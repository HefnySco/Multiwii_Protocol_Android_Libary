package com.MWlib;

import com.MWlib.Messages.MWPacket;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MWParser {

    /**
     * States from the parsing state machine
     */
    protected enum MW_states {
        MW_PARSE_STATE_UNINIT,
        MW_PARSE_STATE_IDLE,
        MW_PARSE_STATE_GOT_HEADER_$,
        MW_PARSE_STATE_GOT_HEADER_M,
        MW_PARSE_STATE_GOT_HEADER_ARROW,
        MW_PARSE_STATE_GOT_HEADER_ERROR,
        MW_PARSE_STATE_GOT_DATA_SIZE,
        MW_PARSE_STATE_GOT_COMMAND_ID,
        MW_PARSE_STATE_GOT_DATA,
        MW_PARSE_STATE_GOT_CRC
    }

    MW_states state = MW_states.MW_PARSE_STATE_UNINIT;

    static boolean msg_received;

    private MWPacket mwpacket;
    private byte lastPacketDataSize;
    byte crc=0;

    public MWPacket mwpacket_parse_char (byte c)
    {
        msg_received = false;
        switch (state)
        {
            case MW_PARSE_STATE_UNINIT:
            case MW_PARSE_STATE_IDLE:
                if (c == '$')
                {
                    state = MW_states.MW_PARSE_STATE_GOT_HEADER_$;
                    crc=0;
                }
                break;
            case MW_PARSE_STATE_GOT_HEADER_$:
                if (c=='M')
                {
                    state = MW_states.MW_PARSE_STATE_GOT_HEADER_M;
                    mwpacket = new MWPacket();
                }
                else
                {
                    state = MW_states.MW_PARSE_STATE_IDLE;
                }
                break;
            case MW_PARSE_STATE_GOT_HEADER_M:
                if ((c=='>') || (c== '<'))
                {
                    mwpacket.direction = c;
                    state = MW_states.MW_PARSE_STATE_GOT_HEADER_ARROW;
                }
                else if (c=='!')
                {
                    mwpacket.direction =c;
                    state = MW_states.MW_PARSE_STATE_GOT_HEADER_ERROR;
                }
                else
                {
                    state = MW_states.MW_PARSE_STATE_IDLE;
                }
                break;
            case MW_PARSE_STATE_GOT_HEADER_ARROW:
            case MW_PARSE_STATE_GOT_HEADER_ERROR:
                // waiting for Data Size
                mwpacket.size = c; // read data size;
                lastPacketDataSize = c;
                state = MW_states.MW_PARSE_STATE_GOT_DATA_SIZE;
                crc ^=c;
                break;
            case MW_PARSE_STATE_GOT_DATA_SIZE:
                mwpacket.setCommand(c);
                if (lastPacketDataSize!=0) {
                    state = MW_states.MW_PARSE_STATE_GOT_COMMAND_ID;
                }
                else
                {
                    state = MW_states.MW_PARSE_STATE_GOT_DATA;
                }
                crc ^=c;
                break;
            case MW_PARSE_STATE_GOT_COMMAND_ID:
                if (lastPacketDataSize ==0)
                {  // data corruption
                    state = MW_states.MW_PARSE_STATE_GOT_DATA;
                    break;
                }
                mwpacket.putData (c);
                crc ^=c;
                lastPacketDataSize = (byte)(lastPacketDataSize -1);
                if (lastPacketDataSize ==0)
                {
                    state = MW_states.MW_PARSE_STATE_GOT_DATA;
                }
                break;
            case MW_PARSE_STATE_GOT_DATA:
                if (crc == c)
                {
                    mwpacket.CRC=c;
                    state = MW_states.MW_PARSE_STATE_IDLE;
                    return  mwpacket;
                }
                else
                {
                    state = MW_states.MW_PARSE_STATE_IDLE;

                }
                state = MW_states.MW_PARSE_STATE_IDLE;
                break;

        }
        return null;
    }


}

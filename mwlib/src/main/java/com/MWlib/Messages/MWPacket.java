package com.MWlib.Messages;

import java.io.Serializable;

/**
 * The general format of an MSP message is:

 *  <preamble>,<direction>,<size>,<command>,<data>,<crc>
 *
 * Where:
 * preamble = the ASCII characters '$M'
 * direction = the ASCII character '<' if to the MWC or '>' if from the MWC
 * size = number of data bytes, binary. Can be zero as in the case of a data request to the MWC
 * command = message_id as per the table below
 * data = as per the table below. UINT16 values are LSB first.
 * crc = XOR of <size>, <command> and each data byte into a zero'ed sum
 * Created by M.Hefny on 16-Jan-15.
 */
public class MWPacket implements Serializable {


    protected byte dataIndex =0;

    /***
     *  > from FC to GCS  < from PC to GCS
     */
    public byte direction;

    public byte size;

    protected MSP_Message msp_Message;
    protected byte commandID;

    public byte CRC;

    // message ID
    public void setCommand (byte commandId)
    {
        // sometimes we need to pass size to message classes.
        commandID = commandId;
        switch (commandId)
        {
            case MSP_IDENT.Message_ID:
                msp_Message = new MSP_IDENT();
                break;
            case MSP_STATUS.Message_ID:
                msp_Message = new MSP_STATUS();
                break;
            default:
                msp_Message = new MSP_UNKNOWN(size);
                break;

        }
    }


    public byte getCommandID ()
    {
        return commandID;
    }

    public MSP_Message getCommand()
    {
        return msp_Message;
    }

    public void putData (byte c)
    {
        msp_Message.putData (c);
    }


    public Boolean validateCRC(byte crc)
    {
        CRC = crc;
        return Boolean.TRUE;
    }



    /**
     * Encode this packet for transmission.
     *
     * @return Array with bytes to be transmitted
     */
    public byte[] encodePacket() {
        size = msp_Message.messageLength; //e.g. commands MSP_BOX where length is not determined by command ID

        byte[] buffer = new byte[5 + size + 1];
        int i = 0;
        byte crc=0;
       buffer[i++] = (byte) '$';
        buffer[i++] = (byte) 'M';
        buffer[i++] = (byte) direction;
        buffer[i++] = (byte) size;
        crc ^=size;
        buffer[i++] = (byte) commandID;
        crc ^=commandID;
        byte c;
        for (int j = 0; j < size; j++) {
            c = msp_Message.getData(j);
            buffer[i++] =c;
            crc ^=c;
        }
        buffer[i++] = (byte) (crc);
        return buffer;
    }

}

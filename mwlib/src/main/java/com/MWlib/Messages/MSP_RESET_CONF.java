package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_RESET_CONF extends MSP_Message {


    public static final byte Message_ID = (byte)208;

    public MSP_RESET_CONF()
    {
        messageLength= 0;

    }


    @Override
    public byte getMessageID()
    {
        return Message_ID;
    }


}

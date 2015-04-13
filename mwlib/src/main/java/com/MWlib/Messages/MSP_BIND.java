package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_BIND extends MSP_Message {


    public static final byte Message_ID = (byte)240;


    public MSP_BIND()
    {
        messageLength= 0;
    }


    @Override
    public byte getMessageID()
    {
        return Message_ID;
    }


}

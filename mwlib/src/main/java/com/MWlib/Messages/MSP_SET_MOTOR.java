package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SET_MOTOR extends MSP_Message {


    public static final byte Message_ID = (byte)214;

    public MSP_SET_MOTOR()
    {
        messageLength= 16 * 2;
        data = new byte[messageLength];
    }

    @Override
    public byte getMessageID()
    {
        return Message_ID;
    }


}

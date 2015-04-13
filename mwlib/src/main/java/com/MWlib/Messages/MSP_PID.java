package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_PID  extends MSP_Message {


    public static final byte Message_ID = 112;

    public MSP_PID()
    {
        messageLength= 30; //30 * 1;
        data = new byte[messageLength];
    }


    @Override
    public byte getMessageID()
    {
        return Message_ID;
    }


}

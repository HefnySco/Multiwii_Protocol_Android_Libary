package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SET_PID  extends MSP_Message {


    public static final byte Message_ID = (byte)202;

    public MSP_SET_PID()
    {
        messageLength= 30 * 1;
        data = new byte[messageLength];
    }



}

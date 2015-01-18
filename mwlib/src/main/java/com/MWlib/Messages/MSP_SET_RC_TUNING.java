package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SET_RC_TUNING  extends MSP_Message {


    public static final byte Message_ID = (byte)204;


    public MSP_SET_RC_TUNING()
    {
        messageLength= 1+1+1+1+1+1+1;
        data = new byte[messageLength];
    }

}

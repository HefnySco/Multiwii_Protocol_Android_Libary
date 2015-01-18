package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_RC_TUNING  extends MSP_Message {


    public static final byte Message_ID = 111;


    public MSP_RC_TUNING()
    {
        messageLength= 1+1+1+1+1+1+1;
        data = new byte[messageLength];
    }

}

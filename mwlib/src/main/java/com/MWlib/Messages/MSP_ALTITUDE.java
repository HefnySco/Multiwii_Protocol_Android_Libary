package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_ALTITUDE  extends MSP_Message {


    public static final byte Message_ID = 109;

    public MSP_ALTITUDE()
    {
        messageLength= 4+2;
        data = new byte[messageLength];
    }

}

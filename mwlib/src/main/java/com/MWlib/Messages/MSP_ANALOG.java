package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_ANALOG  extends MSP_Message {


    public static final byte Message_ID = 110;

    public MSP_ANALOG()
    {
        messageLength= 1+2+2+2;
        data = new byte[messageLength];
    }

}

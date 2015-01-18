package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_RC extends MSP_Message {


    public static final byte Message_ID = (byte)105;

    public MSP_RC()
    {
        messageLength= 16 * 2;
        data = new byte[messageLength];
    }


}

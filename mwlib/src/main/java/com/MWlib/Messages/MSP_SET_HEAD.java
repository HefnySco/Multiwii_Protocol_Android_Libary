package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SET_HEAD extends MSP_Message {


    public static final byte Message_ID = (byte)211;


    public MSP_SET_HEAD()
    {
        messageLength= 2;
        data = new byte[messageLength];
    }

}

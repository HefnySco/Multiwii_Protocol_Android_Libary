package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SET_RAW_RC extends MSP_Message {


    public static final byte Message_ID = (byte)200;

    public MSP_SET_RAW_RC()
    {
        messageLength= 16 * 2;
        data = new byte[messageLength];
    }


}

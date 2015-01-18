package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_RAW_GPS extends MSP_Message {


    public static final byte Message_ID = (byte)106;

    public MSP_RAW_GPS()
    {
        messageLength= 1+1+4+4+2+2+2;
        data = new byte[messageLength];
    }


}

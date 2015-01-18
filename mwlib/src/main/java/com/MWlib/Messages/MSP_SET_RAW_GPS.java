package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SET_RAW_GPS extends MSP_Message {


    public static final byte Message_ID = (byte)201;

    public MSP_SET_RAW_GPS()
    {
        messageLength= 1+1+4+4+2+2;
        data = new byte[messageLength];
    }
    


}

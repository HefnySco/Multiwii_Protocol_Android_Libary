package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_COMP_GPS extends MSP_Message {


    public static final byte Message_ID = (byte)107;


    public MSP_COMP_GPS()
    {
        messageLength= 2+2+1;
        data = new byte[messageLength];
    }

}

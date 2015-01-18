package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_MAG_CALIBRATION extends MSP_Message {


    public static final byte Message_ID = (byte)206;


    public MSP_MAG_CALIBRATION()
    {
        messageLength= 0;
        data = new byte[messageLength];
    }
}

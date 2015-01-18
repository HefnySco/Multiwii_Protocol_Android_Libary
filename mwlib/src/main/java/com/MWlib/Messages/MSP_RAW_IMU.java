package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_RAW_IMU extends MSP_Message {


    public static final byte Message_ID = (byte)102;


    public MSP_RAW_IMU()
    {
        messageLength= 2+2+2+2+2+2+2+2+2;
        data = new byte[messageLength];
    }
}

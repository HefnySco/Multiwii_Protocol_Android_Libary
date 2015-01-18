package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SERVO extends MSP_Message {


    public static final byte Message_ID = (byte)103;

    public MSP_SERVO()
    {
        messageLength= 16 * 2;
        data = new byte[messageLength];
    }


}

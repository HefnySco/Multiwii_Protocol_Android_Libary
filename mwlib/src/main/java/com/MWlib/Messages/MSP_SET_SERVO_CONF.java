package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SET_SERVO_CONF  extends MSP_Message {


    public static final byte Message_ID = (byte)212;

    public MSP_SET_SERVO_CONF()
    {
        messageLength= 8 * (2 + 2 + 2 + 1);
        data = new byte[messageLength];
    }

}

package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_MOTOR_PINS  extends MSP_Message {


    public static final byte Message_ID = 115;

    public MSP_MOTOR_PINS()
    {
        messageLength= 8 * 1;
        data = new byte[messageLength];
    }

}

package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SERVO_CONF extends MSP_Message {


    public static final byte Message_ID = 120;

    public MSP_SERVO_CONF()
    {
        messageLength= 8 * (2 + 2 + 2 + 1);
        data = new byte[messageLength];
    }

    @Override
    public byte getMessageID()
    {
        return Message_ID;
    }


}

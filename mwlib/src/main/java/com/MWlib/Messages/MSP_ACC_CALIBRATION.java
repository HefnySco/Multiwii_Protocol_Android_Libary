package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_ACC_CALIBRATION  extends MSP_Message {


    public static final byte Message_ID = (byte)205;


    public MSP_ACC_CALIBRATION()
    {
        messageLength= 0;
    }

    @Override
    public byte getMessageID()
    {
        return Message_ID;
    }

}

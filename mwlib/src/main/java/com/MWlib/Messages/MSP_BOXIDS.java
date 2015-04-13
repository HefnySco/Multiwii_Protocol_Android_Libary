package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_BOXIDS  extends MSP_Message {


    public static final byte Message_ID = 119;


    @Override
    public byte getMessageID()
    {
        return Message_ID;
    }



}

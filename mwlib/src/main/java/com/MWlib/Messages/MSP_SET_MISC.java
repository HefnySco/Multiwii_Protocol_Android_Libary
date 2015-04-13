package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SET_MISC  extends MSP_Message {


    public static final byte Message_ID = (byte)207;

    public MSP_SET_MISC()
    {
        messageLength= 2+2+2+2+2+2+4+2+1+1+1+1;
        data = new byte[messageLength];
    }


    @Override
    public byte getMessageID()
    {
        return Message_ID;
    }


}

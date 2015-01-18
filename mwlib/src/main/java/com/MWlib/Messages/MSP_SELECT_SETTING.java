package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SELECT_SETTING extends MSP_Message {


    public static final byte Message_ID = (byte)210;

    public MSP_SELECT_SETTING()
    {
        messageLength= 1;
        data = new byte[messageLength];
    }

}

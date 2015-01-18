package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SET_BOX  extends MSP_Message {


    public static final byte Message_ID = (byte)203;

    public MSP_SET_BOX()
    {
        messageLength= 0;
        data = new byte[messageLength];
    }

}

package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SET_WP  extends MSP_Message {


    public static final byte Message_ID = (byte)209;

    public MSP_SET_WP()
    {
        messageLength= 1+4+4+4+2+2+1;
        data = new byte[messageLength];
    }

}

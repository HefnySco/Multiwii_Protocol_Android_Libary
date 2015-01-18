package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_ATTITUDE  extends MSP_Message {


    public static final byte Message_ID = 108;


    public MSP_ATTITUDE()
    {
        messageLength= 2+2+2;
        data = new byte[messageLength];
    }

}

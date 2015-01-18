package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_PIDNAMES  extends MSP_Message {


    public static final byte Message_ID = 117;

    public MSP_PIDNAMES()
    {
        messageLength= 0;
        data = new byte[messageLength];
    }

}

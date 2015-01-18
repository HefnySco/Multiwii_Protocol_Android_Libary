package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_BOXNAMES  extends MSP_Message {


    public static final byte Message_ID = 116;

    public MSP_BOXNAMES()
    {
        messageLength= 0;
        data = new byte[messageLength];
    }

}

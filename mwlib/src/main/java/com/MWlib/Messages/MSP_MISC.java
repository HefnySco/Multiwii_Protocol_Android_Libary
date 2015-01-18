package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_MISC  extends MSP_Message {


    public static final byte Message_ID = 114;

    public MSP_MISC()
    {
        messageLength= 2+2+2+2+2+2+4+2+1+1+1+1;
        data = new byte[messageLength];
    }

}

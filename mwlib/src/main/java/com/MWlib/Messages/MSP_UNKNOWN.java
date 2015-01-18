package com.MWlib.Messages;

/**
 * This could be a new or a custom message command
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_UNKNOWN extends MSP_Message {


    public MSP_UNKNOWN (byte size)
    {
        this.messageLength = size;
        data = new byte[messageLength];
    }


}

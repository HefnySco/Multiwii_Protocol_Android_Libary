package com.MWlib.Messages;

/**
 * {@link} http://www.multiwii.com/wiki/index.php?title=Multiwii_Serial_Protocol
 * not fully implemented yet,
 * works partially for HOME POSITION (wp 0) and HOLD position (wp 15)
 *
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_WP  extends MSP_Message {


    public static final byte Message_ID = 118;

    public MSP_WP()
    {
        messageLength= 1+4+4+4+2+2+1;
        data = new byte[messageLength];
    }

}

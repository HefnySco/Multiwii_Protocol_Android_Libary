package com.MWlib.Messages;

import com.MWlib.Helper;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_ALTITUDE  extends MSP_Message {


    public static final byte Message_ID = 109;


    /***
     * unit in cm
     */
    public int EstAlt;

    /***
     * unit in cm/s
     */
    public short vario;


    public MSP_ALTITUDE()
    {
        messageLength= 4+2;
        data = new byte[messageLength];
    }

    @Override
    protected void OnFinishDataInput()
    {
        EstAlt      = Helper.getInt(data, 0);
        vario       = Helper.getShort(data, 4);
    }


    @Override
    public byte getMessageID()
    {
        return Message_ID;
    }


    @Override
    public void encode ()
    {
        Helper.putInt(EstAlt,data,0);
        Helper.putShort(vario,data,4);
    }
}

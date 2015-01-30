package com.MWlib.Messages;

import com.MWlib.Helper;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SET_HEAD extends MSP_Message {


    public static final byte Message_ID = (byte)211;

    /***
     * Range [-180, +180]
     */
    public short magHold;



    public MSP_SET_HEAD()
    {
        messageLength= 2;
        data = new byte[messageLength];
    }


    @Override
    protected void OnFinishDataInput() {
        magHold      = Helper.getShort(data, 0);
    }

    @Override
    public void encode ()
    {
        Helper.putShort(magHold,data,0);
    }


}

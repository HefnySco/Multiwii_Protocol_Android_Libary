package com.MWlib.Messages;

import com.MWlib.Helper;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SET_RAW_RC extends MSP_Message {


    public static final byte Message_ID = (byte)200;

    public short rcRoll;
    public short rcPitch;
    public short rcYaw;
    public short rcThrottle;
    public short rcAUX1;
    public short rcAUX2;
    public short rcAUX3;
    public short rcAUX4;


    public MSP_SET_RAW_RC()
    {
        messageLength= 16;
        data = new byte[messageLength];
    }

    @Override
    protected void OnFinishDataInput()
    {
        rcRoll      = Helper.getShort(data, 0);
        rcPitch     = Helper.getShort(data, 2);
        rcYaw       = Helper.getShort(data, 4);
        rcThrottle  = Helper.getShort(data, 6);
        rcAUX1      = Helper.getShort(data, 8);
        rcAUX2      = Helper.getShort(data, 10);
        rcAUX3      = Helper.getShort(data, 12);
        rcAUX4      = Helper.getShort(data, 14);
    }

    @Override
    public void encode ()
    {
        Helper.putShort(rcRoll,data,0);
        Helper.putShort(rcPitch,data,2);
        Helper.putShort(rcYaw,data,4);
        Helper.putShort(rcThrottle,data,6);
        Helper.putShort(rcAUX1,data,8);
        Helper.putShort(rcAUX2,data,10);
        Helper.putShort(rcAUX3,data,12);
        Helper.putShort(rcAUX4,data,14);
    }
}

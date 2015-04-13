package com.MWlib.Messages;

import com.MWlib.Helper;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_ANALOG  extends MSP_Message {


    public static final byte Message_ID = 110;


    public byte  VBat;
    public short PowerMeterSum;
    public short RSSI;
    public short Amperage;

    public MSP_ANALOG()
    {
        messageLength= 1+2+2+2;
        data = new byte[messageLength];
    }

    @Override
    public byte getMessageID()
    {
        return Message_ID;
    }



    @Override
    protected void OnFinishDataInput()
    {
        VBat            = data[0];
        PowerMeterSum   = Helper.getShort(data, 1);
        RSSI            = Helper.getShort(data, 3);
        Amperage        = Helper.getShort(data, 5);
    }

    @Override
    public void encode ()
    {
        Helper.putByte (VBat,data,0);
        Helper.putShort(PowerMeterSum,data,1);
        Helper.putShort(RSSI,data,3);
        Helper.putShort(Amperage,data,5);
    }
}

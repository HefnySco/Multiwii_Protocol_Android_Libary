package com.MWlib.Messages;

import com.MWlib.Helper;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SET_WP  extends MSP_Message {


    public static final byte Message_ID = (byte)209;


    public byte wp_no;
    public int lat;
    public int lon;
    public int alt;
    public short heading;
    public short timeToStay;
    public byte navFlag;


    public MSP_SET_WP()
    {
        messageLength= 1+4+4+4+2+2+1;
        data = new byte[messageLength];
    }


    @Override
    protected void OnFinishDataInput()
    {
        wp_no           = data[0];
        lat             = Helper.getInt(data, 1);
        lon             = Helper.getInt(data, 5);
        alt             = Helper.getInt(data, 9);
        heading         = Helper.getShort(data, 13);
        timeToStay      = Helper.getShort(data, 15);
        navFlag         = data[17];
    }

    @Override
    public void encode ()
    {
        data[0] = wp_no;
        Helper.putInt(lat,data, 1);
        Helper.putInt(lon,data, 5);
        Helper.putInt(alt,data, 9);
        Helper.putShort(heading,data, 13);
        Helper.putShort(timeToStay,data, 15);
        data[17] = navFlag;
    }
}

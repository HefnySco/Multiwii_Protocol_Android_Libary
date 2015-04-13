package com.MWlib.Messages;

import com.MWlib.Helper;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_RAW_GPS extends MSP_Message {


    public static final byte Message_ID = (byte)106;


    public byte  GPS_FIX;
    public byte  GPS_numSat;
    public int   GPS_coord_LAT; // 1 / 10 000 000 deg
    public int   GPS_coord_LON; // 1 / 10 000 000 deg
    public short GPS_altitude;      // meter
    public short GPS_speed;         // cm/s
    public short GPS_ground_course; //unit: degree*10


    public MSP_RAW_GPS()
    {
        messageLength= 1+1+4+4+2+2+2;
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
        GPS_FIX             = Helper.getByte(data, 0);
        GPS_numSat          = Helper.getByte(data, 1);
        GPS_coord_LAT       = Helper.getInt(data, 2);
        GPS_coord_LON       = Helper.getInt(data, 6);
        GPS_altitude        = Helper.getShort(data, 10);
        GPS_speed           = Helper.getShort(data, 12);
        GPS_ground_course   = Helper.getShort(data, 14);
    }

    @Override
    public void encode ()
    {
        Helper.putByte(GPS_FIX, data, 0);
        Helper.putByte(GPS_numSat, data, 1);
        Helper.putInt(GPS_coord_LAT, data, 2);
        Helper.putInt(GPS_coord_LON,data,6);
        Helper.putShort(GPS_altitude,data,10);
        Helper.putShort(GPS_speed,data,12);
        Helper.putShort(GPS_ground_course,data,14);
    }

}

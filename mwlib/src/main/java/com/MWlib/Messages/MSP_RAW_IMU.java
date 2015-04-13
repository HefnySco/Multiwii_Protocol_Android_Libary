package com.MWlib.Messages;

import com.MWlib.Helper;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_RAW_IMU extends MSP_Message {


    public static final byte Message_ID = (byte)102;

    /***
     * unit: it depends on ACC sensor and is based on ACC_1G definition
     * MMA7455 64 / MMA8451Q 512 / ADXL345 265 / BMA180 255 / BMA020 63 / NUNCHUCK 200 / LIS3LV02 256 / LSM303DLx_ACC 256 / MPU6050 512 // LSM330 256
     */
    public short accx;

    /***
     * unit: it depends on ACC sensor and is based on ACC_1G definition
     * MMA7455 64 / MMA8451Q 512 / ADXL345 265 / BMA180 255 / BMA020 63 / NUNCHUCK 200 / LIS3LV02 256 / LSM303DLx_ACC 256 / MPU6050 512 // LSM330 256
     */
    public short accy;

    /***
     * unit: it depends on ACC sensor and is based on ACC_1G definition
     * MMA7455 64 / MMA8451Q 512 / ADXL345 265 / BMA180 255 / BMA020 63 / NUNCHUCK 200 / LIS3LV02 256 / LSM303DLx_ACC 256 / MPU6050 512 // LSM330 256
     */
    public short accz;

    /***
     * unit: it depends on GYRO sensor.
     * For MPU6050, 1 unit = 1/4.096 deg/s
     */
    public short gyrx;


    /***
     * unit: it depends on GYRO sensor.
     * For MPU6050, 1 unit = 1/4.096 deg/s
     */
    public short gyry;


    /***
     * unit: it depends on GYRO sensor.
     * For MPU6050, 1 unit = 1/4.096 deg/s
     */
    public short gyrz;


    /***
     *  unit: it depends on MAG sensor.
     */
    public short magx;


    /***
     *  unit: it depends on MAG sensor.
     */
    public short magy;


    /***
     *  unit: it depends on MAG sensor.
     */
    public short magz;


    public MSP_RAW_IMU()
    {
        messageLength= 2+2+2+2+2+2+2+2+2;
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
        accx       = Helper.getShort(data,0);
        accy       = Helper.getShort(data,2);
        accz       = Helper.getShort(data,4);

        gyrx       = Helper.getShort(data,6);
        gyry       = Helper.getShort(data,8);
        gyrz       = Helper.getShort(data,10);

        magx       = Helper.getShort(data,12);
        magy       = Helper.getShort(data,14);
        magz       = Helper.getShort(data,16);
    }


    @Override
    public void encode ()
    {

        Helper.putShort(accx,data,0);
        Helper.putShort(accy,data,2);
        Helper.putShort(accz,data,4);
        Helper.putShort(gyrx,data,6);
        Helper.putShort(gyry,data,8);
        Helper.putShort(gyrz,data,10);
        Helper.putShort(magx,data,12);
        Helper.putShort(magy,data,14);
        Helper.putShort(magz,data,16);

    }




}

package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_SET_RC_TUNING  extends MSP_Message {


    public static final byte Message_ID = (byte)204;





    public byte byteRC_RATE;
    public byte byteRC_EXPO;
    public byte byteRollPitchRate;
    public byte byteYawRate;
    public byte byteDynThrPID;
    public byte byteThrottle_MID;
    public byte byteThrottle_EXPO;


    public MSP_SET_RC_TUNING()
    {
        messageLength= 1+1+1+1+1+1+1;
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
        byteRC_RATE         = data[0];
        byteRC_EXPO         = data[1];
        byteRollPitchRate   = data[2];
        byteYawRate         = data[3];
        byteDynThrPID       = data[4];
        byteThrottle_MID    = data[5];
        byteThrottle_EXPO   = data[6];
    }

    @Override
    public void encode ()
    {
        data[0] = byteRC_RATE;
        data[1] = byteRC_EXPO;
        data[2] = byteRollPitchRate;
        data[3] = byteYawRate;
        data[4] = byteDynThrPID;
        data[5] = byteThrottle_MID;
        data[6] = byteThrottle_EXPO;
    }

}

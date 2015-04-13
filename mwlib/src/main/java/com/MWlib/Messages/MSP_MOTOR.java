package com.MWlib.Messages;

import com.MWlib.Helper;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_MOTOR extends MSP_Message {


    public static final byte Message_ID = (byte)104;

    public short[] motors= new short[8];

    public MSP_MOTOR()
    {
        messageLength= 16;
        data = new byte[messageLength];
    }

    @Override
    protected void OnFinishDataInput()
    {
        for (int i=0;i<8;i+=1) {
            motors[i] = Helper.getShort(data, i * 2);
        }
    }

    @Override
    public void encode ()
    {
        for (int i=0;i<8;i+=1) {
            Helper.putShort(motors[i],data, i*2);
        }
    }

    @Override
    public byte getMessageID()
    {
        return Message_ID;
    }



}

package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_Message {

    public byte messageLength;

    protected byte[] data;

    protected byte dataIndex = 0;

    public void putData(byte c) {
        if (dataIndex >= messageLength) {
            return;
        }
        data[dataIndex] = c;
        dataIndex = (byte) (dataIndex + 1);
    }


    public byte getData(int index) {
        return data[index];
    }
}

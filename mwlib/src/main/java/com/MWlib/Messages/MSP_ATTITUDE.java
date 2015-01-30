package com.MWlib.Messages;

import com.MWlib.Helper;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_ATTITUDE  extends MSP_Message {


    public static final byte Message_ID = 108;

    /***
     * Range [-1800;1800] (unit: 1/10 degree)
     */
    public short angx;
    /***
     * Range [-900;900] (unit: 1/10 degree)
     */
    public short angy;
    /***
     * Range [-180;180]
     */
    public short heading;

    public MSP_ATTITUDE()
    {
        messageLength= 2+2+2;
        data = new byte[messageLength];
    }

    @Override
    protected void OnFinishDataInput()
    {
        angx      = Helper.getShort(data, 0);
        angy      = Helper.getShort(data, 2);
        heading   = Helper.getShort(data, 4);
    }

    @Override
    public void encode ()
    {
        Helper.putShort(angx,data,0);
        Helper.putShort(angy,data,2);
        Helper.putShort(heading,data,4);
    }
}

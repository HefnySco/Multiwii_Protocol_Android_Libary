package com.MWlib.Messages;

import com.MWlib.Helper;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_IDENT extends MSP_Message {


    public static final byte Message_ID = 100;

    /***
     *
     */
    public byte version;

    /***
     * TRI/QUADP,QUADX,BI,GIMBAL,Y6,HEX6,FLYING_WING,Y4,HEX6X,OCTOX8, OCTOFLATP,OCTOFLATX,AIRPLANE,HELI_120,HELI_90,VTAIL4,HEX6H,SINGLECOPTER,DUALCOPTER
     */
    public byte multiType;

    /***
     *
     */
    public byte MSPversion;

   /***
     * A 32 bit variable to indicate capability of FC board
     * Currently, BIND button is used on first bit, DYNBAL on second, FLAP on third
     */
    public int multiCapability;



    @Override
    protected void OnFinishDataInput()
    {
        version         = data[0];
        multiType       = data[1];
        MSPversion      = data[2];
        multiCapability = Helper.getInt(data,3);
    }


    @Override
    public void encode () {
        data[0] = version;
        data[1] = multiType;
        data[2] = MSPversion;
        Helper.putInt(multiCapability,data,3);
    }


    public MSP_IDENT()
    {
        messageLength= 1+1+1+4;
        data = new byte[messageLength];
    }



}

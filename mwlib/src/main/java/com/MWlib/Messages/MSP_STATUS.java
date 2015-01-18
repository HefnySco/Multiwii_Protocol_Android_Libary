package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_STATUS extends MSP_Message {


    public static final byte Message_ID = 101;

    /***
     * unsigned microseconds
     */
    public short cycleTime;

    /***
     * 	UINT 16
     */
    public short i2c_errors_count;

    /***
     * UINT 16	BARO<<1|MAG<<2|GPS<<3|SONAR<<4
     */
    public short sensor;

    /***
     * 	UINT 32	a bit variable to indicate which BOX are active, the bit position depends on the BOX which are configured
     */
    public int flag;

    /***
     * UINT 8	to indicate the current configuration setting
     */
    public byte global_conf_currentSet;


    public MSP_STATUS()
    {
        messageLength= 2+2+2+4+1;
        data = new byte[messageLength];
    }

}

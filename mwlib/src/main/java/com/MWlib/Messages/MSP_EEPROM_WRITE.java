package com.MWlib.Messages;

/**
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_EEPROM_WRITE extends MSP_Message {


    public static final byte Message_ID = (byte)250;

    public MSP_EEPROM_WRITE()
    {
        messageLength= 0;
        data = new byte[messageLength];
    }


}

package com.MWlib.Messages;

/**
 * BOXITEMS number is dependant of multiwii configuration
 * The size of the message is enough to know the number of BOX For each BOX,
 * there is a 16 bit variable which indicates the AUX1->AUX4 activation switch.
 * Bit 1: AUX1 LOW state / bit 2: AUX1 MID state / bit 3: AUX1 HIGH state / bit 4: AUX2 LOW state
 * ….. bit 13: AUX 4 HIGH state
 * Created by M.Hefny on 16-Jan-15.
 */
public class MSP_BOX  extends MSP_Message {


    public static final byte Message_ID = 113;

    public MSP_BOX()
    {
        messageLength= 0;
    }


    @Override
    public byte getMessageID()
    {
        return Message_ID;
    }


}

package com.MWlib;

/**
 * Created by M.Hefny on 19-Jan-15.
 */
public class Helper {


    public static void putShort(short data, byte[]packet, int index) {
        packet[index]   = ((byte)(data >> 0));
        packet[index+1] = ((byte)(data >> 8));

    }

    public static void putInt(int data, byte[]packet, int index) {
        packet[index]   = ((byte)(data >> 0));
        packet[index+1] = ((byte)(data >> 8));
        packet[index+2] = ((byte)(data >> 16));
        packet[index+3] = ((byte)(data >> 24));

    }

    public static void putLong(long data, byte[]packet, int index) {

        packet[index]   = ((byte)(data));
        packet[index+1] = ((byte)(data >> 8));
        packet[index+2] = ((byte)(data >> 16));
        packet[index+3] = ((byte)(data >> 24));
        packet[index+4] = ((byte)(data >> 32));
        packet[index+5] = ((byte)(data >> 40));
        packet[index+6] = ((byte)(data >> 48));
        packet[index+7] = ((byte)(data >> 56));
    }


    public static void putFloat(float data, byte[]packet, int index) {
        int fdata= Float.floatToIntBits(data);
        packet[index]   = ((byte)(fdata >> 0));
        packet[index+1] = ((byte)(fdata >> 8));
        packet[index+2] = ((byte)(fdata >> 16));
        packet[index+3] = ((byte)(fdata >> 24));
    }

    public static float getFloat(float data, byte[]packet, int index) {
        return (Float.intBitsToFloat(getInt(packet, index)));
    }

    public static long getLong(byte[]packet, int index) {

        long result =0;
        result  |= ((packet[index]   & (long)0xFF));
        result  |= ((packet[index+1] & (long)0xFF) << 8);
        result  |= ((packet[index+2] & (long)0xFF) << 16);
        result  |= ((packet[index+3] & (long)0xFF) << 24);
        result  |= ((packet[index+4] & (long)0xFF) << 32);
        result  |= ((packet[index+5] & (long)0xFF) << 40);
        result  |= ((packet[index+6] & (long)0xFF) << 48);
        result  |= ((packet[index+7] & (long)0xFF) << 56);

        return result;
    }


    public static int getInt(byte[]packet, int index) {

        int result =0;
        result  |= ((packet[index]   & (int)0xFF));
        result  |= ((packet[index+1] & (int)0xFF) << 8);
        result  |= ((packet[index+2] & (int)0xFF) << 16);
        result  |= ((packet[index+3] & (int)0xFF) << 24);

        return result;
    }

    public static short getShort(byte[]packet, int index) {

        short result =0;
        result  |= ((packet[index]   & (short)0xFF));
        result  |= ((packet[index+1] & (short)0xFF) << 8);

        return result;
    }
}

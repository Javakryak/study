package com.artem;

import java.nio.ShortBuffer;

public class Main {

    public static void main(String[] args) {
        int a = 10000;
        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + intMinValue);
        System.out.println("Integer maximum value = " + intMaxValue);
        System.out.println("BOOM Integer minimum value = " + (intMinValue - 1));
        System.out.println("BOOM Integer maximum value = " + (intMaxValue + 1));

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + myByteMinValue);
        System.out.println("Byte maximum value = " + myByteMaxValue);

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + myShortMinValue);
        System.out.println("Short maximum value = " + myShortMaxValue);
        
        long myLongValue = 1000L;

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + myLongMinValue);
        System.out.println("Long maximum value = " + myLongMaxValue);

        int myTotal = intMinValue / 2;
        byte newByte =(byte) (myByteMinValue / 2);
        short newShort = (short) (myShortMinValue / 2);

        byte puk = 69;
        short gnom = (short) (puk * 10);
        int norm = gnom * 10;
        long sosiska = 50000 + (10 * (puk + gnom + norm));
        System.out.println("Длинна сосиски: " + sosiska);

    }
}

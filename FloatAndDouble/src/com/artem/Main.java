package com.artem;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value: " + minFloatValue);
        System.out.println("Float maximum value: " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value: " + minDoubleValue);
        System.out.println("Double maximum value: " + maxDoubleValue);

        int myInt = 5 / 3;
        float myFloat = 5F / 3F;
        double myDouble = 5D / 3D;
        System.out.println("My Int Value: " + myInt);
        System.out.println("My Floaat Value: " + myFloat);
        System.out.println("My DOuble Value: " + myDouble);

        double myPounds = 5D;
        double myKilos = myPounds * 0.45359237;
        System.out.println("Converted from Pounds to Kilos: " + myKilos);
    }
}

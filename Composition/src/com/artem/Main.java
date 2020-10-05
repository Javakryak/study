package com.artem;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "LG", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "ASUS", 4, 8, "v2");

        PC thePC = new PC(theCase, monitor, motherboard);
        thePC.powerUp();
    }
}

package com.artem;

public class Main {

    public static void main(String[] args) {

        String myString = "I'm in love with my pirate girl!";
        System.out.println("Yaaaaarrrrrr! " + myString);
        myString = myString + " Kisses!";
        System.out.println("Yaaaaarrrrrr! " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("Yaaaaarrrrrr! " + myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String is equal to  " + lastString);
    }
}

package com.artem;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int newIntValue = myIntValue;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("newIntValue = " + newIntValue);

        newIntValue++;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("newIntValue = " + newIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray (int[] array){
        array[0] = 2;
    }
}

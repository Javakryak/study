package com.artem;

import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printArray(sortInt(getIntegers(5)));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values:\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + ".");
    }

    public static int[] sortInt(int[] array) {
        int lastHighestValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++){
                if (array[j] < array[j+1]){
                    lastHighestValue = array[j+1];
                    array[j+1] = array[j];
                    array[j] = lastHighestValue;
                }
            }
        }
        return array;
    }
}

package com.artem;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many integers do you want to enter?\r");
        int count = scanner.nextInt();
        int min = findMin(readIntegers(count));
        System.out.println("The minimum value of your values is " + min);
    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integer values:\r");
        int[] values = new int[count];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int[] array){
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
}

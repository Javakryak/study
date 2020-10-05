package com.artem;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {5, 9, 7, 1, 34, 2};
        System.out.println(Arrays.toString(myArray));
        reverse(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void reverse(int[] array){
        int x;
        for (int i = 0; i < array.length/2; i++){
            x = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = x;
        }
    }
}

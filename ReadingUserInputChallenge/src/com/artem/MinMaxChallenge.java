package com.artem;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void minMaxUserValues() {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int counter = 0;

        while (true) {
            System.out.println("Enter your numbers");
            boolean hasInt = scanner.hasNextInt();
            if (hasInt) {
                int number = scanner.nextInt();
                if (counter == 0){
                    min = number;
                    max = number;
                    counter = 1;
                } else if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }
            } else {
                System.out.println ("Your MIN value: " + min);
                System.out.println ("Your MAX value: " + max);
                break;
            }
            scanner.nextLine();

        }
        scanner.close();
    }
}
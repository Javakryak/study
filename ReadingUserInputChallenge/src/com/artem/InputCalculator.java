package com.artem;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);
        int numCounter = 0;
        int sum = 0;

        while (true){
            boolean hasInt = scanner.hasNextInt();
            if (hasInt){
                int number = scanner.nextInt();
                numCounter++;
                sum += number;
            } else if (sum == 0 && numCounter == 0){
                System.out.println("SUM = 0 AVG = 0");
                break;
            } else {
                int average = Math.round((float) sum / (float)numCounter);
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }

}

package com.artem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");

        boolean hasInt = scanner.hasNextInt();
        if (hasInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 130) {
                System.out.println("Your name is " + name + ", and you are " + age + " y.o.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Invalid shit");
        }
        scanner.close();
    }
}

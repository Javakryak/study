package com.artem;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number / 2; i++) {
            while ((number % i == 0) && (number / i != 1)) {
                number /= i;
            }
        }
        return number;
    }
}

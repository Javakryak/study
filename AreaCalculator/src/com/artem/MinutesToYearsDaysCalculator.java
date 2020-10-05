package com.artem;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else if (minutes < 60*24*365){
            System.out.println(minutes + " min = 0 y and " + (minutes / 60 / 24) + " d");
        } else {
            int years = (int) (minutes / 60 / 24 / 365);
            int restdays = (int) ((minutes % (60 * 24 * 365)) / 60 / 24);
            System.out.println(minutes + " min = " + years + " y and " + restdays + " d");
        }
    }
}

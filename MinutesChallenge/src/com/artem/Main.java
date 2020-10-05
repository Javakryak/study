package com.artem;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(62));
    }
    public static String getDurationString (int minutes, int seconds){
        if (minutes < 0 || (seconds < 0 || seconds > 59)){
            return "Invalid Value";
        } else if (minutes <60){
            return "0h " + minutes + "m " + seconds + "s";
        } else {
            int hours = minutes / 60;
            return hours + "h " + (minutes % 60) + "m " + seconds + "s";
        }
    }
    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid Value");
        } else if (seconds < 60){
            return getDurationString(0, seconds);
        } else {
            return getDurationString((seconds/60), (seconds % 60));
        }
        return null;
    }
}

package com.artem;

public class Main {

    public static void main(String[] args) {
        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3,4 or 5");
                break;

            default:
                System.out.println("Non specified value");
                break;
        }

        char abcValue = 'b';
        switch (abcValue){
            case 'a':
                System.out.println("Found A");
                break;
            case 'b':
                System.out.println("Found B");
                break;
            case 'c':
                System.out.println("Found C");
                break;
            case 'd':
                System.out.println("Found D");
                break;
            case 'e':
                System.out.println("Found E");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()){
            case "January":
                System.out.println("Jan");
                break;
        }


    }
    public static void printDayOfTheWeek (int day){
        switch (day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");

        }
    }
}

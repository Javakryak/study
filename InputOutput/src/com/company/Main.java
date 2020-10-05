package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for (String exit: exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = getDirection();
            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            } else{
                System.out.println("You cannot go in that direction");
            }
        }
    }

    public static String getDirection(){
        String userInput = scanner.nextLine().toUpperCase();
        String[] direction = userInput.split(" ");
        for (String i : direction){
            switch (i){
                case "NORTH", "N":
                    return "N";
                case "Q", "QUIT":
                    return "Q";
                case "EAST", "E":
                    return "E";
                case "WEST", "W":
                    return "W";
                case "SOUTH", "S":
                    return "S";

            }
        }
        return null;
    }

}

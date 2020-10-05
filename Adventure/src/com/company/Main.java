package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0, "Сидишь перед компом, учишь Джаву",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "Ты стоишь в конце дороги перед небольшим кирпичным зданием",tempExit));


        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "Ты на вершине холма",tempExit));


        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "Ты в долине, рядом с ручьём",tempExit));


        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "Ты в лесу",tempExit));


        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "Ты внутри здания, отличный домик для ранней весны",tempExit));


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

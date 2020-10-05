package com.artem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

private static Scanner s = new Scanner(System.in);
private static GroceryList groceryList = new GroceryList();
private static int[] baseData = new int[10];

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - to print choice options.");
        System.out.println("\t 1 - to print the list of grocery items.");
        System.out.println("\t 2 - to add an item to the list.");
        System.out.println("\t 3 - to modify an item in the list.");
        System.out.println("\t 4 - to remove an item from the list.");
        System.out.println("\t 5 - to search for the item in the list.");
        System.out.println("\t 6 - to quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(s.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter current item name : ");
        String itemNo = s.nextLine();
        System.out.print("Enter replacement name: ");
        String newItem = s.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number : ");
        String itemNo = s.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = s.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not  in the shopping list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

//        System.out.println("Enter 10 integers:");
//        getInput();
//        printArray(baseData);
//        resizeArray();
//        System.out.println("Enter 12 integers:");
//        getInput();
//        printArray(baseData);
//    }
//
//    private static void getInput(){
//        for (int i = 0; i < baseData.length; i++){
//            baseData[i] = s.nextInt();
//        }
//    }
//
//    private static void printArray(int[] arr){
//        for (int i = 0; i < arr.length; i++)
//            System.out.print(arr[i] + " ");
//            System.out.println();
//
//    }
//
//    private static void resizeArray(){
//        int[] original = baseData;
//
//        baseData = new int[12];
//        for (int i = 0; i < original.length;  i++)
//            baseData[i] = original[i];



}

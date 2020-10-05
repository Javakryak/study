package com.artem;

import java.util.Scanner;

public class Main {


    private static Scanner s = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchName();
                    break;
                case 6:
                    quit = true;
                    break;


            }
        }
    }

    public static void printInstructions () {
        System.out.println("\nPress ");
        System.out.println("\t 0 - to print choice options.");
        System.out.println("\t 1 - to print the contact list.");
        System.out.println("\t 2 - to add contact.");
        System.out.println("\t 3 - to modify a contact.");
        System.out.println("\t 4 - to remove a contact.");
        System.out.println("\t 5 - to search for the contact.");
        System.out.println("\t 6 - to quit the application.");
    }

    public static void addContact (){
        System.out.print("Enter contact name: ");
        String name = s.nextLine();
        if (mobilePhone.searchByName(name) == null) {
            System.out.println("Enter contact number: ");
            String phone = s.nextLine();
            mobilePhone.addContact(new Contact(name, phone));
        } else {
            System.out.println(name + " already exists.");
        }
    }

    public static void editContact (){
        System.out.println("What contact do you want to edit?");
        String oldName = s.nextLine();
        if (mobilePhone.searchByName(oldName) != null){
            System.out.println("Enter new name: ");
            String  newName = s.nextLine();
            if (mobilePhone.searchByName(newName) == null) {
                System.out.println("Enter new phone: ");
                String newPhone = s.nextLine();
                Contact newContact = new Contact(newName, newPhone);
                Contact oldContact = mobilePhone.searchByName(oldName);
                mobilePhone.editContact(oldContact, newContact);
            } else {
                System.out.println("Entered name " + newName + " already exists.");
            }
        } else {
            System.out.println("Unable to find contact " + oldName);
        }
    }

    public static void removeContact() {
        System.out.println("What contact do you want to delete?");
        String name = s.nextLine();
        if (mobilePhone.searchByName(name) != null){
            mobilePhone.removeContact(mobilePhone.searchByName(name));
        } else {
            System.out.println("Unable to find contact " + name);
        }
    }

    public static void  searchName() {
        System.out.println("Enter contact name to search for: ");
        String name = s.nextLine();
        if (mobilePhone.searchByName(name) != null){
            System.out.println(name + " is in the contact list.");;
        } else {
            System.out.println("Unable to find contact " + name);
        }
    }
}

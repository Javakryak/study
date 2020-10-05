package com.artem;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static Bank myBank = new Bank();

    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        //menu:
        //1 - add branch
        //2 - add customer
        //3 - add transaction
        //4 - Branch report (print branch's customer list)
        //5 - customer report (choose branch, customer, print transactions list)

        boolean quit = false;
        System.out.println("Welcome to TransNacGazBank OS!");
        int choice = 0;
        printOptions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    createBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    debitTransaction();
                    break;
                case 4:
                    creditTransaction();
                    break;
                case 5:
                    printBranchList();
                    break;
                case 6:
                    printCustomerHistory();
                case 7:
                    quit = true;
                    break;
            }
        }

    }



    public static void printOptions () {
        System.out.println("*** Options list ***" +
                "\n1 - add new branch" +
                "\n2 - add new customer" +
                "\n3 - add debit transaction" +
                "\n4 - add credit transaction" +
                "\n5 - print branch customer report" +
                "\n6 - print customer transaction history" +
                "\n7 - exit");
    }

    public static void createBranch () {
        System.out.print("Enter name of the branch: ");
        String name = s.nextLine();
        if (myBank.searchByName(name) == null){
            myBank.addNewBranch(new Branch(name));
        } else {
            System.out.println("Branch "+ name + " already exists.");
        }
    }

    public static void addCustomer() {
        if (myBank.getBranchList().size() < 1){
            System.out.println("You must create branch first.");
        } else {
            System.out.println("Choose client's branch: ");
            myBank.printBranchList();
            System.out.print("Type the branch number: ");
            int chosenBranch = (s.nextInt()- 1);
            if (myBank.getBranchList().get(chosenBranch) == null){
                System.out.println("Incorrect branch number.");
            } else {
                s.nextLine();
                System.out.println("Chosen branch - " + myBank.getBranchList().get(chosenBranch).getName());
                System.out.println("Type name of the client: ");
                String name = s.nextLine();
                if (myBank.getBranchList().get(chosenBranch).searchByName(name) != null){
                    System.out.println("Client with name "+ name + " already exists in this branch.");
                } else {
                    System.out.println("Type initial balance below. \n *** Attention! Initial balance must be positive! ***");
                    double value = s.nextDouble();
                    myBank.addNewCustomer(myBank.getBranchList().get(chosenBranch), new Customer (name,value));
                }
            }
        }
    }

    public static void debitTransaction (){
        System.out.println("Choose client's branch: ");
        myBank.printBranchList();
        System.out.print("Type the branch number: ");
        int chosenNum = (s.nextInt() - 1);
        Branch chosenBranch = myBank.getBranchList().get(chosenNum);
        if (chosenBranch == null){
            System.out.println("Incorrect branch number.");
        } else {
            System.out.println("Chosen branch - " + chosenBranch.getName());
            chosenBranch.printCustomerList();
            System.out.println("Type clients number: ");
            int num = (s.nextInt() - 1);
            Customer chosenCustomer = chosenBranch.getCustomerList().get(num);
            if (chosenCustomer != null) {
                System.out.println("Type amount of money you want to add to client " + chosenCustomer.getName() + ":");
                double value = s.nextDouble();
                if (value < 0.0d) {
                    System.out.println("Value must be positive!");
                } else {
                    chosenBranch.createNewTransaction(chosenCustomer, value);
                    System.out.println("Transaction successful! \n Current balance: " + chosenCustomer.getBalance());
                }
            }
        }
    }

    public static void creditTransaction () {
        System.out.println("Choose client's branch: ");
        myBank.printBranchList();
        System.out.print("Type the branch number: ");
        int chosenNum = (s.nextInt() - 1);
        Branch chosenBranch = myBank.getBranchList().get(chosenNum);
        if (chosenBranch == null){
            System.out.println("Incorrect branch number.");
        } else {
            System.out.println("Chosen branch - " + chosenBranch.getName());
            chosenBranch.printCustomerList();
            System.out.println("Type clients number: ");
            int num = (s.nextInt() - 1);
            Customer chosenCustomer = chosenBranch.getCustomerList().get(num);
            if (chosenCustomer != null) {
                System.out.println("Current client: " + chosenCustomer.getName() + "\nClient's balance: " + chosenCustomer.getBalance());
                System.out.print("Type amount of money you want to withdraw: ");
                double value = s.nextDouble();
                if (value < 0.0d) {
                    System.out.println("Value must be positive!");
                } else if (chosenCustomer.getBalance() - value < 0.0d) {
                    System.out.println("Client don't have enough money");
                } else {
                    chosenBranch.createNewTransaction(chosenCustomer, -(value));
                    System.out.println("Transaction successful! \n Current balance: " + chosenCustomer.getBalance());
                }
            }
        }
    }

    public static void printBranchList () {
        System.out.println("Choose client's branch: ");
        myBank.printBranchList();
        System.out.print("Type the branch number: ");
        int chosenNum = (s.nextInt() - 1);
        Branch chosenBranch = myBank.getBranchList().get(chosenNum);
        if (chosenBranch == null){
            System.out.println("Incorrect branch number.");
        } else {
            chosenBranch.printCustomerList();
        }
    }

    public static void printCustomerHistory () {
        System.out.println("Choose client's branch: ");
        myBank.printBranchList();
        System.out.print("Type the branch number: ");
        int chosenNum = (s.nextInt() - 1);
        Branch chosenBranch = myBank.getBranchList().get(chosenNum);
        if (chosenBranch == null){
            System.out.println("Incorrect branch number.");
        } else {
            System.out.println("Chosen branch - " + chosenBranch.getName());
            chosenBranch.printCustomerList();
            System.out.println("Type clients number: ");
            int num = (s.nextInt() - 1);
            Customer chosenCustomer = chosenBranch.getCustomerList().get(num);
            if (chosenCustomer != null) {
                chosenCustomer.printTransactionHistory();
            } else {
                System.out.println("Incorrect client number.");
            }
        }
    }
}

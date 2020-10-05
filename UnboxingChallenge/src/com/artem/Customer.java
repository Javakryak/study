package com.artem;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactionList = new ArrayList<Double>();

    public Customer(String name, double startBalance) {
        this.name = name;
        if (startBalance > 0.0) {
            transactionList.add(startBalance);
        } else {
            transactionList.add(0.0);
        }
    }

    public Customer (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactionList;
    }

    public void addTransaction (double value){
        this.transactionList.add(value);
    }

    public double getBalance() {
        if (transactionList.size() > 0) {
            Double balance = 0.0d;
            for (int i = 0; i < transactionList.size(); i++) {
                balance += transactionList.get(i);
            }
            return balance;
        }
        return 0.0d;
    }

    public void printTransactionHistory() {
        System.out.println("List of the client's operations:");
        for (int i = 0; i < transactionList.size(); i++){
            System.out.println("Transaction number " + i+1);
            double value = transactionList.get(i);
            if (value < 0.0d){
                System.out.println("Withdrawal amount: " + value);
            } else {
                System.out.println("Incoming amount: " + value);
            }
            System.out.println("_____________________");
        }
        System.out.println("Current balance: " + getBalance());
    }
}

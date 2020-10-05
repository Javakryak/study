package com.company;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountName;
    private int balance = 0;
    private List<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sum");
        }
    }

    public void withdraw (int amount){
        int withdrawl = -amount;
        if (withdrawl < 0){
            this.transactions.add(withdrawl);
            this.balance += withdrawl;
            System.out.println(amount  + " withdrawed. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sum");
        }
    }

    public void calculateBalance(){
        this.balance = 0;
        for (int i : this.transactions){
            this.balance += i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }
}


package com.artem;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String userName;
    private String userEMail;
    private String userPhone;

    public BankAccount(){
        this(93878912, 0.0d, "Default Name", "Default Email",
                "+700000000");
    }

    public BankAccount (int accountNumber, double accountBalance, String userName, String userEMail, String userPhone){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.userName = userName;
        this.userEMail = userEMail;
        this.userPhone = userPhone;
    }

    public BankAccount(String userName, String userEMail, String userPhone) {
        this(100001, 0.0d, userName, userEMail, userPhone);
    }

    public int getAccountNumber(){return this.accountNumber;}
    public double getAccountBalance(){return this.accountBalance;}
    public String getUserName(){return this.userName;}
    public String getUserEMail(){return this.userEMail;}
    public String getUserPhone(){return this.userPhone;}

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEMail(String userEMail) {
        this.userEMail = userEMail;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void accountDeposit(double depositSum){
        if (depositSum > 0d){
            this.accountBalance += depositSum;
            System.out.println("Balance after deposit: " + this.accountBalance);
        } else {
            System.out.println("Wrong sum");
        }
    }

    public void accountWithdraw(double withdrawSum){
        if (withdrawSum < 0) {
            System.out.println("Wrong sum");
        } else if (withdrawSum > this.accountBalance){
            System.out.println("Not enough funds. Only " + this.accountBalance + " is available.");
        } else {
            this.accountBalance -= withdrawSum;
            System.out.println("Balance after withdrawal: " + this.accountBalance);
        }
    }
}

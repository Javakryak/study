package com.artem;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customerList = new ArrayList<Customer>();

    public Branch(String name, ArrayList<Customer> customerList) {
        this.name = name;
        this.customerList = customerList;
    }

    public Branch(String name) {
        this.name = name;
        this.customerList = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void createNewCustomer(Customer customer) {
        customerList.add(customer);
        System.out.println("Customer has been created");
    }

    public void createNewTransaction(Customer customer, double value) {
        int pos = findCustomer(customer);
        customerList.get(pos).addTransaction(value);
    }

    private int findCustomer(Customer customer) {
        return customerList.indexOf(customer);
    }

    public Customer searchByName (String name){
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().equals(name)) {
                return customerList.get(i);
            }
        }
        return null;
    }

    public void printCustomerList() {
        if (customerList.size() < 1) {
            System.out.println("This branch don't have any clients yet.");
        } else {
            System.out.println("This branch have " + customerList.size() + " clients: ");
            for (int i = 0; i < customerList.size(); i++) {
                System.out.println("Client #" + i+1);
                System.out.println("\t Name: " + customerList.get(i).getName());
                System.out.println("\t Balance: " + customerList.get(i).getBalance());
                System.out.println("_________________________________");
            }
        }
    }



}

package com.artem;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branchList = new ArrayList<Branch>();

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }

    public void addNewBranch(Branch branch) {
        branchList.add(branch);
        System.out.println("Branch " + branch.getName() + " has been added.");
    }

    public void addNewCustomer(Branch branch, Customer customer) {
        int pos = findBranch(branch);
        branchList.get(pos).createNewCustomer(customer);
    }

    private int findBranch(Branch branch) {
        return branchList.indexOf(branch);
    }

    public Branch searchByName(String name) {
        for (int i = 0; i < branchList.size(); i++) {
            if (branchList.get(i).getName().equals(name)) {
                return branchList.get(i);
            }
        }
        return null;
    }

    public void printBranchList (){
        if (branchList.size() < 1) {
            System.out.println("This branch don't have any clients yet.");
        } else {
            //System.out.println("Your bank have " + branchList.size() + " branches:");
            for (int i = 0; i < branchList.size(); i++) {
                System.out.println("\t#" + (i+1) + branchList.get(i).getName());
            }
        }
    }
}

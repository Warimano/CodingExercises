package com.warimano.SectionEightExercises.Banking;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) != null) return false;
        return branches.add(new Branch(branchName));
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) return false;
        return branch.newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) return false;
        return branch.addCustomerTransaction(customerName, transaction);
    }

    private Branch findBranch(String branchName) {
        Branch toReturn = null;
        for (Branch branch : branches) {
            if (Objects.equals(branch.getName(), branchName)) {
                toReturn = branch;
                break;
            }
        }
        return toReturn;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) return false;

        System.out.println("Customer details for branch " + branchName);

        ArrayList<Customer> customers = branch.getCustomers();
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("Customer: " + customer.getName() + "[" + (i+1) + "]");
            if (printTransactions) {
                System.out.println("Transactions");
                ArrayList<Double> transactions = customer.getTransactions();
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("[" + (j+1) + "]  Amount " + transactions.get(j));
                }
            }
        }

        return true;
    }
}

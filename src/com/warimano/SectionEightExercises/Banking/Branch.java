package com.warimano.SectionEightExercises.Banking;

import java.util.ArrayList;
import java.util.Objects;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) != null) return false;
        return customers.add(new Customer(customerName, initialTransaction));
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer == null || transaction < 0) return false;

        customer.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String customerName) {
        Customer toReturn = null;
        for (Customer customer : customers) {
            if (Objects.equals(customer.getName(), customerName)) {
                toReturn = customer;
                break;
            }
        }
        return toReturn;
    }
}

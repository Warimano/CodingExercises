package com.warimano.SectionSixExercises.ConstructorChallenge;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(-1, 0f, "defaultName", "default@domain.com", "0123456789");
        System.out.println("Empty constructor called, using default values");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(-1, 0, customerName, email, phoneNumber);
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double fundsToDeposit) {
        System.out.printf("Adding %.2f to balance%n", fundsToDeposit);
        balance += fundsToDeposit;
        System.out.printf("Total balance = %.2f%n", balance);
    }

    public void withdrawFunds(double fundsToWithdraw) {
        if (fundsToWithdraw > balance) {
            System.out.printf("Insufficient funds, cannot withdraw %.2f from total funds %.2f%n", fundsToWithdraw, balance);
        } else {
            System.out.printf("Withdrawing %.2f from balance%n", fundsToWithdraw);
            balance -= fundsToWithdraw;
            System.out.printf("Remaining balance = %.2f%n", balance);
        }
    }
}

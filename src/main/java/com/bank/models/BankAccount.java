package com.bank.models;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    private static int totalAccounts = 0;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts+= 1;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + balance);
        }
    }


    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds! Current balance: " + balance);
            return;
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
    }

    public static void displayTotalAccounts() {
        System.out.println("Total Bank Accounts Created: " + totalAccounts);
    }

}

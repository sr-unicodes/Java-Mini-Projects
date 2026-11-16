package com.bank.core;

import com.bank.models.BankAccount;
import com.bank.models.SavingsAccount;
public class Main {
    public static void main(String[] args){

        System.out.println("--- Testing Parent (BankAccount) ---");
        BankAccount standardAccount = new BankAccount("ACC-001", "John Doe", 1000.0);
        standardAccount.deposit(200);
        standardAccount.withdraw(1500);

        System.out.println("\n--- Testing Child (SavingsAccount) ---");
        SavingsAccount savings = new SavingsAccount("SAV-002", "Jane Smith", 2000.0, 5.0);

        savings.deposit(500);

        System.out.println("\nAttempting 1600 withdrawal on Savings:");
        savings.withdraw(1600);

        System.out.println("\nAttempting 2100 withdrawal on Savings:");
        savings.withdraw(2100);

        System.out.println("\n--- Testing Inherited Deposit via Child's addInterest ---");
        savings.addInterest();

        System.out.println("\n--- Testing Static Memory ---");
        BankAccount.displayTotalAccounts();
    }
}

package com.bank.models;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate){
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount){
        if ((getBalance() - amount) < 500){
            System.out.println("error");
            return;
        }else {
            super.withdraw(amount);
        }
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        System.out.println("Adding interest at " + interestRate + "%");
        deposit(interest);
    }


}

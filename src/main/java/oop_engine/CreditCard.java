package oop_engine;

public class CreditCard extends Card{
    private double creditLimit;

    public CreditCard(String cardNumber, double balance, double creditLimit){
        super(cardNumber,balance);
        this.creditLimit = creditLimit;
    }
    @Override
    public void processPayment(double amount){
        if (amount <= creditLimit){
            System.out.println("Credit approved for $" + amount);
        }
        else {
            System.out.println("Declined: Exceeds credit limit.");
        }
    }
}

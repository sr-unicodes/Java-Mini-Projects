package oop_engine;

public class DebitCard extends Card {
    public DebitCard(String cardNumber, double balance) {
        super(cardNumber, balance);
    }

    @Override
    public void processPayment(double amount) {
        if (amount <= getBalance()){
            setBalance(getBalance() - amount);
            System.out.println("Payment successful! New balance: $" + getBalance());
        } else {
            System.out.println("Declined: Insufficient funds.");
        }
        }
    }






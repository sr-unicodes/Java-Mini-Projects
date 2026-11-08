package oop_engine;

public abstract class Card {
    private String cardNumber;
    private double balance;

    public Card(String cardNumber, double balance){
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public abstract void processPayment(double amount);
}
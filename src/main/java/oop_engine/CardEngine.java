package oop_engine;

public class CardEngine {
    public static void main(String[] args){

        Card myDebit = new DebitCard("DEBIT-123", 500.00);
        Card myCredit = new CreditCard("CREDIT-999",0.00, 1000.00);

        System.out.println("--- Testing Debit Card ---");

        myDebit.processPayment(100.00);

        myDebit.processPayment(900.00);

        System.out.println("\n--- Testing Credit Card ---");

        myCredit.processPayment(850.00);

        myCredit.processPayment(1200.00);
    }
}

package payment_engine;

public class Account {
    private String accountId;
    private String ownerName;
    private double balance;

    public Account(String accountId, String ownerName, double balance){
        this.accountId = accountId;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
}

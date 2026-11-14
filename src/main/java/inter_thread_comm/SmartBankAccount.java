package inter_thread_comm;

public class SmartBankAccount {
    private double balance = 0.0;
    public synchronized void withdraw(double amount, String billName){
        while (balance < amount){
            System.out.println(billName + " is waiting for funds. Current balance: $" + balance);            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println(billName + " successfully processed for $" + amount + ". Remaining balance: $" + balance);
    }
    public synchronized void deposit(double amount){
        balance += amount;
        System.out.println("Salary deposited: $" + amount + ". Notifying all waiting bills...");        notifyAll();
    }

}

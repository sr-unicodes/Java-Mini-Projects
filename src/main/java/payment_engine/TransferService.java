package payment_engine;

public class TransferService {
    public void transfer(Account fromAccount, Account toAccount, double amount){
        synchronized (fromAccount) {
            synchronized (toAccount) {
                if (fromAccount.getBalance() >= amount){
                    try {
                        Thread.sleep(50);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    fromAccount.withdraw(amount);
                    toAccount.deposit(amount);
                    System.out.println("Success: Transferred $" + amount);
                } else {
                    System.out.println("Declined: Insufficient funds for transfer.");
                }
                }
            }
        }
    }


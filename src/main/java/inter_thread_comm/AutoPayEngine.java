package inter_thread_comm;

public class AutoPayEngine {
    public static void main(String[] args){

        SmartBankAccount account = new SmartBankAccount();

        Thread netflixBill = new Thread(() -> account.withdraw(15.00,"Netflix"));
        Thread paycheck = new Thread(() -> account.deposit(100.00));

        netflixBill.start();

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        paycheck.start();
    }
}

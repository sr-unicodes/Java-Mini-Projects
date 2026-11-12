package payment_engine;

public class PaymentEngineApp {
    public static void main(String[] args){
        PaymentEngineApp paymentEngineApp = new PaymentEngineApp();

        Account myAccount = new Account("ACC-101", "My Account", 1000.00);
        Account storeAccount = new Account("ACC-202", "Amazon Store", 500.00);

        TransferService engine = new TransferService();

        Thread buyer1 = new Thread(() -> engine.transfer(myAccount,storeAccount,200.00));
        Thread buyer2 = new Thread(() -> engine.transfer(myAccount,storeAccount,900.00));

        buyer1.start();
        buyer2.start();
    }
}

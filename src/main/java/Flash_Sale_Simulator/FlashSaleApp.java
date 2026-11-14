package Flash_Sale_Simulator;

public class FlashSaleApp {
    public static void main(String[] args){

        TicketCounter sharedCounter = new TicketCounter(10);

        Thread t1 = new Thread(new TicketBuyer(sharedCounter, "Alice", 4));
        Thread t2 = new Thread(new TicketBuyer(sharedCounter, "Bob", 3));
        Thread t3 = new Thread(new TicketBuyer(sharedCounter, "Charlie", 4));
        Thread t4 = new Thread(new TicketBuyer(sharedCounter, "Dave", 2));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Flash sale is completely over!");
    }
}

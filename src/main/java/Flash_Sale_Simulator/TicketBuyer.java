package Flash_Sale_Simulator;

public class TicketBuyer implements Runnable{
   private TicketCounter counter;
   private String buyerName;
   private int ticketsToBuy;

   public TicketBuyer(TicketCounter counter, String buyerName, int ticketsToBuy) {
      this.counter = counter;
      this.buyerName = buyerName;
      this.ticketsToBuy = ticketsToBuy;
   }

   public void run(){
      counter.bookTicket(buyerName, ticketsToBuy);
   }
}

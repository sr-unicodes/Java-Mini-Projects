package Flash_Sale_Simulator;

public class TicketCounter {
    private int availableTickets = 10;

    public TicketCounter(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public synchronized void bookTicket(String buyerName, int numberOfTickets){
        if(availableTickets >= numberOfTickets){
            try {
                Thread.sleep(100);
                availableTickets-= numberOfTickets;
                System.out.println(buyerName + " successfully booked " + numberOfTickets + " tickets. Tickets left: " + availableTickets);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }else{
            System.out.println(buyerName + " failed to book. Not enough tickets left!");
        }

    }
}


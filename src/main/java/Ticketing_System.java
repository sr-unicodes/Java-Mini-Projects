import java.util.*;

class Ticket {
    private int id;
    private String user;
    private int severity;

    public Ticket(int id, String user, int severity) {
        this.id = id;
        this.user = user;
        this.severity = severity;
    }

    public int getId() { return id; }
    public String getUser() { return user; }
    public int getSeverity() { return severity; }
}

class SupportEngine {

    private Map<Integer, String> ticketStatus = new HashMap<>();

    private Set<String> banned = new HashSet<>();

    private Queue<Ticket> standardTickets = new LinkedList<>();

    private PriorityQueue<Ticket> urgentTickets = new PriorityQueue<>((t1, t2) -> t2.getSeverity() - t1.getSeverity());

    private Deque<Ticket> closedTickets = new ArrayDeque<>();

    public void submitTicket(Ticket t) {
        if (banned.contains(t.getUser())) {
            System.out.println("Ticket rejected");
            return;
        }
        ticketStatus.put(t.getId(), "OPEN");
        if (t.getSeverity() >= 8) {
            urgentTickets.offer(t);
        } else {
            standardTickets.offer(t);
        }
    }

    public void processNextTicket(){

        Ticket currentTicket =  urgentTickets.poll();
        if (currentTicket == null){
            currentTicket = standardTickets.poll();
        }

        if (currentTicket == null){
            System.out.println("No pending tickets");
            return;
        }

        ticketStatus.put(currentTicket.getId(),"CLOSED");

        closedTickets.push(currentTicket);
            System.out.println("Processed Ticket ID: " + currentTicket.getId());
    }

    public void undoLastClosed(){

        if (closedTickets.isEmpty()){
            System.out.println("No history to undo.");
        }

        Ticket lastClosed = closedTickets.pop();
        ticketStatus.put(lastClosed.getId(), "OPEN");

        if (lastClosed.getSeverity() >= 8){
            urgentTickets.offer(lastClosed);
        }else {
            standardTickets.offer(lastClosed);
        }
        System.out.println("Undid closure for Ticket ID: " + lastClosed.getId());
    }
}

public class Ticketing_System {
    public static void main(String[] args){
        SupportEngine engine = new SupportEngine();

        engine.submitTicket(new Ticket(101, "Alice", 3));
        engine.submitTicket(new Ticket(102, "Bob", 9));
        engine.submitTicket(new Ticket(103, "Charlie", 5));

        engine.processNextTicket();
        engine.undoLastClosed();
        engine.processNextTicket();

    }
}

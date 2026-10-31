import java.util.*;

class LogMessage{
    private int id;
    private String level;
    private String message;


    public LogMessage(int id, String level, String message) {
        this.id = id;
        this.level = level;
        this.message = message;
    }

    @Override
    public String toString() {
        return "LogMessage{" +
                "id=" + id +
                ", level='" + level + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }
}

class ServerLogManager implements Iterable<LogMessage> {

    private List<LogMessage> activeLogs = new LinkedList<>();
    public void addLog(LogMessage log){
        activeLogs.add(log);
    }

    @Override
    public Iterator<LogMessage> iterator(){
        return activeLogs.iterator();
    }
    public List<LogMessage> exportToArrayList() {
        return new ArrayList<>(activeLogs);
    }


}
public class LogApp {
    public static void main(String[] args){
        ServerLogManager manager = new ServerLogManager();
        manager.addLog(new LogMessage(101, "INFO", "System Booted"));
        manager.addLog(new LogMessage(102, "ERROR", "Database connection failed"));
        manager.addLog(new LogMessage(103, "WARNING", "High memory usage"));

        for (LogMessage log : manager){
            System.out.println(log);
        }
        List<LogMessage> fastAccessList = manager.exportToArrayList();
        System.out.println("Exported Log: " + fastAccessList.get(1));

    }

}

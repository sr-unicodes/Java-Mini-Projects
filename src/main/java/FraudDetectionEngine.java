import java.util.*;

class Transaction{
    private String accountId;
    private int amount;

    public Transaction(String accountId, int amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public int getAmount() {
        return amount;
    }
}

class FraudEngine {
    private List<Transaction> ledger = new ArrayList<>();
    private Set<String> blacklist = new HashSet<>();
    private Map<String, Integer> balances = new HashMap<>();

    public void addBlacklisted(String ip) {
        blacklist.add(ip);
    }

    public void processTransaction(Transaction t, String ip) {
        if (blacklist.contains(ip)) {
            System.out.println("FRAUD ALERT: " + ip + " rejected");
            return;
        }
        ledger.add(t);
        int currentBalance = balances.getOrDefault(t.getAccountId(), 0);

        balances.put(t.getAccountId(), currentBalance + t.getAmount());

    }

    public void printBalances() {
        for (Map.Entry<String, Integer> entry : balances.entrySet()) {
            System.out.println("Account: " + entry.getKey() + "| Balance: $" + entry.getValue());
        }
    }
}
public class FraudDetectionEngine {
    public static void main(String[] args){
        FraudEngine engine = new FraudEngine();

        engine.addBlacklisted("192.168.1.99");

        engine.processTransaction(new Transaction("ACC-001", 500), "10.0.0.1");
        engine.processTransaction(new Transaction("ACC-001", 200), "10.0.0.1");
        engine.processTransaction(new Transaction("ACC-002", 9000), "192.168.1.99");

        engine.printBalances();
    }
}

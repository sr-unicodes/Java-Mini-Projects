import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

class Payment implements Comparable<Payment>{
    private String txnId;
    private double amount;

    public Payment(String txnId, double amount){
        this.txnId = txnId;
        this.amount = amount;
    }

    public String getTxnId() {
        return txnId;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "txnId='" + txnId + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int compareTo(Payment other) {
        return Double.compare(other.getAmount(), this.getAmount());
    }
}
public class Payment_Processing_Engine {
    public static void main(String[] args){

        Queue<Payment> queue = new PriorityQueue<>();
        queue.add(new Payment("TXN-1", 100.50));
        queue.add(new Payment("TXN-2", 900.00));
        queue.add(new Payment("TXN-3", 45.25));

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }




}

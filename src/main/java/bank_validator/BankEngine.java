package bank_validator;

public class BankEngine {
    public static void main(String[] args){
        BankTransferService service = new BankTransferService();
        try {
            service.processTransfer("ACC123", 15000.00);
        }
        catch (InsufficientFundsException e) {
            System.out.println("Payment Failed: " + e.getMessage());
        }
        catch (InvalidAccountException e){
            System.out.println("Data Error: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction session closed.");
        }

    }
}

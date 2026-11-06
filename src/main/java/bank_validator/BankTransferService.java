package bank_validator;

public class BankTransferService {

    public void processTransfer(String accountId, double amount) throws InsufficientFundsException {
        if (accountId == null || accountId.length() < 5){
            throw new InvalidAccountException("Invalid Account ID: Must be at least 5 characters.");
        }

        if (amount > 10000){
            throw new InsufficientFundsException("Insufficient funds: Transfer amount exceeds your $10,000 balance.");
        }

        System.out.println("Transfer of $" + amount + " to account " + accountId + " successful.");
    }


}

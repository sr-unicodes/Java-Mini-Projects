package bank_validator;

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
    super(message);
}
}

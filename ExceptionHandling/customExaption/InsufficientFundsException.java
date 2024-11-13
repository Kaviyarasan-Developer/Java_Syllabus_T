// Custom exception class for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money, throws exception for insufficient funds
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for this withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", Remaining Balance: " + balance);
    }

    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(1000);
            account.withdraw(1500); // This will throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

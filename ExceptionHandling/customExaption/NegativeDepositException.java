// Custom exception class for negative deposit
class NegativeDepositException extends Exception {
    public NegativeDepositException(String message) {
        super(message);
    }
}

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money, throws exception for negative amounts
    public void deposit(double amount) throws NegativeDepositException {
        if (amount < 0) {
            throw new NegativeDepositException("Deposit amount cannot be negative.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ", Current Balance: " + balance);
    }

    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(1000);
            account.deposit(-500); // This will throw NegativeDepositException
        } catch (NegativeDepositException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

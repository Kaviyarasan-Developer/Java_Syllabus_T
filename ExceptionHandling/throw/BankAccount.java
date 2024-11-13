

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            // Throw an exception if amount is greater than balance
            throw new IllegalArgumentException("Insufficient balance. Cannot withdraw " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        try {
            System.out.println("Attempting to withdraw $600...");
            account.withdraw(600.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}

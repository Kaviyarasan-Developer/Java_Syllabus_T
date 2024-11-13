


class BankAccount {
    private int balance = 0;

    // Method for depositing money
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + " | Current Balance: $" + balance);
        notifyAll(); // Notify waiting threads after depositing
    }

    // Method for withdrawing money
    public synchronized void withdraw(int amount) throws InterruptedException {
        while (balance < amount) {
            System.out.println("Insufficient funds for withdrawal of $" + amount + ". Waiting for deposit...");
            wait(); // Wait if balance is insufficient
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount + " | Remaining Balance: $" + balance);
    }
}

// Depositor thread class
class Depositor extends Thread {
    private final BankAccount account;
    private final int amount;

    public Depositor(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(amount);
            try {
                Thread.sleep(100); // Simulate time between deposits
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Withdrawer thread class
class Withdrawer extends Thread {
    private final BankAccount account;
    private final int amount;

    public Withdrawer(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                account.withdraw(amount);
                Thread.sleep(150); // Simulate time between withdrawals
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Create one depositor and two withdrawer threads
        Depositor depositor = new Depositor(account, 100);
        Withdrawer withdrawer1 = new Withdrawer(account, 150);
        Withdrawer withdrawer2 = new Withdrawer(account, 200);

        // Start threads
        depositor.start();
        withdrawer1.start();
        withdrawer2.start();
    }
}

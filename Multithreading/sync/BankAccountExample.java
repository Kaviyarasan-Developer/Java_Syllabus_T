


// BankAccount class with synchronized deposit and withdraw methods
class BankAccount {
    private int balance = 1000; // Initial balance

    // Method to deposit amount into the account
    public void deposit(int amount) {
        synchronized (this) { // Synchronized block
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + balance);
        }
    }

    // Method to withdraw amount from the account
    public void withdraw(int amount) {
        synchronized (this) { // Synchronized block
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". New balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " attempted to withdraw " + amount + " but insufficient balance.");
            }
        }
    }

    // Method to get the current balance
    public int getBalance() {
        return balance;
    }
}

// Thread class for performing deposit and withdrawal operations
class BankTransaction extends Thread {
    private BankAccount account;
    private boolean deposit;
    private int amount;

    public BankTransaction(BankAccount account, boolean deposit, int amount) {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }

    public void run() {
        if (deposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

// Main class
public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(); // Shared bank account

        // Creating threads for deposit and withdrawal
        BankTransaction t1 = new BankTransaction(account, true, 500);  // Deposit 500
        BankTransaction t2 = new BankTransaction(account, false, 700); // Withdraw 700
        BankTransaction t3 = new BankTransaction(account, true, 300);  // Deposit 300
        BankTransaction t4 = new BankTransaction(account, false, 400); // Withdraw 400

        // Starting the threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            // Waiting for all threads to complete
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Display the final balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}

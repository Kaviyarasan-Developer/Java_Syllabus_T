


// Thread for calculating the sum of numbers
class SumRunnable implements Runnable {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("Sum Thread - Adding: " + i + ", Current Sum: " + sum);
            try {
                Thread.sleep(300); // Sleep for 0.3 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Final Sum (1 to 10): " + sum);
    }
}

// Thread for calculating the product of numbers
class ProductRunnable implements Runnable {
    public void run() {
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
            System.out.println("Product Thread - Multiplying: " + i + ", Current Product: " + product);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Final Product (1 to 5): " + product);
    }
}

// Main class
public class CalculationThreadsExample {
    public static void main(String[] args) {
        // Creating instances of Runnable implementations
        SumRunnable sumRunnable = new SumRunnable();
        ProductRunnable productRunnable = new ProductRunnable();

        // Creating Thread objects and passing the Runnables
        Thread sumThread = new Thread(sumRunnable);
        Thread productThread = new Thread(productRunnable);

        // Starting both threads
        sumThread.start();
        productThread.start();
    }
}

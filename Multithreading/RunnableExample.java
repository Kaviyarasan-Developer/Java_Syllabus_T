

// Implementing the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable(); // Creating an instance of MyRunnable
        Thread thread = new Thread(myRunnable);   // Creating a Thread object with MyRunnable

        thread.start(); // Starting the Runnable thread

        // Running another loop in the main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

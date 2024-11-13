

// Thread to print even numbers
class EvenThread extends Thread {
    private int limit;

    public EvenThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 2; i <= limit; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(500); // Timed Waiting state for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Even Thread completed.");
    }
}

// Thread to print odd numbers
class OddThread extends Thread {
    private int limit;

    public OddThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 1; i <= limit; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(500); // Timed Waiting state for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Odd Thread completed.");
    }
}

// Main class
public class EvenOddThreadsExample {
    public static void main(String[] args) {
        int limit = 10;

        // Creating instances of EvenThread and OddThread
        EvenThread evenThread = new EvenThread(limit); // Thread in New state
        OddThread oddThread = new OddThread(limit); // Thread in New state

        // Starting both threads
        evenThread.start(); // Thread moves to Runnable state
        oddThread.start(); // Thread moves to Runnable state

        try {
            // Waiting for both threads to complete
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread completed."); // Main thread in Terminated state
    }
}




// Counter class with synchronized method to increment the count
class Counter {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
        count++;
    }

    // Method to get the current count
    public int getCount() {
        return count;
    }
}

// Thread class that increments the Counter
class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // Only one thread can access this method at a time
        }
    }
}

// Main class
public class SynchronizedExample {
    public static void main(String[] args) {
        Counter counter = new Counter(); // Shared resource

        // Creating multiple threads that will try to increment the counter
        CounterThread thread1 = new CounterThread(counter);
        CounterThread thread2 = new CounterThread(counter);
        CounterThread thread3 = new CounterThread(counter);

        // Starting the threads
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // Waiting for all threads to complete
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Display the final count
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}

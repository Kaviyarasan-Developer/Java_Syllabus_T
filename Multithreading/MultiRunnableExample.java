


// Thread for counting up
class CountUpRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count Up: " + i);
            try {
                Thread.sleep(700); // Sleep for 0.7 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread for counting down
class CountDownRunnable implements Runnable {
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println("Count Down: " + i);
            try {
                Thread.sleep(700); // Sleep for 0.7 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class MultiRunnableExample {
    public static void main(String[] args) {
        // Creating instances of Runnable implementations
        CountUpRunnable countUp = new CountUpRunnable();
        CountDownRunnable countDown = new CountDownRunnable();

        // Creating Thread objects and passing the Runnables
        Thread upThread = new Thread(countUp);
        Thread downThread = new Thread(countDown);

        // Starting both threads
        upThread.start();
        downThread.start();
    }
}

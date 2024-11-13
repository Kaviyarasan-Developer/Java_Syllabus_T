

// Example of creating a thread by extending the Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000); // Makes the thread sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Creating a new thread
        t1.start(); // Starting the thread

        // Running another loop in the main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
            try {
                Thread.sleep(1000); // Makes the main thread sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

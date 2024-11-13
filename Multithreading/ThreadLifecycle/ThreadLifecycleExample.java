

//New --> Runnable --> Running --> 
// -->Waiting / Timed Waiting / Blocked 
// --> Runnable --> Terminated


// Thread class that prints numbers from 1 to 5
class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                // Pauses for 1 second (Timed Waiting state)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread is completed."); // Thread is now in Terminated state
    }
}

// Main class
public class ThreadLifecycleExample {
    public static void main(String[] args) {
        NumberThread thread = new NumberThread(); // Thread is in New state
        System.out.println("Thread state after creation: " + thread.getState());

        thread.start(); // Thread is in Runnable state
        System.out.println("Thread state after start: " + thread.getState());

        try {
            // Wait for the thread to complete (puts main thread in Timed Waiting state)
            thread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // After completion, the thread is in Terminated state
        System.out.println("Thread state after completion: " + thread.getState());
    }
}


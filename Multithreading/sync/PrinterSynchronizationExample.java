


// Printer class with a synchronized print method
class Printer {
    // Synchronized method to print a document
    public synchronized void printDocument(String documentName, int numPages) {
        System.out.println(Thread.currentThread().getName() + " started printing " + documentName);
        
        for (int i = 1; i <= numPages; i++) {
            System.out.println(Thread.currentThread().getName() + " printing page " + i + " of " + documentName);
            try {
                Thread.sleep(500); // Simulate time taken to print each page
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        
        System.out.println(Thread.currentThread().getName() + " finished printing " + documentName);
    }
}

// Thread class representing a user printing a document
class User extends Thread {
    private Printer printer;
    private String documentName;
    private int numPages;

    public User(Printer printer, String documentName, int numPages) {
        this.printer = printer;
        this.documentName = documentName;
        this.numPages = numPages;
    }

    public void run() {
        printer.printDocument(documentName, numPages);
    }
}

// Main class
public class PrinterSynchronizationExample {
    public static void main(String[] args) {
        Printer printer = new Printer(); // Shared printer resource

        // Creating multiple user threads, each printing a document
        User user1 = new User(printer, "Document1", 3);
        User user2 = new User(printer, "Document2", 2);
        User user3 = new User(printer, "Document3", 4);

        // Starting the threads
        user1.start();
        user2.start();
        user3.start();

        try {
            // Waiting for all threads to complete
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("All print jobs completed.");
    }
}

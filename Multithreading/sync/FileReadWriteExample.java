import java.io.*;

// Class for reading from a file
class ReaderThread extends Thread {
    private final File file;

    public ReaderThread(File file) {
        this.file = file;
    }

    public void run() {
        synchronized (file) { // Synchronize on the file object to prevent simultaneous read/write
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                System.out.println("Starting file reading:");
                while ((line = reader.readLine()) != null) {
                    System.out.println("Read: " + line);
                    Thread.sleep(500); // Simulate time taken for reading
                }
                System.out.println("Finished reading the file.");
            } catch (IOException | InterruptedException e) {
                System.out.println("Error while reading file: " + e.getMessage());
            }
        }
    }
}

// Class for writing to a file
class WriterThread extends Thread {
    private final File file;
    private final String content;

    public WriterThread(File file, String content) {
        this.file = file;
        this.content = content;
    }

    public void run() {
        synchronized (file) { // Synchronize on the file object to prevent simultaneous read/write
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) { // Append mode
                System.out.println("Starting file writing:");
                writer.write(content);
                writer.newLine();
                System.out.println("Wrote: " + content);
                Thread.sleep(500); // Simulate time taken for writing
                System.out.println("Finished writing to the file.");
            } catch (IOException | InterruptedException e) {
                System.out.println("Error while writing to file: " + e.getMessage());
            }
        }
    }
}

// Main class to demonstrate file reading and writing using threads
public class FileReadWriteExample {
    public static void main(String[] args) {
        File file = new File("example.txt");

        // Creating writer and reader threads
        WriterThread writer1 = new WriterThread(file, "Hello, this is the first line.");
        WriterThread writer2 = new WriterThread(file, "This is another line added by a different thread.");
        ReaderThread reader = new ReaderThread(file);

        // Starting the writer and reader threads
        writer1.start();
        writer2.start();
        reader.start();

        try {
            // Waiting for all threads to complete
            writer1.join();
            writer2.join();
            reader.join();
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("File reading and writing operations completed.");
    }
}

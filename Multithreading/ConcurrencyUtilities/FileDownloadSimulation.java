


import java.util.concurrent.*;

public class FileDownloadSimulation {
    public static void main(String[] args) throws InterruptedException {
        // Number of files to download
        int numFiles = 3;

        // Create a CountDownLatch to wait for all downloads
        CountDownLatch latch = new CountDownLatch(numFiles);

        // Create an ExecutorService with a fixed thread pool
        ExecutorService executor = Executors.newFixedThreadPool(numFiles);

        // Create tasks for downloading files
        for (int i = 1; i <= numFiles; i++) {
            int fileId = i; // Local variable for lambda expression
            executor.submit(() -> {
                try {
                    System.out.println("Starting download of file " + fileId);
                    Thread.sleep(2000);  // Simulate download time
                    System.out.println("Download complete for file " + fileId);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    latch.countDown();  // Signal that download is complete
                }
            });
        }

        // Wait for all downloads to complete
        latch.await();
        System.out.println("All files downloaded. Ready to process files!");

        // Shutdown the executor
        executor.shutdown();
    }
}

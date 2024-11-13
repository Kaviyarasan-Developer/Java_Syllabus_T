


import java.util.concurrent.*;

public class SumCalculator {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Number of tasks
        int numTasks = 2;
        
        // Create a CountDownLatch for synchronizing tasks
        CountDownLatch latch = new CountDownLatch(numTasks);
        
        // Create an ExecutorService with a fixed thread pool
        ExecutorService executor = Executors.newFixedThreadPool(numTasks);
        
        // Define two tasks that calculate partial sums
        Callable<Integer> task1 = () -> {
            int sum = 0;
            for (int i = 1; i <= 5; i++) {
                sum += i;
            }
            latch.countDown();  // Decrement latch count when done
            return sum;
        };

        Callable<Integer> task2 = () -> {
            int sum = 0;
            for (int i = 6; i <= 10; i++) {
                sum += i;
            }
            latch.countDown();  // Decrement latch count when done
            return sum;
        };

        // Submit tasks to executor and get Future objects
        Future<Integer> result1 = executor.submit(task1);
        Future<Integer> result2 = executor.submit(task2);

        // Wait for both tasks to complete using the latch
        latch.await();

        // Retrieve the partial results and calculate total sum
        int totalSum = result1.get() + result2.get();
        System.out.println("The sum from 1 to 10 is: " + totalSum);

        // Shutdown the executor
        executor.shutdown();
    }
}

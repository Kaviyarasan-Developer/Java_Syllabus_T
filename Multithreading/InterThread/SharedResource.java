


class SharedResource {
    private int data;
    private boolean isProduced = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (isProduced) {
            wait(); // Wait if data is already produced
        }
        data = value;
        System.out.println("Produced: " + data);
        isProduced = true;
        notify(); // Notify the consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (!isProduced) {
            wait(); // Wait if data is not yet produced
        }
        System.out.println("Consumed: " + data);
        isProduced = false;
        notify(); // Notify the producer
    }
}

class Producer extends Thread {
    private final SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                resource.produce(i);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    private final SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                resource.consume();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}

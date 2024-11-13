

class Game {
    private boolean pingTurn = true;

    // Method for printing "Ping"
    public synchronized void ping() throws InterruptedException {
        while (!pingTurn) {
            wait(); // Wait if it's not Ping's turn
        }
        System.out.println("Ping");
        pingTurn = false;
        notify(); // Notify the Pong thread
    }

    // Method for printing "Pong"
    public synchronized void pong() throws InterruptedException {
        while (pingTurn) {
            wait(); // Wait if it's not Pong's turn
        }
        System.out.println("Pong");
        pingTurn = true;
        notify(); // Notify the Ping thread
    }
}

class PingThread extends Thread {
    private final Game game;

    public PingThread(Game game) {
        this.game = game;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                game.ping();
                Thread.sleep(100); // Add a short delay
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class PongThread extends Thread {
    private final Game game;

    public PongThread(Game game) {
        this.game = game;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                game.pong();
                Thread.sleep(100); // Add a short delay
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class PingPongDemo {
    public static void main(String[] args) {
        Game game = new Game();
        PingThread ping = new PingThread(game);
        PongThread pong = new PongThread(game);

        // Start the threads
        ping.start();
        pong.start();
    }
}

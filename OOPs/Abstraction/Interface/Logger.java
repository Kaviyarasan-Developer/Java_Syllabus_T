
package OOPs.Abstraction.Interface;

interface Logger {
    void log(String message);
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Console Logger: " + message);
    }
}

class FileLogger implements Logger {
    @Override
    public void log(String message) {
        // Simulating file logging
        System.out.println("File Logger: " + message + " (saved to file)");
    }
}

 class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        consoleLogger.log("This is a console log."); // Outputs: Console Logger: This is a console log.

        Logger fileLogger = new FileLogger();
        fileLogger.log("This is a file log."); // Outputs: File Logger: This is a file log. (saved to file)
    }
}

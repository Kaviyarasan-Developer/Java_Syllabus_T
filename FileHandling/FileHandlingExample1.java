

import java.io.*;

public class FileHandlingExample1 {

    // Method to write data to a file
    public static void writeFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read data from a file
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading data from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "Hello, this is a sample text written to the file.\nWelcome to Java file handling.";

        // Write content to the file
        writeFile(fileName, content);

        // Read content from the file
        readFile(fileName);
    }
}

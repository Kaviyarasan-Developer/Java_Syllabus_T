

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class FileAppendExample {

    // Method to append data to a file
    public static void appendToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName, true)) { // 'true' enables append mode
            writer.write(content + "\n");
            System.out.println("Data appended to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }

    // Method to read data from a file
    public static void readFile(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            System.out.println("Reading data from file:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileName = "example_append.txt";
        String content1 = "This is the first line of text.";
        String content2 = "This is an appended line of text.";

        // Append content to the file
        appendToFile(fileName, content1);
        appendToFile(fileName, content2);

        // Read content from the file
        readFile(fileName);
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExample {

    // Method that may throw a FileNotFoundException
    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            readFile("example.txt"); // File path that may not exist
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

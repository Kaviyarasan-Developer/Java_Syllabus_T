import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String input = scanner.nextLine();

            // Attempt to parse the input as an integer
            int number = Integer.parseInt(input);

            System.out.println("You entered: " + number);

        } catch (NumberFormatException e) {
            // Handle the exception if input is not a valid integer
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close(); // Ensure Scanner is closed
            System.out.println("Scanner closed.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}

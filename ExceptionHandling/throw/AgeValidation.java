

import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
            System.out.println("You are eligible to vote.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }

    // Method that checks if the age is valid
    public static void checkAge(int age) {
        if (age < 18) {
            // Throw an exception if age is less than 18
            throw new IllegalArgumentException("Age must be 18 or older to vote.");
        }
    }
}

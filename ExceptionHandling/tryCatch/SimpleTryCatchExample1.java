

public class SimpleTryCatchExample1 {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0; // This will cause a division by zero

        try {
            // This line will throw an ArithmeticException if denominator is 0
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // This block will run if a division by zero occurs
            System.out.println("Error: Cannot divide by zero.");
        }

        System.out.println("Program continues after try-catch.");
    }
}

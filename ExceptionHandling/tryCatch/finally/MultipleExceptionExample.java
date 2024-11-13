public class MultipleExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int index = 5; // This index is out of bounds
        int divisor = 0; // This will cause division by zero

        try {
            // Attempt to access an out-of-bounds index
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);

            // Attempt to divide by zero
            int result = numbers[1] / divisor;
            System.out.println("Division result: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Execution completed. Cleaning up resources if any.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}

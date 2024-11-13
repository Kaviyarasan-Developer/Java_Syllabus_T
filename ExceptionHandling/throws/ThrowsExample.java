

public class ThrowsExample {

    // Method that can throw an exception
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b; // may throw ArithmeticException if b is 0
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

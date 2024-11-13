

// Custom runtime exception class
class InvalidInputRuntimeException extends RuntimeException {
    public InvalidInputRuntimeException(String message) {
        super(message);
    }
}

public class UserInputValidator {

    // Method to validate input, throws exception for invalid input
    public static void validateInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new InvalidInputRuntimeException("Input cannot be null or empty.");
        }
        System.out.println("Valid input: " + input);
    }

    public static void main(String[] args) {
        try {
            validateInput(""); // This will throw InvalidInputRuntimeException
        } catch (InvalidInputRuntimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

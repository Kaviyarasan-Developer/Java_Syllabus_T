// Custom runtime exception class
class InvalidAgeRuntimeException extends RuntimeException {
    public InvalidAgeRuntimeException(String message) {
        super(message);
    }
}

public class AgeValidator {

    // Method that throws the custom runtime exception
    public static void validateAge(int age) {
        if (age < 18) {
            // Throwing the custom runtime exception with a message
            throw new InvalidAgeRuntimeException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw InvalidAgeRuntimeException
        } catch (InvalidAgeRuntimeException e) {
            // Catching the custom runtime exception
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

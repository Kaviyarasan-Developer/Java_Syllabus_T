


// Custom exception class for invalid age range
class InvalidAgeRangeException extends Exception {
    public InvalidAgeRangeException(String message) {
        super(message);
    }
}

public class AgeRangeValidator {

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeRangeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeRangeException("Age must be between 0 and 150.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            validateAge(200); // This will throw InvalidAgeRangeException
        } catch (InvalidAgeRangeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

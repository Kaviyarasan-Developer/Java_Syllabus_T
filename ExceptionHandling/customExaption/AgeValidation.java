

// Custom exception class
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class AgeValidation {

    // Method that may throw an AgeException
    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or older.");
        }
        System.out.println("Access granted.");
    }

    public static void main(String[] args) {
        try {
            checkAge(15); // This will throw an AgeException
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

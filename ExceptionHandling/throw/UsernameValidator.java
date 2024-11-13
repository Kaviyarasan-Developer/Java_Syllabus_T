public class UsernameValidator {
    public static void main(String[] args) {
        String username = "Joe"; // Example of a short username

        try {
            validateUsername(username);
            System.out.println("Username is valid: " + username);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Program continues after exception handling.");
    }

    // Method that validates the length of the username
    public static void validateUsername(String username) {
        if (username.length() < 5) {
            // Throw an exception if the username is shorter than 5 characters
            throw new IllegalArgumentException("Username must be at least 5 characters long.");
        }
    }
}

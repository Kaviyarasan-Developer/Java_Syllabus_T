package Basic;
public class BreakAndContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Exiting the loop at 5.");
                break; // Exit the loop when i is 5
            }
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("Odd Number: " + i);
        }
        System.out.println("Loop finished.");
    }
}

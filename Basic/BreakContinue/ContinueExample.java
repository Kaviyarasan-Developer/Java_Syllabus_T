package Basic;
public class ContinueExample {
    public static void main(String[] args) {
        // Using continue to skip the iteration when i equals 3
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skips the current iteration
            }
            System.out.println("Number: " + i);
        }
        System.out.println("Loop completed.");
    }
}

package Basic;
public class NestedWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        // Nested while loop to print a simple pattern
        while (i <= 5) {
            int j = 1;
            while (j <= i) {
                System.out.print("* "); // Print asterisks
                j++;
            }
            System.out.println(); // New line after each row
            i++;
        }
    }
}

package Basic;
public class NestedForLoopExample {
    public static void main(String[] args) {
        // Nested for loop to print a multiplication table
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t"); // Print product with tab space
            }
            System.out.println(); // New line after each row
        }
    }
}

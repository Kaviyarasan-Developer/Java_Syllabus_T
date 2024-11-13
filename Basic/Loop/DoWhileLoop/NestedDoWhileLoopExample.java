package Basic;
public class NestedDoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        // Nested do-while loop to create a pattern
        do {
            int j = 1;
            do {
                System.out.print(j + " "); // Print numbers in the row
                j++;
            } while (j <= i);
            System.out.println(); // New line after each row
            i++;
        } while (i <= 5);
    }
}

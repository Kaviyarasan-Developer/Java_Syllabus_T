package Basic;
public class CombinedNestedLoopsExample {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 3; i++) {
            System.out.print("Row " + i + ": ");

            // Nested for loop for columns
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") "); // Print coordinates
            }

            System.out.println(); // New line for each row
        }

        System.out.println("Using while loops:");

        // Outer while loop
        int i = 1;
        while (i <= 3) {
            System.out.print("Row " + i + ": ");

            // Nested while loop
            int j = 1;
            while (j <= 3) {
                System.out.print("(" + i + "," + j + ") ");
                j++;
            }

            System.out.println(); // New line for each row
            i++;
        }

        System.out.println("Using do-while loops:");

        // Outer do-while loop
        i = 1;
        do {
            System.out.print("Row " + i + ": ");

            // Nested do-while loop
            int j = 1;
            do {
                System.out.print("(" + i + "," + j + ") ");
                j++;
            } while (j <= 3);

            System.out.println(); // New line for each row
            i++;
        } while (i <= 3);
    }
}

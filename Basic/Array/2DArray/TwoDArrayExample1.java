

public class TwoDArrayExample {
    public static void main(String[] args) {
        // Declaring and initializing a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Looping through the 2D array using an enhanced for loop
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}

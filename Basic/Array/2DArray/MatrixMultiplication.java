

public class MatrixMultiplication {
    public static void main(String[] args) {
        // Declaring and initializing two 2D arrays (matrices)
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };

        // Resultant matrix after multiplication (size of 2x2)
        int[][] result = new int[2][2];

        // Matrix multiplication logic
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Printing the resultant matrix
        System.out.println("Resultant Matrix after Multiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

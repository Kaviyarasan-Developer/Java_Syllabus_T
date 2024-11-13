


import java.util.Scanner;

public class TwoDArrayWithScanner {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Taking number of rows and columns as input
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        // Declare a 2D array with the given size
        int[][] matrix = new int[rows][cols];
        
        // Taking the array elements as input from the user
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Printing the original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Modifying an element (for example, changing element at [1][1])
        System.out.println("\nEnter row and column to modify (row col): ");
        int modifyRow = scanner.nextInt();
        int modifyCol = scanner.nextInt();
        
        System.out.print("Enter the new value: ");
        int newValue = scanner.nextInt();
        
        // Modifying the element at the specified position
        if (modifyRow >= 0 && modifyRow < rows && modifyCol >= 0 && modifyCol < cols) {
            matrix[modifyRow][modifyCol] = newValue;
        } else {
            System.out.println("Invalid row or column!");
        }
        
        // Printing the modified matrix
        System.out.println("\nModified Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Closing the scanner
        scanner.close();
    }
}

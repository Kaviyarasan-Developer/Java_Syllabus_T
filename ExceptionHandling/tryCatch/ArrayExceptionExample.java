

public class ArrayExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Attempt to access an index that is out of bounds
            System.out.println("Element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block handles the exception
            System.out.println("Error: Index out of bounds. The array size is " + numbers.length);
        }

        System.out.println("Program continues after try-catch.");
    }
}

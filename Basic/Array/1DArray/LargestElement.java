


public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 15, 30}; // Array with sample values
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Largest element in the array: " + max);
    }
}




public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, 4}; // Array with sample values
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}

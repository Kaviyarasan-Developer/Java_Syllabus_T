

public class AverageArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Array with sample values
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;
        System.out.println("Average of array elements: " + average);
    }
}



public class CountOccurrences {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 3, 8, 3, 1}; // Array with sample values
        int target = 3; // Number to count
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }

        System.out.println("Number " + target + " appears " + count + " times in the array.");
    }
}




public class CountEvenOdd {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Array with sample values
        int evenCount = 0, oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}

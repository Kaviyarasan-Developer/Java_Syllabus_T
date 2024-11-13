


public class StringArrayExample {
    public static void main(String[] args) {
        // Initializing the string array
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        
        // Printing each element of the array
        System.out.println("Fruits in the array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Modifying the second element (index 1)
        fruits[1] = "Blueberry";
        System.out.println("\nAfter modifying:");
        
        // Printing modified array
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Finding the length of the array
        System.out.println("\nLength of the array: " + fruits.length);
        
        // Checking if "Date" is in the array
        boolean containsDate = java.util.Arrays.asList(fruits).contains("Date");
        System.out.println("Is 'Date' in the array? " + containsDate);
    }
}

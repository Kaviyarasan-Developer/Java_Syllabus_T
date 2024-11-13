import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        // Create an ArrayList of mixed data types (Integer, String, Double)
        List<Object> mixedList = new ArrayList<>();

        // 1. Adding elements to the ArrayList
        mixedList.add(15);
        mixedList.add(10);
        mixedList.add(20);
        mixedList.add("Apple");
        mixedList.add("Banana");
        mixedList.add(45.5);
        mixedList.add(30.75);
        
        System.out.println("Original List: " + mixedList);

        // 2. Sorting the list (Only for numbers, so extracting numbers into a separate list)
        List<Integer> numberList = new ArrayList<>();
        numberList.add(15);
        numberList.add(10);
        numberList.add(20);
        
        Collections.sort(numberList);
        System.out.println("Sorted List of Numbers: " + numberList);
        
        // 3. Reversing the list
        Collections.reverse(numberList);
        System.out.println("Reversed Sorted List of Numbers: " + numberList);

        // 4. Checking if an element exists in the list
        boolean containsApple = mixedList.contains("Apple");
        System.out.println("Does the list contain 'Apple'? " + containsApple);

        // 5. Removing elements from the list by index and by object
        mixedList.remove(1);  // Removes element at index 1 (value 10)
        System.out.println("List after removing element at index 1: " + mixedList);
        
        mixedList.remove("Banana");  // Removes the object "Banana"
        System.out.println("List after removing 'Banana': " + mixedList);
        
        // 6. Adding an element at the beginning
        mixedList.add(0, "Orange");
        System.out.println("List after adding 'Orange' at the beginning: " + mixedList);

        // 7. Getting the size of the list
        System.out.println("Size of the mixed list: " + mixedList.size());

        // 8. Checking if the list is empty
        boolean isEmpty = mixedList.isEmpty();
        System.out.println("Is the mixed list empty? " + isEmpty);

        // 9. Iterating through the list using for-each loop
        System.out.println("Iterating through mixed list using for-each loop:");
        for (Object element : mixedList) {
            System.out.println(element);
        }

        // 10. Clearing all elements from the list
        mixedList.clear();
        System.out.println("List after clearing all elements: " + mixedList);
    }
}

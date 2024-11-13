

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integer values
        List<Integer> numbers = new ArrayList<>();

        // 1. Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        System.out.println("ArrayList after adding elements: " + numbers);
        
        // 2. Adding an element at a specific position
        numbers.add(2, 25);  // Adds 25 at index 2
        System.out.println("ArrayList after adding 25 at index 2: " + numbers);

        // 3. Removing an element by value
        numbers.remove(Integer.valueOf(30));  // Removes the first occurrence of 30
        System.out.println("ArrayList after removing 30: " + numbers);
        
        // 4. Removing an element by index
        numbers.remove(1);  // Removes the element at index 1 (which is 20)
        System.out.println("ArrayList after removing element at index 1: " + numbers);
        
        // 5. Updating an element at a specific index
        numbers.set(2, 60);  // Replaces the element at index 2 with 60
        System.out.println("ArrayList after updating element at index 2 to 60: " + numbers);
        
        // 6. Checking if an element exists in the ArrayList
        boolean contains50 = numbers.contains(50);
        System.out.println("ArrayList contains 50: " + contains50);

        // 7. Getting an element by index
        Integer element = numbers.get(1);  // Gets the element at index 1
        System.out.println("Element at index 1: " + element);
        
        // 8. Getting the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of the ArrayList: " + size);
        
        // 9. Iterating through the ArrayList using for-each loop
        System.out.println("Iterating through ArrayList using for-each loop:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // 10. Iterating using an iterator
        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("Iterating through ArrayList using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 11. Checking if the ArrayList is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);

        // 12. Clearing all elements from the ArrayList
        numbers.clear();
        System.out.println("ArrayList after clearing all elements: " + numbers);

        // 13. Adding elements after clearing the list
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        System.out.println("ArrayList after re-adding elements: " + numbers);
        
        // 14. Using the `toArray` method to convert the ArrayList to an array
        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.println("Array converted from ArrayList:");
        for (Integer num : array) {
            System.out.println(num);
        }
    }
}

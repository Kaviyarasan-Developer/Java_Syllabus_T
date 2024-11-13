

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class CollectionListExample {
    public static void main(String[] args) {
        // Create a list of strings using ArrayList
        List<String> list = new ArrayList<>();
        
        // 1. Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        System.out.println("List after adding elements: " + list);
        
        // 2. Add an element at a specific position
        list.add(2, "Mango");
        System.out.println("List after adding Mango at position 2: " + list);

        // 3. Remove an element from the list
        list.remove("Banana");
        System.out.println("List after removing Banana: " + list);
        
        // 4. Remove an element at a specific index
        list.remove(3);  // Removes "Date"
        System.out.println("List after removing element at index 3: " + list);
        
        // 5. Update an element at a specific position
        list.set(1, "Grapes");  // Replace "Cherry" with "Grapes"
        System.out.println("List after updating element at position 1: " + list);
        
        // 6. Check if an element exists
        boolean containsMango = list.contains("Mango");
        System.out.println("List contains Mango: " + containsMango);
        
        // 7. Get an element by index
        String fruit = list.get(2);  // Get the element at index 2
        System.out.println("Element at index 2: " + fruit);
        
        // 8. Get the size of the list
        int size = list.size();
        System.out.println("Size of the list: " + size);
        
        // 9. Iterate through the list using a for-each loop
        System.out.println("List elements using for-each loop:");
        for (String s : list) {
            System.out.println(s);
        }
        
        // 10. Iterate through the list using an iterator
        Iterator<String> iterator = list.iterator();
        System.out.println("List elements using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // 11. Check if the list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("List is empty: " + isEmpty);
        
        // 12. Clear all elements from the list
        list.clear();
        System.out.println("List after clearing all elements: " + list);
    }
}

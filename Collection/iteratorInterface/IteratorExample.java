

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // Example 1: Using Iterator to iterate over a List
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));
        Iterator<String> iterator = list.iterator();

        System.out.println("Iteration over List:");
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        // Example 2: Using Iterator to remove elements while iterating
        System.out.println("\nRemoving 'Banana' from List using Iterator:");
        iterator = list.iterator();  // Re-initialize the iterator
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("Banana".equals(item)) {
                iterator.remove();  // Removes 'Banana' from the list
            }
        }
        System.out.println("Updated List: " + list); // List after removal

        // Example 3: Using Iterator on a Set to iterate and remove an element
        Set<String> set = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));
        Iterator<String> setIterator = set.iterator();

        System.out.println("\nIteration over Set:");
        while (setIterator.hasNext()) {
            String item = setIterator.next();
            System.out.println(item);
        }

        System.out.println("\nRemoving 'Date' from Set using Iterator:");
        setIterator = set.iterator();  // Re-initialize the iterator
        while (setIterator.hasNext()) {
            String item = setIterator.next();
            if ("Date".equals(item)) {
                setIterator.remove();  // Removes 'Date' from the set
            }
        }
        System.out.println("Updated Set: " + set); // Set after removal

        // Example 4: Using for-each loop (internally uses Iterator)
        System.out.println("\nIteration over List using for-each loop:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}

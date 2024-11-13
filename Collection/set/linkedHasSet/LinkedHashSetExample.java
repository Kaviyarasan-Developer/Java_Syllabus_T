

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet of Strings
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Date");

        // Displaying elements in insertion order
        System.out.println("LinkedHashSet in insertion order: " + linkedHashSet);

        // Adding a duplicate element
        boolean isAdded = linkedHashSet.add("Apple");  // will be false, as "Apple" already exists
        System.out.println("Is 'Apple' added again? " + isAdded);
        System.out.println("LinkedHashSet after attempting duplicate add: " + linkedHashSet);

        // Removing an element
        linkedHashSet.remove("Banana");
        System.out.println("After removing 'Banana': " + linkedHashSet);

        // Checking if a specific element is present
        boolean containsCherry = linkedHashSet.contains("Cherry");
        System.out.println("Does LinkedHashSet contain 'Cherry'? " + containsCherry);

        // Size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // Iterating over elements using a for-each loop
        System.out.println("Iterating over elements:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }

        // Clearing the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("Is LinkedHashSet empty after clear? " + linkedHashSet.isEmpty());
    }
}

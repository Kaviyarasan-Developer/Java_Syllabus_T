

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Checking for an element
        System.out.println("Contains Apple: " + set.contains("Apple")); // true

        // Size of the set
        System.out.println("Size: " + set.size()); // 3

        // Removing an element
        set.remove("Banana");

        // Iterating over elements
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Bulk operation - adding all elements from another set
        Set<String> otherSet = new HashSet<>();
        otherSet.add("Date");
        otherSet.add("Fig");
        set.addAll(otherSet);

        // Using stream forEach
        set.forEach(System.out::println);
    }
}

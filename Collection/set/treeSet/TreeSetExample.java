

import java.util.TreeSet;
import java.util.NavigableSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements to the TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(15);
        numbers.add(30);

        System.out.println("TreeSet in natural order: " + numbers);

        // Accessing the first and last elements
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        // Using higher() and lower() methods
        System.out.println("Higher than 15: " + numbers.higher(15));
        System.out.println("Lower than 15: " + numbers.lower(15));

        // Using ceiling() and floor() methods
        System.out.println("Ceiling of 18: " + numbers.ceiling(18));
        System.out.println("Floor of 18: " + numbers.floor(18));

        // Removing the first and last elements
        System.out.println("Removed first element: " + numbers.pollFirst());
        System.out.println("Removed last element: " + numbers.pollLast());
        System.out.println("TreeSet after removals: " + numbers);

        // Subset operations
        NavigableSet<Integer> subSet = numbers.subSet(10, 20); // 10 (inclusive) to 20 (exclusive)
        System.out.println("Subset from 10 to 20: " + subSet);

        // Adding more elements
        numbers.add(25);
        numbers.add(12);
        System.out.println("Updated TreeSet: " + numbers);

        // Iterating over elements using a for-each loop
        System.out.println("Iterating over TreeSet elements:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // Clearing the TreeSet
        numbers.clear();
        System.out.println("Is TreeSet empty after clear? " + numbers.isEmpty());
    }
}

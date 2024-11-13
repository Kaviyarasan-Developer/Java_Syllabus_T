

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // Creating a HashSet of Strings
        Set<String> fruits = new HashSet<>();

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("Initial HashSet: " + fruits);

        // Attempting to add a duplicate element
        boolean isAdded = fruits.add("Apple");  // false because "Apple" already exists
        System.out.println("Is 'Apple' added again? " + isAdded);

        // Removing an element from the HashSet
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // Checking if an element is in the HashSet
        boolean containsCherry = fruits.contains("Cherry");
        System.out.println("Does the set contain 'Cherry'? " + containsCherry);

        // Checking the size of the HashSet
        System.out.println("Size of HashSet: " + fruits.size());

        // Iterating over elements using a for-each loop
        System.out.println("Iterating over elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Bulk operation - retaining elements in another set
        Set<String> tropicalFruits = new HashSet<>();
        tropicalFruits.add("Date");
        tropicalFruits.add("Mango");

        fruits.retainAll(tropicalFruits);  // Keeps only elements found in both sets
        System.out.println("After retainAll with tropicalFruits: " + fruits);

        // Adding more elements for further demonstration
        fruits.add("Fig");
        fruits.add("Grape");
        System.out.println("After adding more fruits: " + fruits);

        // Using stream and forEach to print all elements
        System.out.println("Using forEach with lambda:");
        fruits.forEach(fruit -> System.out.println("Fruit: " + fruit));

        // Clearing the HashSet
        fruits.clear();
        System.out.println("Is HashSet empty after clear? " + fruits.isEmpty());
    }
}

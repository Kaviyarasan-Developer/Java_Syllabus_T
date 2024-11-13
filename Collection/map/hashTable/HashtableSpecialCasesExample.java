

import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableSpecialCasesExample {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Adding entries using put() method
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");
        System.out.println("Initial Hashtable: " + hashtable);

        // Demonstrating that Hashtable does not allow null keys or values
        try {
            hashtable.put(null, "NullKey"); // Attempt to insert null key
        } catch (NullPointerException e) {
            System.out.println("Cannot add null key: " + e.getMessage());
        }

        try {
            hashtable.put(4, null); // Attempt to insert null value
        } catch (NullPointerException e) {
            System.out.println("Cannot add null value: " + e.getMessage());
        }

        // Using Enumeration to iterate through keys and values
        System.out.println("\nIterating using Enumeration:");
        Enumeration<Integer> keys = hashtable.keys();
        Enumeration<String> values = hashtable.elements();

        while (keys.hasMoreElements() && values.hasMoreElements()) {
            System.out.println("Key: " + keys.nextElement() + ", Value: " + values.nextElement());
        }

        // Using computeIfAbsent() to add an entry only if the key is not already present
        hashtable.computeIfAbsent(4, key -> "Four");
        System.out.println("\nAfter computeIfAbsent (key 4 added): " + hashtable);

        // Using computeIfPresent() to modify an entry only if the key exists
        hashtable.computeIfPresent(2, (key, val) -> val + " Updated");
        System.out.println("After computeIfPresent (key 2 updated): " + hashtable);

        // Using merge() to merge a new value with an existing value
        hashtable.merge(3, " Merged", (oldValue, newValue) -> oldValue + newValue);
        System.out.println("After merging value at key 3: " + hashtable);

        // Checking default value behavior with getOrDefault()
        System.out.println("\nValue at key 5 (using getOrDefault): " + hashtable.getOrDefault(5, "Default Value"));

        // Replacing a value only if it matches the old value using replace(key, oldValue, newValue)
        boolean isReplaced = hashtable.replace(1, "One", "Replaced One");
        System.out.println("After conditional replace on key 1: " + hashtable + " (Was replaced? " + isReplaced + ")");

        // Using forEach() to iterate through the Hashtable
        System.out.println("\nUsing forEach to display all entries:");
        hashtable.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}


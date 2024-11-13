

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        // 1. Creating a Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // 2. Adding key-value pairs using put()
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");
        hashtable.put(4, "Date");

        System.out.println("Initial Hashtable: " + hashtable);

        // 3. Accessing elements using get()
        System.out.println("Value for key 2: " + hashtable.get(2));

        // 4. Checking if the Hashtable contains a specific key or value
        System.out.println("Contains key 3? " + hashtable.containsKey(3));
        System.out.println("Contains value 'Date'? " + hashtable.containsValue("Date"));

        // 5. Iterating over the Hashtable
        System.out.println("Iterating over Hashtable:");
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 6. Checking if the Hashtable is empty
        System.out.println("Is the Hashtable empty? " + hashtable.isEmpty());

        // 7. Removing an entry by key
        hashtable.remove(3);
        System.out.println("After removing key 3: " + hashtable);

        // 8. Getting the size of the Hashtable
        System.out.println("Size of Hashtable: " + hashtable.size());

        // 9. Replacing a value for a specific key
        hashtable.replace(2, "Blueberry");
        System.out.println("After replacing key 2 with 'Blueberry': " + hashtable);

        // 10. Getting all keys using keySet()
        System.out.println("Keys: " + hashtable.keySet());

        // 11. Getting all values using values()
        System.out.println("Values: " + hashtable.values());

        // 12. Getting all entries as a set
        System.out.println("Entries: " + hashtable.entrySet());

        // 13. Putting all entries from another map
        Hashtable<Integer, String> newEntries = new Hashtable<>();
        newEntries.put(5, "Elderberry");
        newEntries.put(6, "Fig");
        hashtable.putAll(newEntries);
        System.out.println("After adding all entries from another Hashtable: " + hashtable);

        // 14. Clearing all entries from the Hashtable
        hashtable.clear();
        System.out.println("After clearing all entries: " + hashtable);
    }
}

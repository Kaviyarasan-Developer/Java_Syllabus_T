


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // 1. Creating a LinkedHashMap with initial values
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();
        
        // 2. Adding entries using put()
        linkedMap.put(1, "Apple");
        linkedMap.put(2, "Banana");
        linkedMap.put(3, "Cherry");
        linkedMap.put(4, "Date");

        System.out.println("Initial LinkedHashMap: " + linkedMap);

        // 3. Accessing entries using get()
        System.out.println("Get value for key 2: " + linkedMap.get(2));

        // 4. Checking if the LinkedHashMap contains a key or a value
        System.out.println("Contains key 3? " + linkedMap.containsKey(3));
        System.out.println("Contains value 'Date'? " + linkedMap.containsValue("Date"));

        // 5. Iterating over the LinkedHashMap
        System.out.println("Iterating over LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : linkedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 6. Checking if the LinkedHashMap is empty
        System.out.println("Is the LinkedHashMap empty? " + linkedMap.isEmpty());

        // 7. Removing an entry by key
        linkedMap.remove(3);
        System.out.println("After removing key 3: " + linkedMap);

        // 8. Getting the size of the LinkedHashMap
        System.out.println("Size of LinkedHashMap: " + linkedMap.size());

        // 9. Replacing a value for a specific key
        linkedMap.replace(2, "Blueberry");
        System.out.println("After replacing key 2 with 'Blueberry': " + linkedMap);

        // 10. Getting all keys
        System.out.println("Keys: " + linkedMap.keySet());

        // 11. Getting all values
        System.out.println("Values: " + linkedMap.values());

        // 12. Getting all key-value pairs (entries)
        System.out.println("Entries: " + linkedMap.entrySet());

        // 13. Putting all entries from another map
        LinkedHashMap<Integer, String> newEntries = new LinkedHashMap<>();
        newEntries.put(5, "Elderberry");
        newEntries.put(6, "Fig");
        linkedMap.putAll(newEntries);
        System.out.println("After adding all entries from another LinkedHashMap: " + linkedMap);

        // 14. Clearing all entries from the LinkedHashMap
        linkedMap.clear();
        System.out.println("After clearing all entries: " + linkedMap);
    }
}

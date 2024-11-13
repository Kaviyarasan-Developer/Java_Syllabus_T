

import java.util.IdentityHashMap;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        // Creating an IdentityHashMap
        IdentityHashMap<String, Integer> identityMap = new IdentityHashMap<>();

        // Creating some string keys
        String key1 = new String("A");
        String key2 = new String("A");  // Different instance but same content as key1
        String key3 = "B";              // String literal

        // 1. put(K key, V value): Adds key-value pairs to the IdentityHashMap
        identityMap.put(key1, 10);
        identityMap.put(key2, 20);  // Will be treated as a separate key due to reference equality
        identityMap.put(key3, 30);
        System.out.println("IdentityHashMap after put operations: " + identityMap);

        // 2. get(Object key): Retrieves the value for a given key
        System.out.println("Value for key1: " + identityMap.get(key1));
        System.out.println("Value for key2: " + identityMap.get(key2));
        System.out.println("Value for key3: " + identityMap.get(key3));

        // 3. containsKey(Object key): Checks if a specific key exists
        boolean hasKey = identityMap.containsKey(key1);
        System.out.println("Contains key1: " + hasKey);

        // 4. containsValue(Object value): Checks if a specific value exists
        boolean hasValue = identityMap.containsValue(30);
        System.out.println("Contains value 30: " + hasValue);

        // 5. size(): Returns the number of key-value pairs in the map
        int size = identityMap.size();
        System.out.println("Size of the IdentityHashMap: " + size);

        // 6. isEmpty(): Checks if the map is empty
        boolean isEmpty = identityMap.isEmpty();
        System.out.println("Is IdentityHashMap empty: " + isEmpty);

        // 7. remove(Object key): Removes the entry for the specified key
        identityMap.remove(key1);
        System.out.println("IdentityHashMap after removing key1: " + identityMap);

        // 8. keySet(): Returns a set view of the keys
        System.out.println("Keys in IdentityHashMap: " + identityMap.keySet());

        // 9. values(): Returns a collection view of the values
        System.out.println("Values in IdentityHashMap: " + identityMap.values());

        // 10. entrySet(): Returns a set view of the mappings
        System.out.println("Entries in IdentityHashMap: " + identityMap.entrySet());

        // 11. clear(): Clears the map
        identityMap.clear();
        System.out.println("IdentityHashMap after clear(): " + identityMap);
    }
}

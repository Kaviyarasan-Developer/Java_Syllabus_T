

import java.util.HashMap;
import java.util.Map;

public class HashMapMethodsExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 1. put(K key, V value): Adds a key-value pair to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("Initial Map: " + map);

        // 2. get(Object key): Returns the value associated with the specified key
        String value1 = map.get(1);
        System.out.println("Value for key 1: " + value1);

        // 3. remove(Object key): Removes the key-value pair for the specified key
        map.remove(2);
        System.out.println("Map after removing key 2: " + map);

        // 4. containsKey(Object key): Checks if the map contains the specified key
        boolean hasKey = map.containsKey(3);
        System.out.println("Map contains key 3: " + hasKey);

        // 5. containsValue(Object value): Checks if the map contains the specified value
        boolean hasValue = map.containsValue("Apple");
        System.out.println("Map contains value 'Apple': " + hasValue);

        // 6. size(): Returns the number of key-value pairs in the map
        int size = map.size();
        System.out.println("Size of the map: " + size);

        // 7. isEmpty(): Checks if the map is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Map is empty: " + isEmpty);

        // 8. putIfAbsent(K key, V value): Adds the key-value pair if the key is not already present
        map.putIfAbsent(2, "Banana");
        System.out.println("Map after putIfAbsent for key 2: " + map);

        // 9. replace(K key, V value): Replaces the value for the specified key
        map.replace(3, "Date");
        System.out.println("Map after replacing key 3's value: " + map);

        // 10. keySet(): Returns a set of all keys in the map
        System.out.println("Keys in the map: " + map.keySet());

        // 11. values(): Returns a collection of all values in the map
        System.out.println("Values in the map: " + map.values());

        // 12. entrySet(): Returns a set of all key-value pairs in the map
        System.out.println("Entries in the map: " + map.entrySet());

        // 13. forEach(BiConsumer action): Performs an action for each entry in the map
        System.out.print("Entries with forEach: ");
        map.forEach((key, value) -> System.out.print(key + "=" + value + " "));

        // 14. clear(): Removes all the key-value pairs from the map
        map.clear();
        System.out.println("\nMap after clear(): " + map);
    }
}

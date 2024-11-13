


import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // 1. Creating a ConcurrentHashMap
        ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();

        // 2. Adding entries with put()
        concurrentMap.put(1, "Apple");
        concurrentMap.put(2, "Banana");
        concurrentMap.put(3, "Cherry");
        concurrentMap.put(4, "Date");
        System.out.println("Initial ConcurrentHashMap: " + concurrentMap);

        // 3. Using get() to retrieve a value
        System.out.println("Value for key 2: " + concurrentMap.get(2));

        // 4. Checking for a specific key or value
        System.out.println("Contains key 3? " + concurrentMap.containsKey(3));
        System.out.println("Contains value 'Date'? " + concurrentMap.containsValue("Date"));

        // 5. Removing an entry
        concurrentMap.remove(1);
        System.out.println("After removing key 1: " + concurrentMap);

        // 6. Replacing a value
        concurrentMap.replace(2, "Blueberry");
        System.out.println("After replacing key 2 with 'Blueberry': " + concurrentMap);

        // 7. Using putIfAbsent() to add a key-value pair only if it is not already present
        concurrentMap.putIfAbsent(3, "Coconut"); // Won't replace as key 3 already exists
        concurrentMap.putIfAbsent(5, "Elderberry"); // Will add as key 5 does not exist
        System.out.println("After putIfAbsent operations: " + concurrentMap);

        // 8. Iterating over the entries in ConcurrentHashMap
        System.out.println("\nIterating through ConcurrentHashMap:");
        for (Map.Entry<Integer, String> entry : concurrentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 9. Getting the size of the ConcurrentHashMap
        System.out.println("\nSize of ConcurrentHashMap: " + concurrentMap.size());

        // 10. Clearing all entries
        concurrentMap.clear();
        System.out.println("After clearing, ConcurrentHashMap: " + concurrentMap);
    }
}

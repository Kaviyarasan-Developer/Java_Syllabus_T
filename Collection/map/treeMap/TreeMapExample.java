

import java.util.TreeMap;
import java.util.Map;
import java.util.NavigableMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // 1. Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // 2. Adding entries with put()
        treeMap.put(1, "Apple");
        treeMap.put(3, "Cherry");
        treeMap.put(2, "Banana");
        treeMap.put(5, "Date");
        treeMap.put(4, "Elderberry");

        System.out.println("Initial TreeMap: " + treeMap);

        // 3. Accessing values with get()
        System.out.println("Value for key 3: " + treeMap.get(3));

        // 4. Checking if TreeMap contains a specific key or value
        System.out.println("Contains key 4? " + treeMap.containsKey(4));
        System.out.println("Contains value 'Banana'? " + treeMap.containsValue("Banana"));

        // 5. Iterating through the TreeMap
        System.out.println("\nIterating through TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 6. Checking if TreeMap is empty
        System.out.println("\nIs TreeMap empty? " + treeMap.isEmpty());

        // 7. Removing an entry by key
        treeMap.remove(2);
        System.out.println("After removing key 2: " + treeMap);

        // 8. Getting the size of the TreeMap
        System.out.println("Size of TreeMap: " + treeMap.size());

        // 9. Replacing a value for a specific key
        treeMap.replace(3, "Coconut");
        System.out.println("After replacing key 3 with 'Coconut': " + treeMap);

        // 10. Getting all keys and values
        System.out.println("Keys: " + treeMap.keySet());
        System.out.println("Values: " + treeMap.values());

        // 11. Getting the first and last entries
        System.out.println("First Entry: " + treeMap.firstEntry());
        System.out.println("Last Entry: " + treeMap.lastEntry());

        // 12. Getting the first and last keys
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());

        // 13. Using subMap() to get a portion of the TreeMap
        System.out.println("SubMap from key 2 to key 4: " + treeMap.subMap(2, 5));

        // 14. Using headMap() to get all entries less than a given key
        System.out.println("HeadMap (keys less than 4): " + treeMap.headMap(4));

        // 15. Using tailMap() to get all entries greater than or equal to a given key
        System.out.println("TailMap (keys greater than or equal to 3): " + treeMap.tailMap(3));

        // 16. Using higherKey(), lowerKey(), ceilingKey(), and floorKey()
        System.out.println("Higher key than 3: " + treeMap.higherKey(3));
        System.out.println("Lower key than 3: " + treeMap.lowerKey(3));
        System.out.println("Ceiling key of 3: " + treeMap.ceilingKey(3));
        System.out.println("Floor key of 3: " + treeMap.floorKey(3));

        // 17. Using pollFirstEntry() and pollLastEntry()
        System.out.println("Polling first entry: " + treeMap.pollFirstEntry());
        System.out.println("Polling last entry: " + treeMap.pollLastEntry());
        System.out.println("TreeMap after polling: " + treeMap);
    }
}

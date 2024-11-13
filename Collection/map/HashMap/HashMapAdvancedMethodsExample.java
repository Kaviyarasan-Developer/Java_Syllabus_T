

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HashMapAdvancedMethodsExample {
    public static void main(String[] args) {
        // Creating a HashMap with initial values
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        System.out.println("Initial Map: " + map);

        // 1. getOrDefault(Object key, V defaultValue): Returns the value for the specified key, or the default value if the key does not exist
        int valueA = map.getOrDefault("A", 0);
        int valueD = map.getOrDefault("D", 0);
        System.out.println("Value for key 'A': " + valueA);
        System.out.println("Value for non-existing key 'D': " + valueD);

        // 2. replace(K key, V oldValue, V newValue): Replaces the value only if the key is mapped to a specific old value
        boolean replaced = map.replace("B", 20, 25);
        System.out.println("Map after replace for key 'B': " + map + " (Replaced: " + replaced + ")");

        // 3. computeIfAbsent(K key, Function mappingFunction): Computes a value for the key if it’s not already present
        map.computeIfAbsent("D", k -> 40);
        System.out.println("Map after computeIfAbsent for key 'D': " + map);

        // 4. computeIfPresent(K key, BiFunction remappingFunction): Recomputes a value for the key only if it is already present
        map.computeIfPresent("C", (k, v) -> v + 10);
        System.out.println("Map after computeIfPresent for key 'C': " + map);

        // 5. compute(K key, BiFunction remappingFunction): Computes a new value for the specified key
        map.compute("A", (k, v) -> Optional.ofNullable(v).orElse(0) + 5);
        System.out.println("Map after compute for key 'A': " + map);

        // 6. merge(K key, V value, BiFunction remappingFunction): Merges the specified value with an existing value using a remapping function
        map.merge("B", 5, Integer::sum);
        map.merge("E", 50, Integer::sum);
        System.out.println("Map after merge for keys 'B' and 'E': " + map);

        // 7. clone(): Creates a shallow copy of the HashMap
        HashMap<String, Integer> clonedMap = (HashMap<String, Integer>) map.clone();
        System.out.println("Cloned Map: " + clonedMap);

        // 8. equals(Object o): Compares the specified object with this map for equality
        boolean isEqual = map.equals(clonedMap);
        System.out.println("Map equals clonedMap: " + isEqual);

        // 9. hashCode(): Returns the hash code value for this map
        int hashCode = map.hashCode();
        System.out.println("Hash code of map: " + hashCode);

        // 10. entrySet().forEach(): Iterating over entries using lambda expressions
        System.out.print("Entries in the map: ");
        map.entrySet().forEach(entry -> System.out.print(entry.getKey() + "=" + entry.getValue() + " "));
    }
}

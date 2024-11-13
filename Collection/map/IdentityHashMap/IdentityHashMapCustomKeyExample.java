

import java.util.IdentityHashMap;
import java.util.Objects;

class CustomKey {
    private final String name;
    private final int id;

    public CustomKey(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "CustomKey{name='" + name + "', id=" + id + "}";
    }

    // Overriding equals() and hashCode() for demonstration purposes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomKey customKey = (CustomKey) o;
        return id == customKey.id && Objects.equals(name, customKey.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}

public class IdentityHashMapCustomKeyExample {
    public static void main(String[] args) {
        // Create an IdentityHashMap with CustomKey objects
        IdentityHashMap<CustomKey, String> identityMap = new IdentityHashMap<>();

        // Create two different instances of CustomKey with the same data
        CustomKey key1 = new CustomKey("Alice", 1);
        CustomKey key2 = new CustomKey("Alice", 1); // Different instance but logically equal to key1

        // 1. Adding entries to the IdentityHashMap
        identityMap.put(key1, "Employee 1");
        identityMap.put(key2, "Employee 2"); // Will be added as a separate entry due to reference equality

        // Print the contents of the IdentityHashMap
        System.out.println("IdentityHashMap contents: " + identityMap);

        // 2. Check if key1 and key2 are considered equal based on reference equality
        System.out.println("Is key1 == key2? " + (key1 == key2)); // Should be false

        // 3. Checking values associated with each key
        System.out.println("Value for key1: " + identityMap.get(key1));
        System.out.println("Value for key2: " + identityMap.get(key2));

        // 4. Adding the same instance (reference) of key1
        identityMap.put(key1, "Updated Employee 1");
        System.out.println("IdentityHashMap after updating key1: " + identityMap);

        // 5. Demonstrate behavior with different instances of the same logical key
        CustomKey key3 = new CustomKey("Alice", 1);
        System.out.println("Value for new instance key3 (same logical data as key1): " + identityMap.get(key3));

        // 6. Display the key set and values to understand IdentityHashMap's reference-based uniqueness
        System.out.println("Keys in IdentityHashMap: " + identityMap.keySet());
        System.out.println("Values in IdentityHashMap: " + identityMap.values());
    }
}

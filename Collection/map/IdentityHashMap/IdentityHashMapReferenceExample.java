


import java.util.IdentityHashMap;

public class IdentityHashMapReferenceExample {
    public static void main(String[] args) {
        // Creating an IdentityHashMap
        IdentityHashMap<Object, String> identityMap = new IdentityHashMap<>();

        // Creating Integer keys with the same value
        Integer intKey1 = new Integer(100); // Using new Integer() to ensure different instances
        Integer intKey2 = new Integer(100); // Different instance with the same value as intKey1

        // Adding entries with Integer keys
        identityMap.put(intKey1, "Value for intKey1");
        identityMap.put(intKey2, "Value for intKey2"); // Will be added as a separate entry

        // Creating String keys with the same content but different instances
        String strKey1 = new String("Hello");
        String strKey2 = new String("Hello"); // Different instance with the same content as strKey1

        // Adding entries with String keys
        identityMap.put(strKey1, "Value for strKey1");
        identityMap.put(strKey2, "Value for strKey2"); // Will be added as a separate entry

        // Printing the IdentityHashMap
        System.out.println("IdentityHashMap contents: " + identityMap);
        
        // Retrieving values by using the exact key references
        System.out.println("Value for intKey1: " + identityMap.get(intKey1));
        System.out.println("Value for intKey2: " + identityMap.get(intKey2));
        System.out.println("Value for strKey1: " + identityMap.get(strKey1));
        System.out.println("Value for strKey2: " + identityMap.get(strKey2));

        // Demonstrating the reference-based equality with identical value content
        System.out.println("intKey1 == intKey2: " + (intKey1 == intKey2)); // false
        System.out.println("strKey1 == strKey2: " + (strKey1 == strKey2)); // false

        // Using a String literal as a key, which has a single instance due to String pool
        String pooledKey = "Hello";  // Refers to the same instance in the string pool
        identityMap.put(pooledKey, "Value for pooledKey");

        // Printing the IdentityHashMap again to observe any changes
        System.out.println("Updated IdentityHashMap contents: " + identityMap);

        // Retrieving the value for the pooled key
        System.out.println("Value for pooledKey: " + identityMap.get(pooledKey));
    }
}



import java.util.HashMap;
import java.util.Map;

public class GenericMapExample {
    public static void main(String[] args) {
        // Map with String keys and Integer values
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);

        // Printing key-value pairs
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }
    }
}

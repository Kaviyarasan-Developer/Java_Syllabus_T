


import java.util.EnumMap;
import java.util.Map;

enum Priority {
    LOW, MEDIUM, HIGH, URGENT
}

public class EnumMapDemo {
    public static void main(String[] args) {
        // Create an EnumMap with Priority as the key type
        EnumMap<Priority, String> priorityMap = new EnumMap<>(Priority.class);

        // Adding values
        priorityMap.put(Priority.LOW, "Low priority - no immediate action needed.");
        priorityMap.put(Priority.MEDIUM, "Medium priority - should address soon.");
        priorityMap.put(Priority.HIGH, "High priority - needs attention soon.");
        priorityMap.put(Priority.URGENT, "Urgent priority - requires immediate action!");

        // Accessing values
        System.out.println("HIGH Priority Description: " + priorityMap.get(Priority.HIGH));

        // Check if map contains specific key or value
        System.out.println("Contains URGENT key: " + priorityMap.containsKey(Priority.URGENT));
        System.out.println("Contains value 'Low priority - no immediate action needed.': " 
                           + priorityMap.containsValue("Low priority - no immediate action needed."));

        // Iterate through EnumMap entries
        System.out.println("\nAll Priority Levels and Descriptions:");
        for (Map.Entry<Priority, String> entry : priorityMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Replace a value
        priorityMap.put(Priority.MEDIUM, "Medium priority - address in 24 hours.");
        System.out.println("\nUpdated MEDIUM Priority Description: " + priorityMap.get(Priority.MEDIUM));

        // Removing an entry
        priorityMap.remove(Priority.LOW);
        System.out.println("\nAfter removing LOW priority: " + priorityMap);

        // Checking map size
        System.out.println("Size of EnumMap after removal: " + priorityMap.size());

        // Clearing the map
        priorityMap.clear();
        System.out.println("Is the EnumMap empty after clear? " + priorityMap.isEmpty());
    }
}

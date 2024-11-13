


import java.util.*;

public class MapIteratorExample {
    public static void main(String[] args) {
        // Initializing a Map with some values
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Apples", 50);
        inventory.put("Bananas", 20);
        inventory.put("Cherries", 30);
        inventory.put("Dates", 10);
        inventory.put("Oranges", 40);

        System.out.println("Initial Inventory:");
        printInventory(inventory);

        // Using Iterator to iterate over Map entries and remove low-stock items
        System.out.println("\nRemoving items with stock less than 30:");
        Iterator<Map.Entry<String, Integer>> iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 30) {
                System.out.println("Removing " + entry.getKey() + " (stock: " + entry.getValue() + ")");
                iterator.remove();  // Safely remove items with stock less than 30
            }
        }

        System.out.println("\nUpdated Inventory:");
        printInventory(inventory);
    }

    // Utility method to print the inventory map
    private static void printInventory(Map<String, Integer> inventory) {
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExample2 {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Display the LinkedList
        System.out.println("Initial LinkedList:");
        System.out.println(list);

        // Add an element at a specific index
        list.add(2, "Fig");  // Adds "Fig" at index 2
        System.out.println("\nAfter adding 'Fig' at index 2:");
        System.out.println(list);

        // Set an element at a specific index
        list.set(3, "Grape");  // Changes the element at index 3 to "Grape"
        System.out.println("\nAfter setting 'Grape' at index 3:");
        System.out.println(list);

        // Remove an element by index
        list.remove(4);  // Removes the element at index 4
        System.out.println("\nAfter removing the element at index 4:");
        System.out.println(list);

        // Remove a specific element by value
        list.remove("Banana");  // Removes the element "Banana"
        System.out.println("\nAfter removing 'Banana':");
        System.out.println(list);

        // Check if the list is empty
        System.out.println("\nIs the list empty? " + list.isEmpty());

        // Get the size of the list
        System.out.println("\nSize of the list: " + list.size());

        // Iterate through the list using an Iterator
        System.out.println("\nIterating through the list using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Check if the list contains a specific element
        System.out.println("\nDoes the list contain 'Cherry'? " + list.contains("Cherry"));
        System.out.println("Does the list contain 'Banana'? " + list.contains("Banana"));

        // Clear the entire list
        list.clear();
        System.out.println("\nAfter clearing the list:");
        System.out.println(list);
    }
}

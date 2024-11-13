

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList list = new LinkedList();

        // Add elements to the LinkedList
        list.add(10);   // Adds 10 to the list
        list.add(20);   // Adds 20 to the list
        list.add(30);   // Adds 30 to the list
        list.add(40);   // Adds 40 to the list

        System.out.println("Linked List after adding elements:");
        System.out.println(list);

        // Add an element at the first position
        list.addFirst(5);  // Adds 5 at the beginning of the list
        System.out.println("\nAfter adding 5 at the beginning:");
        System.out.println(list);

        // Add an element at the last position
        list.addLast(50);  // Adds 50 at the end of the list
        System.out.println("\nAfter adding 50 at the end:");
        System.out.println(list);

        // Remove the first element
        list.removeFirst(); // Removes the first element (5)
        System.out.println("\nAfter removing the first element:");
        System.out.println(list);

        // Remove the last element
        list.removeLast();  // Removes the last element (50)
        System.out.println("\nAfter removing the last element:");
        System.out.println(list);

        // Remove a specific element (20)
        list.remove(Integer.valueOf(20)); // Removes the element 20 from the list
        System.out.println("\nAfter removing 20:");
        System.out.println(list);

        // Get the first and last elements
        System.out.println("\nFirst element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Check if an element exists in the list
        System.out.println("\nDoes the list contain 30? " + list.contains(30));
        System.out.println("Does the list contain 100? " + list.contains(100));
    }
}

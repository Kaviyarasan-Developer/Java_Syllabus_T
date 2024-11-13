

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the Stack
        stack.push(10);   // Pushes 10 to the stack
        stack.push(20);   // Pushes 20 to the stack
        stack.push(30);   // Pushes 30 to the stack
        stack.push(40);   // Pushes 40 to the stack

        // 1. Display stack after pushing elements
        System.out.println("Stack after pushing elements:");
        System.out.println(stack);

        // 2. Peek at the top element of the Stack
        System.out.println("\nTop element using peek(): " + stack.peek());

        // 3. Pop an element from the Stack (removes and returns the top element)
        System.out.println("\nPopped element: " + stack.pop());
        System.out.println("Stack after popping the top element:");
        System.out.println(stack);

        // 4. Check if the Stack is empty
        System.out.println("\nIs the Stack empty? " + stack.isEmpty());

        // 5. Get the size of the Stack
        System.out.println("\nSize of the Stack: " + stack.size());

        // 6. Search for an element in the Stack
        System.out.println("\nPosition of element 20 in the stack (1-based index): " + stack.search(20));

        // 7. Pop remaining elements from the Stack
        stack.pop();  // Pops 30
        stack.pop();  // Pops 20
        stack.pop();  // Pops 10

        // 8. Stack after popping all elements
        System.out.println("\nStack after popping all elements:");
        System.out.println(stack);

        // 9. Check if the Stack is empty after all pops
        System.out.println("\nIs the Stack empty now? " + stack.isEmpty());

        // 10. Clear the Stack (not directly available in Stack)
        // We can manually clear it using pop until empty
        while (!stack.isEmpty()) {
            stack.pop();  // Popping until the stack is empty
        }

        // 11. Stack after clearing
        System.out.println("\nStack after clearing all elements:");
        System.out.println(stack);
    }
}

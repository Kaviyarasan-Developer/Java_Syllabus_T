

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack of Strings
        Stack<String> stack = new Stack<>();

        // Push elements onto the Stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Date");

        // 1. Print the stack after pushing elements
        System.out.println("Stack after pushing elements:");
        System.out.println(stack);

        // 2. Peek at the top element (without removing it)
        System.out.println("\nPeek at the top element: " + stack.peek());

        // 3. Pop an element (removes and returns the top element)
        String poppedElement = stack.pop();
        System.out.println("\nPopped element: " + poppedElement);
        System.out.println("Stack after popping the top element:");
        System.out.println(stack);

        // 4. Check if the stack is empty
        System.out.println("\nIs the stack empty? " + stack.isEmpty());

        // 5. Get the size of the stack
        System.out.println("\nSize of the stack: " + stack.size());

        // 6. Search for an element in the stack
        int position = stack.search("Banana");  // 1-based index
        System.out.println("\nPosition of 'Banana' in the stack (1-based index): " + position);

        // 7. Push some more elements onto the stack
        stack.push("Elderberry");
        stack.push("Fig");
        stack.push("Grape");

        // 8. Print the stack after pushing more elements
        System.out.println("\nStack after pushing more elements:");
        System.out.println(stack);

        // 9. Pop elements until the stack is empty
        System.out.println("\nPopping all elements from the stack:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // 10. Check if the stack is empty after all pops
        System.out.println("\nIs the stack empty now? " + stack.isEmpty());
    }
}

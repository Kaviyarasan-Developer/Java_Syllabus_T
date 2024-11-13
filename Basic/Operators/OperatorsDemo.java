package Basic;
public class OperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus (Remainder)

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c);

        // Increment and Decrement Operators
        System.out.println("\nIncrement and Decrement Operators:");
        int d = 5;
        System.out.println("d++: " + (d++)); // Post-increment (prints then increments)
        System.out.println("++d: " + (++d)); // Pre-increment (increments then prints)
        System.out.println("d--: " + (d--)); // Post-decrement (prints then decrements)
        System.out.println("--d: " + (--d)); // Pre-decrement (decrements then prints)

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b; // Returns a if a > b, otherwise returns b
        System.out.println("Max of a and b: " + max);
    }
}

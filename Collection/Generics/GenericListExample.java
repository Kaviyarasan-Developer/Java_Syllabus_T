

import java.util.ArrayList;
import java.util.List;

public class GenericListExample {
    public static void main(String[] args) {
        // List of Strings
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        // List of Integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        // Printing elements
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}

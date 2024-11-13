

import java.util.HashSet;
import java.util.Set;

public class GenericSetExample {
    public static void main(String[] args) {
        // Set of Doubles
        Set<Double> prices = new HashSet<>();
        prices.add(19.99);
        prices.add(9.99);

        // Printing elements
        for (Double price : prices) {
            System.out.println("Price: " + price);
        }
    }
}

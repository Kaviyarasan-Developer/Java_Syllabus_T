

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetOperations {
    public static void main(String[] args) {
        // Creating two LinkedHashSet instances
        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();

        // Adding elements to the first LinkedHashSet
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Date");

        // Adding elements to the second LinkedHashSet
        set2.add("Banana");
        set2.add("Date");
        set2.add("Elderberry");
        set2.add("Fig");

        // Display initial sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Union of set1 and set2
        Set<String> unionSet = new LinkedHashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union of Set 1 and Set 2: " + unionSet);

        // Intersection of set1 and set2
        Set<String> intersectionSet = new LinkedHashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection of Set 1 and Set 2: " + intersectionSet);

        // Difference of set1 and set2 (elements in set1 but not in set2)
        Set<String> differenceSet = new LinkedHashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference of Set 1 and Set 2 (Set 1 - Set 2): " + differenceSet);

        // Symmetric difference (elements in either set1 or set2 but not both)
        Set<String> symmetricDifferenceSet = new LinkedHashSet<>(unionSet);
        symmetricDifferenceSet.removeAll(intersectionSet);
        System.out.println("Symmetric Difference of Set 1 and Set 2: " + symmetricDifferenceSet);

        // Iterating over unionSet to demonstrate preserved order
        System.out.println("Iterating over Union Set:");
        for (String fruit : unionSet) {
            System.out.println(fruit);
        }
    }
}

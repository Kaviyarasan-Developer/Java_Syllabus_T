

import java.util.Comparator;
import java.util.TreeSet;

// Creating a Person class
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString method for easy display
    @Override
    public String toString() {
        return name + " (" + age + " years)";
    }
}

public class TreeSetCustomComparatorExample {
    public static void main(String[] args) {
        // TreeSet with a custom comparator to sort by age in ascending order
        TreeSet<Person> people = new TreeSet<>(Comparator.comparingInt(person -> person.age));

        // Adding Person objects to the TreeSet
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Diana", 28));

        // Displaying all people in sorted order by age
        System.out.println("People sorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Using `first()` and `last()` to get the youngest and oldest persons
        System.out.println("Youngest person: " + people.first());
        System.out.println("Oldest person: " + people.last());

        // Using `higher()` and `lower()` to find people older and younger than a specific age
        Person reference = new Person("Reference", 28);  // Age 28 as reference
        System.out.println("Person older than 28: " + people.higher(reference));
        System.out.println("Person younger than 28: " + people.lower(reference));

        // Removing a person (e.g., the oldest) from the set
        people.pollLast();
        System.out.println("After removing the oldest person: " + people);

        // Checking if a specific person exists in the set
        Person newPerson = new Person("Eve", 25);
        System.out.println("Does the set contain a person with age 25? " + people.contains(newPerson));
    }
}

package OOPs.Inheritance.SuperAndThis;

class Person {
    String name;
    int age;

    // Constructor with one parameter
    Person(String name) {
        this(name, 0); // Calls the second constructor
    }

    // Constructor with two parameters
    Person(String name, int age) {
        this.name = name; // Using 'this' to set the instance variable
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob", 30);

        person1.display(); // Output: Name: Alice, Age: 0
        person2.display(); // Output: Name: Bob, Age: 30
    }
}

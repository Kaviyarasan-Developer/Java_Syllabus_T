

// Superclass
class Animal {
    String name;

    // Superclass constructor
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }
}

// Subclass
class Dog extends Animal {
    String breed;

    // Subclass constructor
    Dog(String name, String breed) {
        super(name); // Call to superclass (Animal) constructor
        this.breed = breed;
        System.out.println("Dog constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

// Main class
public class SuperSubConstructor {
    public static void main(String[] args) {
        // Creating a Dog object, which invokes both constructors
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.display();
    }
}

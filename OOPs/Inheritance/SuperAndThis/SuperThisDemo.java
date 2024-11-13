package OOPs.Inheritance.SuperAndThis;

class Animal {
    String name;

    // Constructor of the superclass
    Animal(String name) {
        this.name = name; // Using 'this' to refer to the current object's name
    }

    void display() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    String breed;

    // Constructor of the subclass
    Dog(String name, String breed) {
        super(name); // Using 'super' to call the constructor of the superclass
        this.breed = breed; // Using 'this' to refer to the current object's breed
    }

    void display() {
        super.display(); // Calling the display method of the superclass
        System.out.println("Dog Breed: " + breed);
    }
}

public class SuperThisDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.display();
    }
}

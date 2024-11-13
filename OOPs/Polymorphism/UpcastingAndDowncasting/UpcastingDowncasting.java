package OOPs.Polymorphism.UpcastingAndDowncasting;

 class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

 public class UpcastingDowncasting {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.sound(); // Outputs: Dog barks


        if (myAnimal instanceof Dog) {
            // Downcasting
        Dog myDog = (Dog) myAnimal; // Explicit downcasting
        myDog.fetch(); // Outputs: Dog fetches the ball
        } else {
            System.out.println("myAnimal is not an instance of Dog");
        }

    }
}

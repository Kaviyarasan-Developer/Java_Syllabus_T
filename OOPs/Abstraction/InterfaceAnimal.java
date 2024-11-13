package OOPs.Abstraction;

interface InterfaceAnimal {
    void sound(); // Abstract method
    void eat();   // Another abstract method
}

class Dog implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }
}

class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }
}

 class Main {
    public static void main(String[] args) {
        InterfaceAnimal dog = new Dog();
        dog.sound(); // Outputs: Dog barks
        dog.eat();   // Outputs: Dog eats meat

        InterfaceAnimal cat = new Cat();
        cat.sound(); // Outputs: Cat meows
        cat.eat();   // Outputs: Cat eats fish
    }
}

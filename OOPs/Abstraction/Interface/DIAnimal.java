package OOPs.Abstraction.Interface;

interface DIAnimal {
    void sound();
    
    default void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog implements DIAnimal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }
}

class Cat implements DIAnimal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
    // Cat uses the default eat method
}

 class Main {
    public static void main(String[] args) {
        DIAnimal myDog = new Dog();
        myDog.sound(); // Outputs: Dog barks
        myDog.eat();   // Outputs: Dog eats bones

        DIAnimal myCat = new Cat();
        myCat.sound(); // Outputs: Cat meows
        myCat.eat();   // Outputs: Animal eats food
    }
}

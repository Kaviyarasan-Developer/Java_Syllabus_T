package OOPs.Abstraction.Interface;
interface Animal {
    void sound(); // Abstract method
}

interface Pet {
    void play(); // Abstract method
}

class Dog implements Animal, Pet {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void play() {
        System.out.println("Dog plays fetch");
    }
}

class Cat implements Animal, Pet {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void play() {
        System.out.println("Cat plays with yarn");
    }
}

 class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // Outputs: Dog barks
        
        Pet myPetDog = new Dog();
        myPetDog.play(); // Outputs: Dog plays fetch

        Animal myCat = new Cat();
        myCat.sound(); // Outputs: Cat meows
        
        Pet myPetCat = new Cat();
        myPetCat.play(); // Outputs: Cat plays with yarn
    }
}

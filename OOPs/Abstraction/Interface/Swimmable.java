package OOPs.Abstraction.Interface;

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

class Duck implements Swimmable, Flyable {
    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }
}

class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}

 class Main {
    public static void main(String[] args) {
        Swimmable myDuck = new Duck();
        myDuck.swim(); // Outputs: Duck is swimming.

        Flyable flyingDuck = new Duck();
        flyingDuck.fly(); // Outputs: Duck is flying.

        Swimmable myFish = new Fish();
        myFish.swim(); // Outputs: Fish is swimming.
    }
}

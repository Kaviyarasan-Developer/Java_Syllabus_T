package OOPs.Inheritance.Hierarchical;

 class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

 class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        dog.eat(); // Inherited from Animal
        dog.bark(); // Dog’s own method
        
        cat.eat(); // Inherited from Animal
        cat.meow(); // Cat’s own method
    }
}

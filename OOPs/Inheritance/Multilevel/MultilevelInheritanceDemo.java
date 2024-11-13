package OOPs.Inheritance.Multilevel;
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

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat(); // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep(); // Puppy’s own method
    }
}

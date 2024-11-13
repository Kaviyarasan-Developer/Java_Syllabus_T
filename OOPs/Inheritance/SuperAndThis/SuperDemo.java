package OOPs.Inheritance.SuperAndThis;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void start() {
        super.start(); // Call the start method of the superclass
        System.out.println("Car is starting");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}

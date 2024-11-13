package OOPs.Constructor.DefaultConstructor;

public class Car {
    String model;
    String color;

    // Default constructor
    Car() {
        model = "Unknown";
        color = "Unknown";
    }

    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
    }
}
 public class ConstructorDemo {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Car myCar = new Car();
        myCar.displayDetails(); // Output: Car Model: Unknown, Car Color: Unknown
    }
}

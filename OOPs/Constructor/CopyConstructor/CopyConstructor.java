package OOPs.Constructor.CopyConstructor;

public class Car {
    String model;
    String color;

    // Parameterized constructor
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Copy constructor
    Car(Car other) {
        this.model = other.model;
        this.color = other.color;
    }

    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
    }
}

 class CopyConstructor {
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Car myCar = new Car("Honda", "Blue");
        myCar.displayDetails(); // Output: Car Model: Honda, Car Color: Blue

        // Creating a copy of the existing object
        Car myCarCopy = new Car(myCar);
        myCarCopy.displayDetails(); // Output: Car Model: Honda, Car Color: Blue
    }
}

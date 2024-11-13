package OOPs;
public class Car {
    String color;
    String model;
    int year;

    // Constructor to initialize attributes
    Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating an object using the constructor
        Car myCar = new Car("Red", "Toyota", 2020);
        myCar.displayDetails();

        Car anotherCar = new Car("Blue", "Honda", 2021);
        anotherCar.displayDetails();
    }
}

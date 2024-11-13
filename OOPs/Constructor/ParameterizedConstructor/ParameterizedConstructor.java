package OOPs.Constructor.ParameterizedConstructor;

 class Car {
    String model;
    String color;

    // Parameterized constructor
    Car(String model, String color) {
        this.model = model; // 'this' refers to the current object's instance variable
        this.color = color;
    }

    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
    }
}

publics class ParameterizedConstructor {
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Car myCar = new Car("Toyota", "Red");
        myCar.displayDetails(); // Output: Car Model: Toyota, Car Color: Red
    }
}

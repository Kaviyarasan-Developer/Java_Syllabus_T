package OOPs.Abstraction.Interface;


interface Vehicle {
    void start();
    void stop();
}

interface Electric {
    void charge();
}

class ElectricCar implements Vehicle, Electric {
    @Override
    public void start() {
        System.out.println("Electric Car starting silently.");
    }

    @Override
    public void stop() {
        System.out.println("Electric Car stopping.");
    }

    @Override
    public void charge() {
        System.out.println("Charging Electric Car.");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle is ready to ride.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle has stopped.");
    }
}

 class Main {
    public static void main(String[] args) {
        Vehicle myCar = new ElectricCar();
        myCar.start(); // Outputs: Electric Car starting silently.
        myCar.stop();  // Outputs: Electric Car stopping.

        Electric myElectricCar = new ElectricCar();
        myElectricCar.charge(); // Outputs: Charging Electric Car.

        Vehicle myBike = new Bicycle();
        myBike.start(); // Outputs: Bicycle is ready to ride.
        myBike.stop();  // Outputs: Bicycle has stopped.
    }
}

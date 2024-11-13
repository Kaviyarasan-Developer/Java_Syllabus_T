package OOPs.Abstraction;

abstract class AbstractionShape {
    // Abstract method (no body)
    abstract void draw();

    // Regular method
    void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends AbstractionShape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends AbstractionShape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

 class Main {
    public static void main(String[] args) {
        AbstractionShape circle = new Circle(); // Upcasting
        circle.draw();  // Outputs: Drawing a Circle
        circle.area();  // Outputs: Calculating area...

        AbstractionShape rectangle = new Rectangle(); // Upcasting
        rectangle.draw(); // Outputs: Drawing a Rectangle
        rectangle.area(); // Outputs: Calculating area...
    }
}

package OOPs.Polymorphism.Overriding;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

 class Main {
    public static void main(String[] args) {
        Shape shape; // Reference of type Shape

        shape = new Circle();
        shape.draw(); // Outputs: Drawing a circle

        shape = new Rectangle();
        shape.draw(); // Outputs: Drawing a rectangle

        // Using an array of Shapes
        Shape[] shapes = {new Circle(), new Rectangle()};
        for (Shape s : shapes) {
            s.draw(); // Outputs the specific shape being drawn
        }
    }
}

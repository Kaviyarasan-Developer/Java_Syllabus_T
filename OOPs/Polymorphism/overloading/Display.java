package OOPs.Polymorphism.overloading;

class Display {
    
    // Method to display an integer
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    // Method to display a double
    void show(double b) {
        System.out.println("Double: " + b);
    }

    // Method to display a string
    void show(String s) {
        System.out.println("String: " + s);
    }

    // Method to display an array
    void show(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

 class Main {
    public static void main(String[] args) {
        Display display = new Display();

        display.show(10);           // Calls show(int)
        display.show(15.5);        // Calls show(double)
        display.show("Hello!");    // Calls show(String)
        display.show(new int[]{1, 2, 3, 4, 5}); // Calls show(int[])
    }
}

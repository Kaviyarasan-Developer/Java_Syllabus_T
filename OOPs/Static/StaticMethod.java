package OOPs.Static;

public class StaticMethod {

    static void printMessage() {
        System.out.println("Hello, static method!");
    }
}

 class Main {
    public static void main(String[] args) {
        StaticMethod.printMessage(); // Output: Hello, static method!
    }
    
}

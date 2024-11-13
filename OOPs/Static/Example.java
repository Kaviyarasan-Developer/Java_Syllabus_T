package OOPs.Static;
public class Example {
    static int count = 0; // static variable

    Example() {
        count++;
    }
}

 class Main {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
        System.out.println(Example.count); // Output: 2
    }
}

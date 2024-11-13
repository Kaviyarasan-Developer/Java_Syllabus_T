package OOPs.Static;
public class StaticClass {
    static int outerStaticVar = 10;

    static class Inner {
        void display() {
            System.out.println("Outer static var: " + outerStaticVar);
        }
    }
}

 class Main {
    public static void main(String[] args) {
        StaticClass.Inner inner = new StaticClass.Inner();
        inner.display(); // Output: Outer static var: 10
    }
}

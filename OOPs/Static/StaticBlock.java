package OOPs.Static;
public class StaticBlock {
    static int num;

    static {
        num = 42; // Static initialization block
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println(StaticBlock.num); // Output: 42
    }
}

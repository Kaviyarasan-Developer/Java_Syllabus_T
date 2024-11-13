package Basic;
public class BreakExample {
    public static void main(String[] args) {
        // Using break to exit the loop when i equals 3
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exits the loop
            }
            System.out.println("Number: " + i);
        }
        System.out.println("Loop exited.");
    }
}

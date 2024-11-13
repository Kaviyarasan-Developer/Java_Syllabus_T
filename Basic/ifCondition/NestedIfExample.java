package Basic;
public class NestedIfExample {
    public static void main(String[] args) {
        int number = 25;

        // Nested if condition
        a::
        if (number > 0) 
        {
            System.out.println("The number is positive.");
            b::
            if (number > 20) {
                System.out.println("The number is greater than 20.");
               c:: 
                if (number >=25){
                    System.out.println("The number is greater or = than 25.");

                }else {
                    System.out.println("the number is lesthen 25 ");

                }
            }
        }
    }
}

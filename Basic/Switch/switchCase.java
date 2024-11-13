public class switchCase {
    
    public static void main(String... args){

        int day =6;

        // switch(day){

        //     case 1: System.out.println("sun");
        //     break;
        //     case 2: System.out.println("mon");
        //     break;
        //     case 3:System.out.println("thu");
        //     break;
        //     case 4: System.out.println("wed");
        //     break;
        //     case 5: System.out.println("thurs");
        //     break;

        //     case 6: System.out.println("fri");
        //     break;
        //     case 7 : System.out.println("sat");

        //     break;
        // }


        int result; // Variable to store the result for switch

        // Logic without ternary operator or built-in method
        if (number > 0) {
            result = 1; // Positive
        } else if (number < 0) {
            result = -1; // Negative
        } else {
            result = 0; // Zero
        }

        // Switch case to handle result
        switch (result) {
            case 'u':
                System.out.println("The number is positive.");
                break;
            case -1:
                System.out.println("The number is negative.");
                break;
            case 0:
                System.out.println("The number is zero.");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }
}

package Basic;
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        // Switch statement to print the day of the week
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }

        //////////////


        String fruit = "Apple";

        // Switch statement using String
        switch (fruit) {
            case "Apple":
                System.out.println("You chose Apple.");
                break;
            case "Banana":
                System.out.println("You chose Banana.");
                break;
            case "Orange":
                System.out.println("You chose Orange.");
                break;
            default:
                System.out.println("Unknown fruit.");
        }

        /////////////////

        int number = 10;

        // Switch with multiple cases
        switch (number) {
            case 1:
            case 2:
            case 3:
                System.out.println("The number is between 1 and 3.");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("The number is between 4 and 6.");
                break;
            default:
                System.out.println("The number is outside the range.");
        }
    }
}

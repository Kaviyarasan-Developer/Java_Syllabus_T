

package Basic;

public class NestedSwitchExample {
    public static void main(String[] args) {
        String branch = "CSE";  // Example branch
        int year = 2;           // Example year

        // Outer switch to check branch
        switch (branch) {
            case "CSE":
            case "IT":
                System.out.println("Branch: " + branch);

                // Inner switch to check year within a specific branch
                switch (year) {
                    case 1:
                        System.out.println("Courses: Mathematics, Physics");
                        break;
                    case 2:
                        System.out.println("Courses: Data Structures, Operating Systems");
                        break;
                    case 3:
                        System.out.println("Courses: Database Systems, Computer Networks");
                        break;
                    case 4:
                        System.out.println("Courses: Artificial Intelligence, Big Data");
                        break;
                    default:
                        System.out.println("Invalid year for branch " + branch);
                }
                break;

            case "ECE":
                System.out.println("Branch: ECE");

                // Inner switch for ECE
                switch (year) {
                    case 1:
                        System.out.println("Courses: Mathematics, Physics");
                        break;
                    case 2:
                        System.out.println("Courses: Signals and Systems, Digital Electronics");
                        break;
                    case 3:
                        System.out.println("Courses: Microprocessors, Communication Systems");
                        break;
                    case 4:
                        System.out.println("Courses: VLSI Design, Wireless Communication");
                        break;
                    default:
                        System.out.println("Invalid year for branch " + branch);
                }
                break;

            default:
                System.out.println("Invalid branch");
        }
    }
}

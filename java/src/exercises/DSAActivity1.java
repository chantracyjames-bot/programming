import java.util.Scanner;

public class DSAActivity1 {
    // the Floor Function
    static double floorFunc(double num) {
        return Math.floor(num);
    }

    // the Ceiling Function
    static double ceilFunc(double num) {
        return Math.ceil(num);
    }

    // the Modulo Function
    static int moduloFunc(int base, int div) {
        return base % div;
    }

    // the Main Function
    public static void main() {
        // initializes a Scanner object and a local variable
        Scanner in = new Scanner(System.in);
        double inNum;

        // loops the program
        while(true) {
            // runs the program in a try-catch to catch Exceptions
            try {
                // printing with format
                System.out.printf("%s\n%s\n%s\n%s\n\n%s",
                    "The task to perform :",
                    "1. Floor Function",
                    "2. Ceiling Function",
                    "3. Modulo Function",
                    "Choose a Mathematical Function: "
                );
                String input = in.nextLine();

                // enter a switch case
                switch (input) {
                    // if the user selects the floor function
                    case "1":
                        // asks for a number
                        System.out.print("Enter a number: ");
                        inNum = Double.parseDouble(in.nextLine());
                        // prints the result
                        System.out.println("The floor of " + inNum + " is " + (int)floorFunc(inNum) + ".\n");
                        break;
                    // if the user selects the ceiling function
                    case "2":
                        // asks for a number
                        System.out.print("Enter a number: ");
                        inNum = Double.parseDouble(in.nextLine());
                        // prints the result
                        System.out.println("The ceiling of " + inNum + " is " + (int)ceilFunc(inNum) + ".\n");
                        break;
                    // if the user selects the modulo function
                    case "3":
                        // modulo inNum mod div
                        // asks for a number to be divided
                        System.out.print("Enter a number: ");
                        inNum = Double.parseDouble(in.nextLine());
                        // asks for a divisor
                        System.out.print("Enter modulo: ");
                        int div = Integer.parseInt(in.nextLine());
                        // prints the result
                        System.out.println("The modulo of " + (int)inNum + " mod " + div + " is " + moduloFunc((int)inNum, div) + ".\n");
                        break;
                    // a way to quit the program
                    case "q":
                        System.out.println("Exiting...");
                        System.exit(0);
                    // if the user input an invalid option
                    default:
                        System.out.println("Invalid Option.\n");
                        break;
                }
            // if the program runs into an bException, i.e. Modulo by zero
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.\n");
            } catch (Exception e) {
                System.out.println("An Error occured: " + e + "\n");
            }
        }
    }
}

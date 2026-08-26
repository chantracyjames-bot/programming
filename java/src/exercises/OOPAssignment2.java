import java.util.Scanner;

// don't know if the menu changes 
// so i just put it all in an enum
// *shruggie emoji*
enum Menu {
    // Enum constants with their compile-time properties: (Price, Category)
    ITEM_1(50.0, "American Burger"),
    ITEM_2(120.0, "Pizza with Pineapples"),
    ITEM_3(90.0, "Fried Chicken with Watermelon"),
    ITEM_4(60.0, "French Fries from France"),
    ITEM_5(40.0, "Hard Drinks");

    private final double price;
    private final String name;

    Menu(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }
}

public class OOPAssignment2 {
    static void print_main_menu() {
        System.out.printf("\n%s\n%-12s%s\n%s\n%s%-30s%s\n%s%-30s%s\n%s%-30s%s\n%s%-30s%s\n%s%-30s%s\n%s\n", 
        "===========================================",
        "", "FOOD ORDERING MENU",
        "===========================================",
        "1. ", Menu.ITEM_1.getName(), " PHP 50.00",
        "2. ", Menu.ITEM_2.getName(), " PHP 50.00",
        "3. ", Menu.ITEM_3.getName(), " PHP 50.00",
        "4. ", Menu.ITEM_4.getName(), " PHP 50.00",
        "5. ", Menu.ITEM_5.getName(), " PHP 50.00",
        "============================================"
        );
    }

    static void print_summary_header() {
        System.out.printf("\n%s\n%-16s%s\n%s\n", 
        "============================================",
        "", "ORDER SUMMARY",
        "============================================"
        );
    }

    static void print_summary_footer() {
        System.out.printf("\n%s\n%-10s%s\n%s\n", 
        "============================================",
        "", "THANK YOU FOR ORDERING!",
        "============================================"
        );
    }

    static double getPrice(Scanner in) {
        String printValue = "";
        double returnValue = 0;

        priceStuff: while (true) {
            String tempOption = "ITEM_";
            print_main_menu();

            System.out.print("Enter Product number: ");
            tempOption += in.nextLine();

            try {
                printValue = Menu.valueOf(tempOption).getName();
                returnValue = Menu.valueOf(tempOption).getPrice();
                break priceStuff;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input! Try again.");
            }
        }
        System.out.println("You selected: " + printValue);
        return returnValue;
    }

    static int getQuantity(Scanner in) {
        int tempQuantity = 0;
        
        quantityStuff: while (true) {
            try {
                System.out.print("\nEnter Quantity: ");
                tempQuantity = Integer.parseInt(in.nextLine());

                if (tempQuantity < 0) {
                    throw new NumberFormatException();
                }

                break quantityStuff;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Quantity must be a positive integer.");
            }
        }
        return tempQuantity;
    }

    static boolean getChoice(Scanner in) {
        String tempInput;
        boolean tempChoice = false;

        questionStuff: while (true) {
            System.out.print("\nDo you want to order again? (Y/N): ");
            tempInput = in.nextLine().toUpperCase();

            switch (tempInput) {
                case "Y":
                    tempChoice = true;
                    break questionStuff;
                case "N":
                    tempChoice = false;
                    break questionStuff;
                default:
                    System.out.println("Invalid Input! Try again.");
                    break;
            }
        }
        return tempChoice;
    }

    static double getPayment(Scanner in, double totalAmount) {
        double tempPayment = 0;
        
        paymentStuff: while (true) {
            try {
                System.out.print("Enter payment: PHP ");
                tempPayment = Double.parseDouble(in.nextLine());

                if (tempPayment < 0) {
                    throw new NumberFormatException();
                } else if (tempPayment < totalAmount) {
                    System.out.printf("Insufficient payment! Enter value higher than PHP %,.2f or higher.\n", totalAmount);
                    continue;
                }

                break paymentStuff;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Payment must be a positive decimal number.\n");
            }
        }

        return tempPayment;
    }

    static void printSummary(Scanner in, double totalAmount) {
        double customerPayment;

        print_summary_header();
        System.out.printf("TOTAL AMOUNT: %,.2f\n\n", totalAmount);

        customerPayment = getPayment(in, totalAmount);
        System.out.printf("\nPayment: %,.2f", customerPayment);
        System.out.printf("\nChange: %,.2f", (customerPayment - totalAmount));

        print_summary_footer();
    }

    public static void main() {
        double totalAmount = 0;
        try (Scanner in = new Scanner(System.in)) {
            mainProgram: while (true) {
                double itemPrice = getPrice(in);
                int itemQuantity = getQuantity(in);

                totalAmount += itemQuantity * itemPrice;
                System.out.printf("\nSubtotal: PHP %,.2f%n", (itemPrice * itemQuantity));
                System.out.printf("Current Total: PHP %,.2f%n", totalAmount);

                if (!getChoice(in)) { break mainProgram; }
            }

            printSummary(in, totalAmount);
        }
    }
}
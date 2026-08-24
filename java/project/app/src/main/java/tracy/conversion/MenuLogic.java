package tracy.conversion;

import java.util.Scanner;

public class MenuLogic {
    public static void printMainMenu() {
        System.out.print
        (
            """

            Number Conversion
            1.  Binary to X
            2.  Decimal to X
            3.  Octal to X
            4.  Hexadecimal to X
            0.  Exit
            """
        );
    }

    public static void printBinaryMenu() {
        System.out.print
        (
            """

            Choose Binary Operation
            1.  Binary to Decimal
            2.  Binary to Octal
            3.  Binary to Hexadecimal
            0.  Main
            """
        );
    }

    public static void printDecimalMenu() {
        System.out.print
        (
            """

            Choose Binary Operation
            1.  Decimal to Binary
            2.  Decimal to Octal
            3.  Decimal to Hexadecimal
            0.  Back
            """
        );
    }

    public static void printOctalMenu() {
        System.out.print
        (
            """

            Choose Binary Operation
            1.  Octal to Decimal
            2.  Octal to Binary
            3.  Octal to Hexadecimal
            0.  Back
            """
        );
    }

    public static void printHexadecimalMenu() {
        System.out.print
        (
            """

            Choose Binary Operation
            1.  Hexadecimal to Decimal
            2.  Hexadecimal to Binary
            3.  Hexadecimal to Octal
            0.  Back
            """
        );
    }

    public static void mainMenu(Scanner in) {
        printMainMenu();
        System.out.print("Input: ");
        String input = in.nextLine();

        switch (input) {
            case "1":
                binaryMenu(in);
                break;
            case "2":
                decimalMenu(in);
                break;
            case "3":
                octalMenu(in);
                break;
            case "4":
                hexadecimalMenu(in);
                break;
            case "0":
                exitProgram();
                break;
            default:
                System.out.println("\nInvalid input!");
                break;
        }
    }

    public static void binaryMenu(Scanner in) {
        printBinaryMenu();
        System.out.print("Input: ");
        String input = in.nextLine();
        String temp;

        switch (input) {
            case "1":
                System.out.print("Enter Value: ");
                temp = BinaryConversion.binaryToDecimal(in.nextLine());
                System.out.println("\n= " + temp);
                break;
            case "2":
                System.out.print("Enter Value: ");
                temp = BinaryConversion.binaryToOctal(in.nextLine());
                System.out.println("\n= " + temp);
                break;
            case "3":
                System.out.print("Enter Value: ");
                temp = BinaryConversion.binaryToHexadecimal(in.nextLine());
                System.out.println("\n= " + temp);
                break;
            case "0":
                mainMenu(in);
                break;
            default:
                System.out.println("\nInvalid input!");
                break;
        }
    }

    public static void decimalMenu(Scanner in) {
        printDecimalMenu();
        System.out.print("Input: ");
        String input = in.nextLine();
        String temp;

        switch (input) {
            case "1":
                System.out.print("Enter Value: ");
                temp = DecimalConversion.decimalToBinary(Long.parseLong(in.nextLine()));
                System.out.println("\n= " + temp);
                break;
            case "2":
                System.out.print("Enter Value: ");
                temp = DecimalConversion.decimalToOctal(Long.parseLong(in.nextLine()));
                System.out.println("\n= " + temp);
                break;
            case "3":
                System.out.print("Enter Value: ");
                temp = DecimalConversion.decimalToBinary(Long.parseLong(in.nextLine()));
                System.out.println("\n= " + temp);
                break;
            case "0":
                mainMenu(in);
                break;
            default:
                System.out.println("\nInvalid input!");
                break;
        }
    }

    public static void octalMenu(Scanner in) {
        printOctalMenu();
        System.out.print("Input: ");
        String input = in.nextLine();
        String temp;

        switch (input) {
            case "1":
                System.out.print("Enter Value: ");
                temp = OctalConversion.octalToDecimal(in.nextLine());
                System.out.println("\n= " + temp);
                break;
            case "2":
                System.out.print("Enter Value: ");
                temp = OctalConversion.octalToBinary(in.nextLine());
                System.out.println("\n= " + temp);
                break;
            case "3":
                System.out.print("Enter Value: ");
                temp = OctalConversion.octalToHexadecial(in.nextLine());
                System.out.println("\n= " + temp);
                break;
            case "0":
                mainMenu(in);
                break;
            default:
                System.out.println("\nInvalid input!");
                break;
        }
    }

    public static void hexadecimalMenu(Scanner in) {
        printHexadecimalMenu();
        System.out.print("Input: ");
        String input = in.nextLine();
        String temp;

        switch (input) {
            case "1":
                System.out.print("Enter Value: ");
                temp = HexadecimalConversion.hexadecimalToDecimal(in.nextLine());
                System.out.println("= " + temp);
                break;
            case "2":
                System.out.print("Enter Value: ");
                temp = HexadecimalConversion.hexadecimalToBinary(in.nextLine());
                System.out.println("= " + temp);
                break;
            case "3":
                System.out.print("Enter Value: ");
                temp = HexadecimalConversion.hexadecimalToOctal(in.nextLine());
                System.out.println("= " + temp);
                break;
            case "0":
                mainMenu(in);
                break;
            default:
                System.out.println("\nInvalid input!");
                break;
        }
    }

    public static void exitProgram() {
        System.out.println("Exitting...");
        System.exit(0);
    }
}

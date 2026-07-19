import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class NumberConversion {
    static String binaryToDecimal(String s) {
        if (s.startsWith("0b")) { s = s.substring(2); }
        long x = 0; int a = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(s.charAt(i)) > 1 || Character.getNumericValue(s.charAt(i)) < 0) {
                throw new InputMismatchException();
            } if (Character.getNumericValue(s.charAt(i)) == 1) {
                x += Math.pow(2, a);
            } a++;
        } return Long.toString(x);
    }

    static String binaryToOctal(String s) {
        String d = binaryToDecimal(s);
        return decimalToOctal(Long.parseLong(d));
    }

    static String binaryToHexadecimal(String s) {
        String d = binaryToDecimal(s);
        return decimalToHexadecemal(Long.parseLong(d));
    }

    static String decimalToBinary(long n) {
        String x = new String(); 
        do {
            x = Long.toString(n % 2) + x;
            n /= 2;
        } while (n > 0);
        return "0b" + x;
    }

    static String decimalToOctal(long n) {
        String x = new String();
        do {
            x = Long.toString(n % 8) + x;
            n /= 8;
        } while (n > 0);
        return "0o" + x;
    }

    static String decimalToHexadecemal(long n) {
        HashMap<Long, Character> map = new HashMap<Long, Character>();
        map.putAll(Map.of(10L, 'A', 11L, 'B', 12L, 'C', 13L, 'D', 14L, 'E', 15L, 'F'));

        String x = new String();
        do {
            x = map.containsKey(n % 16) ? map.get(n % 16) + x : Long.toString(n % 16) + x;
            n /= 16;
        } while (n > 0);
        return "0x" + x;
    }

    static String octalToDecimal(String s) {
        if (s.startsWith("0o")) { s = s.substring(2); }
        long x = 0; int a = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(s.charAt(i)) > 7 || Character.getNumericValue(s.charAt(i)) < 0) {
                throw new InputMismatchException();
            } if (!(Character.getNumericValue(s.charAt(i)) == 0)) {
                x += (Character.getNumericValue(s.charAt(i)) * Math.pow(8, a));
            } a++;
        } return Long.toString(x);
    }
    
    static String octalToBinary(String s) {
        String o = octalToDecimal(s);
        return decimalToBinary(Long.parseLong(o));
    }
    
    static String octalToHexadecial(String s) {
        String o = octalToDecimal(s);
        return decimalToHexadecemal(Long.parseLong(o));
    }

    static String hexadecimalToDecimal(String s) {
        HashMap<Long, Character> map = new HashMap<Long, Character>();
        map.putAll(Map.of(10L, 'A', 11L, 'B', 12L, 'C', 13L, 'D', 14L, 'E', 15L, 'F'));
        HashMap<Character, Long> rmap = new HashMap<Character, Long>();
        rmap.putAll(Map.of('A', 10L, 'B', 11L, 'C', 12L, 'D', 13L, 'E', 14L, 'F', 15L));

        if (s.startsWith("0x")) { s = s.substring(2); }
        long x = 0; int a = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(s.charAt(i)) > 15 || Character.getNumericValue(s.charAt(i)) < 0) {
                throw new InputMismatchException();
            } if (!(Character.getNumericValue(s.charAt(i)) == 0)) {
                x += map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) * Math.pow(16L, a) : Character.getNumericValue(s.charAt(i)) * Math.pow(16L, a);
            } a++;
        } return Long.toString(x);
    }

    static String hexadecimalToBinary(String s) {
        String h = hexadecimalToDecimal(s);
        return decimalToBinary(Long.parseLong(h));
    }

    static String hexadecimalToOctal(String s) {
        String h = hexadecimalToDecimal(s);
        return decimalToOctal(Long.parseLong(h));
    }

    static String booleanToSrting(boolean t) {
        return Boolean.toString(t);
    }

    static 

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Number Converter");
            System.out.print
            (
                """
                    1.  Binary to Decimal
                    2.  Binary to Octal
                    3.  Binary to Hexadecimal
                    4.  Decimal to Binary
                    5.  Decimal to Octal
                    6.  Decimal to Hexadecimal
                    7.  Octal to Decimal
                    8.  Octal to Binary
                    9.  Octal to Hexadecimal
                    10. Hexadecimal to Decimal
                    11. Hexadecimal to Binary
                    12. Hexadecimal to Octal
                """
            );

            System.out.print("Enter conversion mode: ");
            int n = in.nextInt();
            in.nextLine();
            System.out.print("Enter value: ");
            switch (n) {
                case 1 -> System.out.println(binaryToDecimal(in.nextLine().strip()));
                case 2 -> System.out.println(binaryToOctal(in.nextLine().strip()));
                case 3 -> System.out.println(binaryToHexadecimal(in.nextLine().strip()));
                case 4 -> System.out.println(decimalToBinary(in.nextLong()));
                case 5 -> System.out.println(decimalToOctal(in.nextLong()));
                case 6 -> System.out.println(decimalToHexadecemal(in.nextLong()));
                case 7 -> System.out.println(octalToDecimal(in.nextLine().strip()));
                case 8 -> System.out.println(octalToBinary(in.nextLine().strip()));
                case 9 -> System.out.println(octalToHexadecial(in.nextLine().strip()));
                case 10 -> System.out.println(hexadecimalToDecimal(in.nextLine().strip()));
                case 11 -> System.out.println(hexadecimalToBinary(in.nextLine().strip()));
                case 12 -> System.out.println(hexadecimalToOctal(in.nextLine().strip()));
                default -> System.out.println("Invalid input.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } catch (Exception e) {
            System.out.println("blame tarcy");
        }
    }
}

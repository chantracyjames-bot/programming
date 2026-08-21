package tracy.conversion;

import java.util.InputMismatchException;

public class BinaryConversion {
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
        return DecimalConversion.decimalToOctal(Long.parseLong(d));
    }

    static String binaryToHexadecimal(String s) {
        String d = binaryToDecimal(s);
        return DecimalConversion.decimalToHexadecemal(Long.parseLong(d));
    }
}

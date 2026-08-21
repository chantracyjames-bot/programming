package tracy.conversion;

import java.util.InputMismatchException;

public class OctalConversion {
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
        return DecimalConversion.decimalToBinary(Long.parseLong(o));
    }
    
    static String octalToHexadecial(String s) {
        String o = octalToDecimal(s);
        return DecimalConversion.decimalToHexadecemal(Long.parseLong(o));
    }
}

package tracy.conversion;

import java.util.HashMap;
import java.util.Map;
import java.util.InputMismatchException;

public class HexadecimalConversion {
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
        return DecimalConversion.decimalToBinary(Long.parseLong(h));
    }

    static String hexadecimalToOctal(String s) {
        String h = hexadecimalToDecimal(s);
        return DecimalConversion.decimalToOctal(Long.parseLong(h));
    }
}

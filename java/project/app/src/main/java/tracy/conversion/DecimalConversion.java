package tracy.conversion;

import java.util.HashMap;
import java.util.Map;

public class DecimalConversion {
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
}

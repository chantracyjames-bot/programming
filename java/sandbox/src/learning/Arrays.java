public class Arrays {
    public static void main(String[] args) {
        Object mixedArray[] = { "idkman", new String[]{ "hello", "world" }, "lumbago", new String[]{ "yes", "no" } };
        
        int numArray[] = {1, 2, 3, 4, 5};
        System.out.print("1D Array:");
        for ( int i : numArray ) {
            System.out.print(" " + i);
        }
        System.out.println();

        double floatArray[][] = {{1.2, 2.3, 3.4}, {3.14, 2.72, 1.28}, {4.14, 4.19, 5.15}};
        System.out.print("\n2D Array:");
        for ( double[] j : floatArray ) {
            for ( double k : j ) {
                System.out.print(" " + k);
            }
            System.out.print("\n         ");
        }

        char charArray[][][] = {{{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}}, {{'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r'}}, {{'s', 't', 'u'}, {'v', 'w', 'x'}, {'y', 'z', 10}}};
        System.out.print("\n3D Array:");
        for ( char[][] l : charArray ) {
            for ( char[] m : l ) {
                for ( char n : m ) {
                    System.out.print(" " + n);
                }
                System.out.print("\n         ");
            }
            System.out.print("\n         ");
        }
    }
}
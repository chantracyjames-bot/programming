import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;

public class ShapePatterns {
    static void centerTriangle(int a, int n, boolean addSpace) {
        if (a == n) {
            return;
        } if (addSpace) {
            System.out.print(" ");
        } for (int i = n - a; i > 1; i--) {
            System.out.print(" ");
        } for (int j = a; j >= 0; j--) {
            System.out.print("# ");
        } System.out.println();
        centerTriangle(a + 1, n, addSpace);
    }

    static void leftSideTriangle(int a, int n) {
        if (a == n) {
            return;
        }
        for (int i = 0; i <= a; i++) {
            System.out.print("# ");
        } System.out.println();
        leftSideTriangle(a + 1, n);
    }    

    static void rightSideTriangle(int a, int n) {
        if (a == n) {
            return;
        }
        for (int i = n - a; i > 1; i--) {
            System.out.print("  ");
        } for (int j = a; j >= 0; j--) {
            System.out.print("# ");
        } System.out.println();
        rightSideTriangle(a + 1, n);
    }
    static void centerTriangleReversed(int a, int n, boolean addSpace) {
        if (n == 0) {
            return;
        } if (addSpace) {
            System.out.print(" ");
        } for (int i = 0; i < a; i++) {
            System.out.print(" ");
        } for (int j = n + 1; j > 1; j--) {
            System.out.print("# ");
        } System.out.println();
        a++;
        centerTriangleReversed(a, n - 1, addSpace);
    }

    static void leftSideTriangleReversed(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("# ");
        } System.out.println();
        leftSideTriangleReversed(n - 1);
    }    

    static void rightSideTriangleReversed(int a, int n) {
        if (n == 0) {
            return;
        } 
        for (int i = 0; i < a; i++) {
            System.out.print("  ");
        } for (int j = n; j > 0; j--) {
            System.out.print("# ");
        } System.out.println();
        a++;
        rightSideTriangleReversed(a, n - 1);
    }

    static void diamondPattern(int n) {
        centerTriangle(0, n - 1, true);
        for (int i = 0; i < n; i++) { System.out.print("# "); }
        System.out.println();
        centerTriangleReversed(0, n - 1, true);
    }

    static void diamondPatternReversed(int n) {
        centerTriangleReversed(0, n, true);        
        centerTriangle(1, n, true);
    }

    static void squareShapeHollow(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) || j == 0 || j == (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void squareShapeCrossed(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) || j == 0 || j == (n - 1) || i == j || j == n - (i + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void squareShapeFilled(int a, int n) {
        if (a == n) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("# ");
        } System.out.println();
        squareShapeFilled(a + 1, n);
    }

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Shape Patterns");
                System.out.print
                (
                """
                    1.  Triangle (centered)
                    2.  Triangle (left-leaning)
                    3.  Triangle (right-learning)
                    4.  Triangle (reversed centered)
                    5.  Triangle (reversed left-leaning)
                    6.  Triangle (reversed right-leaning)
                    7.  Diamond (centered)
                    8.  Diamond (reversed)
                    9.  Square (hollow)
                    10. Square (crossed)
                    11. Square (filled)
                    0.  Exit         
                """ 
                );
                System.out.print("Enter pattern: ");
                int x = in.nextInt();
                if (x != 0) { System.out.print("Enter size: "); }
                switch (x) {
                    case 0 -> { in.close(); System.exit(0); }
                    case 1 -> centerTriangle(0, in.nextInt(), false);
                    case 2 -> leftSideTriangle(0, in.nextInt());
                    case 3 -> rightSideTriangle(0, in.nextInt());
                    case 4 -> centerTriangleReversed(0, in.nextInt(), false);
                    case 5 -> leftSideTriangleReversed(in.nextInt());
                    case 6 -> rightSideTriangleReversed(0, in.nextInt());
                    case 7 -> diamondPattern(in.nextInt());
                    case 8 -> diamondPatternReversed(in.nextInt());
                    case 9 -> squareShapeHollow(in.nextInt());
                    case 10 -> squareShapeCrossed(in.nextInt());
                    case 11 -> squareShapeFilled(0, in.nextInt());
                    default -> System.out.println("Try Again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input detected.");
            } catch (Exception e) {
                System.out.println("An error occured.");
            }
        }
    }
}

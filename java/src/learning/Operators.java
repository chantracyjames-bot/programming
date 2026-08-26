import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Operators {
    static void artihmeticOperators() {
        int num1 = 10;
        int num2 = 12;
        System.out.println("\nArithmethic Operators:");
        System.out.printf("num1 = %d\nnum2 = %d\n", num1, num2);
        System.out.printf("Addition: %d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("Subtraction: %d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("Multiplication: %d * %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("Division: %d / %d = %d\n", num1, num2, num1 / num2);
        System.out.println("Modulo: " + num1 + " % " + num2 + " = " + num1 % num2);
        num1++;
        System.out.printf("Incrementation: num1++ = %d\n", num1);
        num1--;
        System.out.printf("Decrementation: num1-- = %d\n", num1);
    }

    static void assignmentOperators() {
        int num = 10;
        System.out.println("\nAssignment Operators:");
        num += 10;
        System.out.printf("%d += 10 -> %d\n", num, num);
        num -= 13;
        System.out.printf("%d -= 13 -> %d\n", num, num);
        num *= 3;
        System.out.printf("%d *= 3 -> %d\n", num, num);
        num /= 3;
        System.out.printf("%d /= 7 -> %d\n", num, num);
        num %= 2;
        System.out.println(num +" %= 2 -> " + num);
        System.out.printf("%d &= 12 -> %d\n", num, num &= 12);
        System.out.printf("%d |= 9 -> %d\n", num, num |= 9);
        System.out.printf("%d ^= 25 -> %d\n", num, num ^= 25);
    }

    static void comparisonOperator() {
        int num1 = 10;
        int num2 = 12;
        System.out.println("\nComparison Operators: ");
        System.out.println(num1 + " == " + num2 +" = " + (num1 == num2));
        System.out.println(num1 + " > " + num2 +" = " + (num1 > num2));
        System.out.println(num1 + " < " + num2 +" = " + (num1 < num2));
        System.out.println(num1 + " <= " + num2 +" = " + (num1 <= num2));
        System.out.println(num1 + " >= " + num2 +" = " + (num1 >= num2));
    }

    static void logicalOperator() {
        int num1 = 10;
        int num2 = 12;
        System.out.println("\nLogical Operators: ");
        System.out.println("(" + num1 + " == " + num2 + ") && (" + num1 + " < " + num2 + ") = " + ((num1 == num2) && (num1 < num2)));
        System.out.println("(" + num1 + " == " + num2 + ") || (" + num1 + " < " + num2 + ") = " + ((num1 == num2) && (num1 < num2)));
        System.out.println("(" + num1 + " == " + num2 + ") || (" + num1 + " < " + num2 + ") = " + !((num1 == num2) && (num1 < num2)));
    }



    public static void main(String[] args) {
        artihmeticOperators();
        assignmentOperators();
        comparisonOperator();
        logicalOperator();
    }
}

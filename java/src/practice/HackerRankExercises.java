import java.util.*;

public class HackerRankExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    static void numberConditions(int N) {
        if ((N % 2 == 1) || ((N % 2 ==0) && (N >= 6) && (N <= 20))) {
            System.out.println("Weird");
        } else if (((N % 2 == 0) && ((N >= 2) && (N <= 5))) || ((N % 2 == 0) && (N > 20))) {
            System.out.println("Not Weird");
        } 
    }

    static void multiTypeInput(Scanner in) {
        int n = in.nextInt();
        double d = in.nextDouble();
        in.nextLine();
        String s = in.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + n);
    }

    static void multiStringPrint(Scanner in) {
        String a = in.next();
        int a1 = in.nextInt();
        String b = in.next();
        int b1 = in.nextInt();
        String c = in.next();
        int c1 = in.nextInt();
        
        System.out.println("================================");
        System.out.printf("%-15s%03d %n%-15s%03d %n%-15s%03d %n",
            a, a1,
            b, b1,
            c, c1
        );
        System.out.println("================================");
    }

    static void multiplicationTable(Scanner in) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}

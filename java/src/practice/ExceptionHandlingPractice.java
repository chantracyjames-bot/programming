import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandlingPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            try {
                double num1, num2;
                System.out.println("\nVery Good Division Calcuaaateas");
                System.out.print("First Number :");
                num1 = in.nextDouble();
                System.out.print("Second Number: ");
                num2 = in.nextDouble();
                if(num2 == 0) {throw new ArithmeticException("idkman"); }
                double quotient = num1 / num2;
                System.out.println(quotient);
            } catch(InputMismatchException e) {
                System.out.println(e + " error here");
                in.next();
            } catch(ArithmeticException e) {
                System.out.println(e + " error here");
            }
        in.close();
        }
    }
}

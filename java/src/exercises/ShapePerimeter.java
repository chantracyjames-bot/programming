import java.util.Scanner;

public class ShapePerimeter {
    static double rectanglePerimeter(Scanner in) {
        System.out.print("Enter A: ");
        double A = in.nextDouble();
        System.out.print("Enter B: ");
        double B = in.nextDouble();
        return 2 * (A + B);
    }

    static double squarePerimeter(Scanner in) {
        System.out.print("Enter S: ");
        double S = in.nextDouble();
        return 4 * S;
    }

    static double trianglePerimeter(Scanner in) {
        System.out.print("Enter A: ");
        double A = in.nextDouble();
        System.out.print("Enter B: ");
        double B = in.nextDouble();
        System.out.print("Enter C: ");
        double C = in.nextDouble();
        return A + B + C;
    }

    static double circlePerimeter(Scanner in) {
        System.out.print("Enter R: ");
        double R = in.nextDouble();
        return 2 * Math.PI * R;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Perimeter Calculator");
        System.out.printf("%s%n%s%n%s%n%s%n%s",
            "1. Rectangle (2x, 2y)",
            "2. Square (4s)",
            "3. Triangle (a, b, c)",
            "4. Circle (r)",
            "Input: "
        );
        String decision = in.nextLine();

        switch (decision) {
            case "1":
                System.out.println("Result: " + rectanglePerimeter(in));
                break;
            case "2":
                System.out.println("Result: " + squarePerimeter(in));
                break;
            case "3":
                System.out.println("Result: " + trianglePerimeter(in));
                break;
            case "4":
                System.out.println("Result: " + circlePerimeter(in));
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }

        in.close();
    }
}

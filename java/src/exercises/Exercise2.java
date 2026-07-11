import java.util.Scanner;
public class Exercise2
{
    public static boolean check_triangle(int x, int y, int z)
    {
        boolean output;
        if (x + y > z || x + z > y || y + z > x)
        {
            if (x == y && x == z && y == z)
            {
                output = true;
            }
            else if (x == y || y == z || x == z)
            {
                output = true;
            }
            else
            {
                output = true;
            }
        }
        else
        {
            output = false;
        }

        return output;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean result = check_triangle(a, b, c);
        System.out.print(result);

        in.close();
    }
}

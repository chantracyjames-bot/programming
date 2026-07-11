import java.util.Scanner;
public class PrimeNumberChecker {
    static int check(int a)
    {
        int temp = 0;
        for(int i = 1; i < a; i++)
        {
            temp = (a/i) * i;
            if(temp == a)
            {
                return 0;
            }
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int test = check(in.nextInt());
        System.out.println(test);
        in.close();
    }
}

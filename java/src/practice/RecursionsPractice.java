public class RecursionsPractice
{
    // Loops
    /*public static int factorial(int n)
    {
        int f = 1;
        while (n > 0)
        {
            f = f * (n);
            n--;
        }
        return f;
    }
        */
    public static int factorial(int n)
    {
        if (n == 0 || n == 1)
        { return 1; }
        return n * factorial(n - 1);
    }

    public static void main(String[] args)
    {
        int in = 5;
        int test = factorial(in);
        System.out.print(test);
    }
}

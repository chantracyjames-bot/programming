import java.util.Scanner;
public class FunctionsPractice 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Integer: ");
        int num1 = in.nextInt();
        System.out.print("Enter Second Integer: ");
        int num2 = in.nextInt();
        int sum = sum(num1, num2);
        String greeting = "The sum of the two integers is: ";
        printNTimes(greeting, sum);
        in.close();
    }

    public static int sum(int num1, int num2)
    {
        return (num1 + num2);
    }

    public static void printNTimes(String greeting, int num)
    {
        for(int i = 0; i < num; i++)
        {
            System.out.println(greeting + num);
        }
    }
}
import java.util.Scanner;
public class Idkman 
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
        //System.out.println();
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

/* Access Modifier (static) return type name(args)
   public           static  void        main(String[] args)
{
    statements
}
*/
// Access modifiers
// - public
// - private
// - protected

// Return type
// - void
// - String, ints, Boolean

// Name
// - commonly called as "main"

// Args
// - list of Arguments


//final
// - makes a variable a constant (unchangeable)
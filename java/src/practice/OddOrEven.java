import java.util.Scanner;

public class OddOrEven 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        if((in.nextInt() % 2) == 0)
        {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        in.close();
    }

}

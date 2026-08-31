import java.util.Scanner;
public class Exercise3
{
    public record authorization(boolean bool, String mess) {}
    public static authorization authorize_transaction(int balance, int amount)
    {
        Boolean bool;
        String output;
        if (amount <= 0)
        {
            bool = false;
            output = "Error: Invalid Transaction Amount";
        }
        else if (amount > balance || balance < 100)
        {
            bool = false;
            output = "Transaction Declined: Insufficient Funds or Low Balance Fee";
        }
        else
        {
            bool = true;
            output = "Transaction Approved";
        }
        return new authorization(bool, output);
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Balance: ");
        int bal = in.nextInt();
        System.out.print("Enter Amount: ");
        int amo = in.nextInt();
        authorization input = authorize_transaction(bal, amo);
        boolean result = input.bool;
        String message = input.mess;
        System.out.println(result + "\n" + message);
        in.close();
    }
}

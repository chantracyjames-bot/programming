import java.util.Scanner;

class Input
{
    public static Scanner in = new Scanner(System.in);
    public static int num, num_old, test, lim = 999;
    public static String sp = "----------------------------------------------------------";
    
    public static int[] emp = new int[lim];
     
    public static String[] ln = new String[lim];
    public static String[] fn = new String[lim];
    public static String[] mn = new String[lim];
    public static String[] sj = new String[lim];
    public static String[] dn = new String[lim];
    public static String[] dp = new String[lim];
    public static String[] dj = new String[lim];
        
    public static double[] bs = new double[lim];
    public static double[] al = new double[lim];
    public static double[] gr = new double[lim];
    public static double[] dd = new double[lim];
    public static double[] tx = new double[lim];
    public static double[] ta = new double[lim];
    public static double[] ph = new double[lim];
    public static double[] ss = new double[lim];
    public static double[] ns = new double[lim];
    
    public static void scannerInput()
    { 
        System.out.print("\n" + "Enter # of Employee/s: ");
        num_old = num_old + num;
        num = num_old + in.nextInt();
        in.nextLine();
        
        System.out.println();
        for(int i = 0 + num_old; i < num; i++)
        {      
            test = test + 1;
            emp[i] = test;
            System.out.printf("%s%n%-20s%s%n%s%n%n", sp, "", "BASIC INFORMATION", sp);
            System.out.print("Enter Last Name; ");
            ln[i] = in.nextLine();
            System.out.print("Enter First Name; ");
            fn[i] = in.nextLine();
            System.out.print("Enter Middle Name; ");
            mn[i] = in.nextLine();
            System.out.print("Enter Designation; ");
            dn[i] = in.nextLine();
            System.out.print("Enter Department; ");
            dp[i] = in.nextLine();
            System.out.print("Enter Date Joined; ");
            dj[i] = in.nextLine();
            System.out.println();
            
            System.out.printf("%s%n%-18s%s%n%s%n%n", sp, "", "FINANCIAL INFORMATION", sp);
            System.out.print("Enter Basic Salary; ");
            bs[i] = in.nextDouble();
            System.out.print("Enter Allowance; ");
            al[i] = in.nextDouble();
            System.out.print("Enter Tax Percentage(%); ");
            tx[i] = in.nextDouble();
            System.out.print("Enter PhilHealth Tax; ");
            ph[i] = in.nextDouble();
            System.out.print("Enter Social Security System (SSS) Tax; ");
            ss[i] = in.nextDouble();
            System.out.printf("%n%n%s%n%n", sp);
            System.out.println();
            
            gr[i] = bs[i] + al[i];
            ta[i] = gr[i] * (tx[i]/100);
            dd[i] = ta[i] + ph[i] + ss[i];
            ns[i] = gr[i] - dd[i];
            in.nextLine();
        }
    }
}

class Output extends Input
{
    public static void displayOutput()
    {
        if(ln[0] == null)
        {
           System.out.printf("%n%s%n", "No Information Available!!! Please Input via Option 1...");
        }
            
        for(int j = 0; j < num; j++)
        {
            System.out.printf("%n%s%n%-20s%s%n%s%n%n", sp, "", "BASIC INFORMATION", sp);
            System.out.printf("%-14s %s %03d%n", "Employee ID", ":", emp[j]);
            System.out.printf("%-14s %s %s, %s %s%n", "Name", ":", ln[j], fn[j], mn[j]);
            System.out.printf("%-14s %s %s%n", "Designation", ":", dn[j]);
            System.out.printf("%-14s %s %s%n", "Department", ":", dp[j]);
            System.out.printf("%-14s %s %s%n%n", "Date Joined", ":", dj[j]); 
            
            System.out.printf("%s%n%-18s%s%n%s%n%n", sp, "", "FINANCIAL INFORMATION", sp);
            System.out.printf("%-14s %s %.2f %-20s %-3s %s %.2f%n", "Basic Salary", ":", bs[j], "", "Allowances", ":", al[j]);
            System.out.printf("%-14s %s %.2f%n%n", "Gross Salary", ":", gr[j]);
            System.out.printf("%-14s %s %.2f%n", "Tax Deductions", ":", ta[j]);
            System.out.printf("%-14s %s %.2f%n", "Philhealth Tax", ":", ph[j]);
            System.out.printf("%-14s %s %.2f%n%n", "SSS Tax", ":", ss[j]);
            System.out.printf("%-14s %s %.2f%n", "Deductions", ":", dd[j]);
            System.out.printf("%-14s %s %.2f%n", "Net Income", ":", ns[j]);
            System.out.printf("%n%s%n%n%n", sp);
        }
    }
}

public class PayslipProject 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        while(choice != 3)
        {
            System.out.printf("%s%n%s%n%s%n%s%n", "Choose Option:", "1) Add Employee", "2) View Employee", "3) Exit");
            System.out.print("Option? ");
            choice = in.nextInt();
            
            switch (choice)
            {
                case 1:
                    Input.scannerInput();
                    break;
                    
                case 2:
                    Output.displayOutput();
                    break;
                    
                case 3:
                    System.out.print("Exiting...");
                    break;
                    
                default:
                   System.out.println("Invalid Input!!! Please try again...");
                   break;
            }
        }
        in.close();
    }
}

public class VariableSwappingPractice 
{
    public static void main(String[] args)
    {
        String var1 = "1";
        int var2 = 2;

        String temp = var1;
        var1 = Integer.toString(var2);
        var2 = Integer.parseInt(temp);
        System.out.print(var1);
        System.out.print(var2);
    }
}

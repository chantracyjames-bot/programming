import java.util.Scanner;

public class NewChristmasLights 
{
    public static void printTree()
    {
        Scanner in = new Scanner(System.in);
        //Declaration of variables
        String colour, star = "*", space = " ", trunk = "\u001B[38;5;180m" + "|", reset = "\u001B[0m", misc = "-+";
        String color[] = { "\u001B[31m", "\u001B[32m", "\u001B[33m" };
        for (int idk = 0; idk <= 10;) {  misc = misc + "-+";    idk++;  };
        //User Input
        System.out.println("\n" + misc);
        System.out.print("Enter number here: ");
        int num = in.nextInt();
        System.out.println(misc + "\n");
        //Loop for the Top-half of the Christmas Trwe
        for(int i = 0; i <= num; i+=1)
        {
            for(int j = num; j >= i; j-=2)
            {   System.out.print(space);  }
            
            for(int k = 1; k <= i; k++)
            {
                if (k % 2 == 0)
                {   colour = color[1];  }
                else
                {   colour = color[k % color.length];   }
                System.out.print(colour + star + reset);
            }
            System.out.println();
        }
        //Loop for the Bottom-half of the Christmas Tree
        for(int l = 0; l <= (num/5); l++)
        {
            for(int m = 0; m <= (num/4) + (num/8); m++)
            {   System.out.print(space);  }
            for(int n = 0; n <= (num/2) - (num/4); n++)
            {   System.out.print(trunk);  }
            System.out.println();
        }
        in.close();
    }
}
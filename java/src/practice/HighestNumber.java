public class HighestNumber 
{
    public static void main(String[] args)
    {
            int[][][] numbers = { 
            {
                {5, 10, 15}, {20, 25, 30}, {35, 40, 45}, {50, 55, 60}
            },
            {
                {65, 70, 75}, {80, 85, 90}, {95, 100, 105}, {110, 115, 120}
            },
            {
                {125, 130, 135}, {140, 145, 150}, {155, 160, 165}, {170, 175, 180}
            }
        };

        int con = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers[i].length; j++)
            {
                for(int k = 0; k < numbers[i][j].length; k++)
                {
                    if(con < numbers[i][j][k])
                    {   con = numbers[i][j][k];    }
                    System.out.println("The current greatest number is " + con);
                }
            }
        }
    }    
}

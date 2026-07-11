public class ExamsArrayTest
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

        for(int i = 0; i < numbers[1].length; i++)
        {
            for(int j = 0; j < numbers[1][i].length; j++)
            {
                System.out.print(numbers[1][i][j] + "\t");
            }
            System.out.println();
        }
    }
}
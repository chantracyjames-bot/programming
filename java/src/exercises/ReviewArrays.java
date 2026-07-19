public class ReviewArrays 
{
    public static void main(String[] args)
    {
        String[][][] arrays = {
            {
                { "a", "b", "c" },
                { "d", "e", "f" }
            },
            {
                { "g", "h", "i" },
                { "j", "k", "l" },
            },
            {
                { "m", "n", "o" },
                { "p", "q", "r" },
            },
            {
                { "w", "t", "u", "v" },
                { "w", "x", "y", "z" }
            }
        };
        System.out.printf("%s %s%s%s%s %s%s%s%n", arrays[1][0][2], arrays[1][0][2], arrays[2][0][2], arrays[3][0][3], arrays[0][1][1], arrays[3][1][2], arrays[2][0][2], arrays[3][0][2]);
    }
}

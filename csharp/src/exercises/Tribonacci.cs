using System;

namespace csharp.src.exercises 
{
    class Tribonacci 
    {
        static int[] TribonacciSequence(int[] arr, int len) 
        {
            if (len == 0) 
            {
                return [];
            }

            int[] new_arr = new int[len];

            if (arr.Length > 3) 
            {
                Console.WriteLine("Insufficient items in the array");
                return arr;
            } 
            else if (len < 3) 
            {
                int[] temp_arr = new int[len];
                for (int i = 0; i < len; i++) 
                {
                    temp_arr[i] = arr[i];
                }
                return temp_arr;
            }
            
            else if (arr[0] > arr[1] || arr[1] > arr[2]) 
            {
                Console.WriteLine("Unordered sequences");
                return arr;
            }

            for (int i = 0; i < arr.Length; i++) 
            {
                new_arr[i] = arr[i];
            }

            for (int i = 0; i < len - 3; i++) 
            {
                new_arr[i + 3] = new_arr[i] + new_arr[i + 1] + new_arr[i + 2];
            }

            return new_arr;
        }

        public static void Main() 
        {
            int[] res = TribonacciSequence([21, 32, 43], 10);
            foreach ( int i in res ) {
                Console.Write(i + " ");
            }
        }
    }
}
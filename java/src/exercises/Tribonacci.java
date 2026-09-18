import java.util.ArrayList;

public class Tribonacci {
    public static int[] tribonacciSequence(int[] arr, int len) {
        if (len == 0) {
            return new int[0];
        }

        int[] new_arr = new int[len];

        if (arr.length > 3) {
            System.out.println("Insufficient items in the array");
            return arr;
        } else if (len < 3) {
            int[] temp_arr = new int[len];
            for (int i = 0; i < len; i++) {
                temp_arr[i] = arr[i];
            }
            return temp_arr;
        }
        
        else if (arr[0] > arr[1] || arr[1] > arr[2]) {
            System.out.println("Unordered sequences");
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];
        }

        for (int i = 0; i < len - 3; i++) {
            new_arr[i + 3] = new_arr[i] + new_arr[i + 1] + new_arr[i + 2];
        }

        return new_arr;
    }

    public static void main(String[] args) {
        int[] res = tribonacciSequence(new int[] {21, 32, 43}, 2);
        for ( int i : res ) {
            System.out.print(i + " ");
        }
    }
}

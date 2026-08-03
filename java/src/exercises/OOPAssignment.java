import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class OOPAssignment {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("Enter 10 random numbers.");
        for (int i = 0; i < 10; i++) {
            System.out.printf("#%d: ", i + 1);
            nums[i] = in.nextInt();
        }

        //SortNumbersManual.quickSort(nums, 0, nums.length - 1);
        quickSort(nums, 0, nums.length - 1);
        System.out.println("\nThe sum of 1 to 200 is: " + idk());
        System.out.println("Sorted 10 random numbers: " + Arrays.toString(nums));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; 
        int i = (low - 1); 

        for (int j = low; j < high; j++) {
            if (arr[j] > pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int idk() {
        int sum = 0;
        for (int i = 0; i <= 200; i++) {
            sum += i;
            if (isDivisibleThree(i) && isDivisibleFive(i)) {
                System.out.println(i + " is divisible by 3 and 5");
                continue;
            } else if (isDivisibleThree(i)) {
                System.out.println(i + " is divisible by 3");
                continue;
            } else if (isDivisibleFive(i)) {
                System.out.println(i + " is divisible by 5");
                continue;
            } else {
                System.out.println(i);
                continue;
            }
        }
        return sum;
    }

    static boolean isDivisibleThree(int n) {
        return n % 3 == 0;
    } 

    static boolean isDivisibleFive(int n) {
        return n % 5 == 0;
    } 
}
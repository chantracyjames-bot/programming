import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Algorithms {
    static int fibonacciRecursion(int a) {
        if(a == 1 || a == 0) {
            return 1;
        }
        return fibonacciRecursion(a - 1) + fibonacciRecursion(a - 2);
    }

    static int factorialRecursion(int a) {
        if (a <= 1) {
            return 1; 
        }
        return a * factorialRecursion(a - 1);
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void userAlgorithms() {
        int arr[] = {4, 23, 14, 6, 8, 33};
        int targetNumber = 6;

        System.out.print("Array:");
        for ( int i : arr ) {
            System.out.print(" " + i);
        }

        bubbleSort(arr);
        System.out.print("\nBubble sort:");
        for ( int i : arr ) {
            System.out.print(" " + i);
        }
        arr = new int[]{4, 23, 14, 6, 8, 33};
        selectionSort(arr);
        System.out.print("\nSelection sort: ");
        for ( int i : arr ) {
            System.out.print(" " + i);
        }

        Integer linear = linearSearch(arr, targetNumber);
        Integer binary = binarySearch(arr, targetNumber);

        System.out.println("\nLinear Search:  " + linear);
        System.out.println("Binary Search:  " + binary);

        System.out.println("Factorial of 5: " + factorialRecursion(5));
        System.out.println("Fibonacci of 5: " + fibonacciRecursion(5));
    }
    
    static void sortingAlgorithms() {
        System.out.println("Sorting Algorhtms:");

        // list to search and sort
        List<Integer> items = new ArrayList<Integer>(List.of(2, 4, 1, 5, 6));
        System.out.println("List:    " + items);

        // copy list
        List<Integer> copy = new ArrayList<Integer>(items);
        
        // shuffles the list for random order
        Collections.shuffle(copy);
        System.out.println("Shuffle: " + copy);
        copy = new ArrayList<Integer>(items);

        // swaps the order of two elements
        Collections.swap(copy, 0, 4);
        System.out.println("Swap:    " + copy);
        copy = new ArrayList<Integer>(items);

        // reverses the order of the list
        Collections.reverse(copy);
        System.out.println("Reverse: " + copy);
        copy = new ArrayList<Integer>(items);

        // sorts the list using natural order
        Collections.sort(copy);
        System.out.println("Sort:    " + copy);
    }

    static void searchingAlgorthms() {
        System.out.println("Searching Algortihms:");

        // list to search and sort
        List<Integer> items = new ArrayList<Integer>(List.of(2, 4, 1, 5, 6));
        System.out.println("List:     " + items);

        // binary search
        Integer whereElement = Collections.binarySearch(items, 6);
        System.out.println("6 is at:  " + whereElement);

        // maximum search
        Integer maxElement = Collections.min(items);
        System.out.println("Maximum:  " + maxElement);

        // minimum search
        Integer minElement = Collections.min(items);
        System.out.println("Minimum:  " + minElement);

        // frequency search
        Integer freqElement = Collections.frequency(items, 2);
        System.out.println("6 occurs: " + freqElement + " times");

        // disjoint search
        Boolean isDisjoint = Collections.disjoint(items, items);
        System.out.println("List ∩ List: " + isDisjoint);
    }

    public static void main() {
        searchingAlgorthms();
        System.out.println();
        sortingAlgorithms();
        System.out.println();
        userAlgorithms();
    }
}

import java.util.*;

// Solved in HackerRank.com using Java 15
public class AlgorithmPractice {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> y = new ArrayList<>(List.of(3, 2, 1));

        System.out.println(compareTriplets(x, y));
    }

    static int sumOfTwo(int a, int b) {
      return a + b;
	}

    static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int i : ar) {
            sum += i;
        }
        return sum;

    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<Integer>(List.of(0, 0));
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) { result.set(0, result.get(0) + 1); }
            else if (a.get(i) < b.get(i)) { result.set(1, result.get(1) + 1); } 
            else { continue; }
        }
        return result;
    }

    static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (long i : ar) { sum += i; }
        return sum;
    }

    static int diagonalDifference(List<List<Integer>> arr) {
        int lToRight = 0;
        int rToLeft = 0;
        for (int i = 0; i < arr.size(); i++) {
            lToRight += arr.get(i).get(i);
        } 
        
        int counter = arr.size() - 1;
        for (int j = 0; j < arr.size(); j++) {
            rToLeft += arr.get(j).get(counter);
            counter--;
        }
        
        return Math.abs(lToRight - rToLeft);
    }

    static void plusMinus(List<Integer> arr) {
        double[] num = new double[3];
        
        for(int i : arr) {
            if (i == 0) { num[2] += 1; } 
            else if (i < 0) { num[1] += 1; } 
            else { num[0] += 1; }
        }
        System.out.printf("%.6f%n", num[0]/arr.size());
        System.out.printf("%.6f%n", num[1]/arr.size());
        System.out.printf("%.6f%n", num[2]/arr.size());
    }

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = n; k > i; k--) { System.out.print(" "); }
            for (int j = 1; j <= i; j++) { System.out.print("#"); }
            System.out.println();
        }
    }

    static void miniMaxSum(List<Integer> arr) {
        long allSum = 0;
        for (int i : arr) { allSum += i; }
        long min = allSum - arr.get(arr.size() - 1), max = allSum - arr.get(0);
        for (int i : arr) {
            long temp = allSum - i;
            if (min > temp) { min = temp; }
            if (max < temp) { max = temp; }
            temp = allSum;
        }
        
        System.out.println(min + " " + max);
    }

    static int birthdayCakeCandles(List<Integer> candles) {
        int tallest = 0;
        int num = 0;
        for (int i : candles) { if (i > tallest) { tallest = i; } }
        for (int j : candles) { if (j == tallest) { num += 1; } }
        return num;
    }

    static String timeConversion(String s) {
        String meridian = s.contains("AM") ? "AM" : "PM";
        String[] times = s.split(":|PM|AM");
        List<Integer> time = new ArrayList<>();
        for (String i : times) { time.add(Integer.parseInt(i)); } 

        if (meridian == "AM") { if (time.get(0) == 12) { time.set(0, 0); } } 
        else if (meridian == "PM") { if (time.get(0) != 12) { time.set(0, time.get(0) + 12); } }
        return String.format("%02d:%02d:%02d", time.get(0), time.get(1), time.get(2));
    }

    static void twoPointer(int[] arr, int num) {
        int rPtr = arr.length - 1;
        int lPtr = 0;
        
        while(lPtr < rPtr) {
            int sum = arr[lPtr] + arr[rPtr];
            if (num < sum) { rPtr--; } 
            else if (num > sum) { lPtr+=1; } 
            else { 
                System.out.println("Indices " + lPtr + " and " + rPtr + "(" + arr[lPtr] + " + " + arr[rPtr] + ") add up to " + num);
                return;
            }
        }
        System.out.println("No match found.");
    }
}
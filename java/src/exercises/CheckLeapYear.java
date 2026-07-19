public class CheckLeapYear {
    static void isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Century Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                    
                }
            } else {
                System.out.println(year + " is a Non-Century Leap Year.");
            }
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    public static void main() {
        int[] years = {2024, 1999, 2026, 2001, 1600, 1400, 2100, 2000, 1800};
        for (int i : years) {
            isLeapYear(i);
        }
    }
}
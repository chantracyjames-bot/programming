package tracy.company;

public class MainCompany {
    public static void main(String[] args) {
        Console.console();
    }

    public static void test() {
        Manager test = new Manager("tarcy", "CCIT", "idkman", 50000, 10000, 10);
        test.displayRole();

        Developer test1 = new Developer("tracy", "CCIT", "lumbago", 40000, 5000, "Java");
        test1.displayRole();

        Manager test2 = new Manager("yes", "TICC", "hello", 19, 5, -1);
        test2.displayRole();

        Developer test3 = new Developer("no", "TICC", "world", 91, 2, "Fortan");
        test3.displayRole();

        test.displayInformation();
        test1.displayInformation();
        test2.displayInformation();
        test3.displayInformation();
    }
}

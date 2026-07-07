public class TestClass {
    int ten = 10;

    public static void main(String[] args) {
        TestClass yes = new TestClass();
        TestClass no = new TestClass();
        yes.ten = 100;
        System.out.println(yes.ten);
        System.out.println(no.ten);
    }
}  

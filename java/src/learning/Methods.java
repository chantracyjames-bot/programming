/* methods and functions
    - built-in methods
        - main()
            - the main method in Java
            - it is the entry point of the program

        System class methods
            - print()
                - prints text to the screen
                - syntax:
                    System.out.print("Hello World"); // Hello World
            - println()
                - prints text to the screen
                - adds a new line after each statement
                - syntax:
                    System.out.println("Hello World"); // Hello World\n

        - String class methods
            - .length() or size()
                - queries the length of a string object
                - syntax and example:
                    String myString = "idk";
                    int length = myString.length(); // 3
            - .toUpperCase()
                - converts text into all upper case
                - syntax and example:
                    String myString = "idk";
                    String mySTRING = myString.toUpperCase(); // "IDK"
            - .toLowerCase()
                - converts text into all lower case
                - syntax and example:
                    String myString = "idk";
                    String mystring = myString.toLowerCase(); // "idk"
            - .indexOf()
                - finds the index of the first occurence of text in a String
                    - includes whitespace
                    - index starts from 0
                    - index is dictated by the characters not by word
                - syntax and example:
                    String myString = "idkman";
                    int myNum = myString.indexOf("n"); // 5
            - .charAt()
                - queries the character at a certain index of a String
                - syntax and example:
                    String myString = "idkman";
                    char myChar = myString.charAt(1); // 'd'
            - .equals()
                - compares two Strings
                    - if both are equal, the result is true
                    - false otherwise
                - syntax and example:
                    String myString1 = "idk";
                    String myString2 = "idk";
                    boolean myBool = myString1.equals(myString2); // true
            - .trim()
                - removes whitespace from the start and end of a String
                - syntax and example:
                    String myString = "   Hello World    ";
                    String trimmedString = myString.trim(); // "Hello World"
            - .concat()
                - used to concatinate strings together
                - an alternative to the + operator
                - syntax and example:
                    String myString = "idk";
                    myString.concat("man"); // "idkman"

        - Math class methods
            - Math.max()
                - queries the highest value between two values
                - syntax:
                    Math.max(x, y);
            - Math.min()
                - queries the lowest value between two values
                - syntax:
                    Math.min(x, y);
            - Math.sqrt()
                - performs a square root operation
                - syntax:
                    Matth.sqrt(x);
            - Math.abs()
                - finds the absolute value 
                - i.e. converts the number into a positive number
                - syntax:
                    Math.abs(x);
            - Math.pow()
                - raises a number to a power
                - syntax:
                    Math.pow(x, y); // x is the base number, y is the exponent
            - Math.round()
                - rounds a number to the nearest integer
                - syntax:
                    Math.round(x);
            - Math.ceil()
                - rounds a number to the nearest next integer
                - syntax:
                    Math.ceil(x);
            - Math.floor()
                - rounds a number to the nearest preceding integer
                - syntax:
                    Math.floor(x);
            - Math.random()
                - returns a double ranging from 0.0 (inclusive) to 1.0 (exlusive)
                - syntax
                    int myRandomNum = (int) Math.Random * 101; // 0 to 100

    - user-defined methods
        - paves the way for the creation of custom methods
        - user-defined methods are designed by the programmer

        - declaration and definition
            - methods are made to either have a return type or not
            - no return type:
                - syntax:
                    <staticOrDefault> void <methodName>() {
                        <statements>
                    }
                - example:
                    static void greeterMethod() {
                        System.out.print("Hello");
                    }
            - with return type:
                - syntax:
                    <staticOrDefault> <returnType> <methodName>() {
                        <statements>
                        return <value>;
                    }
                - example:
                    static String idkman() {
                        return "lumbago";
                    }
                - sidenote:
                    - when a return types is declared, the method must return a value
                        - a compilation error occurs when there is no return value
                        - the return value must be the same type as the return type declared
                    - the return type can be any of the primitive data types
                        - including arrays 
                    - any code that is declared after the return value won't be run
                        - once the program reaches a return value, it will jump back to the main program
                            - ignoring any code after it
            
        - methods with parameters
            - methods that requires an input of data
            - syntax:
                <staticOrDefault> <returnType> <methodName>(<parameters>) {
                    <statements>
                    <returnValueIfAny>
                }
            - example:
                void myMethod(int x) {
                    return x;
                }
            - the variable that is declared in the parameter is a temporary variable
                - it disappears after the method is finished
            - it is possible to declare multiple parameters
                - syntax:
                    void lumbago(float yes, char no) {
                        System.out.print("maybe");
                    }

        - access and method calls
            - methods are accessed using the method name followed by parentheses ()
            - syntax:
                <methodName>();
            - example:
                // inside main()
                idkman();

        - method calls with arguments
            - if a method needs certain parameters, that is called "argument"
            - calling methods with parameters requires the corresponding arguments
            - syntax:
                <methodName>(<arguments>);
            - example:
                myMethod(19);
            - variables and values are able to be passed as arguments
            - when there are multiple arguments needed
                - the order of parameters matter
                    - if the order of arguments doesn't match the order of parameters, an error occues
                    - example:
                        // assuming myMethod(int x, float y)
                        int a = 10;
                        float b = .13;
                        myMethod(a, b);
                        meMethod(b, a); -> Error
        
        - overloading
            - multiple methods can have the same name if they have different return types or paramenters
            - syntax:
                <returnType1> <methodName>(<parametersIfAny>) {
                    <arguments>
                }
                <returnType2> <methodName>(<parametersIfAny>) {
                    <arguments>
                }
            - example:
                void idkman(String world) {
                    System.out.print("Hello" + world);
                }    
                int idkmain(int man) {
                    return mam;
                }
                // inside main()
                // calling the overloaded method
                idkman("Hello"); // valid
                idkman(10);      // valid
            
        - recursions
            - it is the act of a method calling upon itself
            - its generally recommended to add a halting condition
                - otherwise, it will go into an infinite loop
                - or JVM will return recursion limit error
            - example:
                static int factorial(int num) {
                    if(num > 0) {
                        return num * factorial(num -1);
                    } else {
                        return num;    
                    }
                }
*/

public class Methods {
    public static void main(String[] args) {
        idkman("maybe");
        idkman('s');
        maybe();
    }
    static void idkman(String yes) {
        System.out.println("idk");
    }
    static int idkman(char no) {
        return 10;
    }
    static void maybe() {
        System.out.println("man");
    }
}

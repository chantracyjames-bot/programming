/* functions and methods
    - built-in functions
        - main()
            - the main method in Java
            - it is the entry point of the program
                - this is where the statements are first read and executed

        System class methods
            - .print()
                - prints text to the screen
                - syntax:
                    System.out.print(<value>);
                - example:
                    System.out.print("Hello World"); // Hello World
            - .println()
                - prints text to the screen
                - adds a new line after each statement
                - syntax:
                    System.out.println(<value>);
                - example:
                    System.out.println("Hello World"); // Hello World\n

        - String class methods
            - .charAt()
                - queries the character at a specified index of a String
                    - returns a char value corresponding to that index in the String
                - syntax:
                    <string>.charAt(<index>);
                - example:
                    "idkman".charAt(1); // 'd'
            - .codePointAt() 
                - queries the Unicode code of a character at a specified index of a String  
                    - returns an int value that is able to be casted as a char value
                - syntax:
                    <string>.codePointAt(<index>);
                - example:
                    "idkman".codePointAt(1);    // 100
            - .codePointBefore()
                - queries the Unicode code of a character before a specific index of a String
                    - returns an int value that is able to be casted as a char value
                - syntax:
                    <string>.codePointBefore(<index>);
                - example:
                    "idkman".codePointBefore(1); // 106
            - .codePointCout()
                - queries the numnber of Unicode characters found inside a String
                    - requires an start index and end index
                        - note that the end index is exclusive
                        - start index is inclusive
                    - returns an int representing the amount of Unicode characters
                - syntax:
                    <string>.codePointCount(<startIndex>, <endIndex>);
                - example:
                    "idkman".codePointBefore(0, 6); // 6
            - .compareTo()
                - used to compare two String values by their lexicography
                    - positive values indicate that the first String is greater that the second String
                        - either in Unicode value or number of Unicode characters
                        - if the Unicode value is higher
                            - the difference between it and the corresponding Unicode character at the same index in the second String is given
                            - example; 'F' and 'A', 'F' is higher than 'A' by 4, so it returns 4
                        - if the number of Unicode characters is higher
                            - it will return the difference between the size of the first and second String
                            - if and only if the Strings are identical except the excess Unicode values
                            - example; 'idkmmm' and 'idk', 'idkmmm' has 3 more values than 'idk', so it returns 3
                    - negative values indicate that the second String is greater than the first String
                        - either in Unicode value or number of Unicode characters
                        - if the Unicode value is higher
                            - the difference between it and the corresponding Unicode character at the same indec in the first String is given
                            - example; 'A' and 'a', 'A' is lower than 'a' by 32, so it returns -32
                        - if the number of Unicode characters is higher
                            - it will return the difference between the size of the first and second String
                            - if and only if the Strings are identical except the excess Unicode values
                            - example; 'lumbago' and 'lumbagooo', 'lumbago' has 2 less values than 'lumbagooo', so it returns -2
                    - note that this methods runs through the Strings from left to right
                        - any values String values after the first mismatch is discarded
                        - example; 'lumbago' and 'idkman', the first letters are compared, 'l' and 'i' while the others are ignored
                - syntax:
                    <string1>.compareTo(<string2>);
                - example;
                    "lumbago".compareTo(idkman); // 3
            - .compareToIgnoreCase()
                - the same function as the .compareTo() method, comaparing two Strings lexicograpically
                - the only difference is that this method ignores case-sensitive differences
                    - i.e. does not take into consideration if both values differ in casing or not
                - syntax:
                    <string1>.compareToIgnoreCase(<string2>);
                - example:
                    "Hello".compareToIgnoreCase("hello"); // 0
            - .concat()
                - used to concatinate strings together
                    - an alternative to the + operator
                - returns a combined String value
                - syntax:
                    <string1>.concat(<string2>);
                - example:
                    "idk".concat("man"); // "idkman"
            - .contains()
                - queries if the String contains a specific sequence of characters
                    - returns true if the value is present
                    - returns false if not
                - syntax:
                    <string>.contains(<charSequence>);
                - example:
                    "lumbago".contains("bag"); // true
            - .contentEquals()
                - compares a String to a StringBuffer or a CharSequence object
                    - similar to the .equals() method
                - syntax:
                    <string>.contentEquals(<stringBuffer>);
                    // or
                    <string>.contentEquals(<charSequence>);
                - example:
                    "Hello World".contentEquals("Hello World"); // true
            - .copyValueOf()
                - returns a String from an array of characters
                    - i.e. turns a specific portion of a char[] into a String value
                - requires a start index and a end index
                    - note that the end index is exclusive
                    - start index is inclusive
                - syntax:
                    <string>.copyValueOf(<char[]>), <startIndex>, <endIndex>;
                - example:
                    char[] charArray = {65, 66, 67, 68};                     // {'A', 'B', 'C', 'D'}
                    String myString = myString.copyValueOf(charArray, 0, 4); // "ABCD"
            - .endsWith()
                - queries if a given String ends with a certain sequence of characters
                    - returns true if the String ends with the given characters
                    - returns false if no
                - syntax:
                    <string1>.endsWith(<string2>);
                - example:
                    "idkman".endsWith("man"); // true
            - .equals()
                - compares two String values
                    - returns true if both values are the same
                    - returns false if otherwise
                - note that unlike the .contentEquals() method
                    - this method strictly requires only Strings
                - syntax:
                    <string1>.equals(<string2>);
                - example:
                    "idk".equals("idk"); // true
            - .equalsIgnoreCase()
                - similar to the .equals() method
                    - only that this method ignores case-sensitive strings
                    - i.e. does not consider UpperCase and lowercase characters
                - syntax:
                    <string1>.equalsIgnoreCase(<string2>);
                - example:
                    "yippee".equalsIgnoreCase("YIPPEE"); // true
            - .format()
                - similar to the .printf() method
                    - instead of printing, it returns a String value
                - returns a formatted String value
                - the first argument must be a String of format specifiers
                - syntax:
                    String.format(<formatSpecifier>, <string>);
                - example:
                    String.format("%d %s", 10, tem);
            - .getBytes()
                - converts a String into an array of bytes
                - returns a bytes[] value
                - syntax:
                    <string>.getBytes()
                - example:
                    "ABCD".getBytes(); // {65, 66, 67, 68}
            - .getChars()
                - copies a part of a String into a char array
                - returns a char[] value
                    - requires a start and end index
                        - note that the end index is exclusive
                        - start index is inclusive
                    - requires a position index
                        - dictates where to start to write the copied characters
                        - this value is inclusive
                - syntax:
                    <string>.getChars(<startIndex>, <endIndex>, <charArray>, <position>);
                - example:
                    char[] maybe = {'l', 'u', 'm', 'b', 'a', 'g', 'o'};
                    "idkman".getChars(3, 6, maybe, 4);                  // lumbman
            - .hashCode()
                - returns the hash code of a string
                - formula:
                    s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
                - where s[i] is the ith character of the string, n is the length of the string, and ^ indicates exponentiation.
                - syntax:
                    <string>.hashCode();
                - example:
                    "idkman".hashCode(); // -1193258838
            - .intern()
                - returns a canonical representation of a String object
                    - a reference of that String in the String Pool
                        - if that String is not present
                            - then it adds it and returns that address
                        - if it is
                            - then returns that address 
                - syntax:
                    <string>.intern()
                - example:
                    "idkman".intern(); // memory address of "idkman" from the String Pool
            - .indexOf()
                - finds the index of the first occurence of a specified substring in a String
                    - starts from the start of the String
                - returns an int value denoting the starting index of the located value
                    - a substring is a required argument
                        - which can be a String or char value
                    - note that it also takes an optional second argument
                        - a starting index to for the method to start the search
                        - note that this index is inclusive
                        - in .indexOf(), the index moves to the right
                - syntax:
                    <string>.indexOf(<substring>, <startIndex>);
                    // or
                    <string>.indxcOf(<substring>);
                - example:
                    "Hello World".indexOf('o'); // 4
            - .isEmpty()
                - queries if the String is empty or not
                    - note that whirespace is not empty space
                - returns a boolean value
                    - returns true if the String is empty
                    - returns false if not
                - syntax:
                    <string>.isEmpty();
                - example:
                    "idkman".isEmpty(); // false
            - .join()
                - joins two or more CharSequence or String elements into one single String value
                    - uses a separator to separate the joined Strings
                - returns a String value consisting of String values joined and separated by a separator
                - syntax:
                    String.join(<separator>, <charSequence>);
                    // or 
                    String.join(<separator>, <iterable>);
                - example:
                    String.join(" ", "idkman", "lumbago"); // "idkman lumbago"
            - .lastIndexOf()
                - finds the index of the first occurence of a specified substring in a String
                    - starting from the end of the String
                - returns an int value denoting the starting index of the located value
                    - a substring is a required argument
                        - which can be a String or char value
                    - note that it also takes an optional second argument
                        - a starting index to for the method to start the search
                        - note that this index is inclusive
                        - in .lastIndexOf(), the index moves to the left
                - syntax:
                    <string>.lastIndexOf(<substring>, <startIndex>);
                    // or
                    <string>.lastIndexOf(<substring>);
                - example:
                    "Hello World".lastIndexOf('o'); // 7
            - .length()
                - queries the length of a string object
                - returns an int value, coninciding with the size of a String
                - syntax:
                    <string>.length();
                - example:
                    "idkman".length(); // 6
            - .matches()
                - compares a String to a regular expression
                    - requires a regex value as an arguement
                - results into a boolean
                    - returns true if the String matches the regex value
                    - returns false if not
                - example:
                    "idkman".matches("idkman|lumbago"); // true
            - .offsetByCodePoints()
                - returns an index of a String which has bee offset byt a specified number of code points
                    - note that some code points require two characters in memory to store
                        - hence, needing to offset the index to read the correct index
                    - emojis and other special characters require two characters in memory
                - requires a starting index and an offset index
                    - the starting index dictates what index of a String to start reading
                    - the offset index dictates the number of charactes to offset by
                        - skipping characters which take up two character slots
                - syntax:
                    <string>.offsetByCodePoints(<index>, <offset>);
                - example:
                    "idk😭man".offsetByCodePoints(2, 2); // 3
                                                         // starts at index 2, 'k'
                                                         // offset by 2 characters
                                                            // since 😭 is an emoji, it takes two slots
                                                            // 'm' is a normal character, taking one slot
                                                            // 2 + 1 = 3
            - .regionMatches()
                - compares two regions of two String values if they match
                    - requires the starting index of both regions of the two Strings
                        - the first being the starting index of the first String
                        - the second being the starting index of the second String
                - results into a boolean value
                    - returns true if the specified regions match
                    - returns false if not
                - has an optional boolean value
                    - toggling case-sensitive mode or not
                - requires a length value
                    - indicating the length of the region to compare
                - syntax:
                    <string1>.regionMathces(<boolean>, <string1Index>, <string2>, <string2Value>, <length>);
                    // or
                    <string1>.regionMatches(<string1Index>, <string2>, <string2Index>, <length>);
                - example:
                    "idkman".regionMatches(4, "lumbago", 4, 1); // true
                                                                // String region a = "a"
                                                                // String region b = "a"
            - .replace()
                - replaces all occurences of a specified char value in a String value
                    - uses a char as a search value
                - returns a String wherein the replaced characters are present
                    - note that a char value for both a search and replacement value is required
                - syntax:
                    <string>.replace(<search>, <replacement>);
                - example:
                    "idkman".replace('d', (char) 0); // "ikman"
            - .replaceAll()
                - replaces all occurenhces of a specified substring in a String value
                    - uses a regular expression as a search value
                - returns a String wherein the replaced substrings are present
                    - note that a regex value and a replacement String value is required
                - syntax:
                    <string>.replaceAll(<regex>, <replacement>);
                - example:
                    "idkman".replaceAll("i|a", "o"); / "odkman";
            - .replaceFirst();
                - replaces the first occurence of a specified substring in a String value
                    - uses a regular expression as a search value
                - returns a String wherein the replaced substring is present
                    - note that a regex value and a replacement String value is required
                - syntax:
                    <string>.replaceFirst(<regex>, <replacement>);
                - example:
                    "idkman".replaceFirst("idk", "ik"); // "ikman"
            - .split()
                - splits the String value into an array of subtrings
                    - uses a regular expression as the separator
                - returns a String[] value
                    - note that a regex value is required
                        - returns the remainder of the String into the end of the array
                    - has an optional second argument
                        - an int value representing the limit to how many splits are done
                        - the remaining string that is not split is stored at the end of the array
                - syntax:
                    <string>.split(<regex>, <limit>);
                - example:
                    "idkman".split("k"); {"id", "man"}
            - .startsWith()
                - queries if a given String starts with a certain sequence of characters
                    - returns true if the String starts with the given characters
                    - returns false if no
                - syntax:
                    <string1>.startsWith(<string2>)
                - example:
                    "idkman".startsWith("idk"); // true
            - .subSequence()
                - returns a CharSequence object from a String value
                - requires both a start index and end index
                    - note that the end index is exclusive
                    - start index is inclusive
                - syntax:
                    <string>.subSequence(<startIndex>, <endIndex>);
                - example:
                    "idkman".subSequence(0, 3);
            - .substring()
                - returns a subtring from a String value
                - requires a start index
                    - end index is optional but if not present 
                        - returns a substring from the starting index until the end of the String
                    - note that the end index is exclusive
                        - and start value if inclusive
                - syntax:
                    <string>.substring(<startIndex>, <endIndex>);
                - example:
                    "idkman".substring(3, 6); // "man"
            - .toCharArray()
                - converts a string value into a char array
                - returns a char[] value
                - syntax:
                    <string>.toCharArray();
                - example:
                    "idkman".toCharArray(); // {'i', 'd', 'k', 'm', 'a', 'n'}
            - .toLowerCase()
                - converts a String value into its lowercase variamts
                - returns a String value of lowercase characters
                - syntax:
                    <string>.toLowerCase();
                - example:
                    "LUMBAGO".toLowerCase(); // "lumbago"
            - .toString()
                - used to allow code that is treating the String as a more generalized object
                    - to know its string value without casting it to String type
                - returns a String value into itself                    
                - syntax:
                    <string>.toString();
                - example:
                    "idkman".toString(); // "idkman"
                - example
            - .toUpperCase()
                - convers a String value into its UpperCase variants
                - returns a String value of UpperCase characters
                - syntax:
                    <string>.toUpperCase();
                - example:
                    "idkman".toUpperCase(); // "IDKMAN"                    
            - .trim()
                - removes whitespace from the start and end of a String
                - returns a String with the removed whitespace
                - syntax:
                    <string>.trim()
                - example:
                    "   idkman   ".trim(); // "idkman"
            - .valueOf()
                - converts non-String values into a String representation
                    - returns a String value
                - syntax:
                    String.valueOf(<value>);
                - example:
                    String.valueOf(100); // "100"

        - Math class methods
            - .abs()
                - finds the absolute value 
                    - i.e. converts the number into a positive number
                - returns a positive double, float, int or long value
                - syntax:
                    Math.abs(x);
                - example:
                    Math.abs(-10); // 10
            - .addExact()
                - adds two values
                - returns a long or an int value
                    - throws a ArithmeticException if the sum causes an overflow
                - syntax:
                    Math.addExact(x, y);
                - example:
                    Math.addExact(1, 1); // 2
            - .cbrt()
                - performs a cube root operation
                - returns a double value
                - syntax:
                    Math.cbrt(x);
                - example:
                    Math.cbrt(27); // 3
            - .ceil()
                - rounds a number to the nearest next integer
                - returns a double value
                - syntax:
                    Math.ceil(x);
                - example:
                    Math.ceil(3.14); // 4.0
            - .copySign()
                - copies the sign of the second argument and places it on the first
                - returns double or a float value
                - syntax:
                    Math.copySign(x, y);
                - example:
                    Math.copySign(-1, 4); // 1
            - decrementExact()
                - returns exactly one integer less than the argument
                - returns an long or an int value
                    - throws an ArithmeticException if an overflow occurs
                - syntax:
                    Math.decrementExact(x);
                - example:
                    Math.decrementExact(1); // 0
            - .floor()
                - rounds a number to the nearest preceding integer
                - syntax:
                    Math.floor(x);
                - example:
                    Math.floor(2.72); // 2.0
            - .floorDiv()
                - performs a division operation between two arguments
                    - and then rounds the quotient down
                - returns a long or an int value
                - syntax:
                    Math.floorDiv(x, y);
                - example:
                    Math.floorDiv(10, 3); // 3
            - .floorMod()
                - performs a division operation between two arguements
                    - and then returns the modulo of the remainder rounded up
                - returns a long or an int value
                - syntax:
                    Math.floorMod(x, y);
                - example:
                    Math.floorMod(10, 3); // 1
            - .incrementExact()
                - returns exactly one integer more than the argument
                - returns a long or an int value
                    - throws an ArithmeticException if an overflow occurs
                - syntax:
                    Math.incrementExact(x);
                - example:
                    Math.incrementExact(1); // 2 
            - .max()
                - queries the highest value between two values
                - returns a double, float, int, or long value
                - syntax:
                    Math.max(x, y);
                - example:
                    Math.max(9, 5); // 9
            - .min()
                - queries the lowest value between two values
                - returns a double, float, int or long value
                - syntax:
                    Math.min(x, y);
                - example:
                    Math.min(9, 5); // 5
            - .multipleExact()
                - returns the exact product between two arguements
                - returns a long or an int value
                    - throws an ArithmeticException if an overflow occurs
                - syntax:
                    Math.multiplyExact(x, y);
                - example:
                    Math.multiplyExact(1, 1); // 1
            - .negateExact()
                - returns the exact number but in the opposite sign (domain)
                - returns a long or an int value
                    - throws an ArithmeticException if an overflow occurs
                - syntax:
                    Math.negateExact(x);
                - example:
                    Math.negateExact(Integer.MIN_VALUE); -> Error
            - .nextAfter()
                - finds the next floating point number 
                    - in the direction of the second argument
                - returns a double or float value
                - syntax:
                    Math.nextAfter(x, y);
                - example:
                    Math.nextAfter(1f, 2f); // 1.0000001
            - .nextDown()
                - finds the next floating point number
                    - in the negative direction
                - returns a double or float value
                - syntax:
                    Math.nextDown(x);
                - example:
                    Math.nextDown(1); // 0.99999994
            - .nextUp()
                - finds the next floating point number
                    - in the positive direction
                - returns a double or float number
                - syntax:
                    Math.nextUp(x);
                - example:
                    Math.nextUp(1); // 1.0000001
            - .pow()
                - raises a number to a power
                    - the first argument is the base
                    - the second argument is the exponent
                - syntax:
                    Math.pow(x, y);
                - example:
                    Math.pow(3, 2); // 9
            - .random()
                - returns a double ranging from 0.0 to 1.0
                    - 0.0 is inclusive, 1.0 is exclusive
                - syntax
                    Math.random();
                - example:
                    Math.random(); // 0.00 to 0.99 
            - .rint()
                - rounds a number to the nearest integer
                    - if the both integers are equally as far (0.5)
                        - the method returns the nearest even number
                - returns a double value
                - syntax:
                    Math.rint(x);
                - example:
                    Math.rint(1.5); // 2   
            - .round()
                - rounds a number to the nearest integer
                - syntax:
                    Math.round(x);
                - example:
                    Math.round(0.6); // 1
            - .scalb()
                - performs the mathemetical operation of x*2^y
                    - the first argument is the base
                    - the second argument is the exponent of 2
                - returns a double or a float value
                - syntax:
                    Math.scalb(x, y);
                - example:
                    Math.scalb(3.0, 3.0); // 24.0
            - .signum()
                - queries the sign of the number
                - return a double or a float
                    - -1 if the number is negative
                    - 1 if the number is positive
                    - 0 if the number is exactly zero
                - syntax:
                    Math.signum(x);
                - example:
                    Math.signum(10); // 1.0
            - .sqrt()
                - performs a square root operation
                - syntax:
                    Math.sqrt(x);
                - example:
                    Math.sqrt(9); // 3
            - .subtractExact()
                - subtracts two values
                - returns a long or an int value
                    - throws a ArithmeticException if the difference causes an overflow
                - syntax:
                    Math.subtractExact(x, y);
                - example:
                    Math.subtractExact(1, 1); // 0
            - .toIntExact()
                - converts a long value to an int value
                - returns an int value
                    - throws a ArithmeticException if the result causes an overflow
                - syntax:
                    Math.toIntExact(x);
                - example:
                    Math.toIntExcat(10L); // 10
            - .ulp()
                - returns the unit of least precision of a number
                    - larger numbers have lower precision
                - returns a double or long value
                    - doubles are more precise than floats
                - syntax:
                    Math.ulp(x);
                - example:
                    Math.ulp(1); // 2.220446049250313E-16

    - user-defined functions
        - paves the way for the creation of custom functions
        - user-defined functions are designed by the programmer

        - declaration and definition
            - functions are made to either have a return type or not
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
            
        - functions with parameters
            - functions that requires an input of data
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
            - functions are accessed using the method name followed by parentheses ()
            - syntax:
                <methodName>();
            - example:
                // inside main()
                idkman();

        - method calls with arguments
            - if a method needs certain parameters, that is called "argument"
            - calling functions with parameters requires the corresponding arguments
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
            - multiple functions can have the same name if they have different return types or paramenters
                - is a form of Polymorphism
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

public class Functions {
    public static void main(String[] args) {
        System.out.println(stringLength("idkman"));
    }

    static int stringLength(String s) {
        return s.length();
    }
}

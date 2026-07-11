/* data types
    - Java has two types of data types: Primitive and Non-primitive
    - Primitive data types consists of 8 types
        - byte
            - stores whole numbers ranging from -128 to 127
            - example:
                byte myByte = 127;
        - short
            - stores whole numbers ranging from -32 768 to 32 767
            - example:
                short myShort = -32768;
        - int
            - stores whole numbers ranging from -2 147 483 648 to 2 147 483 647
            - example:
                int myInt = 2147483647;
        - long 
            - stores whole numbers ranging from -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807
            - requires the l or L suffix to be a valid long value
            - example:
                long myLong = -9223372036854775808L;
        - float
            - stores 4 bytes of decimals ranging from 6-7 decimal places
            - requires the f or F suffic to be a valid float value
            - example:
                float myFloat = 3.141592f;
        - double
            - stores 8 bytes of decimals ranging from 15-16 decimal places
            - decimals are automatically declared as double unless type casted
            - it is optional to use the d or D suffix unless type casting from a float
            - example:
                double myDouble = 1.23456789101112;
        - boolean
            - stores either a true ot false value
            - example:
                boolean myBool = true;
        - char
            - stores a single character or a Unicode escape sequence
            - requires to be declared in single quotes ' '
            - example:
                char myChar = 'Y';

    - Non-primitive are data types that are not part of the 8 primitive types
        - String
            - stores an array of characters, and has methods to manipulate text values
            - requires to be declared in double quotes " "
            - example:
                String myString = "Hello World";
        - Classes
            - are blueprints for objects, having their own attributes and methods
            - String is a class, so is Scanner, LocalDate, System, etc.
            - example:
                class MyClass { }
        - Interfaces
            - are blueprints for classes, part of the concept of Abstraction
            - example:
                interface MyInterface { }
        - Enums
            - stores constant (final) attributes and values
            - example:
                enum MyEnum { }

    - Other data type concepts:
        - automatic data type declaration
            - leaves it to the compiler to determince the data types or an attribute or variable
            - uses the var keyword
            - var only works if the value the variable holds is assigned alongside it
            - the data type cannot be changed after the compiter determines its type
                - i.e. float cannot become int
            - example:
                var myVar = "value";
        - scientific notation (e)
            - used to write very large or very small numbers
            - uses the letter e or E
            - example:
                double largeNum = 10e10; // same as 10 x 10^10
                // or
                float smallNum = 10e-10f; // same as 10 x 10^-10
        - type casting
            - data types are able to be converted into another type
            - either widening casting or narrowing casting
                - widening casting
                    - from a smaller type to a larger type
                    - done automatically without data loss
                    - byte -> short -> char -> int -> long -> float -> double
                    - example:
                        byte smallToLargeType = 100;
                        int largerType = smallToLargeType;
                - narrowing casting
                    - from a larger type to a smaller type
                    - done manually due to possible data loss
                    - double -> float -> long -> int -> char -> short -> byte
                    - example:
                        float largeToSmallType = 903.54f;
                        short smallerType = (short) largeToSmallType; // has to be manually type casted using (<dataType>)
*/

public class DataTypes {
    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes();
        System.out.printf("%s", "Java Data Types");
        dataTypes.primitiveDataTypes();
        dataTypes.nonPrimitiveDataTypes();
        dataTypes.otherDataTypeConcepts();
    }
    void primitiveDataTypes() {
        System.out.printf("%n%s %n%-7s%s%d %n%-7s%s%d %n%-7s%s%d %n%-7s%s%d %n%-7s%s%.6f %n%-7s%s%.15f %n%-7s%s%b %n%-7s%s%c",
            "Primitive Types",
            "byte", ": ", 127,
            "short", ": ", -32768,
            "int", ": ", 2147483647,
            "long", ": ", -9223372036854775808L,
            "float", ": ", 3.141592f,
            "double", ": ", 1.234567890101112,
            "boolean", ": ", true,
            "char", ": ", 'Y'
        );
    }
    void nonPrimitiveDataTypes() {
        System.out.printf("%n%n%s %n%-12s%s%s %n%-12s%s%s %n%-12s%s%s %n%-11s%s%s",
            "Non-primitive Types",
            "String", ": ", "Hello World",
            "Classes", ": ", "class MyClass {...}",
            "Interfaces", ": ", "interface MyInterface {...}",
            "Enumerations", ": ", "enum MyEnum {...}"
        );
    }
    void otherDataTypeConcepts() {
        System.out.printf("%n%n%s %n%s%s%s%s%s %n%s%s%s%f %n%s %n%-4s%s%s%d%s%d %n%-4s%s%s%.2f%s%d",
            "Other concepts",
            "automatic date type", " : ", "var myVar = \"", "value", "\" -> String",
            "scientific notations", ": ", "10e10 = ", 100000000000.00,
            "type casting",
                "", "widening ", ": from (byte) ", 100, " to (int) ", 100,
                "", "narrowing", ": from (float) ", 903.54, " to (short) ", 903
        );
    }
}
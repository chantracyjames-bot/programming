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
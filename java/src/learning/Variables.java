public class Variables {
    // constant variable, cannot be overwritten
    final static int CONSTANT_VARIABLE = 10000;

    public static void main(String[] args) {
        // normal variable declaration
        String myText = "yes";

        // defining after declaring
        char myChar;
        myChar = 'Y';

        // using the var keyword
        var myDouble = 3.14; // double

        // copying a value to another variable
        var myNum = CONSTANT_VARIABLE;

        // results into errors
        // changing the value of a constant
        // CONSTANT_VARIABLE = 1; -> Error
        
        // changing types
        // int myText;

        // having no name
        // float = 3.14f;

        // type casting - widening
        long myLong = myNum;

        // type casting - narrowing
        float myFloat = (float) myDouble;

        // using wrapper classes
        Integer myNumber = new Integer(10);
    }
}

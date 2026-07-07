/* variables
    - variables are containers for storing data (or values)
    - declaration and initialization:
        - syntax:
            <dataType> <varaibleName> = <value>;
        - example:
            int myNum;
        - rules for variable declaration:
            - variables must have a name
                - it is not possible to declare a variable without a name
                - trying to do so results in an error
                - Sting = "test"; -> Error
            - variable names can use letters, numbers*, underscores _ or dollar signs $
                - *variable names cannot start with a number
                - float 0myNum; -> Error
            - variable names must not contain any special characters
                - examples are @, #, %, ~, etc.
            - variable names must start with either a letter, an underscore _ or a dollar sign $
            - variable names cannot use reserved names
                - example: int, float, classes, String, etc.
            - variable must be declared with a type
                - declaring a variable without a data type results in an error
                - myVar = "idk"; -> Error

        - conventions in naming variables
            - in Java, camelCase is the preferred method of naming variables adn attribues
                - example: myVar, floatValue, currentTemperature, etc.
            - variable names must match their purpose
                - it makes reading variable easy to understand
                - example: myNum, varSum, etc.

        - it is possible to declare a value alongside the variable:
            - note that the value to assign to a variable must match the variable type
            - syntax:
                <dataType> <variableName> = <value>;
            - example:
                char myChar = 'I';

        - it is possible to declare more than one variable in a single statement
            - note that the it is only possible to declare multiple variables with the same data type
            - syntax:
                <dataType> <variable1Name>, <variable2Name>, <variable3Name>;
            - example:
                String testString, tryString, yesString;

        - it is also possible to declare values alongside the variables in a multi-variable declaration
            - syntax:
                <dataType> <variable1Name> = <variable1Value>, <variable2Name> = <variable2Value>;
            - example
                String myString = "Hello World", myString = "idkman", kjakyuih = "lumbago";

    - access and modification
        - the values of a variable are accessible through calling their name
            - syntax:
                <variableName>;
            - example:
                float myFloat = 3.14;
                myFloat; // -> 3.14

        - it is possible to change the values of a variable
            - syntax:
                <variableName> = <newValue>;
            - example:
                myFloat = 1.11;
            - sidenote:
                - changing the value of a variable to a value that does not match the declared type results in an error
                    - doing so result in an error
                    - myFloat = "idkman"; -> Error
                - it is not possible to change the type of a variable once it have been assigned to one
                    - doing so resuls in an error
                    - int myNum;
                    - float myNum; -> Error

        - it is possible to set (or declare) the value of variable equal to another
            - only if they are the same data type
            - syntax:
                <dataType> <variable2Name> = <variable1Name>;
                // or 
                <variable2Name> = <variable1Name>; 
            - example:
                String myString = myText;
                // or 
                myString = myText;

    - constants (final)
        - these are variables that is unmodifiable
            - i.e. the values are stuck or cannot be changed
            - the variable effectively becomes read-only
            - similar to the const keyword in C/C++
        - uses the final keyword to be declared
        - syntax:
            final <dataType> <variableName> = <value>;
        - example:
            final char CHAR = 'A';
        - sidenote:
            - a value must be declared alongside the final variable
            - if a final variable is declared without a value, an error occurs
            - example:
                final int NUM; -> Error
        - convention:
            - when naming constant (final) variables, it is recommended to be in SCREAMING_SNAKE_CASE
            - exanple:
                final int NUM1 = 1, NUM2 = 2;
*/

public class Variables {
    public static void main(String[] args) {
        
    }
}

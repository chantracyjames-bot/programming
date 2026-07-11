/* variables
    - variables are containers for storing data (or values)
    - declaration and initialization
        - syntax:
            <dataType> <variableName> = <value>;
        - example:
            int myNum;
        - rules foe variable declaration
            - variables must have a name
                - it is not possible to declare a varibale without a name
                - trying to do so results in an error
                - example:
                    int = 10; -> Error
            - variable names can use letters, numbers*, and underscores _
                - *variables cannot start with a number, but can contain it
                - float 1num = 3.14; -> Error
            - variable names must start with either a letter, or an underscore _
            - variable names cannot use reserved names
                - examples are int, float, double, etc.
            - variables must be declared with a type
                - declaring a variable without a data type is not allowed
                    - doing so results in an error
                - example:
                    myVar = 'A'; -> Error

        - conventions in naming variables
            - in C++, camelCase is the preferred method of naming variables and attributes
                - example: myVar, myInt, sumValue, etc.
            - variable names must match their purpose
                - it makes reading variables easier to understand

        - it is possible to declare a value along the variable
            - note that the value assigned to the variable must match the data type it was declared as
            - syntax:
                <dataType> <variableName> = <value>;
            - example:
                char myChar = 'Y';

        - it is possible to declare more than one variable in a single statement
            - each declarations are separated by commas
            - note that they must be using a single data type
            - syntax:
                <dataType> <variableName1>, <variableName2>, <variablename3>;
            - example:
                int myNum1, myNum2, myNum3;
            - it is also possible to declare variables with a value;
                - syntax:
                    <dataType> <variableName1> = <value1>, <variableName2> = <value2>;
                - example:
                    float pi = 3.14, euler = 2.72, yes = 4.19;

    - access and modification
        - the values of a variable are accessible through calling their name
            - syntax:
                <variableName>;
            - example:
                myVar;
        
        - it is possible to change the value that a variable holds
            - it is through accessing them and using the assignment = operator
            - syntax:
                <variableName> = <newValue>;
            - example:
                myInt = 1000;
            - sidenote:
                - the new value must match the pre-existing data type of the variable being modified
                    - not doing so results in an error
                    - example:
                        myNum = "idkman"; -> Error
                - it is not possible to change the type of a variable once it has been assigned to one
                    - example:
                        float myChar; -> Error
                    
        - it is possible to set (or declare) the value of a variable to be equal to another
            - only if they have the same data type
            - syntax:
                <dataType> <variableName1> = <variableName2>;
                // or
                <variableName1> = <variableName2>;
            - example:
                int myFloat = myOtherFloat;
                // or
                myNum = myOtherNum;

    - constants (const)
        - these are variables that are unmodifiable
            - i.e. the values cannot be changed
            - the variable effectively becomes read-only
            - similar to the final keyword in Java
        - uses the const keyword
        - syntax:
            const <dataType> <variableName> = <value>;
        - example:
            const int myNum = 10;
        - sidenote:
            - the variable must be declares with a value
            - if a const variable is declared without a value, an error occurs
            - example:
                const myNum; -> Error
        - convention:
            - when naming constant variables, it is recommended to use SCREAMING_SNAKE_CASE
            - example:
                const MY_VARIABLE = "Hello World";
*/
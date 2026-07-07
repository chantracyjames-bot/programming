/* variables
    - variables are containers for storing data (or values)
    - declaration and initialization
        - syntax:
            <data_type> <variable_name> = <value>;
        - example:
            int my_num
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
                    my_var = 'A'; -> Error

        - conventions in naming variables
            - in C, snake_case is the preferred method of naming variables and attributes
                - example: my_var, my_int, sum_value, etc.
            - variable names must match their purpose
                - it makes reading variables easier to understand

        - it is possible to declare a value along the variable
            - note that the value assigned to the variable must match the data type it was declared as
            - syntax:
                <data_type> <variable_name> = <value>;
            - example:
                char my_char = 'Y';

        - it is possible to declare more than one variable in a single statement
            - each declarations are separated by commas
            - note that they must be using a single data type
            - syntax:
                <data_type> <variable_name1>, <variable_name2>, <variable_name3>;
            - example:
                int my_num1, my_num2, my_num3;
            - it is also possible to declare variables with a value;
                - syntax:
                    <data_type> <variable_name1> = <value1>, <variable_name2> = <value2>;
                - example:
                    float pi = 3.14, euler = 2.72, yes = 4.19;

    - access and modification
        - the values of a variable are accessible through calling their name
            - syntax:
                <variable_name>;
            - example:
                my_var;
        
        - it is possible to change the value that a variable holds
            - it is through accessing them and using the assignment = operator
            - syntax:
                <variable_name> = <new_value>;
            - example:
                my_int = 1000;
            - sidenote:
                - the new value must match the pre-existing data type of the variable being modified
                    - not doing so results in an error
                    - example:
                        my_num = "idkman"; -> Error
                - it is not possible to change the type of a variable once it has been assigned to one
                    - example:
                        float my_char; -> Error
                    
        - it is possible to set (or declare) the value of a variable to be equal to another
            - only if they have the same data type
            - syntax:
                <data_type> <variable_name1> = <variable_name2>;
                // or
                <variable_name1> = <variable_name2>;
            - example:
                int my_float = my_other_float;
                // or
                my_num = my_other_num;

    - constants (const)
        - these are variables that are unmodifiable
            - i.e. the values cannot be changed
            - the variable effectively becomes read-only
            - similar to the final keyword in Java
        - uses the const keyword
        - syntax:
            const <data_type> <variable_name> = <value>;
        - example:
            const int MY_NUM = 10;
        - sidenote:
            - the variable must be declares with a value
            - if a const variable is declared without a value, an error occurs
            - example:
                const MY_NUM; -> Error
        - convention:
            - when naming constant variables, it is recommended to use SCREAMING_SNAKE_CASE
            - example:
                const MY_VARIABLE = "Hello World";
            
    - typedef
        - allows the created of aliases for existing types
        - makes complex decorations easier to read and maintain
            - improves clarity and readability
        - declared outside of main()
        - syntax:
            typedef <data_type> <alias_name>
        - example:
            typedef int Integer;
            // inside a function
            Inteher my_num = 10;
        - typedef with structs
            - makes declaring structs easier to write
                - removes the need to write the struct keyword when declaring an instance of a structure
            - example:
                // without typedef
                struct idkman {
                    int yes;
                };
                // inside a function
                struct idman my_struct;

                // with typedef
                typedef struct lumbago {
                    int no;                
                };
                // inside a function
                lumbago my_struct;
        - typedef with enums
            - makes declaring enums easier to write
                - improves clarity and maintenance
            - example:
                // without typedef
                enum idkman {
                    HELLO,
                    WORLD
                };
                // inside a function
                enum idkman yes = HELLO;

                // with typedef
                typedef enum lumbago {
                    HELLO,
                    WORLD
                };
                // inside a function
                lumbago no = WORLD;
*/

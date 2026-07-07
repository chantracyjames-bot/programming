/* data structures
    - structs
        - similar to arrays
            - the difference lies with the ability to store multiple data types in structs
        - can store more than one data types
            - e.g. int, float, char, etc.
        - each element of a struct is called a member
        
        - declaration and definition
            - usually declared outside of main()
            - uses the struct keyword
            - syntax:
                struct <struct_name> {
                    <data_type> <variable_name>;
                };
            - example:
                struct my_struct {
                    char idkman[8];
                };
            - it is not possible to declare values to variables inside a struct
                - it can only be done using a struct variable
                - doing so will result in an error
                - example:
                    struct lumbago {
                        char lumbago[] = "idkman"; -> Error
                    };
            - it is possible to declare a variable of a struct during declaration
                - syntax:
                    struct <struct_name> {
                        <data_type> <variable_name>;
                    } <struct_variable_name>;
                - example:
                    struct yes_and_no {
                        int maybe;
                    } probs;

        - access and modification
            - to access a struct, a struct variable must first be declared
                - syntax:
                    struct <struct_name> <struct_variable>;
                - example:
                    struct idkman hello;
                - if a struct variable has already been declared during the declaration of the struct
                    - it can be accessed using the struct variable name
                    - example:
                        struct lumbago {
                            char yes;
                        } hello_world;
                        // inside a function
                        helloworld;

            - to access a member of a struct, the dot . syntax is used
                - syntax:
                    <struct_variable>.<struct_member>;
                - example:
                    probs.maybe;
                - it is also possible to modify the values of struct members using this method
                    - syntax:
                        <struct_variable>.<struct_member> = <new_value>;
                    - example:
                        probs.maybe = 100;
                - sidenote
                    - since strings in C are just an array of char characters
                        - using the assignment = operator to modify a char array member will throw an error
                            - example:
                                struct idkman {
                                    char yes[11];
                                };
                                // inside a function
                                struct idkman maybe;
                                maybe.yes = "HelloWorld"; -> Error
                        - to bypass this, the strcpy() function is used
                            - example:
                                strcpy(maybe, "HelloWorld");
                    
            - there is a shortcutn to quickly assign values to struct members in a struct variable
                - uses the same syntax as implicitly declaring arrays
                    - through the curly braces { } syntax
                - syntax:
                    struct <struct_name> <struct_variable> = { <struct_member_values> };
                - example:
                    struct idkman maybe = { "HelloWorld" };
                - note that the order in which the struct member are declared is the order that the values must be declared as
                    - example:
                        typedef struct yes {
                            int no;
                            char maybe[8];
                            float probs;
                        };
                        // inside a function
                        yes my_struct = { 10, "idkman", 3.14 }; // int, then char[], then float

        - nested structures
            - structs are able to be declared inside other structs
            - declaration and definition
                - uses the same way as creating struct variabkles
                - syntax:
                    struct <struct_name1> {
                        <data_type> <variable_name> 
                    },
                    struct <struct_name2> {
                        struct <struct_name> <struct_variable>;
                    };
                - example:
                    struct idkman {
                        char yes[20];
                    }
                    struct lumbago {
                        struct idkman no;
                    } outer;

            - access and modification
                - nested structs also uses the same dot . syntax
                    - but another dot is added every level of nested structs
                - syntax:
                    <outer_struct_variable>.<inner_struct_member>.<inner_struct_member>;
                - example:
                    outer.no.yes; // uses the struct variable for the outher struct lumbago
                                  // uses the struct variable declared inside lumbago pointing to another struct idkman, called no
                                  // uses the struct members of idkman
                - the same principle can also be used to add or modify the values of the struct member
                    - syntax:
                        <outer_struct_variable>.<inner_struct_member>.<inner_struct_member> = <new_value>;
                    - example:
                        outer.no.yes = "Hello World";

    - unions
        - similar to structs but instead of having different memory addresses for each member
            - all union members share the exact same memory
            - i.e. changing the value for each member will change the value for all members
        - note that each union variables do not share the same memory
            - only union members that do share it

        - declaration and definition
            - similar to structs' way of declaring and definition
            - uses the union keyord
            - syntax:
                union <union_name> {
                    <variable_name> = <value>;
                };
            - example:
                union idkman {
                    int maybe;
                };
            - union variables can be declared duing the declaration of unions
                - syntax:
                    union <union_name> {
                        <variable_name> = <value>;
                    } <union_variable>;
                - example:
                    union lumbago {
                        double yes;
                    } yippie;

        - access and modification
            - similar to structs' way to initializing variables
                - syntax:
                    union <union_name> <union_variable>;
                - example:
                    union idkman probs;
            - accessing member variables can be done uing the dot . syntax
                - syntax:
                    <union_variable>.<union_member>;
                - example:
                    yippie.yes;
                - the same concept can also be uses to assign or modify values to member variables
                    - uses the assignment = operator
                    - syntax:
                        <union_variable>.<union_member> = <new_value>;
                    - example:
                        probs.maybe = 100;
            - note that changing the value of one union member changes the value of the other members
                - example:  
                    union my_union {
                        int man;
                        char po;
                    };
                    // inside main()
                    union my_union yes;
                    yes.man = 2000;
                    yes.po = 'q';       // yes.man becomes invalid
                                        // due to union members sharing the same memory
                                        // if one gets written, the others becomes invalid
                                        // or becomes unreliable
            - the size of a union depends on the largest member
                - in a union with member variables of char[20], int, double
                    - char[20] is the largest therefore the size of the union is 20 bytes

    - enums
        - short for enumerations
        - represents a group of constants (consts)
        - conventions:
            - since enums holds constant values, it is recommended to use SCREAMING_SNAKE_CASE

        - declaration and definition
            - enum values are separated by commas
                - except the last value
            - syntax:
                enum <enum_name> {
                    <enum_values>
                };
            - example:
                enum my_enum {
                    IDKMAN,
                    HELLO,
                    WORLD
                };

            - variables inside an enum can have descriptions (values)
                - done by using the assignment = operator next to the variable
                - syntax:
                    enum <enum_name> {
                        <variable> = <value>
                    }
                - example:
                    enum my_enum {
                        IDKMAN = 10,
                        HELLO = 20,
                        WORLD // 21
                    }
                - note that the value assigned must be an integer

        - access
            - enums are accessed using a variable
            - refer to typdef for a simpler enum declaration
            - syntax:
                enum <enum_name> <variable_name>;
            - example:
                enum my_enum idkman;
            - when declaring a value to the variable, it must be present inside the enum
                - example:
                    enum my_enum = IDKMAN;
            - by default, the values in an enum starts from 0 and ranges up
                - example:
                    enum my_enum {
                        IDKMAN,
                        HELLO,
                        WORLD
                    };
                    enum my_enum idkman = IDKMAN; // 0
            - enums with custom values
                - example:
                    enum my_enum {
                        IDKMAN = 10,
                        HELLO = 20
                        WORLD
                    };
                    enum my_enum idkman = WORLD; // 21
*/
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
                struct <structName> {
                    <dataType> <variableName>;
                };
            - example:
                struct myStruct {
                    char idkman[8];
                };
            - it is not possible to declare values to variables inside a struct
                - it can only be done using a struct variable
                - doing so will result in an error
                - example:
                    struct Lumbago {
                        char maybe[] = "idkman"; -> Error
                    };
            - it is possible to declare a variable of a struct during declaration
                - syntax:
                    struct <structName> {
                        <dataType> <variableName>;
                    } <structVariableName>;
                - example:
                    struct yesAndNo {
                        int maybe;
                    } probs;

        - access and modification
            - to access a struct, a struct variable must first be declared
                - syntax:
                    struct <structName> <structVariable>;
                - example:
                    struct idkman hello;
                - if a struct variable has already been declared during the declaration of the struct
                    - it can be accessed using the struct variable name
                    - example:
                        struct Lumbago {
                            char yes;
                        } helloWorld;
                        // inside a function
                        helloWorld;

            - to access a member of a struct, the dot . syntax is used
                - syntax:
                    <structVariable>.<structMember>;
                - example:
                    probs.maybe;
                - it is also possible to modify the values of struct members using this method
                    - syntax:
                        <structVariable>.<structMember> = <newValue>;
                    - example:
                        probs.maybe = 100;
                    
            - there is a shortcutn to quickly assign values to struct members in a struct variable
                - uses the same syntax as implicitly declaring arrays
                    - through the curly braces { } syntax
                - syntax:
                    struct <structName> <structVariable> = { <struct_member_values> };
                - example:
                    struct Idkman maybe = { "HelloWorld" };
                - note that the order in which the struct member are declared is the order that the values must be declared as
                    - example:
                        typedef struct Yes {
                            int no;
                            char maybe[8];
                            float probs;
                        };
                        // inside a function
                        Yes myStruct = { 10, "idkman", 3.14 }; // int, then char[], then float

        - nested structures
            - structs are able to be declared inside other structs
            - declaration and definition
                - uses the same way as creating struct variabkles
                - syntax:
                    struct <struct_name1> {
                        <dataType> <variableName> 
                    },
                    struct <struct_name2> {
                        struct <structName> <structVariable>;
                    };
                - example:
                    struct ddkman {
                        char yes[20];
                    }
                    struct Lumbago {
                        struct idkman no;
                    } outer;

            - access and modification
                - nested structs also uses the same dot . syntax
                    - but another dot is added every level of nested structs
                - syntax:
                    <outerStructVariable>.<outerStructMember>.<innerStructMember>;
                - example:
                    outer.no.yes; // uses the struct variable for the outher struct Lumbago
                                  // uses the struct variable declared inside Lumbago pointing to another struct Idkman, called no
                                  // uses the struct members of Idkman
                - the same principle can also be used to add or modify the values of the struct member
                    - syntax:
                        <outerStructVariable>.<outerStructMember>.<innerStructMember> = <newValue>;
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
                union <unionName> {
                    <variableName> = <value>;
                };
            - example:
                union idkman {
                    int maybe;
                };
            - union variables can be declared duing the declaration of unions
                - syntax:
                    union <unionName> {
                        <variableName> = <value>;
                    } <unionVariable>;
                - example:
                    union lumbago {
                        double yes;
                    } yippie;

        - access and modification
            - similar to structs' way to initializing variables
                - syntax:
                    union <unionName> <unionVariable>;
                - example:
                    union idkman probs;
            - accessing member variables can be done uing the dot . syntax
                - syntax:
                    <unionVariable>.<unionMember>;
                - example:
                    yippie.yes;
                - the same concept can also be uses to assign or modify values to member variables
                    - uses the assignment = operator
                    - syntax:
                        <unionVariable>.<unionMember> = <newValue>;
                    - example:
                        probs.maybe = 100;
            - note that changing the value of one union member changes the value of the other members
                - example:  
                    union MyUnion {
                        int man;
                        char po;
                    };
                    // inside main()
                    union MyUnion yes;
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
                enum <enumName> {
                    <enumValues>
                };
            - example:
                enum MyEnum {
                    IDKMAN,
                    HELLO,
                    WORLD
                };

            - variables inside an enum can have descriptions (values)
                - done by using the assignment = operator next to the variable
                - syntax:
                    enum <enumName> {
                        <variable> = <value>
                    }
                - example:
                    enum MyEnum {
                        IDKMAN = 10,
                        HELLO = 20,
                        WORLD // 21
                    }
                - note that the value assigned must be an integer

        - access
            - enums are accessed using a variable
            - refer to typdef for a simpler enum declaration
            - syntax:
                enum <enumName> <variableName>;
            - example:
                enum MyEnum idkman;
            - when declaring a value to the variable, it must be present inside the enum
                - example:
                    enum MyEnum = IDKMAN;
            - by default, the values in an enum starts from 0 and ranges up
                - example:
                    enum MyEnum {
                        IDKMAN,
                        HELLO,
                        WORLD
                    };
                    enum MyEnum idkman = IDKMAN; // 0
            - enums with custom values
                - example:
                    enum MyEnum {
                        IDKMAN = 10,
                        HELLO = 20
                        WORLD
                    };
                    enum MyEnum idkman = WORLD; // 21
*/
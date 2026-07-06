/* data types
    - Rust variables don't need to be explicitly requires to declare their data types
        - unlike other programming langauges like C++ or Java 
            - it does this automatically, similar to the auto or var keywords
        - example:
            let my_num = 5;         // integer
            let my_double = 5.99;   // float
            let my_letter = 'D';    // character
            let my_bool = true;     // boolean
            let my_text = "Hello";  // string
    - it is still possible to explicitly declare the data type for variables
        - numbers
            - i32
                - integers or whole numbers
                - can range from -2,147,483,648 to 2,147,483,647
                - syntax:
                    let <variable_name>: i32 = <value>;
                - exmaple:
                    let my_num: i32 = 2147483647;
            - f64
                - floating points or decimal numbers
                - can range from 1.797 693 134 862 315 7 x 10^309  to 1.797 693 134 862 315 7 x 10^308
                - syntax:
                    let <variable_name>: f64 = <value>
                - example:
                    let my_float: f64 = 3.141592;
        - characters
            - char
                - a single character
                - it must be surrounded by single quotation marks ' '
                - syntax:
                    let <variable_name>: char = <value>
                - example:
                    let my_char: char = 'M';
        - booleans
            - bool
                - a truth value
                - can only be either true or false
                - syntax:
                    let <variable_name>: bool = <value>;
                - exmaple:
                    let my_bool: bool = true;
        - strings
            - &str
                - a sequence of characters or text
                - it must be surrounded by double quotation marks " "
                - &str are only pointers to memory where:
                    - static strings are located in the Data Segment
                    - or where String type strings are located in the Heap
                    - or an array of bytes located in the Stack
                - syntax:
                    let <variable_name>: &str = <value>;
                - example:
                    let my_string: &str = "lumbago";
            - String
                - a sequence of characters or text
                - it must be surrounded by double quotation marks " "
                - unlike string slices (&str), String type strings are resizable
                    - this is due to it being a Vector array (Vector<u8>)
                - declaration and initialization
                    - String type strings are able to be created in two ways
                        - both of which converts a string literal into a String
                    - .to_string()
                        - syntax:
                            let <variable_name> = <string_literal>.to_string();
                        - example:
                            let lumbago = "idkman".to_string();
                    - String::from()
                        - syntax:
                            let <variable_name> = String::from(<string_literal>);
                        - example:
                            let idkman = String::from("lumbago");

                - access and modification
                    - if the declared String type string is mutable
                        - it is able to be modified
                        - .push_str()
                            - this method is used to add a string at the end of the string
                            - syntax:
                                <variable_name>.push_str(<string_literal>);
                            - example:
                                idkman.push_str(" yes");
                        - .push()
                            - this method is used to add one character at the end of the string
                            - syntax:
                                <variable_name>.push(<character>);
                            - exmaple:
                                lumbago.push('Y');
                    - string concatenation
                        - strings are able to be combined together using the format!() macro
                        - example:
                            let my_format = format!("{} is to {}", "idkman", "lumbago");
                        - is is possible to use the addition + operator to combine strings
                            - syntax:
                                // for variables
                                <string1> + &<string2> + &<string3>;
                            - example:
                                "Hello".to_string + " " + "World"; // Hello World
                            - note that the it is only possible to add a &str to a String
                                - therefore, the first string must be a String type string
                            - it is recommended to use the format!() macro instead of the addition + operator
                    - the length of a string is able to be queried using the .len() method
                        - syntax:
                            <string>.len();
                        - example:
                            "idkman".len();

        - Rust also has types for collections
            - like tuples and arrays (lists)
            - tuples
                - contains ordered and immutable collections of values
                    - allows duplicate entries and a fixed length
                - example:
                    (1, 3.14, "lumbago")
                - declaration and initialization
                    - tuples are denoted by the parenthesis ( ) symbol
                        - anything inside the parentheses are considered as a tuple
                    - syntax:
                        let <tuple_name>: (<data_types>) = (<values>);
                    - example:
                        let my_tuple: (u8, u8, u8) = (255, 255, 255)
                - access and modification
                    - tuples are accessed using indexes
                        - starting form 0 as the first element
                        - it is done using a dot . syntax
                        - syntax:
                            <tuple_name>.<index>;
                        - example:
                            idkman.0;
                    - tuple deconstruct
                        - it is possible to assign to other variables the values of a tuple
                        - syntax:
                            let (a, b, c) = my_tuple;
            - arrays
                - contains ordered and mutable collections of values
                    - allows duplicate entries and a fixed length
                - example:
                    [1, 3.14, "idkman"]
                - declaration and initialization
                    - lists are denoted by the brackets [ ] symbol
                        - anything inside the brackets are considered as a list
                    - note that the values that an array holds must be the same type
                    - syntax:
                        let <array_name> = [<values>];
                    - example:
                        let my_array = ['A', 'B', 'C']
                    - it is possible to initializa an array alongside declraring its type
                        - syntax:
                            let <array_name>: [<data_type>; <size>];
                            // or 
                            let <array_name>: [<data_type>; <size>] = [<valus>];
                        - example:
                            let lumbago: [&str; 3] = ["yes", "maybe", "no"];
                    - it is also possible to declare an array with multiple of the same valus
                        - syntax:
                            let <array_name> = [<value>; <size>];
                        - example:
                            let maybe = [12; 3]; // [12, 12, 12]
                - access and modification
                    - arrays are accessed using indexes
                        - starting from 0 as the first element
                        - it is done using square brackets [ ]
                        - syntax:
                            <array_name>[<index>];
                        - example:
                            my_array[10]
*/

fn main() {
    // Create an empty String
    
    let my_array = [100;3];

    for i in 0..=2 {
        print!("{}", my_array[i]);
    }
}
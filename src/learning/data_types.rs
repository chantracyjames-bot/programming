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
            - signed integers
                - i8
                    - integers or whole numbers
                    - can range from -128 to 127
                    - syntax:
                        let <variable_name>: i8 = <value>;
                    - example:
                        let my_num: i8 = -128_i8;
                - i16
                    - integers or whole numbers
                    - ranges from -32768 to 32767
                    - syntax:
                        let <variable_name>: i16 = <value>;
                    - example:
                        let my_num: i16 = 32767_i16;
                - i32
                    - integers or whole numbers
                    - can range from -2,147,483,648 to 2,147,483,647
                    - syntax:
                        let <variable_name>: i32 = <value>;
                    - exmaple:
                        let my_num: i32 = 2147483647_i32;
                - i64
                    - integers or whole numbers
                    - can range from -9223372036854775808 to 9223372036854775807⏎
                    - syntax:
                        let <variable_name>: i64 = <value>;
                    - example:
                        let my_num: i64 = 9223372036854775807_i64;
                - i128
                    - integers or whole numbers
                    - can range from -170141183460469231731687303715884105728 to 170141183460469231731687303715884105727
                    - syntax:
                        let <variable_name>: i128 = <value>;
                    - example:
                    let my_num: i128 = -170141183460469231731687303715884105728_i128;
            - unsigned integers
                - u8
                    - positive whole numbers
                    - can range from 0 to 255
                    - syntax:
                        let <variable_name>: u8 = <value>;
                    - example:
                        let my_num: u8 = 255_u8;
                - u16
                    - positive whole numbers
                    - can range from 0 to 65535
                    - syntax:
                        let <variable_name>: u16 = <value>;
                    - example:
                        let my_num: u16 = 65535_u16;
                - u32
                    - positive whole numbers
                    - can range from 0 to 4294967295
                    - syntax:
                        let <variable_name>: u32 = <value>;
                    - example:
                        let my_num: u32 = 4294967295_u32;
                - u64
                    - positive whole numbers
                    - can range from 0 to 18446744073709551615
                    - syntax:
                        let <variable_name>: u64 = <value>;
                    - example:
                        let my_num: u64 = 18446744073709551615_u64;
                - u128
                    - positive whole numbers
                    - ranges from 0 to 340282366920938463463374607431768211455
                    - syntax:
                        let my_num: u128 = <value>;
                    - example:
                        let my_num: u128 = 340282366920938463463374607431768211455_u128;
            - floating points
                - f32
                    - floating points or decimal numbers
                    - can range from -3.40282347 × 10^38 to 3.40282347 × 10^38
                    - syntax:
                        let <variable_name>: f32 = <value>;
                    - syntax:
                        let my_float: f32 = 2.72_f32;
                - f64
                    - floating points or decimal numbers
                    - the default floating point in Rust
                    - can range from 1.797 693 134 862 315 7 x 10^308  to 1.797 693 134 862 315 7 x 10^308
                    - syntax:
                        let <variable_name>: f64 = <value>
                    - example:
                        let my_float: f64 = 3.141592_f64;
        - pointers
            - isize
                - is a pointer-sized integer
                - ranges from the full width of a machine's CPU architecture
                    - in this case, 64-bit signed
            - usize
                - is a pointer-sized number
                - ranges from the full width of a machine's CPU architecture
                    - in this case, 64-bit unsigned
        - characters
            - char
                - a single character
                - is 32 bits wide (4 bytes?)
                - it must be surrounded by single quotation marks ' '
                - syntax:
                    let <variable_name>: char = <value>
                - example:
                    let my_char: char = 'M';
        - booleans
            - bool
                - a truth value
                - is 8 bits wide (1 byte?)
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
*/

fn main() {
    let my_num: i32 = i32::MAX * 1.2;

    println!("{my_num}");
}
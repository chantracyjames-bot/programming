/* functions
    - user-defined functions
        - paves the way for the creation of custom functions
            - mainly for reusing code instead of redeclaring it
        - user-defined functions are designed by the programmer
        - declared outside of the main() function

        - declaration and definition
            - functions are made to either have a return type or not
            - uses the fn keyword
            - no return type:
                - syntax:
                    fn <function_name>() {
                        <statements>
                    }
                - example:
                    fn my_function() {
                        print!("man");
                    }
            - with return type:
                - uses the -> symbol to signify the return valye
                - syntax:
                    fn <function_name>() -> <data_type> {
                        <statements>
                        <expression>
                    }
                - example:
                    fn my_function() -> i32 {
                        1
                    }
                - sidenote:
                    - when a return type is declared, the function must return a value
                        - a compilation error occurs when there is no return value
                        - the return value must be the same type as the return type declared
                    - the keyword return can be omitted
                        - it can be done just by removing the semicolon of the return statement
            
        - functions with parameters
            - functions that requires an input of data
            - syntax:
                fn <function_name>(<parameters>) {
                    <statements>
                }
            - example:
                fn my_function(num: i32) {
                    print!(num);
                }
            - the variable that is declared in the parameter is a temporary variable
                - it disappears after the function is finished
            - it is possible to declare multiple parameters
                - example:
                    fn sum(x: i2, y: f64) {
                        x + y
                    }

        - access and function calls
            - methods are accessed using the function name followed by parentheses ()
            - syntax:
                <function_name>();
            - example:
                my_function();

        - function calls with arguments
            - if a function needs certain parameters, that is called "argument"
            - calling methods with parameters requires the corresponding arguments
            - syntax:
                <function_name>(<arguments>);
            - example:
                my_function(19);
            - variables and values are able to be passed as arguments
            - when there are multiple arguments needed
                - the order of parameters matter
                    - if the order of arguments doesn't match the order of parameters, an error occues
                    - example:
                        sum(3.14, 2.72);
                        sum('A', 1.12);  -> Error
*/
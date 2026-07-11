/* variables
    - variables are containers for storing data (or values)
    - declaration and initialization
        - declaring variables in Rust requires the let keyword
        - syntax:
            let <variable_name> = <value>;
        - example:
            let my_num = 10;
        - by default, variables are immutable
            - i.e. they are unable to be modifies
            - using the mut keyword declares the variable as mutable
                - i.e. it is modifyable
            - syntax:
                let mut <variable_name> = <value>;
            - example:
                let mut idkman = 3.14;
        
    - access and modification
        - variables are able to be accessed using their name
            - syntax:
                <variable_name>;
            - example:
                my_num
        - since variables in Rust are immutable by default
            - variables are only modifyable if they are declared with the mut keyword
            - syntax:
                <variable_name> = <new_value>;
            - example:
                idkman = 2.92;

    - constants (const)
        - these are variables that are unmodifiable
            - i.e. the values cannot be changed
            - the variable effectively becomes read-only
            - similar to the final keyword in Java
        - uses the const keyword
        - syntax:
            const <variable_name>: <data_type> = <value>;
        - example:
            const MY_NUM: i32 = 10;
        - sidenote:
            - the variable must be declared with a type
                - if a const variable is declared without a type, an error occues
                - example:
                    const MY_VAR = "yes"; -> Error
            - the variable must be declared with a value
                - if a const variable is declared without a value, an error occurs
                - example:
                    const my_num: i32; -> Error
        - convention:
            - when naming constant variables, it is recommended to use SCREAMING_SNAKE_CASE
            - example:
                const MY_VARIABLE: &str = "Hello World";

    - constants (const)
        - these are variables that are unmodifiable
            - i.e. the values cannot be changed
            - the variable effectively becomes read-only
            - similar to the final keyword in Java
        - uses the const keyword
            - defined outside of main()
        - syntax:
            const <variable_name>: <data_type> = <value>;
        - example:
            const MY_NUM: i23 = 10;
        - sidenote:
            - the variable must be declared with a data type
                - if a const variable is declared without a data type, an error occurs
                - example:
                    const MY_NUM; -> Error
            - the variable must be declares with a value
                - if a const variable is declared without a value, an error occurs
                - example:
                    const MY_NUM: i32; -> Error
        - convention:
            - when naming constant variables, it is recommended to use SCREAMING_SNAKE_CASE
            - example:
                const MY_VARIABLE = "Hello World";
*/

const MY_VAR: i32;

fn main() {
    println!("{MY_VAR}");
}
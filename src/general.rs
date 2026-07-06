/* general
    - syntaxes
        - statements
            - a statement is a single line (or compound) that performs a single operation
                - i.e. calling a function, initializing a variable, declaring a loop, etc.
            - every statement must end with a semicolon ;
            - example:
                println!("yes"); // printing text
        - comments
            - comments in C++ is done by declaring a double frontslash //
            - comments are not compiled into code
            - syntax:
                // <comment>
            - example:
                // comment here
        - placeholders
            - placeholders are used to show variable values
                - when iside a string or text variable
            - similar to Python's placeholders
            - uses curly braces {} followed by the placeholder value
            - syntax:
                "{}", <value>;
            - example:
                println!("idkman {}", "lumbago"); // idkman lumbago
            - note that placeholders and their respective values must be in order
                - example:
                    print!("{} is {}", "yes", 10); // yes is 10

    - scope
        - by default, the compiler compiles code from the top to bottom, first line until the last line
        - calling a variable that is not defined until later in the code will throw an error
        - example:
            print!(x); -> Error
            let x: i32 = 10;    // defined later while called before declared
        - block scope
            - are statements inside a block of code
            - variables inside a block scope only exists inside that code block
            - trying to access a variable inside a block scope from the outside will throw an error
            - example:
                fn my_func() {
                    let x: i32 = 10;
                }
                print!(x);        -> Error
            - loop scope
                - like block scope, variables inside a loop (e.g. for loops) are only accessible inside of it
                    - trying to access it outside the code block will throw an error
                - example:
                    while(true) {
                        let i: i32 = 10;
                        break;
                    }
                    print!(i); -> Error
        - shadowing 
            - variables in the same scope are able to be overshadowed
                - this is done by redeclaring the variable
            - example:
                let x: i32 = 10;
                let x: i32 = 100; // overshadows the first x variable
            - variables are able to be overshadowed inside a deeper scope
                - note that the outside variable is unaffected
                - example:
                    let x: i32 = 2;
                    {
                        let x: i32 = 10;
                    }
                    print!("{}", x);     // 2
            - it is recommended to have different names for each variable instead of overshadowing them
                - this makes the code easier to read
*/


fn main() {
// main() acts as the entry point of the program
// anything inside its curly braces {} runs code
    print!("Hello World\n")
    // print! or println! is a macro
    // it prints text to the terminal
    // every line of code must end in semicolons ;
    // the program throws an error if not present
}
// basic Rust program

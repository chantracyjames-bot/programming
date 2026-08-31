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
            
    - naming conventions
        - there are industry standard when naming certain elements in C
        - variables
            - usually in snake_case
            - example:
                let my_string;
                let my_num[];
        - functions and methods
            - usually in snake_case
            - example:
                my_function();
                sum_all();
        - filenames and folders
            - usually in snake_case
            - example:
                my_program.rs
                idkman.rs
        - macros
            - usually in snake_case with an exclamation marks as a suffix
            - example:
                println!
                vec!
        - constants and static variables
            - usually in SCREAMING_SNAKE_CASE
            - example:
                CONSTANT_VARIABLE
                STATIC_VARIABLE
        - enum variants
            - usually in UpperCamelCase
            - example:
                Results::Ok
        - types, traits and enums
            - usually in UpperCamelCase
            - example:
                enum MyEnum {...}
                String

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

        - block labeling
            - blocks of lines are able to be labeled
                - used in loops to have precise control of looping
            - uses a single quote '
            - syntax:
                '<label>: {
                    <statements>
                }
            - example:
                'block: {
                    if 10 > 12 {
                        print!("yes");
                    } else {
                        print!("no");
                    }
                }
            - it is generally used to label loops
                - example:
                    'idkman: loop {
                        loop {
                            break 'idkman; // breaks the outer loop
                        }
                    }

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

        - lifetime
            - Rust prevents dangling pointers by introducing lifetimes
                - a reference must not outlive the data it is pointing to
            - is the time it takes for a variable to be dropped
                - commonly when the variable hits the closing brace }
                - ending its lifetime
            - a reference is able to be tagged (or named)
                - multiple references are able to be tagged with the same name
                - with this, if one of the reference with the same name gets freed (or dropped)
                    - then the references become invalid
                - syntax:
                    '<tag>
                - example:
                    'a
                - sample code:
                    fn lifetimes<'a>(x: &'a str, y: &'a str) -> &'a str -{
                        a
                    }
                    // the output of lifetimes() is tied to the lifetime tag 'a
                    // if one of the references with the same tag goes out of scope
                    // then the anything with the tag 'a get's invalidated
                - sidenote:
                    - 'static is a reserved name
                        - used for strings that lasts until the end of the program
                    - '_ is an anonymous placeholder
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

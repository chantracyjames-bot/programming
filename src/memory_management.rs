/* memory management
    - Rust ownership
        - Rust uses ownership to manage memory in a safe way
            - each value has a owner, usually a variable
        - ownership rules:
            - each value has one owner
            - when the owner goes out of scope
                - the value gets deleted (or freed)
            - only one owner is allowed at a time
                - unless borrowed
        - why ownership?
            - it is used by Rust to automatically free memory
                - only when it is no longer needed
            - prevent bugs like using memory that has already been freed
                - unlike in C++'s use-after-free
            - it is the main reason why Rust is safe and fast
        - example:
            let a = String::from("idkman");
            let b = a;                      // a no longer has ownership
                                            // accessing a will result in an error

            println!("{}", a)               -> Error
        - note that primitive types like int, char, bool, etc. are copied
            - they don't transfer ownership, they are only copied over
            - example:
                let a: i64 = 100;
                let b: i64 = a;

                println!("{}", a); // 100
                                   // valid since b only copied its value
                                   // it did not transfer ownership over
            - to be able to copy String variables
                - the .clone() method is used
                - example:
                    let a = String::from("idk");
                    let b = a.clone();

                    println!("{}", a);           // idk

    - Rust borrowing
        - lets variables use values of other variables
            - without transferring owmership
        - when a variable has a reference to another variable
            - this is called "borrowing"
        - references
            - references lets other variables see the values of other variables
                - it is done using the reference& & symbol
            - syntax:
                &<variable>
            - example:
                let a = &b; // a can borrowed from b
*/

fn main() {
    let mut a = String::from("Hello");
    let b = &mut a;
    b.push_str(" lumbago");
    println!("{}", a);
}
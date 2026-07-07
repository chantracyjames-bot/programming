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

        - slice type
            - a subtype of Rust's ownership
                - is a type of reference, therefore it does not have ownership
            - a read-only view on a contiguous sequence of elements in a collection
            - &str is a type of slice type
                - its a string slice
            - any data type inside a collection can be a slice type
                - take for instance an array of i32 values
                - it would be a slice type of &[i32]

    - Rust borrowing
            - without transferring owmership
        - when a variable has a reference to another variable
            - this is called "borrowing"
        - why borrowing?
            - lets variables use the values of other variables
                - without tranferring ownership
            - avoids cloning
                - which is slow from large amounts of data
            - makes the program safer and faster
        - references
            - references lets other variables see the values of other variables
                - it is done using the reference& & symbol
            - syntax:
                &<variable>
            - example:
                let a = &b; // a borrowed from b
        - mutable reference
            - it is possible to modify the value through a reference
                - note that the original variable must be mutable
            - uses the &mut syntax
            - syntax:
                let <reference_name> = &mut <variable_name>;
            - example:
                let b = &mut a;
            - note that only one mutable reference can exist to a single variable at a time
                - it is also not possible to borrow from a variable with a present immutable reference
                - example:
                    let yes: i32 = 100;
                    let no = &yes;           // immatable reference
                    let maybe = &mut yes;    -> Error
                                             // cannot borrow from variable with present immutable reference
                    let lumbago: f64 = 3.14;
                    let idk = &mut lumbago;  // mutable reference
                    let man = &mut lumbago;  -> Error
                                             // cannot boorow from variable with another present mutable reference
*/

fn main() {
    let mut a = String::from("Hello");
    let b = &mut a;
    b.push_str(" lumbago");
    println!("{}", a);
}
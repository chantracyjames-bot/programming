/* data structures
    - collections
        - are used to store multiple values in a single variable
            - instead of declaring multiple variables to store value, collections makes the process easier
        - Rust has two types of immutable collections
            - tuples
                - contains ordered and immutable collections of values
                    - allows duplicate entries and a fixed length
                - example:
                    (1, 3.14, "lumbago")

                - declaration and initialization
                    - tuples are denoted by the parenthesis ( ) symbol
                        - anything inside the parentheses are considered as a tuple
                    - tuples are able to hold more than one data type unlike arrays and vectors
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
                        - also called unpacking
                        - it is possible to assign to other variables the values of a tuple
                        - syntax:
                            let (a, b, c) = my_tuple;

                - tuples are able to be used as a return value in functions
                    - example:
                        fn my_function() -> (String, i32) {
                            (String::from("idkman"), 1089)
                        }

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
                    - it is possible to modify arrays using the same concepts
                        - it is done through its index and via the assigment = operator
                        - the array must also be mutable
                        - syntax:
                            <array_name>[<index>] = <new_value>
                        - example:
                            my_array[1] = 100;
                        - note that the same restrictions with arrays stands
                            - the new value must be the same type as the array
                    - the length of an array is able to be queried using the .len() method
                        - syntax:
                            <array_name>.len();
                        - example:
                            idkman.len();
                    - unlike tuples, arrays are able to be used as an iterable in for loops
                        - syntax:
                            for <loop_variable> in <array_name> {...}
                        - example:
                            for i in my_array {
                                print!({:?}, my_array);
                            }

        - Vectors
            - also known as dynamic arrays
            - unlike normal arrays, vectors are able to be resized
                - it can shrink and grow

            - declaration and inittialization
                - to create a vector, the vec! macro is used followed by square brackets []
                - syntax:
                    let <vector_name> = vec![<values>];
                - example
                    let my_vector = vec!["yes", "no", "maybe"];

            - access and modification
                - similar to arrays, vectors are accessed using indexes inside square brackets []
                    - syntax:
                        <vector_name>[<index>];
                    - example:
                        lumbago[1];
                - using the same concept, it is possible to modify vectors
                    - it is done via the assignment = operator
                    - syntax:
                        <vector_name>[<index>] = <new_value>;
                    - exampl:
                        my_vector[2] = "probs";
                - adding values to the vector is done using the .push() method
                    - similar to .append() in Python
                    - syntax:
                        <vector_name>.push(<value>);
                    - example:
                        my_vector.push("idkman");
                    - adding items to a specific index is done using the .insert() method
                        - note tha vectors are designed to add and remove items at the end of it
                            - due to this, this may be slower than appending values
                        - syntax:
                            <vector_name>.insert(<index>, <value>);
                - to remove values from a vector, the .pop() method is used
                    - it removes the last element in a vector
                    - syntax:
                        <vector_name>.pop();
                    - example:
                        my_vector.pop();
                    - removing items from a certain index is also possible
                        - due note that the it is slower than .pop()
                        - syntax:
                            <vector_name>.remove(<index>);
                        - example:
                            my_vector.remove(1);
                - to query the size of a vector, the .len() method is used
                    - syntax:
                        <vector_name>.len();
                    - example:
                        my_vector.len()
                - vectors able to be used as an iterable in for loops
                    - syntax:
                        for <loop_variable> in <vector_name> {...}
                    - example:
                        for i in &my_vector {
                            print!({:?}, my_vector);
                        }
                    - note that the loop must borrow the vector unlike normal arrays
                        - doing it without borrowing will move ownership of the vector to the for loop
                        - making the original variable unavailable to be used since it no longer owns the vector

        - HashMaps   
            - is a collection of key and value pairs
            - similar to Python's dictionaries
                - hashmaps are able to store values and find them using a key
            - hashmaps are able to be used by importing them from the standard library
                - syntax:
                    use std::collections::HashMap
        
            - declaration and initialization
                - HashMaps are able to be declared using the HashMap syntax:
                - syntax:
                    let <hashmap_name> = HashMap::new();
                - example:
                    let my_hashmap = HashMap::new(); // creates an empty hashmap, note that it is immutable
                - hashmaps can also be declared with a pre-allocated capacity
                    - syntax:
                        let mut <hashmap_name>: HashMap<(data_type), (data_type)> = HashMap::with_capacity(<integer>);
                    - example:
                        let mut my_hashmap: HashMap(<String>, <i32>) = HashMap::with_capacity(10); // hashmap with 10 capacity

            - access and modification
                - hashmaps have different ways to access values
                    - it usees keys as an "index"
                    - array-style index
                        - uses square brackets [ ] to use keys as index
                        - note that the program will panic if the key is not fount\d
                        - syntax:
                            <hashmap_name>[<key>];
                        - example:
                            my_hashmap["lumbago"];
                    - .get()
                        - if the key is found, it retruns a Optiom<V> object
                        - but if the key is not present, it returns None
                        - syntax:
                            <hashmap_name>.get(<key>);
                        - example:
                            my_hashmap.get("Hello");
                        - it is commonly paired up with the if let expression to mitigate damages if None is returned
                            - syntax:
                                if let Some(<reference_name>) = <hashmap_name>.get(<key>) {...}
                            - example:
                                if let Some(temp) = my_hashmap.get("lumbago") {
                                    println!("{:?}", temp);
                                }
                            - note that there is no else block
                                - if the value is not found, the entire if expression is skipped
                    - .get_mut()
                        - the same thing as the .get() method
                            - only that using it in a if let expression will return a mutable reference
                            - unlike .get() returning an immutable reference
                        - syntax:
                            <hashmap_name>.get_mut(<key>);
                        - example:
                            my_hashmap.get_mut("Hello");
                        - using it in a if let expression
                            - example:
                                if let Some(temp) = my_hashmap.get_mut("lumbago") {
                                    *temp = String::from("idkman");
                                }
                    - .contains_key()
                        - a fast way to accessing if the key is present
                        - only returns a boolean
                        - syntax:
                            <hashmap_name>.contains_key(<key>);
                        - example:
                            my_hashmap.contains_key("idkman");

                - hashmaps have different ways to insert or update values
                    - .insert()
                        - if the value does not exist, it creates a new entry
                        - but if the value does exist, it overwrites it a return the old value
                            - returns a Some(<value>) object
                        - syntax:
                            <hashmap_name>.insert(<key>, <value>);
                        - example:
                            my_hashmap.insert("yes", "lumbago");
                    - .entry().or_insert()
                        - if the value inside the .entry() is not found
                            - the .or_insert is executed and creates a new entry with the value inside it
                        - regardless if the value if found or not
                            - .entry() always returns a mutable reference to the keys's value inside the HashMap
                        - syntax:
                            <hashmap_name>.entry(<key>).or_insert(<value>);
                        - example:
                            my_hashmap.entry("lumbago").or_insert("idkman"); // if not "lumbago is not found"
                                                                             // creates a new entry with the or_insert() as the value
                                                                             // regardless, returns a mutable reference to the key
                    - .entry().and_modify().or_insert()
                        - the same as .entry().or_insert()
                            - but modifies the value if present
                        - syntax:
                            <hash_map>.entry(<key>).and_modify(<new_value>).or_insert(<value>);
                        - example:
                            let ref: &str = my_hashmap
                - hashmap elements can also be removed
                    - it lies on the principle that pairs of keys and value must exist
                        - if one is not present, then so is the other
                    - .remove()
                        - purges the key entry from the hashmap
                            - but returns the value that the key holds
                            - returns a Some(<value>) object
                        - requires a reference to a key of a hashmap
                            - purging it if found
                        - syntax:
                            <hashmap_name>.remove(&<key>);
                        - example:
                            my_hashmap.remove("Hello");
                        - it is commonly used with the if let expression to use the returned variable
                            - example:
                                if let Some(temp) = my_hashmap.remove("Hello") {
                                    println!("{} has been slain", temp);
                                }
                    - .remove_entry()
                        - similar to the .remove() method
                            - but it returns both the key and value as a tuple
                        - syntax:
                            <hashmap_name>.remove_entry(&<key>);
                        - example:
                            my_hashmap.remove_entry("Hello");
                        - using it in a if let expression
                            - example:
                                if let Some((key, value)) = my_hashmap.remove_entry("Hello") {
                                    println!("{} and {} has been slain", key, value);
                                }
                    - .retain()
                        - a filter loop that houses a closure argument and a condition
                        - if the condition is false, it purges the key and value pair from the heap
                        - syntax:
                            <hashmap_name>.retain(|<key>, <value>|, <condition>);
                        - example:
                            my_hashmap.retain(|_key, value|, *value != "World");
                        - note that Rust returns a &key and &mut value
                    - .clear()
                        - clears every single key and value pair from the HashMap
                        - very effiecient since it retains the memory allocated for the capacity of the hashmap
                            - meaning it doesn't need to request memory from the system
                            - only when it reaches the max capacity
                        
*/

use std::collections::HashMap;

fn main() {
    let mut yes = HashMap::new();

    yes.insert("lumbago", "idkman");
    yes.insert("Hello", "Workd");

    let test: &mut &str = yes.entry("maybe").or_insert("probs");
    let binding = String::from("worp");
    *test = &binding;
    
    yes.clear();
    println!("{}", yes["maybe"]);
}
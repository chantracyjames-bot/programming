/* arrays
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

    - Rust also has dynamic arrays
        - called vectors
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
            
*/


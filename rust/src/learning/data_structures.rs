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

    - Rust Structs
        - short for structure
        - is a custom data strutcure that enables grouping of related values together
            - somewhat of a "mini database"
        - why structs?
            - the group related data in a clean way
            - they make the code easier to read and maintain
        
        - declaration and definition
            - structs are able to be declared using the struct keyword
            - structs are used to store multiple variables
            - classic or C-style structs
                - this type of struct is commonly used to have descriptive names for each fields
                - syntax:
                    struct <struct_name> {
                        <variable_name>: <data_type>,
                    }
                - example:
                    struct MyStruct {
                        my_num: i32;
                        my_str: String,
                        my_char: char,
                    }
                - similar to C-style structs, it is not possible to declare default variables for struct fields
                    - the fileds only get their values when a struct object is created
                    - to initialize default values to fields
                        - the Default Trait is used
                        - syntax:
                            #[derive(Default)]
                            struct <struct_name> {...}
                        - example:
                            #[derive(Default)]
                            struct MyStruct {...}
            - tuple structs
                - this type of struct is used when field naming is not needed
                - syntax:
                    struct <struct_name>(<data_types>);
                - example:
                    struct MyStruct(String, i32, f64);
            - unit-like structs
                - this type of struct has zero fields
                    - it takes up no memory
                - used as a placeholder
                    - for types that need to implement behaviors
                    - or to act as a marker
                - syntax:
                    struct <struct_name>;
                - example:
                    struct MyStruct;

        - access and modification
            - there multiple ways to access structs depending on the type declared                
                - structs are accessed by creating an object of it
                - sidenote:
                    - Rust does not allow uninitialized variables
                        - the compiler will throw an error if the struct object's field are not initialized
                    - every single field must be initialized
                - classic or C-style structs
                    - syntax:
                        let <struct_variable> = <struct_name> {...};
                    - example:
                        let my_struct = MyStruct {
                            my_num: 100,
                            my_str: String::from("idkman"),
                            my_char: 'B',
                        };
                - tuple structs
                    - syntax:
                        let <struct_variable> = <struct_name>(<values>);
                    - example:
                        let my_struct = MyStruct("idkman".to_string, 100, 3.14);
                - unit-like structs
                    - syntax:
                        let <struct_variable> = <struct_name>;
                    - example:
                        let my_struct = MyStruct;

            - to access the variables inside the structs, or "fields" in Rust
                - C-style structs
                    - the dot . operator is used
                    - syntax:
                        <struct_variable>.<field>;
                    - example:
                        my_struct.my_name;
                    - changing the value of a field
                        - uses the same concept of accessing structs but with the assigment = operator
                            - note that the struct variable must be mutable
                        - syntax:
                            <struct_object>.<field> = <new_value>;
                        - example:
                            my_struct.my_char = 'Y';
                - tuple structs
                    - like normal tuples, the dot . index is used
                    - syntax:
                        <struct_variable>.<index>;
                    - example:
                        my_struct.0;
                    - changing the value of a field
                        - uses the same concept of accessing structs but with the assigment = operator
                            - note that the struct variable must be mutable
                        - syntax:
                            <struct_object>.<index> = <new_value>;
                        - example:
                            my_struct.0 = String::from("lumbago");
                - unit-like structs
                    - there are no fields inside a unit-like struct
                    - it is mostly used for Traits
            
            - note that structs can only be in one state of access at a time
                - only immutable or mutable
                - that extends to its fields
                    - meaning all fields are the same with either being immutable or mutable, but never both
            - some fields of a struct can be "owned" by a variable
                - only if they live on the heap like Strings or Vectors
                - sidenote:
                    - if one of the fields of a struct is owned by a variable
                        - trying to print the entire struct leads to an error
                - unlike primitive data types that are copied, not moved

            - structs are able to be printed with some prerequisites
                - println!() or print!()
                    - the format specifier of {:?} or {:#?} must be used
                    - along with the #[debug(Debug)] trait
                        - which is declared before the struct declaration
                    - syntax:
                        println!("{:?}", <struct_object>);
                        // or 
                        println!("{:#?}", <struct_object>);
                - dbg!()
                    - can print a struct without any of the debug formats
                        - since it is a debug printer
                    - can either take a reference to the object or move ownership to it
                        - note that ownership rules applies, the original variable is lost
                    - syntax:
                        dbg!(<struct_object>);
                        // or
                        dbg!(&<struct+_object>);
                    - the values are able to be passed over to another variable
                        - example:
                            let a = MyStruct{100, "maybe".to_string(), 'Y'};
                            let b = dbg!(a); // prints a and moves it to b

    - Rust struct impl
        - an extension to Rust's structs which provides the behavior of the struct object
        - structs and impl is Rust's implementation of classes
            - structs provide the storage for the data
            - impl provide how the data is manipulated
        
        - declaration and definition
            - uses the impl keyword with the struct name
            - syntax:
                impl <struct_name> {...}
            - example:
                impl MyStruct {...}
            - there are two types of operation in impl
            - associated functions
                - these are comparable to static methods in C++ or Java
                - like functions, they are able to return any data type
                - syntax:
                    impl <struct_name> {
                        fn <method_name>(<parameters>) -> <return_type> {...}
                    }
                - example:
                    impl my_method() -> String {
                        String::from("lumbago");
                    }
                - associated functions are able to be used as "contructors"
                    - it is comparable to constructors in C++ or Java
                    - it is used to initialize fields in structs
                    - returns a Self object
                        - which is the actual struct type that is the impl is based on
                        - or the "storage" for the initialized data
                    - syntax:
                        impl <struct_name> {
                            fn <function_name>(<parameters>) -> Self {...}
                        }
                    - example:
                        impl MyStruct {
                            fn new(my_num: i32, my_str: &str, my_char: char) -> Self {
                                my_num: my_num,
                                my_string: name.to_string(),
                                my_char: my_char,
                            }
                        }
            - methods
                - similar to methods in other langauges like C++, Java and Python
                - it is used to alter the behavior of the struct object
                - it must always have a reference to self as the first parameter
                    - similar to Python's self parameter
                    - pointing to the actual instance of the object
                - immutable methods
                    - are not allowed to modify internal data
                    - syntax:
                        impl <struct_name> {
                            fn <method_name>(&self, <parameters>) {...}
                        }
                    - example:
                        impl MyStruct {
                            fn my_method(&self) {
                                println!("{}", self.my_string);
                            }
                        }
                - mutable methods
                    - are allowed to change fields of a struct object
                    - syntax:
                        impl <struct_name> {
                            fn <methdo_name>(&mut self, <parameters>) {...}
                        }
                    - example:
                        impl MyStruct {
                            fn idkman(&mut self) {
                                self.my_string = "lumbago".to_string();
                            }
                        }
            - consuming methods
                - unlike regular methods
                    - this type of methods "consumes" the object instance
                        - i.e takes ownership over the struct variable
                        - redering it useless after it is called
                - uses the self parameter without any references
                    - this is how it hands over ownership
                - syntax:
                    impl <struct_name> {
                        fn <method_name>(self, <parameters>) {...}
                    }
                - example:
                    impl MyStruct {
                        fn consumer(self) {
                            println!("bye bye object");
                        }
                    }

        - access and method calls
            - associated functions
                - it is called using the struct name with a double colon::
                - syntax:
                    <struct_object>::<function>(<arguments>);
                - example:
                    MyStruct::new(120, String::from("idkman"), 3.1415)
            - methods
                - regardless if the mutability, there are two ways to call a method
                - standard syntax:
                    - syntax:
                        <object_name>.<method>(<arguments>);
                    - example:
                        my_struct.my_method();
                - verbose syntax:
                    - syntax:
                        <struct_object>::<method>(&<mut> <object_name>, <arguments>);
                    - example:
                        MyStruct::my_method(&my_struct);
                        // or
                        MyStruct::idkman(&mut my_struct);
                - for general purposes, the standard syntax is better
                    - the compiler automatically handles the references and borrowing
            - consuming methods
                - similar to method calls with regular methods
                - standard syntax:
                    - syntax:
                        <object_name>.<method>(<arguments>);
                    - example:
                        my_struct.consumer();
                - verbose syntax:
                    - syntax:
                        <struct_object>::<method>(<object_name>, <arguments>);
                    - example:
                        MyStruct::consumer(my_struct);   

    - Rust traits
        - Rust's solution to OOP inheritance
        - similar to inheritance in OOP-centered languages
            - implementing traits inherits the methods inside said traits

        - declaration and definition
            - traits are declared using the trait keyword
            - syntax:
                trait <trait_name> {...}
            - example:
                trait MyTrait {...}
            - similar to abstract classes in Java or virtual functions in C++
                - traits can have functions with no bodies
                - sidenote:
                    - even though traits are very similar to abstract classes
                        - they are unable to hold any fields
                        - they can only hold methods
                - syntax:
                    trait <trait_name> {
                        fn <method_name>(&self, <parameters>);
                    }
                - example:
                    trait MyTrait {
                        fn my_method(&self) {}; // no body
                    }
            - methods can also have a default body
                - they are inherited automatically
                    - they are not required to be defined in an implementation
                    - except when they call an undefined method
                - syntax:
                    trait <trait_name> {
                        fn <method_name>(&self, <parameters>) {...}
                    }
                - example:
                    trait MyTrait {
                        fn my_method(&self) {
                            println!("Hello World");
                        }
                    }
                - if the method calls the undefined method
                    - then the method does not get inherited unless the undefined method is defined
                    - example:
                        trait MyTrait {
                            fn my_method(&self);  // undefined

                            fn call_stuff(&self);
                                self.my_method(); // won't get inherited until my_method does
                        }
            - associated functions are able to be declared inside of traits
                - note that implementing them requires a different syntax
                - syntax:
                    trait <trait_name> [
                        fn <method_name>(<parameters>) -> <return_type> {...}
                    ]
                - examle:
                    trait MyTrait {
                        fn create() -> Self {...}
                    }

        - access and implementation
            - traits are used to add methods to struct implementations
                - implementing traits are similar to inheritance in other programming languages
                - uses the "for" keyword
                - syntax:
                    impl <trait_name> for <struct_name> {...}
                - example:
                    impl MyTrait for MyStruct
            - after being implementing the trait, all methods from it are "inherited" with a few caveats
                - all methods without a body that were implemented from a trait are required to be defined
                    - if not, the compiler will throw an error
                    - example:
                        impl MyTrait for MyStruct {
                            fn my_method(&self) {
                                println!("idkman");
                            }
                        }
                - similarly, methods that depend on an undefined method are not inherited
                    - not until the undefined method gets defined
            - trait implementation example
                - sample code:
                    trait Yes {
                        fn idkman(&self);

                        fn lumbago(&self) {
                            println!("bruh");
                            self.idkman();
                        }

                        fn yippee() -> ();
                    }

                    struct No {
                        vorp: String,
                        korg: i32,
                    }

                    impl No {
                        fn maybe(vorp: &str, korg: i32) -> Self {
                            Self {
                                vorp: String::from(vorp),
                                korg: korg,
                            }
                        }
                    }

                    impl Yes for No {
                        fn idkman(&self) {
                            println!("{}", self.vorp);
                        }

                        fn yippee() -> () {
                            println!("wew");
                        }
                    }

                    fn main() {
                        No::yippee();
                        let probs: No = No::maybe("probably", 100);
                        probs.idkman();
                        probs.lumbago();
                        println!("{}", probs.korg);
                    }

    - Rust Enums
        - short for enumeration
        - used to define a type that can be in the form of a few different values
        - each value of an enum is called an "variant"
        - why enums?
            - groups related values into one type
            - leads to cleaner and readable code
            - handles different cases in match expressions

        - declaration and definition
            - enums are declared using the keyword
            - syntax:
                enum <enum_name> {...}
            - example:
                enum MyEnum {...}
            - enums must also have a set of variants (values) declared
                - separated by commas
                - syntax:
                    enum <enum_name> {
                        <variant>
                    }
                - example:
                    enum MyEnum {
                        Idkman,
                        Lumbago,
                    }
            - enums variants are able to hold a value
                - syntax:
                    enum <enum_name> {
                        <variant>(<data_type>)
                    }
                - example:
                    enum MyEnum {
                        Idkman(String),
                        Lumbago(String),
                    }

        - access and enumeration
            - enum variants are access using double colons ::
                - enum variants are usually declared as a value of a variable
                - syntax:
                    let <variable_name> = <enum_nam>::<variant>;
                - example:
                    let maybe = MyEnum::Idkman;
            - enums are commonly used in match expressinos
                - example:
                    match maybe {
                        MyEnum::Idkman => println!("yes"),
                        MyEnum::Lumbago => println!("no"),
                    }
            - enums that holds can values are able to be assigned values
                - syntax:
                    let <variable> = <enum_name>::<variant>(<value>);
                - example:
                    let my_var = MyEnum::Lumbago(String::from("probs"));
                - this concept is also used in match expressions
                    - example:
                        match my_var {
                            MyEnum::Idkman(text) => println!("{}", text),
                            MyEnum::Lumbago(text) => println!("{}", text),
                        }

    - Rust enum impl
        - an extension to Rust's enums
        - similar to struct impl

        - declaration and definition
            - uses the impl keyword with the enum name
            - syntax:
                impl <enum_name> {...}
            - example:
                impl MyEnum {...}
            - like struct impl, there are two types of operations
            - associated functions
                - these functions does not reference self
                - syntax:
                    impl <enum_name> {
                        fn <method_name>(<parameters>) {...}
                    }
                - example:
                    impl MyEnum {
                        fn my_method() -> u64 {
                            1000000000000000
                        }
                    }
                
                - similar to structs, associated functions are able oto be used as "constructors"
                    - these type of associated functions must return a Self object
                        - referring to the enum object
                    - syntax:
                        impl <enum_name> {
                            fn <method_name>(<parameters>) -> Self {...}
                        }
                    - example:
                        impl MyEnum {
                            fn my_method() -> Self {
                                Self::Idkman("lumbago")
                            }
                        }

            - methods
                - similar to struct methods
                    - used to alter the behavior of the enum object
                - these must have a reference to the self object
                    - it must be the first parameter
                - immutable methods
                    - are not allowed to modify internal data
                    - syntax:
                        impl <enum_name> {
                            fn <method_name>(&self, <parameters>) {...}
                        }
                    - example:
                        impl MyEnum {
                            fn my_method(&self) {
                                match self {
                                    MyEnum::Idkman => println!("lumbago"),
                                    MyEnum::Lumbago => println!("idkman"),
                                }
                            }
                        }
                - mutable methods
                    - are allowed to change fields of a enum object
                    - syntax:
                        impl <enum_name> {
                            fn <methdo_name>(&mut self, <parameters>) {...}
                        }
                    - example:
                        impl MyEnum {
                            fn idkman(&mut self) {
                                match self {
                                    MyEnum::Idkman(yes) => *yes += "yes",
                                    MyEnum::Lumbago(no) => *no += "no",
                                }
                            }
                        }                                            
                - consuming methods
                    - unlike regular methods
                        - this type of methods "consumes" the object instance
                            - i.e takes ownership over the enum variable
                            - redering it useless after it is called
                    - uses the self parameter without any references
                        - this is how it hands over ownership
                    - syntax:
                        impl <enum_name> {
                            fn <method_name>(self, <parameters>) {...}
                        }
                    - example:
                        impl MyEnum {
                            fn consumer(self) {
                                println!("bye bye object");
                            }
                        }

        - access and method calls
            - associated functions
                - it is called using the enum name with a double colon::
                - syntax:
                    <enum_name>::<function>(<arguments>);
                - example:
                    MyEnum::my_method();
            - methods
                - regardless if the mutability, there are two ways to call a method
                - standard syntax:
                    - syntax:
                        <object_name>.<method>(<arguments>);
                    - example:
                        my_enum.my_method();
                - verbose syntax:
                    - syntax:
                        <enum_name>::<method>(&<mut> <object_name>, <arguments>);
                    - example:
                        MyEnum::my_method(&my_enum);
                        // or
                        MyEnum::idkman(&mut my_enum);
                - for general purposes, the standard syntax is better
                    - the compiler automatically handles the references and borrowing
            - consuming methods
                - similar to method calls with regular methods
                - standard syntax:
                    - syntax:
                        <object_name>.<method>(<arguments>);
                    - example:
                        my_enum.consumer();
                - verbose syntax:
                    - syntax:
                        <enum_name>::<method>(<object_name>, <arguments>);
                    - example:
                        MyEnum::consumer(my_enum);  
                        
*/



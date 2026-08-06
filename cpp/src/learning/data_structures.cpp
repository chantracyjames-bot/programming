/* data structures
    - Built-in Types
        - structs
            - similar to arrays
                - the difference lies with the ability to store multiple data types in structs
            - can store more than one data types
                - e.g. int, float, char, etc.
            - each element of a struct is called a member
            
            - declaration and definition
                - usually declared outside of main()
                - uses the struct keyword
                - syntax:
                    struct <structName> {
                        <dataType> <variableName>;
                    };
                - example:
                    struct myStruct {
                        char idkman[8];
                    };
                - it is not possible to declare values to variables inside a struct
                    - it can only be done using a struct variable
                    - doing so will result in an error
                    - example:
                        struct Lumbago {
                            char maybe[] = "idkman"; -> Error
                        };
                - it is possible to declare a variable of a struct during declaration
                    - syntax:
                        struct <structName> {
                            <dataType> <variableName>;
                        } <structVariableName>;
                    - example:
                        struct yesAndNo {
                            int maybe;
                        } probs;

            - access and modification
                - to access a struct, a struct variable must first be declared
                    - syntax:
                        struct <structName> <structVariable>;
                    - example:
                        struct idkman hello;
                    - if a struct variable has already been declared during the declaration of the struct
                        - it can be accessed using the struct variable name
                        - example:
                            struct Lumbago {
                                char yes;
                            } helloWorld;
                            // inside a function
                            helloWorld;

                - to access a member of a struct, the dot . syntax is used
                    - syntax:
                        <structVariable>.<structMember>;
                    - example:
                        probs.maybe;
                    - it is also possible to modify the values of struct members using this method
                        - syntax:
                            <structVariable>.<structMember> = <newValue>;
                        - example:
                            probs.maybe = 100;
                        
                - there is a shortcutn to quickly assign values to struct members in a struct variable
                    - uses the same syntax as implicitly declaring arrays
                        - through the curly braces { } syntax
                    - syntax:
                        struct <structName> <structVariable> = { <struct_member_values> };
                    - example:
                        struct Idkman maybe = { "HelloWorld" };
                    - note that the order in which the struct member are declared is the order that the values must be declared as
                        - example:
                            typedef struct Yes {
                                int no;
                                char maybe[8];
                                float probs;
                            };
                            // inside a function
                            Yes myStruct = { 10, "idkman", 3.14 }; // int, then char[], then float

            - nested structures
                - structs are able to be declared inside other structs
                - declaration and definition
                    - uses the same way as creating struct variabkles
                    - syntax:
                        struct <struct_name1> {
                            <dataType> <variableName> 
                        },
                        struct <struct_name2> {
                            struct <structName> <structVariable>;
                        };
                    - example:
                        struct ddkman {
                            char yes[20];
                        }
                        struct Lumbago {
                            struct idkman no;
                        } outer;

                - access and modification
                    - nested structs also uses the same dot . syntax
                        - but another dot is added every level of nested structs
                    - syntax:
                        <outerStructVariable>.<outerStructMember>.<innerStructMember>;
                    - example:
                        outer.no.yes; // uses the struct variable for the outher struct Lumbago
                                    // uses the struct variable declared inside Lumbago pointing to another struct Idkman, called no
                                    // uses the struct members of Idkman
                    - the same principle can also be used to add or modify the values of the struct member
                        - syntax:
                            <outerStructVariable>.<outerStructMember>.<innerStructMember> = <newValue>;
                        - example:
                            outer.no.yes = "Hello World";

        - unions
            - similar to structs but instead of having different memory addresses for each member
                - all union members share the exact same memory
                - i.e. changing the value for each member will change the value for all members
            - note that each union variables do not share the same memory
                - only union members that do share it

            - declaration and definition
                - similar to structs' way of declaring and definition
                - uses the union keyord
                - syntax:
                    union <unionName> {
                        <variableName> = <value>;
                    };
                - example:
                    union idkman {
                        int maybe;
                    };
                - union variables can be declared duing the declaration of unions
                    - syntax:
                        union <unionName> {
                            <variableName> = <value>;
                        } <unionVariable>;
                    - example:
                        union lumbago {
                            double yes;
                        } yippie;

            - access and modification
                - similar to structs' way to initializing variables
                    - syntax:
                        union <unionName> <unionVariable>;
                    - example:
                        union idkman probs;
                - accessing member variables can be done uing the dot . syntax
                    - syntax:
                        <unionVariable>.<unionMember>;
                    - example:
                        yippie.yes;
                    - the same concept can also be uses to assign or modify values to member variables
                        - uses the assignment = operator
                        - syntax:
                            <unionVariable>.<unionMember> = <newValue>;
                        - example:
                            probs.maybe = 100;
                - note that changing the value of one union member changes the value of the other members
                    - example:  
                        union MyUnion {
                            int man;
                            char po;
                        };
                        // inside main()
                        union MyUnion yes;
                        yes.man = 2000;
                        yes.po = 'q';       // yes.man becomes invalid
                                            // due to union members sharing the same memory
                                            // if one gets written, the others becomes invalid
                                            // or becomes unreliable
                - the size of a union depends on the largest member
                    - in a union with member variables of char[20], int, double
                        - char[20] is the largest therefore the size of the union is 20 bytes

        - enums
            - short for enumerations
            - represents a group of constants (consts)
            - conventions:
                - since enums holds constant values, it is recommended to use SCREAMING_SNAKE_CASE

            - declaration and definition
                - enum values are separated by commas
                    - except the last value
                - syntax:
                    enum <enumName> {
                        <enumValues>
                    };
                - example:
                    enum MyEnum {
                        IDKMAN,
                        HELLO,
                        WORLD
                    };

                - variables inside an enum can have descriptions (values)
                    - done by using the assignment = operator next to the variable
                    - syntax:
                        enum <enumName> {
                            <variable> = <value>
                        }
                    - example:
                        enum MyEnum {
                            IDKMAN = 10,
                            HELLO = 20,
                            WORLD // 21
                        }
                    - note that the value assigned must be an integer

            - access
                - enums are accessed using a variable
                - refer to typdef for a simpler enum declaration
                - syntax:
                    enum <enumName> <variableName>;
                - example:
                    enum MyEnum idkman;
                - when declaring a value to the variable, it must be present inside the enum
                    - example:
                        enum MyEnum = IDKMAN;
                - by default, the values in an enum starts from 0 and ranges up
                    - example:
                        enum MyEnum {
                            IDKMAN,
                            HELLO,
                            WORLD
                        };
                        enum MyEnum idkman = IDKMAN; // 0
                - enums with custom values
                    - example:
                        enum MyEnum {
                            IDKMAN = 10,
                            HELLO = 20
                            WORLD
                        };
                        enum MyEnum idkman = WORLD; // 21
    - C++ STL
        - Data Structures
            - are ways to store and organize data
                - resulting in various levels of efficiency depending on use
            - one example of a data structure are arrays
                - which allows multiple elements to be stored in a single variable
                - a basic structure compared to the other data structures in C++
                - refer to arrays.cpp for more info
            - in C++, the most common data structures are:
                - Vector <vector>
                    - stores element like an array but dynamic in size
                    - adding and removing elements are done at the end of the container
                    - elements are accessed using an index
                - List <list>
                    - stores elements sequentially, where every element is connected to the next
                    - element are not accessed using indexes
                    - similar to Linked Lists
                - Stack <stack>
                    - stores elements in a specific order, through the Last in First Out (LIFO) concept
                    - where elements can only be added and removed from the top, or at the end of the list
                    - elements are not accessed using indexes
                - Queue <queue>
                    - stores elements in a specific order, through the First in First Out (FIFO) concept
                    - where elements can only be added and removed from the front, or the start of the list
                    - elements are not accessed using indexes
                - Deque <deque>
                    - stores elements in a double-ended queue
                    - ehere elements can be added and removed from both eneds of the list
                    - elements are able to be aceesed using an index
                - Set <set>
                    - stores unique elements in a list
                    - elements are not accessed using index
                - Map <map>
                    - stores elements using a key-value pair
                    - elements are accessed using keys, not by index
        - Standard Template Library
            - is a library that consists of different data structures and algorithms
                - used to effective store and manipulate data
            - STL consists of three concepts; containers, iterators, and algorithms, and the relationship between them are:
                - containers
                    - are data structures that provides a way to store data
                    - examples are vectors, lists, sets, etc.
                - iterators
                    - are objects that are used to access elements of a data structure
                - algorithms
                    - the STL library includes functions like sort() and finc()
                    - performs operations on data through iterators
            - in Computer Science, data structures and algorithms go hand in hand
                - a data structure is worthless if it is no searchable or unable to be manipulated
                - an algorithm is worthless if there is no data structure to work on

            - Vectors
                - definition
                    - the size of this data structure of array is dynamic
                        - it can grow and shrink without errors
                    - initialized using the <vector> library
                    - syntax:
                        #include <vector>

                - declaration and initialization
                    - to create a vector, the vector keyword followd by the data type is done
                    - syntax:
                        std::vector<(dataType)> <vectorName>;
                    - exmaple:
                        std::vector<std::string> idkman;
                    - it is possible to directly assign values to a vector during declaration
                        - using a comma separated list inside curly braces { }
                        - syntax:
                            std::vector<(dataType)> <vectorName> = {<values>};
                        - example:
                            std::vector<std::string> idkman = {"yes", "no", "maybe"};
                    - note that when a vector array has been assigned a data type
                        - it cannot be changed and can only hold that specifiv data type

                    - it is possible for vectors to hold more than one data type
                        - it is achieved through the use of the <variable> header
                            - using the std::variant type
                            - note that the data types that the vector is able to hold must be specified
                        - syntax:
                            std::vector<std::variant<(dataTypes)>> <vectorName>;
                        - example:
                            std::vector<std::variant<std::string, int, double>> myArray;

                - access and modification
                    - like normal arrays, vector arrays are accessed using indexes
                        - starting from 0, being the first element
                        - syntax:
                            <vectorName>[<index>];
                        - example:
                            idkman[2];
                        - unlike normal arrays, the <vector> library has methods for vector arrays
                            - like the .front() and .back() methods
                            - syntax:
                                <vectorName>.front();
                                // or
                                <vectorName>.back();
                            - example:
                                idkman.front();
                                // or
                                idkman.back();
                            - it is recommended to us the .at() method to access elements rather than the square brackets
                                - it lets programmers know if an error occurs
                                - syntax:
                                    <vectorName>.at(<index>);
                                - example:
                                    idkman.at(2) // same as idkman[2]
                    - similar to normal arrays, elements are able to be modified using the assignment = operator
                        - syntax:
                            <vectorName>.at(<index>) = <newValue>;
                        - example:
                            idkman.at(1) = 100;
                    - unlike normal arrays, the biggest difference between it and vector arrays is the ability to add elements
                        - it is done using the .push_back() method
                            - it adds method to the back (last) of a vector array
                        - syntax:
                            <vectorName>.push_back(<newValue>);
                        - example:
                            idkman.push_back(5);
                        - similarly, it is elements at the back of the vector array can also be removed
                            - using the .pop_back() method
                            - syntax:
                                <vectorName>.pop_back();
                            - example:
                                idkman.pop_back();
                    - the size of vector arrays are able to be queried using the .size() method
                        - syntax:
                            <vectorName>.size();
                        - example:
                            idkman.size();
                        - vectors can also be queried if they are empty or not
                            - using the .empty() method
                                - returns 1 if it is empty
                                - returns 0 if it is not
                            - syntax:
                                <vectorName>.empty();
                            - example:
                                idkman.empty();

            - Lists
                - definition
                    - similar to vectors
                        - the size of this data structure is dynamic
                        - it can grow and shrink without errors
                    - lists vs vectors
                        - modification
                            - using a list, it is possible to add or remove items from the beginning or end of a list
                            - unlike in vectors where it is only optimized to add or remove elements at the end of a vector
                        - access
                            - unlike in vectors, random access in list does not support random access
                            - lists are unable to directly jump to a specific index or access element via an index

                    - initialized using the <list> library
                    - syntax:
                        #include <list>
                 
                - declaration and initialization
                    - to create a list, the list keyword is followed by the data type is done
                    - syntax:
                        std::list<(dataType)> <listName>;
                    - example:
                        std::list<std::list> lumbago;
                    - it is possible to directly assign values to a list during declaration
                        - syntax:
                            std::list<(dataType)> <listName> = {<values>};
                        - example:
                            std::list<std::string> lumbago = {"yes", "no", "maybe"};
                    - note that when a list variable has been assigned a data type
                        - it cannot be changed and can only hold that specific data type

                    - it is possible for lists to hold more than one data type
                        - it is achieved through the use of the <variant> header
                            - using the std::variant type
                            - note that the data types that the list is able to hold must be specified
                        - syntax:
                            std::list<std::variant<(dataTypes)>> <vectorName>;
                        - example:
                            std::list<std::variant<std::string, int>> myList;
                
                - access and modification
                    - unlike normal arrays or vectors, a list element cannot be accesed through an index
                        - only through the .front() or .back() methods
                            - able to access the first or the last element, respectively
                        - syntax:
                            <listName>.front();
                            // or
                            <listName>.back();
                        - example:
                            lumbago.front()
                            // or
                            lumbago.back();
                    - using the same concept, elements at the front or back of the list can be modified
                        - through the use of the assignment = operator
                        - syntax:
                            <listName>.front() = <newValue>;
                            // or
                            <listName>.back() = <neValue>;
                        - example:
                            lumbago.front() = "maybe";
                            // or
                            lumbago.back() = "back";
                    - similar to vectors, elements are able to be added using the .push_back() and even the .push_front() methods
                        - adding elements to the back or front of the list, respectively
                        - syntax:
                            <listName>.push_front(<newValue>);
                            // or
                            <listName>.push_back(<newValue>);
                        - example:
                            lumbago.push_front("yes");
                            // or
                            lumbago.push_back("no");
                    - similar to vectors, elements are able to be removed using the .pop_back() and even the .pop_front() methods
                        - syntax:
                            <listName>.pop_front();
                            // or
                            <listName>.pop_back();
                        - example:
                            lumbago.pop_front();
                            // or
                            lumbago.pop_back();
                    - the size of a list is able to be queried using the .size() method
                        - syntax:
                            <listName>.size();
                        - example:
                            lumbago.size();
                        - lists can also queried if they are empty or not
                            - using the .empty() method
                                - returns 1 if it is empty
                                - returns 0 if it is not
                            - syntax:
                                <listName>.empty();
                            - example:
                                lumbago.empty()
            
            - Stacks
                - definition
                    - a data structure that contains elements that are stored in a specific order
                    - uses the LIFO principle
                        - Last In, First Out
                        - wherein any changes, adding or removing elements, occurs at the end of the stack
                    - stacks vs vectors
                        - unlike vectors, stack elemtns are unable to be accessed through an index
                        - due to elements being added and removed from the top
                            - the only element accessible is the top of the stack

                    - initialized using the <stack> libary
                    - syntax:
                        #include <stack>
                        
                - decalration and initialization
                    - to create a stack, the stack keyword is followed by the data type is done
                    - syntax:
                        stack<(dataType)> <stackName>;
                    - example:
                        stack<std::string> maybe;
                    - sidenote:
                        - unlike vectors or lists, it is not possible to assign values to the stack during declaration
                            - example:
                                stack<int> myNums = {1, 2, 3, 4}; -> Error
                        - after a stack has been assigned a data type
                            - it cannot be changed and can only hold that specific data type
                        
                    - it is possible for stacks to hold more than one data type
                        - it is achieved through the use of the <variamt> header
                            - using the std::variant type
                            - note that the data types that the stack is able to hold must be specified
                        - syntax:
                            std::stack<std::variant<(dataTypes)>> <stackName>;
                        - example:
                            std::stack<std::variant<std::string, int>> myStack;

                - access and modification
                    - unlike normal arrays or vectors, a stack element cannot be accessed through an index
                        - only through the .top() method
                            - which represents the end element of the stack
                        - syntax:
                            <stackName>.top();
                        - example:
                            maybe.top();
                    - using the same concept, elements at the top of the stack can be modified
                        - through the use of the assignment = operator
                        - syntax:
                            <stackName>.top() = <newValue>;
                        - example:
                            maybe.top() = "idkman";
                    - elements are able to be pushed (or added) to the top of the stack through a special method
                        - using the .push() method
                        - syntax:
                            <stackName>.push(<value>);
                        - example:
                            maybe,push("probs");
                    - elements are able to be popped (or removed) from the top of the stack through a special method
                        - using the .pop() method
                            - syntax:
                                <stackName>.pop();
                            - example:
                                maybe.pop();
                    - the size of a stack is able to be queried using the .size() method
                        - syntax:
                            <stackName>.size();
                        - example:
                            maybe.size();
                        - stacks can also be queried if they are empty or not
                            - using the .empty() method
                                - returns 1 if it is empty
                                - returns 0 is it it not
                            - syntax:
                                <stackName>.empty();
                            - example:
                                maybe.empty();

            - Queues
                - definition
                    - a data structure that contains elements that are stored in a specific order
                    - uses the FIFO principle
                        - FIrst In, First Out
                        - wherein any changes, adding elements adds them at the end of the queue
                        - removing elements removed the first element in the queue
                    - queues vs vectors
                        - unlike vectors, queue elements are unable to be accessed through an index
                        - the only element accessible is the front and back of the queue

                    - initialized using the <queue> library
                    - syntax:
                        #include <queue>

                - declaration and initialization
                    - to create a queue, the queue keyword is followed by the data type is done
                    - syntax:
                        queue<(dataType)> <queueName>;
                    - example:
                        queue<std::string> no;
                    - sidenote:
                        - unlike vectors or lists, it is not possible to assign values to the queue during declaration
                            - example:
                                queue<int> myNums = {1, 2, 3, 4}; -> Error
                        - after a queue has been assigned a data type
                            - it cannot be changed and can only hold that specific data type

                    - it is possible for queues to hold more than one data type
                        - it is achieved through the use of the <variant> header
                            - using the std::variant type
                            - note that the data types that the queue is able to hold must be specified
                        - syntax:
                            std::queue<std::variant<(dataTypes)>> <queueName>;
                        - example:
                            std::queue<std::variant<std::string, int>> myQueue;

                - access and modification
                    - unlike normal arrays or vectors, a queue element cannot be accessed through an index
                        - only through the .front() and .back() method
                            - which represents the first and last elements in a queue, repectively
                        - syntax:
                            <queueName>.front();
                            // or
                            <queueName>.back();
                        - example:
                            no.front();
                            // or
                            no.back();5
                    - using the same concept, elements at the front and back of the queue are able to be modified
                        - through the assignment = operator
                        - syntax:
                            <queueName>.front() = <newValue>;
                            // or
                            <queueName>.back() = <newValue>;
                        - example:
                            no.front() = "hello";
                            // or
                            no.back() = "world";
                    - elements are able to be pushed (or added) to the back of the queue through a special method
                        - using the .push() method
                        - syntax:
                            <queueName>.push(<value>);
                        - example
                            no.push("yes");
                    - elements are able to be popped (or removed) from the front of the queue through a special method
                        - using the .pop() method
                        - syntax:
                            <queueName>.pop();
                        - example:
                            no.pop();
                    - the size of a queue is able to be queried using the .size() method
                        - syntax:
                            <queueName>.size();
                        - example:
                            no.size();
                        - queues can also be queired if they are empty or nor
                            - using the .empty() method
                                - returns 1 if it is empty
                                - returns 0 if it is not
                            - syntax:
                                <queueName>.empty();
                            - example:
                                no.empty();

            - Deque
                - definition
                    - a data structure that contains elements that are stored in a flexible order
                    - deques vs queues
                        - unlike queues, deque elements are able to added and removed from both the front and back ends
                        - it it also possible to access elements using an index, unlike queues which can't

                    - initialized through the <deque> library
                    - syntax:
                        #include <deque>

                - declaration and initialization
                    - to create a deque, the deque keyword is followed by the data type is done
                    - syntax:
                        std::deque<(dataType)> <dequeName>;
                    - example:
                        std::deque<std::string> yes;
                    - it is possible to assign values to the deque during declaration
                        - syntax:
                            std::deque<(dataType)> <dequeName> = {<values>};
                        - example:
                            std::deque<int> yes = {1, 2, 3, 4};
                    - note that after a deque have been assigned to a data type
                        - it cannot be changed and can only hold that specific data type

                    - it is possible for queues to hold more than one data type
                        - it is achieved through the use of the <variant> header
                            - using the std::variant type
                            - note that the data types that the deque is able to hold must be specified
                        - syntax:
                            std::deque<std::variant<(dataTypes)>> <queueName>;
                        - example:
                            std::deque<std::variant<std::string, int>> myQueue;

                - access and modification
                    - similar to normal arrays or vectors, deque elements are able to be accessed through an index
                        - starting from 0, being the first element
                        - syntax:
                            <dequeName>[<index>];
                        - example:
                            yes[0];
                        - similar to vectors, it is also possible to use the .front() and .back() methods to access eleemnts
                            - syntax:
                                <dequeName>.front();
                                // or
                                <dequeName>.back();
                            - example:
                                yes.front();
                                // or
                                yes.back();                                
                            - it is recommended to us the .at() method to access elements rather than the square brackets
                                - it lets programmers know if an error occurs
                                - syntax:
                                    <dequeName>.at(<index>);
                                - example:
                                    yes.at(2) // same as idkman[2]
                    - using the same concept, it is possible to modify the value of a specific deque element
                        - through the assignment = operator
                        - syntax:
                            <dequeName>.at(<index>) = <newValue>;
                        - example:
                            yes.at(0) = "no";
                    - similar to lists, it is possible to add elements to the front and back of a deque
                        - using the .push_front() and .push_back() methods, respectively
                        - syntax:
                            <dequeName>.push_front(<newValue>);
                            // or
                            <dequeName>.push_back(<newValue>);
                        - example:
                            yes.push_front("world");
                            // or
                            yes.push_back("hello");
                    - like lists, it is possible to remove elements from the front or back of a deque
                        - using the .pop_front() or .pop_bac() methods, respectively
                        - syntax:
                            <dequeName>.pop_front();
                            // or
                            <dequeName>.pop_back();
                        - example
                            yes.pop_front();
                            // or
                            yes.pop_back();
                    - the size of a deque is able to be queried using the .size() method
                        - syntax:
                            <dequeName>.size();
                        - example:
                            yes.size();
                        - deques can also be queried if they are empty or not
                            - through the .empty() method
                                - returns 1 if it is empty
                                - returns 0 if it is not
                            - syntax:
                                <dequeName>.empty();
                            - example:
                                yes.empty();
            - Set
                - definition
                    - a data structure that contains only unique elements, where:
                        - each element is sorted alphanumerically in ascending order
                        - each element is unique, making any duplicates additions ignored
                        - can be added and removed, but no element is modifyable after insertion
                        - cannot be accessed via an index due to being sorted, not indexed

                    - initialized through the <set> library
                    - syntax:
                        #include <set>

                - declaration and initialization
                    - to create a set, the set keyword is followed by the data type is done
                    - syntax:
                        std::set<(dataType)> <setName>;
                    - example:
                        set::set<set::string> hello;
                    - it is possible to declare values to the set during declaration
                        - syntax:
                            std::set<(dataType)> <setName> = {<values>};
                        - example:
                            std::set<int> hello =  {1, 2, 3, 4};
                    - note that after a set has been assigned to a data type
                        - it cannot be changed and can only hold that specific data type

                    - it is possible for sets to hold more than one data type
                        - it is achieved through the use of the <variant> header
                            - using the std::variant type
                            - note that the data types that a set can hold must be specified
                        - syntax:
                            std::set<std::variant<(dataTypes)>> <setName>;
                        - example:
                            std::set<std::variant<std::string, int>> mySet;

                - access and modification
                    - note that a set cannot be accessed through any normal means
                        - like through index based access in vectors and arrays
                        - it can only accessed as an iterator in loops
                        - syntax:
                            for (<dataType> <loopVariable> : <setName>) {...}
                        - example:
                            for (std::string son : hello) {
                                std::cout << son;
                            }
                    - sets are automatically sorted in an ascending order and they only store unique elements
                        - trying to store duplicates will only store one of them
                        - example:
                            std::set<std::string> hello = {"yes", "no", "yes"}; // only a single "yes" entry is stored
                    - it is possible to add elements to a set using the .insert() method
                        - syntax:
                            <setName>.insert(<value>);
                        - example:
                            hello.insert("world");
                    - it is possible to remove elements from a set using the .erase() method
                        - syntax:
                            <setName>.erase(value);
                        - example:
                            hello.erase("world");
                        - to remove all elements in a set, the .clear() method is used
                            - syntax:
                                <setName>.clear();
                            - example:
                                hello.clear();
                    - the size of a set is able to be queried using the .size() method
                        - syntax:
                            <setName>.size();
                        - example:
                            hello.size();
                        - sets can also be queried if they are empty or not
                            - through the .empty() method
                                - returns 1 if it is empty
                                - returns 0 if it is not
                            - syntax:
                                <setName>.empty();
                            - example:
                                hello.empty();
                
            - Maps
                - definition
                    - a data structur that contains a key-value pair, where
                        - it is accessible through keys, not index
                        - similar to sets, each key must be unique
                        - unlike its key counterpart, the values can be a duplicate
                        - each entry is sorted alphanumerically in ascending order by their keys

                    - initialized through the <map> library
                    - syntax:
                        #include <map>

                - declaration and initialization
                    - to create a map, the map keyword is used followed by the type of both the key and the value
                    - syntax:
                        std::map<(keyDataType), <valueDataType>> <mapName>;
                    - example:
                        std::map<std::string, std::string> probs;
                    - it is possible to declare values to the map during declaration
                        - syntax:
                            std::map<(keyDataType), (valueDataType)> <mapName> = {{<key>, <value>}, ...};
                        - example:
                            std::map<std::string, std::string> probs = {{"hello", "world"}, {"yes", "no"}};
                    - note that after a map's keys and values have been declared to a data type
                        - it cannot be changed and can only hold that specific data type
                    
                    - it it possible for maps to hold more than one data type for each of its keys and values
                        - it is achieved through the use of the <variant> header
                            - using the std::variant type
                            - note that he data types that a map's keys and values must hold must be specified
                        - syntax;
                            std::map<std::variant<(dataTypes), std::variant(dataTypes)>> <mapName>;
                        - example:
                            std::map<std::variant<std::string, int>, std::variant<std::string, int>> myMap;
                    
                - access and modification
                    - unlike normal arrays or vectors, maps are accesed using their key instead of an index
                        - syntax:
                            <mapName>[<key>];
                        - example:
                            probs["hello"];
                        - maps can also using the .at() method to access key-value elements
                            - instead of an index, a key is used
                            - syntax:
                                <mapName>.at(<key>);
                            - example:
                                probs.at("yes");
                            - it is recommended to us the .at() method to access elements rather than the square brackets
                                - it lets programmers know if an error occurs
                    - using the same concept, it is possiblt to modify the value of a specific map element
                        - through the assignment = operator
                        - syntax:
                            <mapName>.at(<key>) = <newValue>;
                        - example:
                            probs.at("yes") = "maybe";
                    - it is possible to add elements to a map using the .insert() method
                        - syntax:
                            <mapName>.insert({<key>, <value>});
                        - example:
                            probs.insert({"maybe", "probs"});
                        - it is also possible to add elements using square brackts [ ]
                            - assigning a value to a non-existent key will add a new entry with that same key and value
                            - syntax:
                                <mapName>[<key>] = <value>;
                            - example:
                                probs["idkman"] = "lumbago";
                        - note that when adding a new map element with a pre-existing key
                            - only the first value of the same key remains
                            - while the new value is ignored
                    - it is possible to remove elements from a map using the .erase() method
                        - syntax:
                            <mapName>.erase(<key>);
                        - example:
                            probs.erase("maybe");
                        - to remove all elements in a map, the .clear() method is used
                            - syntax:
                                <mapName>.clear();
                            - example:
                                probs.clear();
                    - the size of a map is able to be queried using the .size() method
                        - syntax:
                            <mapName>.size();
                        - example:
                            probs.size();
                        - maps can also be queried if they are empty or not
                            - through the .empty() method
                                - returns 1 if it is empty
                                - returns 0 if it is not
                            - syntax:
                                <mapName>.empty();
                            - example:
                                probs.empty();
                        - keys can be queried if they exists or not
                            - through the .count() method
                                - returns 1 if it exists
                                - returns 0 if it does not
                            - syntax:
                                <mapName>.count(<key>);
                            - example:
                                probs.count("yes");
                - looping through a map
                    - it is recommended to use the auto keyword inside a for each loop when looping through a map
                        - this allows the compiler to automatically determine the type for each key-value pair
                    - since maps have two elements, a key and its value
                        - the .first attribute is used to access the key, and
                        - the .second attribute is used to access the value
                    - sample code:
                        for (auto idkman : probs) {
                            std::cout << idkman.first << idkman.second;
                        }
*/

/* classes
    - Object Oriented Programming
        - focuses on dealing with objects that holds both data and functions to work on the same data
        - by design, C++ is an object-oriented programming language
            - along with its data members and methods
        - main points of OOP
            - clearer structure to programming
                - similar methods are reused
            - focuses on the DRY principle
                - Don't Repeat Yourself
                    - implying that duplicate code should be reused
                    - hekps in maintaining, reusing and debugging pieces of code
        - OOP focuses on object and classes
            - classes
                - a user-defined type
                - works as an object constructor
                    - derves as a blueprint for creating objects
                    - defines what an object should look like
            - objects
                - created based on the class
                - uses the "blueprints" provided by the class
                - inherits the data members and methods of the class it is based on
                    - it becomes an instance of said class

        - Procedural Programming vs Object-Oriented Programming
            - procedural
                - focuses on writing fundtions that operate on data
                - procedural operates more on programming around functions
            - object-oriented
                - focues on creating objects that contains both the date and functions
                - OOP operates on declaring classes and creating classes

    - C++ classes
        - declaration and definition
            - to create a class, it is done through the class keyword
            - syntax:
                class <className> {
                    <statements>
                };
            - example:
                class MyClass {
                    int myVar;
                };
            - note that a semicolon is required to end a class declaration

        - multiple classes
            - it is possible to declare more than one classes in a C++ program
            - syntax:
                class <className1> {...};
                class <className2> {...};
                class <className3> {...};
            - example:
                class MyFirstClass {
                    public:
                        MyFirstClass() {
                            std::cout << "yes";
                        }
                };
                class MySecondClass {
                    public:
                        MySecondClass() {
                            std::cout << "no"
                        }
                };
                class MyThirdClass {
                    public:
                        MyThirdClass() {
                            std::cout << "maybe"
                        }
                };

    - C++ objects
        - declaration and initialization    
            - to create an object, it is done by using the class name
            - syntax:
                <className> <objectName>;
            - example:
                MyClass myObj;
            - it is possible to declare more than one objects
                - example:
                    MyClass myObj1;
                    MyClass myObj2;

    - class members
        - data members and methods of a class are called "class members"
        - class data members
            - refer to variables.cpp for variable declaration
            - variables that are declared inside a class are calles "data members"

            - declarating data members
                - similar to declaring a variable, the same thing is done in a class
                - syntax:
                    class <className> {
                        <dataType> <dataMemberName>;
                    };
                - example:
                    class MyClass {
                        std::string myString;
                    };
                - data members can come with pre-declared value
                    - syntax:
                        class <className> {
                            <dataType> <dataMemberName> = <value>;
                        };
                    - example:
                        class MyClass {
                            float myFloat = 3.14;
                        };
            
            - accessing data members
                - a data member of a class is accessible through an object
                    - using the dot . syntax
                - syntax:
                    <objectName>.<dataMemberName>;
                - example:
                    myObj.myString;
                - values of data members are able to modified
                    - using the assignment = operator
                    - syntax:
                        <objectName>.<dataMemberName> = <newValue>;
                    - example:
                        myObj.myString = "idkman";
                    - sidenote:
                        - like normal variables, the new value must match the type of the data member
                            - an eror will occur if a different data value is assigned
                            - example:
                                myObj myFloat = 'A'; -> Error

        - class methods
            - refer to functions.cpp for function declarations
            
            - declaration and definition
                - there are two ways to declare methods
                    - static methods
                        - static methods are able to be accessed directly
                            - without the need to declare an object
                        - uses the static keyword
                        - syntax:
                            class <className> {
                                static <returnType> <methodName>() {
                                    <statements>
                                }
                            };
                        - example:
                            class MyClass {
                                static std::string idkman() {
                                    return "lumbago";
                                }
                            };
                    - instance methods
                        - can only be called using a object
                        - declaration is similar to normal functions
                        - syntax:
                            class <className> {
                                <returnType> <methodName>() {
                                    <statement>
                                }
                            };
                        - example:
                            class MyClass {
                                int myMethod() {
                                    return 9 + 10;
                                }
                            };
                
                - methods can also have parameters like normal functions
                    - static methods
                        - syntax:
                            class <className> {
                                static <returnType> <methodName>(<parameters>) {
                                    <statements>
                                }
                            };
                        - example:
                            class MyClass {
                                static std::string idkman(std::string maybe) {
                                    return maybe;
                                }
                            };
                    - instance methods
                        - syntax:
                            class <className> {
                                <returnType> <methodName>(<parameters>) {
                                    <statement>
                                }
                            };
                        - example:
                            class MyClass {
                                int myMethod(char yes) {
                                    if(yes == 'A') {
                                        return 9 + 10;
                                    }
                                    return 21;
                                }
                            };
                
                - it is possible to define a method outside a class
                    - it must be declared inside a class
                    - syntax:
                        class <className> {
                            <returnType> <methodName>(<parameter>);
                        };
                        <returnType> <className>::<methodName>(<parameters>) {
                            <statements>
                        }
                    - example:
                        class MyClass {
                            void myMethod(double no);
                        };
                        void MyClass::myMethod(double no) {
                            std::cout << no;
                        }
            
            - access and method calls
                - there are two ways to call methods
                    - static methods
                        - are able to be called directly
                        - syntax:
                            <className>::<methodName>();
                        - example:
                            MyClass::idkman();
                    - instance methods
                        - requires a object to be called
                        - syntax:
                            <objectName>.<methodName>();
                        - example:
                            myObj.myMethod();
                - arguements are able to be passed like normal functions
                    - static methods
                        - are able to be called directly
                        - syntax:
                            <className>::<methodName>(<arguments>);
                        - example:
                            MyClass::idkman("yes");
                    - instance methods
                        - requires a object to be called
                        - syntax:
                            <objectName>.<methodName>(<arguments>);
                        - example:
                            myObj.myMethod('A');

            - template functions
                - templates are able to be used inside classes
                - enables support for general programming
                    - needing no specific data type declaration, like the auto data type flag

                - declaration and definition
                    - unlike templates for normal functions, template functions for classes have a different syntax
                    - syntax:
                        template <typename (templateName)>
                        class <className> {
                            public:
                                <templateName> <dataMemberName>; // can hold any data type
                        };
                    - example:
                        template <typename idkman>
                        class MyClass {
                            public:
                                static void myMethod(idkman yes) {
                                    std::cout << yes;
                                }
                        };
                    - like normal templates, multiple templates are supported inside classes
                        - these are separated by commas ,
                        - example;
                            template <typename idkman, typename lumbago>
                            class Yes {
                                public:
                                    void myMethod(idkman yes, lumbago no) {
                                        std::cout << yes << no;
                                    }
                            };

                - access and method calls
                    - accessing classes with template variables requires a different syntax
                    - syntax:
                        <className><(dataType)> <objectName>(<arguments>);
                    - example:
                        MyClass<std::string> myObj("idkman");

        - class constructors
            - a constructor is a special method in C++
                - it is a method that gets called when an object is created
                - it must not contain any return types and return statements
            - it is used to initialize objects when creating a new instance of a class
            
            - declaration and definition
                - when creating a constructor, the name must match the class name
                - no return types must be present in a constructor, not even void
                    - the same restriction is present for return statements
                - syntax:
                    class <className> {
                        public:
                            <className>() {
                                <statement>
                            }
                    };
                - example:
                    class MyClass {
                        public:                     // defined in Encapsulation
                            MyClass() {
                                std::cout << "yes";
                            }
                    }; 
                - like normal functions, constructors can also have parameters
                    - it is most commonly used to initialize data members of a class
                    - syntax:
                        class <className> {
                            public:
                                <className>(<parameters>) {
                                    <statements>
                                }
                        };
                    - example:
                        class MyClass {
                            public:
                                MyClass(std::string maybe) {
                                    std::cout << maybe;
                                }
                        };

                - overloading
                    - like normal functions, contructors can also be overloaded
                    - it enables multiple object creations with difference arguments
                    - syntax:
                        class <className> {
                            public:
                                <className>(<parameters1>) {
                                    <statements>
                                }
                                <className>(<parameters2>) {
                                    <statements>
                                } 
                        };
                    - example:
                        class MyClass {
                            public:
                                MyClass(std::string yes) {
                                    std::cout << yes;
                                }
                                MyClass(int no) {
                                    std::cout << no;
                                }
                        };

            - access and method calls
                - contructors are called automatically when creating an object
                - syntax:
                    <className> <objectName>();
                - example:
                    MyClass myObj();
                - contructors with parameters are able to be called using their respective arguments
                    - syntax:
                        <className> <objectName>(<arguments>);
                    - example:
                        MyClass myObj("yes");

    - Encapsulation
        - ensures that sensitive data are hidden from users
            - any important values are hidden to prevent data leaks
        - encapsulation is achieved through access modifiers
            - mainly through the private access modifier
        - to access and retrieve private data, certains methods are declared and use
            - these are the getter and setter methods
        - why Encapsulation
            - it provides better contrik of classes, methods, and data members
                - read-only for getter methods
                - write-only for setter methods
            - increases security and flexibility
                - parts of code are able to be changed without compromising other

        - access modifiers
            - in C++ there are three types of access modifiers
            - by default, all class members are private
            - member modifiers
                - public
                    - accessible and callable by objects outside the class
                    - syntax:
                        class <className> {
                            public:
                                <statements>
                        };
                    - example:
                        class MyClass {
                            public:
                                int maybe = 10;
                        };
                - protected
                    - cannot be accessed or called by objects outside the class
                    - it can only be accessed through inheritance
                    - syntax:
                        class <className> {
                            protected:
                                <statements>
                        };
                    - example:
                        class MyClass {
                            protected:
                                char 'Y';
                        };
                - private:
                    - cannot be accessed or called by objects outside the class
                        - not even through inheritance
                    - syntax:
                        class <className> {
                            private:
                                std::string yes = "idkman";
                        };
            - note that all access modifiers are able to be used simultaneously
                - example:
                    class MyClass {
                        private:
                            std::string idkman;
                        public:
                            std::string lumbago = idkman;
                        protected:
                            std::string yes = "no";
                    };

        - getter and setter methods
            - to access and modify private attributes of a class, getter and setter methods are used
            - since private attributes are accessible inside the same class
                - other methods or attributes from the same class can influence it
            - setter methods
                - sets the value of a private data member
                - example:
                    class MyClass {
                        private:
                            int idkman;                  // data member to set
                        public:
                            void setterMethod(int yes) {
                                idkman = yes;            // sets the private value through a public method
                            }
                    };

                    // inside a function
                    MyClass myObj;
                    myObj.setterMethod(10);              // private data member is set
            - getter methods
                - retrives the value of a private data member
                - example:
                    class MyClass {
                        private:
                            std::string maybe = "probs"; // data member to retrives
                        public:
                            std::string getterMethod() { // retrives the private value through a public method
                                return maybe
                            }
                    };

                    // inside a function
                    MyClass myObj;
                    std::string = myObj.getterMethod()   // private data member is retrived

        - friend functions
            - this type of function is not part of any class
                - but is able to freely access private members of the class where it is declared in
            
            - declaration and definition
                - friend functions must be declared inside a class
                - uses the concept of declaration and definition
                    - is declared inside the class
                    - but is defined outside the class
                - declared using the friend keyword
                - syntax:
                    class <className> {
                        <statements>

                        friend <returnType> <methodName>(<parameters>);
                    };
                    <returnType> <methodName>(<parameters>) {
                        <statements>
                    }
                - example:
                    class MyClass {
                        private:
                            std::string lumbago = "maybe";
                        
                        friend std::string yes(MyClass idk);
                    }

                    std::string yes(MyClass idk) {
                        return idk.lumbago;
                    }

    - Inheritance
        - allows child classes to reuse members from the parent class
        - prevents duplication of the same methods
            - allows reusing it without redeclaration
        - inheritance is grouped into two categories
            - superclass
                - parent class
                    - also known as the superclass or the base class
                    - it is where the child class inherits from
                - child class
                    - also known as the subclass or the derived class
                    - it is what inherits from the parent class
            
        - declaration and defintion
            - in C++, inheritance is done through a special syntax
            - syntax:
                class <childClassName>: public <parentClassName> {
                    <statements>
                };
            - example:
                class ChildClass: public ParentClass {
                    int idkman;
                };
            - multilevel inheritance
                - other classes can also inherit from child classes
                    - these classes becomes child classes of a child class
                - example:
                    class ParentClass {...};
                    class ChildClass: public ParentClass {...};
                    class GrandClass: public ChildClass {...};
            - multiple inheritance
                - child classes can inherit from multiple parent classes
                    - done by a comma , separates list
                - syntax:
                    class <childClassName>: public <parentClassName1>, public <parentClassName> {...};

        - access and inheritance
            - all public and protected members of a class are accessible in the child class
                - protected members are not accessible outside the classes, only through inheritance
            - example:
                class ParentClass {
                    private:
                        int myNum;
                    public:
                        std::string yes;
                    protected:
                        char idk;
                };
                class ChildClass: public ParentClass {
                    idk = 'M';
                    yes = "idkman";
                    myNum = 100; -> Error
                }
            - child classes can use their parent's constructor
                - requires the colon : operator
                    - ensures that anything that is right next to the colon is ran before the code block
                - example:
                    class ChildClass: public ParentClass {
                        public:
                            ChildClass(std::string lumbago) : ParentClass(lumbago) {} // passes the argument from child constructor
                                                                                      // and gives it to the parent constructor
                    }

    - Polymorphism
        - means "many forms"
        - occurs when multiple classes that are related through inheritance
        - it uses the same methods to perform different tasks
        - method overloading is a form of polymorphism
        - syntax:
            class <parentClassName> {
                public:
                    <returnType> <methodName>(<parameters>) {
                        <statements>
                    }
            };
            class <childClassName1>: public <parentClassName> {
                public:
                    <returnType> <methodName>(<parameters>) {
                        <statements>
                    }
            };
            class <childClassName3>: public <parentClassName> {
                public:
                    <returnType> <methodName>(<parameters>) {
                        <statements>
                    }
            };
            class <childClassName2>: public <parentClassName> {
                public:
                    <returnType> <methodName>(<parameters>) {
                        <statements>
                    }
            };
        - example:
            class MyClass {
                public:
                    void idkman(std::string yes) {
                        std::cout << yes;
                    } 
            };
            class ChildClassYes: public MyClass [
                public:
                    void idkman(std::string yes) {
                        std::cout << yes << yes;
                    }
            ];
            class ChildClassYes: public MyClass [
                public:
                    void idkman(std::string yes) {
                        std::cout << yes << yes << yes;
                    }
            ];
            class ChildClassYes: public MyClass [
                public:
                    void idkman(std::string yes) {
                        std::cout << yes << yes << yes << yes;
                    }
            ];
        - note that all classes have the same methods
            - but they differ in how they operate

        - virtual functions
            - is member function declared on a base class (parent class)
                - is able to be overriden in derived classes (child classes)
            - is a key part of C++ polymorphism
                - letting different classes (or objects) reposnt differently to the same function call
            - why virtual functions?
                - without it, C++ decides whch functions to call based on the pointer type
                    - not the actual object type
                - with virtual, it checks the actual object that the pointer is pointing to
                    - in exchange for a bit of performace
            - example:
                // without virtual
                class MainClass {
                    public:
                        void printStuff() {
                            std::cout << "idkman";
                        }
                };
                class Derived: public MainClass {
                    public:
                        void printStuff() {
                            std::cout << "lumbago";
                        }
                };
                // inside main()
                MainClass *ptr;    // creates a pointer of MainClass
                Derived myObj;     // creates an object of Derived
                ptr = &myObj;      // points the MainClas pointer to the object of Derived
                ptr->printStuff();   // idkman
                                   // instead of "lumbago", it calls the MainClass method

                // with virtual
                class MainClass {
                    public:
                        virtual void printStuff() {
                            std::cout << "idkman";
                        }
                };
                class Derived: public MainClass {
                    public:
                        void printStuff() override { // overwrites the inherited method
                            std::cout << "lumbago";
                        }
                };
                // inside main()
                MainClass *ptr;    // creates a pointer of MainClass
                Derived myObj;     // creates an object of Derived
                ptr = &myObj;      // points the MainClas pointer to the object of Derived
                ptr->printStuff(); // lumbago
                                   // calls the appropriate method
*/

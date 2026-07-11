/* Classes
    - Object-Oriented Programming
        - focuses on dealing with objects that holds both data and functions to work on the same data
        - by design, Java is an object-oriented programming language
            - everyting is required to be associated with classes and objects
                - along with its attributes and methods
                - even a simple print requires a class and a method
        - main points of OOP
            - clearer structure to programming
            - focuses on the DRY principle
                - Don't Repeat Yourself
                    - implying that duplicate code must be reused
                    - helps in maintaining, reusing and debugging pieces of code
        - OOP focuses on object and classes
            - classes
                - a user-defined type
                - works as an object constructor
                    - serves as a blueprint for creating objects
                    - defines what an object should look like
            - objects
                - created based on the class
                - uses the "blueprints" provided by the class
                - inherits the attributes and methods of the class it is based on
                    - it becomes an instance of said class

    - Java classes
        - declaration and definition
            - to create a class, it is done though the class keyword
            - syntax:
                class <className> {
                    <statements>
                }
            - example:
                class MyClass {
                    int yes = "10";
                }
            - note that the name of the class must match the filename without extensions
                - e.g. since this file is called Classes.java, the class name must be Classes

        - class attributes
            - refer to Variables.java for variable declaration
            - variables declared inside a class are called attributes
                - if the variable is outside any methods
                - the variables will belong to the class, becoming attributes
            
            - accessing attributes
                - an attribute of a class is accessible in two ways
                    - static attributes 
                        - if the variable inside a class is static, it can be accessed directly
                        - syntax:
                            <className>.<classAttribute>;
                        - example:
                            // if; static int yes = 10;
                            MyClass.yes;                // 10
                    - non-static attributes
                        - if the variable has not been declared a static attribute, it must be accessed using an object
                        - syntax:
                            <className> <objectName> = new <className>();
                            <objectName>.<classAttribute>;
                        - example:
                            // if; int yes = 10;
                            MyClass myObj = new MyClass();
                            myObj.yes;                     // 10
                    - sidenote:
                        - even though static variables are able to be accessed using the non-static way, it is generally disadvised
                            - since static values share the same memory
                            - changing it will change the value of the same attribute across all objects
                - it is possible to change the value of each attribute
                    - static attributes 
                        - note that changing this type of value will change every instance of this attribute
                        - syntax:
                            <className>.<classAttribute> = <newValue>;
                        - example:
                            // if; static int yes;
                            MyClass.yes = 100;
                    - non-static attributes
                       - syntax:
                            <className> <objectName> = new <className>();
                            <objectName>.<classAttribute> = <newValue>;
                        - example:
                            // if; int yes;
                            MyClass myObj = new MyClass();
                            myObj.yes = 100;
                    - sidenote:
                        - like normal variables, the new value must match the type of the attribute
                            - an error will occur if a different type of value is assigned to an attribute
                        - non-static variables are different across objects
                            - changing an attribute of one object won't change the attribute of another
                            - unlike static values which shares the same memory

        - class methods
            - refer to Methods.java for method declaration
            - there are two ways to access methods
                - static methods
                    - static methods are able to be accessed directly
                        - without the creation of a class object
                    - syntax:
                        <className>.<classMethod>();
                    - example:
                        // if; public static void myMethod() {...} inside MyClass
                        // inside main()
                        MyClass.myMethod();
                    - sidenote:
                        - when inside the same class, it is possible to omit the class name
                            - syntax:
                                <classMethod>();
                            - example:
                                myMethod();
                - non-static methods
                    - non-static methods must be declared using an object
                    - syntax:
                        <className> <objectName> = new <className>();
                        <objectName>.<classMethod>();
                    - example:
                        // if; public void myMethod() {...} inside MyClass
                        // inside main()
                        MyClass myObj = new MyClass();
                        myObj.myMethod();
                        
            - the same syntax also applies when calling a class method with parameters
                - static methods
                    - syntax:
                        <className>.<classMethod>(<arguments>);
                    - example:
                        // if; public static void myMethod(int yes) {...} inside MyClass
                        // inside main()
                        MyClass.myMethod(10);
                    - sidenote:
                        - when inside the same class, it is possible to omit the class name
                            - syntax:
                                <classMethod>();
                            - example:
                                myMethod();
                - non-static methods
                    - non-static methods must be declared using an object
                    - syntax:
                        <className> <objectName> = new <className>();
                        <objectName>.<classMethod>(<arguments>);
                    - example:
                        // if; public void myMethod(float no) {...} inside MyClass
                        // inside main()
                        MyClass myObj = new MyClass();
                        myObj.myMethod(3.14);
                    
        - class constructor
            - a constructor is a special method in Java
                - it is a method that gets called when an object is created
                - it msut not contain any return types and return statements
            - it is used to initialize objects when creating a new instance of a class
            by default, the compiler creates a constructor when one hasn't been declared yet
                - the default constructor does nothing

            - declaration and definition
                - when creating a constructor, the name must match the class name
                - no return types must be present in a constructor, not even void
                - syntax: 
                    class <className> {
                        <className>() {
                            <statements>
                        }
                        <statements>
                    }
                - example:
                    class MyClass {
                        MyClass() {
                            System.out.println("idkman"); // gets called when a MyClass object is created
                        }
                    }

            - parameters and arguments
                - like in normal methods, it is possible to assign parameters to a constructor
                - syntax:
                    // declaring a constructor with parameters
                    class <className> {
                        <className>(<parameters>) {
                            <statements>
                        }
                        <statements>
                    }
                    // creating an object with arguments
                    <className> <objectName> = new <className>(<arguments>);
                - example:
                    class MyClass {
                        MyClass(String hello) {
                            System.out.println(hello);
                        }
                    }
                    // inside main()
                    MyClass myObj = new MyClass("idkman"); // "idkman" gets printed out

        - anonymous classes
            - a types of class that is created and used at the same time
            - it is mainly used to overide existing methods or attributes of a class or interface
                - without fully declaring a child class
            - use cases:
                - overriding a function without creating a new subclass
                - implementing an interface quickly
                    - on the fly, without creating a new class for it
                - passing small pieces of behavior as objects
            - syntax:
                class <className> {
                    <statement>
                }
                // inside a method
                <className> <objectName> = new <className>() {
                    <newStatements>
                }
            - example:
                class MyClass {
                    void myMethod() {
                        System.out.println("idkman");  // original functions
                    }
                }
                // inside a method
                MyClass myObj = new MyClass() {
                    void myMethod() {
                        System.out.println("lumbago"); // on the fly modification
                    }
                }
        - anonymous classes can also allow the creation of interface objects
            - note that the class must defines the abstract methods of the interface
            - example:
                interface MyInterface {
                    int returnSomething();
                }
                // inside a method
                MyInterface myObj = new MyInterface {
                    int returnSomething() {
                        return 0;                     // defines the abstract class
                    }
                }

    - nested classes
        - classes can exist within classes
        - the main purpose of nested classes is to gourp classes that belong together
        - inner classes are able to access the attributes and methods from the outer class

        - declaration and definition
            - similar to normal class declaration, but inside classes
            - syntax:
                <accessModifier >class <outerClassName> {
                    <statements>
                    <accessModifier> class <innerClassName> {
                        <statements>
                    }
                }
            - example:
                class MyClass {
                    int x;
                    class InnerClass {
                        void printStuff() {
                            System.out,println(x); // can access variables inside the outer class
                        }
                    }
                }
            - unlike outer classes, inner classes are able to be private or protected
                - example:
                    public class MyClass {
                        private class InnerClass {...}
                    }
                - note that private classes are only accessible inside the outer class
            
            - inner classes can also be static
                - meaning, the are able to be called without creating an object of the inner class
                - syntax:
                    <accessModifier> class <outerClassName> {
                        static class <innerClassName>
                    }
                - example:
                    public class MyClass {
                        public static class InnerClass {...}
                    }

        - accessing inner class
            - to access the innerclass, there two main ways
            - static inner classes
                - similar to static methods, accessing static classes are able to be done directly
                    - without creating an object of the innerclass
                - syntax:
                    <outerClassName>.<innerClassName> <objectName> = new <outerClassName>.<innerClassName>();
                    <objectName>.<attributeName>;
                    // or
                    <objectName>.<methodName>();
                example:
                    MyClass.InnerClass myObj = new MyClass.InnerClass();
                    myObj.lumbago;                                       // for attributes
                    // or
                    myObj.myMethod();                                    // for

            - non-static inner classes
                - to access these types of inner classes, an object must inherit the class' attributes and methods
                - syntax:
                    <outerClassName> <objectName> = new <outerClassName>();
                    <outerClassName>.<innerClassName> = <objectName>.new <innerClassName>();
                - example:
                    MyClass myObj = new MyClass();
                    MyClass.InnerClass myInnerObj = MyClass.new InnerClass();
                    myInnerObj.idkman;                                                       // for attributes
                    // or
                    myInnerObj.yes();                                                        // for methods             
    
        - multiple classes
            - it is possible to declare more than one clases in a program
            - note that each class must be inside their own .java file
                - having more than one public class will trigger a compilation error
                    - since classes must match the file name
                - with the exception of interfaces, child classes and enums
            - syntax:
                // first file
                public class <className1> {
                    <statements>
                }
                // second file
                public class <className2> {
                    <statements>
                }
            - example:
                // inside MyClass.java
                public class MyClass {
                    int x;
                }
                // inside MyOtherClass.java
                public class MyOtherClass {
                    // inside main()
                    MyClass myObj = new MyClass();
                    myObj.x;                       // valid
                }
            - note that the class must be declared public to be visible to other classes
                - without it, it will only be visible to classes in the current folder

        - enums
            - enums is short for enumerations
            - is a special type of class that store a group of constants
                - similar to enums for C/C++
                - similar to using the final keyword to multiple variables
            - enums and classes
                - enums can have attributes and methods just like classes
                    - the main difference is the default modifiers of those attributes and methods
                    - they are public, static and final
                - enums are not able to be used to create objects and cannot be used to extend other classes
                    - but it can be used to implement interfaces

            - declaration and definition
                - to declare an enum, the enum keyword is used
                    - similar syntax to classes and interfaces
                - syntax:
                    enum <enumName> {
                        <statements>
                    }
                - example:
                    enum MyEnum {
                        IDKMAN,
                        HELLO,
                        WORLD
                    }
                - enums are also able to be declared inside a class
                    - syntax:
                        class <className> {
                            enum <enumName> {...}
                        }
                    - example:
                        class MyClass {
                            enum MyEnum {...}
                        }
                - variables inside an enum can have descriptions (values)
                    - done by using parentheses next to the variables to describe
                    - syntax:
                        enum <enumName> {
                            <variable>(<value>)
                        }
                    - example:
                        enum MyEnum {
                            IDKMAN("lumbago"),
                            HELLO(100),
                            WORLD(true);
                        }
                    - note that trying to access the values of the enums will require a getter method
                - enums can also have constructors
                    - similar to classes, contructors are present inside enums
                    - enum constructors are called automatically when constants are created
                        - it cannot be called by the user
                    - they have the same syntax as normal class constructors
                    - syntax:
                        enum <enumName> {
                            <enumName> {...}
                        }

            - accessing enums
                - to access the variables and values of an enum
                    - the dot . syntax is used
                - syntax:
                    <enumName> <variableName> = <enumName>.<enumVariable>;
                - example:
                    MyEnum myObj = MyEnum.IDKMAN;

                - accessing the values of enums
                    - it is done by declaring a setter method and a declared constructor
                    - example of a full enum
                        enum MyEnum {
                            IDKMAN("lumbago"),
                            HELLO(100),
                            WORLD(true);

                            private String idkman;
                            private int hello;
                            private boolean world;

                            MyEnum(String idkman) { this.idkman = idkman; }
                            MyEnum(int hello) { this.hello = hello; }
                            MyEnum(boolean world) { this.world = world; }

                            public String getLumbago() { return idkman; }
                            public int getHello() { return hello; }
                            public boolean getWorld() { return world; }
                        }

                        public static void main(String[] args) {
                            MyEnum myObj = MyEnum.IDKMAN;
                            myObj;                                         // IDKMAN
                            myObj.getLumbago();                            // lumbago
                        }
                    - enums are commonly used inside switch-case statements
                        - example:
                            // inside a method
                            MyEnum myObj = MyEnum.IDKMAN;
                            switch (myObj) {
                                case "lumbago":
                                    break;
                                case 100;
                                    break;
                                case true;
                                    break;
                            }
                    - enums have a special method called .values()
                        - it is possible to use enums as iterables
                        - example:
                            MyEnum.values(); // constants inside MyEnum

        - this keyowrd
            - 'this' refers to the current instance of an object through a method or constructor
            - used to avoid confusion when class attributes and parameters have the same name

            - accessing class attributes
                - uses when the parameters has the same name as class attributes
                    - syntax:
                        this.<classAttribute>;
                    - example:
                        int c;
                        void idkman(c) {
                            this.c = c;
                        }

            - calling a construtor inside another constructor
                - uses the this() method call
                - similar to the overloading concept
                - it must be declared at the beginning of a constructor
                - syntax:
                    <className> (
                        this();
                    }
                - example:
                    class Yes {
                        Yes() {
                            this("idk");
                        }
                        Yes(String yes) {
                            this();
                        }
                    }

        - super keyword 
            - refers to the parent class of the subclass
            - it is used to eliminate the confusion between superclasses and subclasses
                - if they have methods with the same name
            - it is also used to access the attributes of the parent class
                - including the constructor of the parent class
            
            - access superclass methods
                - if the subclass has a method with the same name as the parent class
                    - usually when overloading, or Polymorphism
                    - the super keyword calls the method of the superclass
                - syntax:
                    super.<methodName>();
                - example:
                    super.myMethod();

            - access superclass attributes
                - same syntax as accessing superclass methods
                - syntax:
                    super.<attributeName>;
                - example
                    super.idkman;

            - access parent constructor
                - the super() method calls the parent constructor
                    - useful for reusing initializing code
                - it must be at the beginning of the subclass constructor
                - syntax and example:
                    super()

    - Java objects
        - to create an object, it must become an instance of a class
            - objects use the new keyword followed by the class they are becoming an object of
        - syntax:
            <className> <objectName> = new <className>();
        - example:
            // inside main()
            MyClass myObj = new MyClass();
        - it is possible to declare more than one instance of a class
            - example:
                // inside main()
                MyClass idk = new MyClass();
                MyClass man = new MyClass();

    - Encapsulation 
        - ensures that sensitive data are hidden from users
            - any important values are hidden to prevent data leaks
        - encapsulation is achieved through access modifiers
            - mainly the private access modifier
        - to access and retrieve private data, certain methods are created and used
            - these are getter and setter method
        - why Encapsulation?
            - it provides better control of classes, mathods, and attributes
                - read-only through the getter method
                - write-only through the seeter method
            - increases security and flexibility
                - parts of code can be changed without compromising others

        - modifiers 
            - in Jave, there are two types of modifiers
                - access modifiers
                    - these modfiers controls the access level of code
                    - prevents unwanted access of private data

                    - class modifiers
                        - public
                            - makes the class accessible to other classes in other folders
                            - syntax:
                                public class <className> {...}
                            - example:
                                public class MyClass {...}
                        - default
                            - no declaration
                            - makes the class inaccessible to other class in other foldeers
                            - syntax:
                                class <className> {...}
                            - example:
                                class MyClass {...}
                        - example:
                            root
                             |--> main
                             |     |--> Main.java   // public class
                             |     \--> Backup.java // no public declaration
                             \--> other
                                   \--> Other.java  // can access Main.java (since public class Main)
                                                    // can't access Backup.java (since class Backup) 

                    - class attribute, method and constructor modifiers
                        - public
                            - the code is acceeible everywhere
                            - in the same class, package (folder), child classes, or anywhere
                        - protected
                            - in between public and private
                            - the code is accessible in the same class, package (folder) or child classes
                                - note that in other packages, it is accessible via inheritance
                        - default
                            - default declaration when no access modifier is specified
                            - no declaration
                            - the code is accessible in the same class, and package (folder)
                        - private
                            - the code is practically hidden from the outside
                            - it is only accessible in the same class
                
                - non-access modifiers
                    - it is used to add features to classes, methods and attributes
                    - class non-access modifiers
                        - final
                            - ensures that the class is not inheratble
                            - prevents child classes from inheriting from it
                            - it is still possible to create objects with it
                        - abstract
                            - refer to Abstaction
                            - declares the class a "blueprint"
                            - it is not possible to create objects with this type of class
                    - methods
                        - final
                            - ensures that the method is unchanging
                            - any attemps to override it through child classes will return errors
                            - it is still possible to call these methods
                        - static
                            - makes the method belong to the class
                                - not to any instance objects
                            - can only be called directly
                                - refer to static class methods
                            - technically can still be called using the non-static way
                                - but is generally unadvised to do so
                        - abstract
                            - abstract methods can only exist inside abstract classes
                                - declaring it ouside leads to compilation erros
                            - any inheriting class must define abtract classes
                                - failure to do so leads to compilation erros
                    - attributes
                        - final
                            - ensures that the attribute value cannot be chaanges
                            - any attempts will lead to compilation errors
                            - it is still possible to use these attributes, just not being able to change their values
                        - static
                            - makes the value belong to the class
                                - not to any instance objects
                            - can only be called directly by using the className
                                - syntax:
                                    <className>.<classAttribute>;
                            - technically can still be accessed by objects
                                - changing values to a static attribute is generally unadvised
                                - static attributes share the same memory
                                    - changing its value will chnage the value of the attribute to every instance objects
                    
        - getter and setter methods
            - to access and modify private attributes of a class, getter and setter methods are used
            - since private attributes are accessible inside the same class
                - other methods or attributes from the same class can influence it
            - set methods
                - sets the value of a private attribute
                - example:
                    // inside a class
                    private int myNum;                 // private value, cannot be modified from the outside
                    public void setValue(int newNum) { // setter method
                        myNum = newNum;                // sets the value using a parameter variable
                    }
                    // inside a method
                    setValue(10);                      // set the value of the private attribute through the setter method
            - get methods
                - retrieves the value of a private attribute
                - example:
                    // inside a class
                    private String idkman = "lumbago"; // private value, cannot be accessed fron the ourside
                    public String getValue {           // getter method
                        return idkman;                 // retrives the value using the return statement
                    }
                    // inside a method
                    getValue();                        // receives the value of the private attribute through the getter method
                        
    - Inheritance
        - allows child classes to reuse attributes from the parent class
        - prevent duplication of the same methods
            - allows reusing it without redeclaring the same methods
        - sidenote:
            - unlike C++, Java does not support multiple inheritance
                - i.e. no support for inheriting multiple classes at once
                - it is only available through multiple implementation of interfaces
                    - refer to Abstraction
        - inheritance is grouped into two categories
            - superclass
                - also known as the parent class or the base class
                - it is where the child class inherits from
            - subclass
                - also knows as the child class or the derived class
                - it is what inherites from the parent class

        - declaration and definition
            - in Java, inheritance is done through the extends keyword
            - syntax:
                class <subclassName> extends <superclassName> {...}
            - example:
                class parentClass {
                    int x;
                }
                class childClass extends parentClass {
                    x = 10;
                }
            - note that the protected access modifier provides a way to access variables as if they were public
                - but maintains the security of a private variable by disallowing access from the outside of the class
                - example:
                    class MyClass {
                        protected String yes = "idkman";
                    }
                    class ChildClass extends MyClass {
                        System.out.println(yes);
                    }
            - to prevent inheritance, the class must be declared with the final keyord
                - example:
                    final class Idkman {
                        int x;
                    }
                    class Yes extends Idkman {...} -> Error
                - refer to access modifiers

    - Polymorphism
        - means "many forms"
        - occurs when multiple classes that are related through inheritance
        - it uses the same methods to perform different tasks
        - method overloading is a form of polymorphism
        - syntax:
            class <superclassName>() {
                <staticOrDefault> <returnType> <methodNName> () {...}
            }
                class <subclassName1>() {
                <staticOrDefault> <returnType> <methodNName> () {...}
            }
                class <subclassName2>() {
                <staticOrDefault> <returnType> <methodNName> () {...}
            }
                class <subclassName3>() {
                <staticOrDefault> <returnType> <methodNName> () {...}
            }
        - example:
            class MyClass() {
                void idkman() {
                    System.out.println("idkman");
                }
            }
            class ChildClass1 extends MyClass {
                void idkman() {
                    System.out.println("Hello");
                }
            }
            class ChildClass2 extends MyClass {
                void idkman() {
                    System.out.println("World");
                }
            }
            class ChildClass extends MyClass {
                void idkman() {
                    System.out.println("lumbago");
                }
            }
            // all posses the same methods but have different purposes

    - Abstraction
        - is the process of hiding cetain details and showing only essential information to the user
        - it is possible through the use of abstract classes or interfaces

        - abstracts
            - is a non-access modifier, used in classes to create abstract classes and methods
            - abstract classes
                - is a restricted version of a class that cannor bt used to create new objects
                    - trying to create an object from an abstract class results in errors
                - syntax:
                    abstract class <abstractClassName> {
                        <abstractStatements>
                    }
                - example:
                    abstract class AbstractClass {
                        abstract void myMethod() {...}
                    }
                - it is only accessible through another class inheriting from it
                    - syntax:
                        class <className> extends <abstractClassName> {...}
                    - example:
                        class MyClass extends AbstractClass {...}
            - abstract methods
                - methods that can only be declared inside of abstract classes
                - it has no body, only defined by the subclass that inherites the abstract class it is inside of
                - syntax:
                    // inside an abstract class
                    <accessModifier> abstract <methodName>();
                - example:
                    // inside an abstract class
                    protected abstract myMethod();

        - interfaces
            - another way to achieve abstraction in java, done through the use of the interface keyword
            - an interface is a complete "abstract class"
                - meaning it only consists of methods with no bodies
                    - or methods that has not been defined yet
            - like abstract class, interfaces cannot be used to create objects
                - and cannot be declared to contain a constructor
                - objects can inherit from interfaces only through anonymous classes
            
            - interface
                - to create intefaces, it is done through the use of the interface keyword
                - trying to define methods bodies inside of interfaces will result in errors
                    - only the implement class can define method bodies
                - by default, the modifiers of an interface are public, static and final
                - syntax:
                    interface <interfaceName> {
                        <abstractDeclaration>
                    }
                - example:
                    interface InterfaceClass {
                        public void idkman();
                    }

            - implements
                - to inherit from interfaces, it is done through the use of the implements keyword
                - it bears similar syntax with the extends keyword
                - syntax:
                    class <className> implements <interfaceName> {...}
                - example:
                    class MyClass implements InterfaceClass {...}
                - sidenote:
                    - classes that inherits from an interface must define all methods that were declared inside the interface
                        - failure to do so will result to a compilation error

            - multiple interfaces
                - unlike normal classes which do not support multiple inheritances
                    - multiple interfaces are able to be implemented into a single class
                - to inherit multple interfaces, it is done by using the comma ,
                - syntax:
                    class <className> implements <interfaceName1>, <interfaceName2> {..,}
                - example:
                    class MyClass implements Idkman, Lumbago
                - sidenote:
                    - like normal implementation of interfaces
                        - it is required to define the methods that were declared inside the interfaces


*/

public class Classes {

}

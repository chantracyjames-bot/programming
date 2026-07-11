# classes
#   - Object-Oriented Programming
#       - focuses on dealing with objects that holds both data and functions to work on the same data
#           - everything is required to be associated with classes and objects
#       - main points of OOP
#           - clearer structure to programming
#           - focuses on the DRY principle
#               - Don't Repeat Yourself
#                   - implying that duplicate code must be reused
#                   - helps in maintaining. reusing and debugging pieces of code
#           - OOP focuses on objects and classes
#               - classes
#                   - a user-defined type
#                   - works as an object constructor
#                       - serves as a blueprint for creating objects
#                       - defines what an object should look like
#               - object
#                   - created based on the class
#                   - uses the "blueprints" provided by the class
#                   - inherits the attributes and methods of the class it is based on
#                       - it becomes an instance of the class
#
#   - Python classes
#       - definition and declaration
#           - to create a user-defined class, the class keyword is used
#           - syntax:
#               class <class_name>:
#                   <statements>
#           - example:
#               class MyCLass:
#                   idkman = 'lumbago'
#
#       - __init__() method
#           - also known as a class constructor
#           - is a built in method in Python
#               - it is method that gets called when the class is being initiated
#               - or when object instance of a class is being created
#           - it is used to initialize object properties or perform operations that are when the class is called
#               
#           - declaration and definition
#               - when declaring a class constructor, it must use the __init__() method name
#               - syntax:
#                   class <class_name>:
#                       def __init__():
#                           <statements>
#               - example:
#                   class MyClass:
#                       def __init__():
#                           print('lumbago')
#
#           - paramethers and arguments
#               - like normal methods, it is possible to assign parameters to a constructor
#               - syntax:
#                   class <class_name>:
#                       def __init__(<parameters>):
#                           <statements>
#               - example:
#                   class Idkman:
#                       def __init__(self, lumbago):
#                           self.lumbago = lumbago
#               - self
#                   - a reference to the current instance of the class or object of the class
#                       - used to access attributes and methods that belongs to that particular object instance
#                       - without it, Python won't know what attribute is being accessed
#                   - the self parameter is the most important parameter in a class
#                       - it is used to initialize variables during the object creation
#                       - it must be the first parameter when declared
#                       - can be named as anything
#                           - self is preferred by convention
#                   - it is possible to call attributes and methods using the self parameter
#                   - example:
#                       #> with __init__() and self
#                       class TestClass:
#                           def __init__(self, idkman):
#                               self.idkman = idkman    #> creates and object and initializes the idkman variable
#                       
#                       my_obj = TestClass("lumbago")   #> auto initializes idkman with "lumbago"
#                       
#                       #> without __init__() and self
#                       class TestClass:
#                           pass
#                   
#                       my_obj = TestClass()
#                       my_obj.idkman = "lumbago"       #> have create the object attribute manually
#               - default variables as parameters
#                   - similar to normal methods, it is possible to pre-assign values to parameters
#                       - objects are able to be created without assigning the pre-assigned attribute
#                       - assigning it will override the default value
#                   - syntax:
#                       class <class_name>:
#                           def __init__(self, <variable> = <value>):
#                               self.<variable> = <variable>
#                   - example:
#                       class HelloWorld:
#                           def __init__(self, hello, world = 'idkman'):
#                               self.hello = hello
#                               self.world = world
#                   
#                       my_obj = HelloWorld('yes', 'maybe') #> overriding the default value
#                       my_other_obj = HelloWorld('no')     #> using the default value
#
#       - class properties
#           - similar to attributes in Java
#           - refers to the variables that a class possesses
#               - variable in a class become properties or attributes of the class
#           - accessing properties
#               - in Python, there are to types of properties
#               - class properties
#                   - similar to static class attributes in Java
#                   - every single instance object share the same class attribute
#                   - example:
#                       class YesNo:
#                           idkman = 'lumbago' #> class property
#                   
#                       hello = YesNo()
#                       world = YesNo()
#                       hello.idkman           #> 'idkman'
#                       world.idkman           #> 'idkman'
#                                              #> shares the same property
#                   - modifying value will be shared by all object instance
#                       - only if the class is being modified
#                           - example:
#                               YesNo.idkman = 'maybe'
#                               world.idkman           #> maybe
#                               hello.idkman           #> maybe
#                       - modifying the vakue using an object will make that class property be an object property
#                           - it becomes part of the object rather than the class
#                           - the value of that property will be unique to that object
#                           - example:
#                               world.idkman = 'yes'
#                               hello.idkman         #> 'lumgao'
#                                                    #> retains the class property value 
#                       - deleting the value will delete the class property
#                           - trying to access it after being deleted will case an error
#                           - example:
#                               del hello.idkman
#                               world.idkman     #> causes an error
#               - object properties
#                   - similar to non-static attributes in Java
#                   - every single instance object have unique object properties
#                   - example:
#                       class Lumbago:
#                           def __init__(self, idkman):
#                               self.idkman = idkman    #> creates a 'unique' property for the object
#               
#                       hello = Lumbago('Hello')
#                       world = Lumbago('World')
#                       hello.idkman                    #> 'hello'
#                       world.idkman                    #> 'world'
#                                                       #> doesn't share the same property
#                   - modifying the value retains the uniqueness of other object instances
#                       - example:
#                           hello.idkman = 'yes'
#                           world.idkman         #> 'world'
#                                                #> still holds the same value
#                       - deleting the value won't cause an error
#                           - example:
#                               del world.idkman
#                               hello.idkman     #> 'yes'
#                   - unlike class properties, it is possible to add new object properties
#                       - it is unique to the object instance, it cannot be accessed by other objects
#                       - example:
#                           world.new_var = yes
#                           hello.new_var       #> causes an error
#
#       - class methods
#           - similar to normal functions
#           - refer to methods for normal method declaration
#           - declaration and definitiom:
#               - static methods
#                   - functions that belong to a class
#                       - non-unique to any object
#                   - requires the staticmethod decorator
#                   - syntax:
#                       class <class_name>:
#                           @staticmethod
#                           def <method_name>():
#                               <statements>
#                   - example:
#                       class Lumbago:
#                           @staticmethod
#                           def idkman():
#                               print('worldhello')
#               - non-static methods
#                   - functions that belong to a class
#                       - defining the behavior of objects created from the same class
#                   - syntax:
#                       class <class_name>:
#                           def <method_name>():
#                               <statements>
#                   - example:
#                       class MyClass:
#                           def my_method():
#                               print('idkman')
#               - class methods can contain parameters
#                   - static methods
#                       - syntax:
#                           class <class_name>:
#                               @staticmethod
#                               def <method_name>():
#                                   <statements>
#                       - example:
#                           class Yes:
#                               @staticmethod
#                               def no():
#                                   print('maybe')
#                   - non-static methods
#                       - syntax:
#                           class <class_name>:
#                               def <method_name>(self, <parameters>):
#                                   <statements>
#                       - example:
#                           class MyClass:
#                               def my_method(self, idkman):
#                                   print('lumbago')
#                   - note that all methods must contain self as the first parameter
#                       - using self will enable the method to access any properties of the current object instance
#                       - methods are able to directly modify the properties provided by self
#                           - example:
#                               class MyClass:
#                                   def __init__(self, yes):
#                                       self.yes = yes
#                                   def my_method(self):
#                                       yes = 'idkman'
#               - classes can contain multiple methods 
#                   - example:
#                       class MyClass:
#                           def idkman():
#                               pass
#                           def maybe():
#                               pass
#                           def lumbago():
#                               pass
#               - __str__()
#                   - similar to __init__()
#                       - that being a dunder method
#                   - commonly used to modify the string value when trying to print a property of an object
#                   - syntax:
#                       class <class_name>:
#                           def __str__(self, <parameters>):
#                               <statements>
#                               return <expression>
#           - access and calls
#               - to access methods, there are two ways
#               - static methods
#                   - can be accessed directly
#                   - without using an object
#                   - syntax:
#                       <class_name>.<method_name>()
#                   - example:
#                       MyClass.my_method()
#               - non-static methods
#                   - requires an object to access methods
#                   - syntax:
#                       <object_name>.<method_name>()
#                   - example:
#                       my_obj = MyClass()
#                       my_obj.my_method()
#               - methods are able to be deleted using the del keyword
#                   - syntax:
#                       #> static methods
#                       del <class_name>.<method_name>
#                       #> non-static methods
#                       del <object_name>.<method_name>
#
#           - nested classes
#               - classes can exist within classes
#               - the main purpose of nedted classes is to group classes that belong together
#               - inner classes are able to access the properties and methods from the outer classes
#               
#               - declaration and definition
#                   - similar to declaring normal classes but done inside of one
#                   - syntax:
#                       class <outer_class_name>:
#                           class <inner_class_name>:
#                               <statements>
#                   - example:
#                       class OuterClass:
#                           class InnerClass
#                               pass
#                   - by default, inner clases don't have access to the properties and methods ofthe outer class
#                       - however, it is possible to access it by creating an object of the outer class inside the inner class
#                       - there are two ways:
#                           - static elements
#                               - example:
#                                   class Yes:
#                                       my_var = 'yes'
#                                       class No:
#                                           Yes.my_var
#                           - non-static
#                               - works by passing self into the inner class
#                               - example:
#                                   class Outer:
#                                       def __init__(self, yes):
#                                           self.yes = yes
#                                           self.inner = self.Inner(self)
#                                       class Inner:
#                                           def __init__(self, outer_self):
#                                               self.outer = outer_self
#
#               - accessing inner classes
#                   - to access an inner class, an object of the outer class must first be created
#                   - syntax:
#                       <object_name1> = <class_name>(<arguments>)
#                       <object_name2> = <object_name1>.<inner_class_name>(<arguments>)
#                   - example:
#                       my_outer = OuterClass()
#                       my_inner = my_outer.InnerClass()
#
#   - Python objects
#       - declaration
#           - to create an object, it must become an instance of a class
#           - syntax:
#               <object_name> = <class_name>()
#           - example:
#               my_obj = MyClass()
#           - it is possible to declare more than one instance of a class
#               - example:
#                   idk = MyClass()
#                   man = MyClass()
#       - deletion
#           - to remove or delete a class, the del keyword is used
#           - syntax:
#               del <object_name>
#           - example:
#               del my_obj
#
#   - Inheritance
#       - allows child classes to reuse properties from the parent class
#       - prevents the duplication of the same methods
#           - allows reusing without redeclaring the same methods
#       - inheritance is grouped into two categories
#           - parent class
#               - also known as the superclass or the base class
#               - it it where the child class inherits from
#           - child class
#               - also knows as the subclass or the derived class
#               - it is what inherits from the parent class
#
#       - declaration and definition
#           - in Python, inheritance is done by enclosing the parent class in parentheses
#               - right next to the name of the child class
#           - syntax:
#               class <child_class_name>(<parent_class_name>):
#                   <statements>
#           - example:
#               class ChildClass(ParentClass):
#                   pass
#           - by default, when the __init__() method is not declared in the child class
#               - it uses the __init__() method of the parent class
#                   - this is due to it inheriting every method including the constructor method
#               - declaring another __init__() method overrides parent class' __init__() method
#               - syntax:
#                   class <child_class_name>(<parent_class_name>):
#                       def __init__(self, <parameters>):
#                           <statements>
#               - adding the parent's __init__() method will complete the inheritance
#                   - without it, it loses access to the properties of the parent class
#                   - syntax:
#                       class <child_class_name>(<parent_class_name>):
#                           def __init__(self, <parameters>):
#                               <parent_class_name>.__init__(self, <parameters>)
#                   - example:
#                       class ChildClass(ParentClass):
#                           def __init__(self, yes, no):
#                               ParentClass.__init__(self, yes, no)
#           - super()
#               - lets the child inherit all properties and methods from its parent class
#               - replaces the <parent_class_name>.__init__() method of inheiting
#               - syntax:
#                   class <child_class_name>(<parent_class_name>):
#                       def __init__(self, <parameters>):
#                           super().__init__(<parameters>)
#               - example:
#                   class ChildClass(ParentClass):
#                       def __init__(self, yes):
#                           super().__init__(yes)
#           - child classes can declare their own properties and methods
#               - the parent class won't have access to new properties or methods declared by the child class
#               - example:
#                   class MyClass(ParentClass):
#                       def __init__(self, no, idkman):
#                           super().__init__(no):
#                           #> new property
#                           self.idkman = idkman
#                       #> new method
#                       def my_method(self):
#                           print('probs')
#
#   - Polymorphism
#       - means "many forms"
#       - occurs when multiple classes that are related through inheritance
#       - multiple functions or methods havivng the same name but perform different tasks
#       - overloading is a form of polymorphism
#       - syntax:
#           class <superclass_name>:
#               def <method_name>(<parameters>):
#                   <statements>
#           class <subclass_name1>:
#               def <method_name>(<parameters>):
#                   <statements>
#           class <subclass_name2>:
#               def <method_name>(<parameters>):
#                   <statements>
#           class <subclass_name3>:
#               def <method_name>(<parameters>):
#                   <statements>
#       - example:
#           class MyClass:
#               def my_method(self):
#                   print('idkman')
#           class Yes(MyClass):
#               def my_method(self):
#                   print('lumbago')
#           class No(MyClass):
#               def my_method(self):
#                   print('hello')
#           class Maybe(MyClass):
#               def my_method(self):
#                   print('world')
#           #> all classses possesses the same methods but have different purposes
#       - child classes are considered as polymorphism
#           - they inherit the methods and properties of their parent class
#           - child classes can use the same methods as the parent class
#           - child classes can also override the parent's methods
#
#   - Encapsulation
#       - ensures that sensitive data are hidden from users
#           - any important value are hidden to prevent data leaks
#       - encapsulation is achieved through access modifiers
#       - to access and retrive private datam certain methods are created and used
#           - these are getter and setter methods
#       - why Encapsulation?
#           - it provides better control of classes, methods, and properties
#               - read-only for getter methods
#               - write-only for setter methods
#           - increases security and flexibility
#               - parts of code can be changed without compromising others
#           - better data protection and validation
#               - prevents accidental modification of private data and better validation
#
#       - access modifiers
#           - public / default
#               - properties and methods are able to be accessed outside the class
#                   - either directly or through objects
#               - no special declaration, properties are public by default
#               - syntax:
#                   class <class_name>:
#                       #> static properties
#                       <variable_name1>
#                       #> non-static method
#                       def <method_name1>(<parameters>):
#                           #> non-static properties
#                           self.<variable_name2>
#                       #> static method
#                       @staticmethod
#                       def <method_name2>(<variables>):
#                           <statement>
#               - example:
#                   class MyClass:
#                       #> static properties
#                       maybe = 'yes'
#                       #> static method
#                       @staticmethod
#                       def static_method(self):
#                           pass
#                       #> non-static method
#                       def idkman(self):
#                           #> non-static properties
#                           self.probs = 'no'
#                   
#                   #> accessing public properties and methods
#                   #> static elements
#                   MyClass.static_method()
#                   MyClass.maybe
#                   #> non-static methods
#                   lumbago = MyClass()
#                   lumbago.idkman()
#                   lumbago.probs
#           - protected
#               - Python does not have a "protected" syntax like Java and C++
#               - by convention, having a single underscore _ before the name denotes a variable is protected
#                   - it means that the properties and methods must stay inside the class
#                   - while controlling how data can be accessed from the outside
#               - elements are still accessible outside
#               - syntax:
#                   class <class_name>:
#                       #> static properties
#                       _<variable_name1>
#                       #> non-static method
#                       def _<method_name1>(<parameters>):
#                           #> non-static properties
#                           self._<variable_name2>
#                       #> static method
#                       @staticmethod
#                       def _<method_name2>(<variables>):
#                           <statement>
#               - example:
#                   class MyClass:
#                       #> static properties
#                       _maybe = 'yes'
#                       #> static method
#                       @staticmethod
#                       def _static_method(self):
#                           pass
#                       #> non-static method
#                       def _idkman(self):
#                           #> non-static properties
#                           self._probs = 'no'
#                   
#                   #> accessing public properties and methods
#                   #> static elements
#                   MyClass.static_method()
#                   MyClass.maybe
#                   #> non-static methods
#                   lumbago = MyClass()
#                   lumbago.idkman()
#                   lumbago.probs
#           - private
#               - elements are completely inaccessible from outside the class
#                   - only through getter and setter methods
#               - declared using two underscores before the name __
#                   - triggers name mangling
#               - name mangling
#                   - declaring an element name with a double underscore __ prefix before it triggers name mangling
#                   - renaming the element by adding a _<class_name> prefix before the name
#                   - private methods are tecnically accessible via the "mangled" name but is unadvised
#                   - example:
#                       class Yes:
#                           __my_var
#                           #> becomes
#                           _Yes__my_var
#               - syntax:
#                   class <class_name>:
#                       #> static properties
#                       __<variable_name1>
#                       #> non-static method
#                       def __<method_name1>(<parameters>):
#                           #> non-static properties
#                           self.__<variable_name2>
#                       #> static method
#                       @staticmethod
#                       def __<method_name2>(<variables>):
#                           <statement>
#               - example:
#                   class MyClass:
#                       #> static properties
#                       __maybe = 'yes'
#                       #> static method
#                       @staticmethod
#                       def __static_method(self):
#                           pass
#                       #> non-static method
#                       def __idkman(self):
#                           #> non-static properties
#                           self.__probs = 'no'
#                   
#                   #> accessing public properties and methods
#                   #> static elements
#                   MyClass.static_method() -> Error
#                   MyClass.maybe           -> Error
#                   #> non-static methods
#                   lumbago = MyClass()
#                   lumbago.idkman()        -> Error
#                   lumbago.probs           -> Error
#
#       - getter and setter methods
#           - to access and modify private properties of a class, getter and setter methods are used
#           - since private properties are accessible inside the class
#               - other methods or properties from the same class can influence it
#           - setter methods
#               - sets the value of a private property
#               - example:
#                   class MyClass:
#                       __my_var = None      #> private property, cannot be modified from the outside
#                       def set_var(maybe):  #> setter method
#                           __my_var = maybe #> sets the value using a parameter
#
#                   MyClass.set_var(10)      #> sets the private property through the setter method                  
#           - getter methods
#               - retrives the value of a private property
#               - example:
#                   class MyClass:
#                       __my_var = 'yes'    #> private property, cannot be accessed from the outside
#                       def get_var():      #> getter method
#                           return __my_var #> retieves the value
#
#                   MyClass.get_var()       #> 'yes'
#                                           #> retrieves the private property through the setter method   
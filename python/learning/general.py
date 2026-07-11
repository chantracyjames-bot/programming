# general
#   - syntaxes
#       - statements
#           - a statement is a single (or multiple) line of code doing once particular task
#               - i.e. initializing a variable, declaring a loop, a function, etc.
#           - unlike C/C++, Java or similar languages, Python doesn't need a semicolon to end statements
#               - it is still possible to use semicolons but it is generally unadvised
#               - semicolons are used to chain multiple statements in a single line
#                   - example:
#                       m = 10; n = 'Hello'; yes = False
#               - it is not recommended due to it not being the Pythonic way to code
#                   - it can also make code unreadable
#       - indentation
#           - Python requires indents for compound statements to run
#               - statements like a loop, coditional, function declaration, etc.
#           - compound statements without indents will throw an error
#               - called 'IndentationError'
#           - a compound statement requires a colon to be considered as one
#           - example:
#               while (true):    #> colon signifies a compound statement
#                   print("yes") #> substatements must be indented
#       - case-sensitive
#           - Python is case-sensitive when it comes to naming
#           - true and True are different things
#       - numbers and strings
#           - declaration
#               - text in python must be wrapped in either single or double quotes
#                   - single quotes ' '
#                   - double quotes " "
#                   - example:
#                       my_string = 'Hello World'
#                       idkman = "lumbago"
#               - numbers in python don't need to be incased in quotes
#                   - doing so will convert them into string
#                   - example:
#                       my_num = 100
#                       yes = 1
#           - concatenation
#               - numbers and string cannot be added together through the use of the addition + operator
#                   - doimg so results into a TypeError
#               - f-strings are design to circumvent this
#           - f-strings
#               - a type of string that is formatted
#               - replaces the old .format() method
#               - declaration:
#                   - to declare an f-string, the letter "f" must be the prefix of a string literal
#                       - syntax:
#                           f'<value>'
#                           #> or
#                           f"<value>"
#                       - example:
#                           f'yes and yes'
#                           #> or
#                           f"idkman"
#                   - to add other variable or elements to form a string
#                       - they must be enclosed in curly braces { }
#                           - these are commonly called as placeholders
#                       - operation are able to declared inside placeholders
#                           - it allows adding, multiplying, etc.
#                           - it also allows conditional statements
#                               - mainly the shorthand if else statements
#                           - function and method executions are also allowed
#                       - syntax:
#                           f'{<value>}'
#                           #> or
#                           f"{<value>}"
#                       - example:
#                           f'the sum is: {10 + 10}'
#                           #> or
#                           f"{100} is my number"
#                   - string modifiers are possible in f-strings
#                       - a colon : suffix must be declared in the variable
#                       - syntax:
#                           f'{<variable>:<modifiers>}'
#                           #> or
#                           f"{<variable>:<modifiers>}"
#                       - example:
#                           f'pi is {3.141592:f}' #> pi is 3.14
#                           #> or
#                           f"{'idkman':10s yes}" #> idkman    yes
#
#   - naming conventions
#       - there are industry convention when naming certain elements in Python
#       - attributes and variables
#           - usually in snake_case
#           - example:
#               my_string = "idkman"
#               my_bool = True
#       - functions and methods
#           - usually in snake_case
#           - example:
#               my_method()
#               sum_result()
#       - filenames and folders
#           - usually in snake_case
#           - example:
#               my_program.py
#               odd_or_even.py
#       - classes and enumerations
#           - usually in PascalCase
#           - example:
#               MyClass()
#               InventoryClass()
#       - constants and enum values
#           - usually in SCREAMING_SNAKE_CASE
#           - note that Python does not have a constant keyword
#               it is by convention to name unchanging values in SCREAMING_SNAKE_CASE
#           - example:
#               CONSTANT_VAR = "immutable"
#               SUNNY_DAY
#
#   - scope
#       - by default, the compiler (or interpreter) reads code from top to bottom
#           - first line until the last line of the file
#       - calling a variable that is not defined until later in the code will throw an error
#       - example:
#           print(sum)    -> Error
#           sum = 10 + 10 #> sum is decalred later
#       - Python uses the LEGB rule
#           - Local
#               - inside the current function or compound statement
#           - Enclosing
#               - inside the enclosing function or nested statement
#           - Global
#               - at the top level or lowest level indentation
#           - Built-in
#               - uses Python's namespace
#               - built-in functions
#       - local variables
#           - if the variables are declared inside a user-defined function or method
#               - the variable/s created is/are a local variable
#           - example:
#               def my_function():
#                   x = 100        #> declared inside a local function
#                   print(x)       #> 100
#               print(x)           -> Error
#                                  #> it doesn't see x
#       - global variables
#           - it is possible to declare a variable as global even if its located locally
#               - it uses the global keyword
#           - syntax:
#               glocal <variable>
#           - example:
#               def my_function():
#                   global x
#                   x = 10
#               print(x)           #> 10
#
#   - Python keywords
#       - global
#           - declares the variable as global
#               - creates the variable if it doesn't exist
#           - usually is unadvised to use 
#               - passing arguments are preferred
#           - syntax:
#               global <variable_name>
#               <variable_name> = <value>
#           - example:
#               yes = 10
#               def my_function():
#                   global yes
#                   yes = 100
#       - nonlocal
#           - lets the variable be assessible by the outer function
#           - will fail if the variable doesn't exist
#           - syntax:
#               nonlocal <variable_name>
#               <variable_name> = <new_value>
#           - example:
#               def my_outer():
#                   x = 10
#                   def my_inner():
#                       nonlocal x
#                       x = "no"
#       - del
#           - similar to the .remove() method
#           - removes the pointer associated with the variable
#               - renders the variable name useless
#           - syntax:
#               del <variable_name>
#           - example:
#               del x
#           - can also be used to remove elements in a list of tuple
#               - syntax:
#                   del <list_name>[<index>]
#               - example:
#                   del my_list[1]
#       - pass
#           - allows stataments to be declared with empty blocks of codes
#               - useful for placeholder code
#           - bypasses the IndentationError
#               - syntax:
#                   #> inside an empty statement
#                   pass
#               - example:
#                   def empty_func():
#                       pass
#       - def
#           - used to create user-defined functions
#           - refer to methods
#           - syntax:
#               def <method_name>():
#           - example:
#               def my_func():
#       - yield
#           - used to pause functions
#           - generally used in generator functions
#               - refer to generator functions
#           - syntax:
#               #> inside a generator function
#                   yield <value>
#           - example:
#               def my_generator():
#                   yield 10
#
#   - escape sequences
#       - \n
#           - the most common escape sequence
#           - represents a new line
#       - \t
#           - represents a horizontal tab rule
#       - \\
#           - represenst a single backslash as text
#       - \"
#           - represents a single double quote as text
#       - \'
#           - represents a single single quote as text
#       - \b
#           - represenst a single backspace
#       - \r
#           - represents a Carriage Return
#       - \f
#           - represents a Form Feed
#       - \ooo
#           - represents an octal value
#       - \xhh
#           - represents a hex value

print("Hello World") 
# print() is a python method that prints text to the screen
# basic Python programgg
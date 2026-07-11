# operators
#   - used to manipulate data or variable
#   - has five types; Arithmetic, Assignment, Comparison, Logical, Precedence
#     - Arithmetic
#         - commonly used for mathematical operations
#             - types or arithmetic operators:
#                 - addition (+)
#                     - used to add two values
#                     - if and only if they have the same data type
#                         - adding numeric types and non-numeric types results into erros
#                     - example: 
#                         my_num = 10
#                         my_other_num = 15
#                         sum = my_num + my_other_num #> 25
#                 - subtraction (-)
#                     - subtracts two values from one another
#                     - example: 
#                         my_num = 10
#                         my_other_num = 15
#                         dif = my_num - my_other_num #> -5
#                 - multiplication (*)
#                     - multiplies two values with each other
#                     - example: 
#                         my_num = 10
#                         my_other_num = 15
#                         pro = my_num * my_other_num #> 150
#                 - division (/)
#                     - divides one value by the other
#                     - example: 
#                         my_num = 10
#                         my_other_num = 15
#                         quo = my_num / my_other_num #> 0.666666666666 (auto casts to float)
#                 - modulus (%)
#                     - returns the division remainder
#                     - example: 
#                         my_num = 10;
#                         my_other_num = 15
#                         mod = my_num % my_other_num #> 5
#                 - exponentation (**)
#                     - raises a value to an exponent
#                     - example:
#                         my_num = 10
#                         my_other_num = 2
#                         exp = my_num ** my_other_num #> 100
#                 - floor division
#                     - divides one value by the other
#                     - takes the highest integer lower than the result
#                     - exmaple
#                         my_num = 10
#                         my_other_num = 15
#                         flo = my_num // my_other_num #> 0     
#           
#       - Assigment
#           - used to assign values to variables
#           - types of assignment operators:
#               - assignment operator (=)
#                   - used to assign any values to variables
#                   - used to initialize variables
#                   - example: 
#                       my_num = 10
#               - addition assignment (+=)
#                   - used to increment (or add) values
#                   - example: 
#                       my_num = 10
#                       my_num += 10 #> 20
#               - subtractiom assignment (-=)
#                   - used to decrement (or subtract) values
#                   - example: 
#                       my_num = 10
#                       my_num -= 10 #> 0
#               - multiplication assignment (*=)
#                  - used to multiply values
#                   - example: 
#                       my_num = 10
#                       my_num *= 10 #> 100
#               - division assignment (/=)
#                   - used to divide values
#                   - example: 
#                       my_num = 10
#                       my_num /= 10 #> 1
#               - modulo assignment (%=)
#                   - used to retrieve remainder values
#                   - example: 
#                       my_num = 10
#                       my_num %= 10; #> 0
#               - floor division assignment (//=)
#                   - used to divide values
#                   - returns a value rounded down
#                   - example:
#                       my_num = 10
#                       my_num //= 10 #> 1
#               - exponential assignment (**=)
#                   - used to raise values to an exponent
#                   - example:
#                       my_num = 10
#                       my_num **= 3 #> 100
#               - bitwise AND assignment (&=)
#                   - used for bitwise operations
#                   - uses the AND logic comparisons
#                   - example: 
#                       a = 60       #> 0011 1100
#                       b = 13       #> 0000 1101
#                       a &= b       #> 0000 1100 - 12 in binary
#                       my_num %= 10 #> 0
#               - bitwise OR assignment (|=)
#                   - used for bitwise operations
#                   - uses the OR logic comparisons
#                   - example: 
#                       a = 60;      #> 0011 1100
#                       b = 13;      #> 0000 1101
#                       a &= b;      #> 0011 1101 - 61 in binary
#                       my_num %= 10 #> 0
#               - bitwise XOR assignment (^=)
#                   - used for bitwise operations
#                   - uses the XOR logic comparisons
#                   - example: 
#                       a = 60;      #> 0011 1100
#                       b = 13;      #> 0000 1101
#                       a &= b;      #> 0011 0001 - 49 in binary
#                       my_num %= 10 #> 0
#               - left-shift assignment (<<=)
#                   - shifts the bit to the left
#                   - effectively multiplies the value by 2^n
#                   - example: 
#                       my_num = 60;  #> 0011 1100
#                       my_num <<= 2; #> 1111 0000 - 240 in binary
#               - right-shift assignment (>>=)
#                   - shifts the bit to the right
#                   - effectively divides the value by 2^n
#                   - example: 
#                       my_num = 60;  #> 0011 1100
#                       my_num >>= 2; #> 0000 1111 - 15 in binary
#               - walrus assignment (:=)
#                   - assigns values to a variable
#                   - example:
#                       count := 10        #> count = 10
#                       #> or
#                       print(count := 10) #> count = 10
#                                          #> print(count)
#
#       - Comparison
#           - used to compare two values
#           - returns a Boolean
#               - either True or False
#               - either 1 or 0
#           - types of comparison operators:
#               - equal to (==)
#                   - returns True if both values are equal
#                   - false otherwise
#                   - exmaple: 
#                       a = 10
#                       b = 10
#                       a == b #> True
#               - not equal to (!=)
#                   - returns tTue if the values are not equal
#                   - False if they are equal
#                   - exmaple: 
#                       a = 10
#                       b = 15
#                       a =!= b #> True
#               - greater than (>)
#                   - returns True if the value to the left if greater than the value in the right
#                   - exmaple: 
#                       a = 10
#                       b = 5
#                       a > b #> True
#               - less than (<)
#                   - returns True if the value to the left if less than the value in the right
#                   - exmaple: 
#                       a = 10
#                       b = 5
#                       a < b #> False
#               - greater than or equal to (>=)
#                   - returns True if the value to the left if greater than or equal to the value in the right
#                   - exmaple: 
#                       a = 10
#                       b = 10
#                       a >= b #> True
#               - less than or equal to (<=)
#                   - returns True if the value to the left if less than or equal to the value in the right
#                   - exmaple: 
#                       a = 10
#                       b = 20
#                       a <= b #> Tru
#
#       - Logical
#           - not
#               - logical negation
#               - flips the value of the returning value
#               - example:
#                   my_text = "Hello World"
#                   "World" not in my_text  #> False
#           - and 
#               - logical AND
#               - chains multiple conditions
#               - returns True if and only if all the conditions are True
#               - example:
#                   10 > 5 and 19 < 20 #> True
#           - or
#               - logiccal OR
#               - chains multiple conditions
#               - returns True if and only if one condition is True
#               - example:
#                   10 > 15 or 5 > 0 #> Tru
#
#       - Identity
#           - is
#               - returns True if both values are the same object
#               - sidenote
#                   - is and == are not the same
#                       - is queries if both objects refer to the same object in memory
#                       - == queries if both objetct contain the same elemets
#               - example:
#                   x = "idkman"
#                   y = "idkman"
#                   x is y       #> True
#           - is not
#               - returns True if both values are not the same object
#               - example:
#                   x = "idkman"
#                   y = "Hello World"
#                   x is not y       #> Tru
#
#       - Membership
#           - in
#               - queries if a certain value is inside of a larger array of values
#                   - or if a certain string is inside of a larger array of strings
#               - returns a bool value
#                   - either True or False
#               - syntax and example:
#                   my_text = "Hello World"
#                   "Hell" in my_text #> True
#           - not in
#               - queries if a certain value is not inside of a larger array of values
#                   - or if a certain string is not inside of a larger array of strings
#               - returns a bool value
#                   - either True or False
#               - syntax and example:
#                   my_text = "Hello World"
#                   "idkman" in my_text #> Tru
#
#       - Bitwise
#           - AND (&)
#               - sets each bit to 1 if both bits are 1
#               - example:
#                   6 & 3 #> 2
#                   6 = 0000000000000110
#                   3 = 0000000000000011
#                                     ^ 
#                       0000000000000010 - value of 2
#           - OR (|)
#               - sets each bit to 1 if one of two bits are 1
#               - example:
#                   6 | 3 #> 7
#                   6 = 0000000000000110
#                   3 = 0000000000000011
#                                    ^^^
#                       0000000000000111 - value of 7
#           - XOR (^)
#               - sets each bit to 1 if only one of two bits are 1
#               - example:
#                   6 ^ 3 #> 5
#                   6 = 0000000000000110
#                   3 = 0000000000000011
#                                    ^ ^
#                       0000000000000101 - value of 5
#           - NOT (~)
#               - inverts all bits
#               - example:
#                   ~3 #> -4
#                   3 = 0000000000000011
#                       1111111111111100 - value of -$
#           - Zero fill left shift (<<)
#               - pushes all zeros to the left
#               - discards the leftmost bits
#               - example:
#                   3 << 2 #> 12
#                   3 = 0000000000000011
#                       0000000000001100 - value of 12
#           - Signed right shift (<<)
#               - pushes all zeros to the right
#               - discards the rightmost bits
#               - example:
#                   12 >> 2 #> 3
#                   12 = 0000000000001100
#                        0000000000000011 - value of 
#
#       - Precedence
#           - order of operations
#           - similar of PEMDAS in mathematics
#           - left to right
#               - if two similar level in precedence operators are in the same equation
#                   - precedence starts from the left to right
#           - opereator precedence:
#               - Parentheses	      ()
#               - Exponents           **
#               - unary plus, minus   +x, -x, ~x
#                   and bitwise not     
#               - muliplication,      *, /, //, %
#                   divion and modulus 	
#               - adding, subtracting +, -
#               - bitwise left and    <<, >>
#                   right shits    
#               - bitwise AND         &
#               - bitwise XOR         ^
#               - bitwise OR          |
#               - comparisons,        ==, !=, >, <,
#                   identity and        >=, <=, is, is not,
#                   membership          in, not in
#               - logical NOT         not
#               - logical AND         and
#               - logical OR          o
#
#       - Other Operators
#           - shorthand statements
#               - ternary operator
#                   - short version of an if-else statment
#                   - syntax:
#                       <statement> if <condition> else <statement>
#                   - example:
#                       print("yes") if 10 == 10 else print("no")
#               - nested ternary operator
#                   - an extender version of the regular ternary operator
#                   - includes the elif conditional statememt
#                   - syntax:
#                       <statement> if <condition> else <statement> if <condition> else <statement> 
#                   - example:
#                       print("no") if 10 == 20 else print("maybe") if 10 == 15 else print("yes")
#           - set operators
#               - only applicable when using sets
#               - operators: 
#                   - union operator (|)
#                       - alternative to the .union() merhod
#                       - syntax:
#                           <set_name1> | <set_name2>
#                   - intersection operator (|)
#                       - alternative to the .union() merhod
#                       - syntax:
#                           <set_name1> & <set_name2>
#                   - difference operators (-)
#                       - alternative to the .difference() method
#                       - syntax:
#                           <set_name1> - <set_name2>
#                   - symmetric difference operator (^)
#                       - alternative to the .symmetric_difference() method
#                       - syntax:
#                           <set_name1> ^ <set_name2>
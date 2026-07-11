/* operators
    - used to manipulate data or variables
    - C has five main types of operators
    - Arithmetic
        - commonly used for mathematical operations
        - types or arithmetic operators:
            - addition (+)
                - used to add two values
                - if and only if they have the same data type
                - example: 
                    int my_num = 10;
                    my_other_num = 15;
                    sum = my_num + my_other_num // results to 25
            - subtraction (-)
                - subtracts two values from one another
                - example: 
                    int my_num = 10;
                    my_other_num = 15;
                    sum = my_num - my_other_num // results to -5
            - multiplication (*)
                - multiplies two values with each other
                - example: 
                    int my_num = 10;
                    my_other_num = 15;
                    sum = my_num * my_other_num // results to 150
            - division (/)
                - divides one value by the other
                - example: 
                    int my_num = 10;
                    my_other_num = 15;
                    sum = my_num / my_other_num // results to 0 (due to it being with two integers, not float)
            - modulus (%)
                - returns the division remainder
                - example: 
                    int my_num = 10;
                    my_other_num = 15;
                    sum = my_num % my_other_num // results to 5
            - increment (++)
                - raises the value by one
                - example: 
                    int my_num = 10;
                    ++my_num // results to 11 or
                    my_num++ // results to 12
            - Decrement (--)
                - lowers the value by one
                - example: 
                    int my_num = 10;
                    --my_num // results to 9 or
                    my_num-- // results to 8

    - Assigment
        - used to assign values to variables
        - types of assignment operators:
            - assignment operator (=)
                - used to assign any values to variables
                - used to initialize variables
                - example: 
                    int my_num = 10;
            - addition assignment (+=)
                - used to increment (or add) values
                - example: 
                    int my_num = 10;
                    my_num += 10; // 20
            - subtractiom assignment (-=)
                - used to decrement (or subtract) values
                - example: 
                    int my_num = 10;
                    my_num -= 10; // 0
            - multiplication assignment (*=)
                - used to multiply values
                - example: 
                    int my_num = 10;
                    my_num *= 10; // 100
            - division assignment (/=)
                - used to divide values
                - example: 
                    int my_num = 10;
                    my_num /= 10; // 1
            - modulo assignment (%=)
                - used to retrieve remainder values
                - example: 
                    int my_num = 10;
                    my_num %= 10; // 0
            - bitwise AND assignment (&=)
                - used for bitwise operations
                - uses the AND logic comparisons
                - example: 
                    int a = 60; // 0011 1100
                    int b = 13; // 0000 1101
                    a &= b;     // 0000 1100 - 12 in binary
                    my_num %= 10 // 0
            - bitwise OR assignment (|=)
                - used for bitwise operations
                - uses the OR logic comparisons
                - example: 
                    int a = 60; // 0011 1100
                    int b = 13; // 0000 1101
                    a &= b;     // 0011 1101 - 61 in binary
                    my_num %= 10 // 0
            - bitwise XOR assignment (^=)
                - used for bitwise operations
                - uses the XOR logic comparisons
                - example: 
                    int a = 60; // 0011 1100
                    int b = 13; // 0000 1101
                    a &= b;     // 0011 0001 - 49 in binary
                    my_num %= 10 // 0
            - left-shift assignment (<<=)
                - shifts the bit to the left
                - effectively multiplies the value by 2^n
                - example: 
                    int my_num = 60; // 0011 1100
                    my_num <<= 2;    // 1111 0000 - 240 in binary
            - right-shift assignment (>>=)
                - shifts the bit to the right
                - effectively divides the value by 2^n
                - example: 
                    int my_num = 60; // 0011 1100
                    my_num >>= 2;    // 0000 1111 - 15 in binary

    - Comparison
        - used to compare two values
        - returns a Boolean
            - either true or false
        - types of comparison operators:
            - equal to (==)
                - returns true if both values are equal
                - false otherwise
                - exmaple: 
                    int a = 10;
                    int b = 10;
                    a == b; // true
            - not equal to (!=)
                - returns true if the values are not equal
                - false if they are equal
                - example: 
                    int a = 10;
                    int b = 15;
                    a != b; // true
            - greater than (>)
                - returns true if the value to the left if greater than the value in the right
                - example: 
                    int a = 10;
                    int b = 5;
                    a > b; // true
            - less than (<)
                - returns true if the value to the left if less than the value in the right
                - example: 
                    int a = 10;
                    int b = 5;
                    a < b; // false
            - greater than or equal to (>=)
                - returns true if the value to the left if greater than or equal to the value in the right
                - example: 
                    int a = 10;
                    int b = 10;
                    a >= b; // true
            - less than or equal to (<=)
                - returns true if the value to the left if less than or equal to the value in the right
                - example: 
                    int a = 10;
                    int b = 20;
                    a <= b; // true
    - Logical
        - used to determine logic by combining one or more comparison operators
        - chains multiple conditions
        - also returns either a true or false, 0 or 1, respectively
        - types of logical operators:
            - logical AND (&&)
                - returns true if both conditions are the true
                - example: 
                    15 > 10 && 25 < 30; // true
            - logical OR (|)
                - returns true if at least one condition is true
                - example: 
                    10 > 15 || 25 < 30; // true
            - logical NOT (!)
                - negates (or flips) the logical value
                - i.e. !(true) = false, vice versa
                - example: 
                    !(15 > 10 && 25 < 30); // false
        
    - Precedence
        - order of operations
        - basically PEMDAS in programming
        - order from most important to least important:
            - Parentheses - ()
            - Multiplication, Division, Modulus - *, /, %
            - Addition, Subtraction - +, -
            - Comparison - >, <, >=, <= 
            - Equality - ==, != 
            - Logical AND - && 
            - Logical OR - ||
            - Assignment - = 

    - Other Operators
        - sizeof
            - used to query how many bytes a variable is using
            - returns an unsigned integer
*/
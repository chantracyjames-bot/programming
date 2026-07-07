/* operators
    - used to manipulate data or variables
    - Arithmetic
        - commonly used for mathematical operations
        - types or arithmetic operators:
            - addition (+)
                - used to add two values
                - if and only if they have the same data type
                - example: 
                    let my_num: i32 = 10;
                    let my_other_num: i32 = 15;
                    let sum: i32 = my_num + my_other_num // results to 25
            - subtraction (-)
                - subtracts two values from one another
                - example: 
                    let my_num: i32 = 10;
                    let my_other_num: i32 = 15;
                    let sum: i32 = my_num - my_other_num // results to -5
            - multiplication (*)
                - multiplies two values with each other
                - example: 
                    let my_num: i32 = 10;
                    let my_other_num: i32 = 15;
                    let sum: i32 = my_num * my_other_num // results to 150
            - division (/)
                - divides one value by the other
                - example: 
                    let my_num: i32 = 10;
                    let my_other_num: i32 = 15;
                    let sum: i32 = my_num / my_other_num // results to 0
            - modulus (%)
                - returns the division remainder
                - example: 
                    let my_num: i32 = 10;
                    let my_other_num: i32 = 15;
                    let sum: i32 = my_num % my_other_num // results to 5

    - Assigment
        - used to assign values to variables
        - types of assignment operators:
            - assignment operator (=)
                - used to assign any values to variables
                - used to initialize variables
                - example: 
                    let my_num: i32 = 10;
            - addition assignment (+=)
                - used to increment (or add) values
                - example: 
                    let mut my_num: i32 = 10;
                    my_num += 10; // 20
            - subtractiom assignment (-=)
                - used to decrement (or subtract) values
                - example: 
                    let mut my_num: i32 = 10;
                    my_num -= 10; // 0
            - multiplication assignment (*=)
                - used to multiply values
                - example: 
                    let mut my_num: i32 = 10;
                    my_num *= 10; // 100
            - division assignment (/=)
                - used to divide values
                - example: 
                    let mut my_num: i32 = 10;
                    my_num /= 10; // 1
            - modulo assignment (%=)
                - used to retrieve remainder values
                - example: 
                    let mut my_num: i32 = 10;
                    my_num %= 10; // 0

    - Comparison
        - used to compare two values
        - returns a Boolean
            - either true or false
        - types of comparison operators:
            - equal to (==)
                - returns true if both values are equal
                - false otherwise
                - exmaple: 
                    let a: i32 = 10;
                    let b: i32 = 10;
                    a == b; // true
            - not equal to (!=)
                - returns true if the values are not equal
                - false if they are equal
                - example: 
                    let a: i32 = 10;
                    let b: i32 = 15;
                    a != b; // true
            - greater than (>)
                - returns true if the value to the left if greater than the value in the right
                - example: 
                    let a: i32 = 10;
                    let b: i32 = 5;
                    a > b; // true
            - less than (<)
                - returns true if the value to the left if less than the value in the right
                - example: 
                    let a: i32 = 10;
                    let b: i32 = 5;
                    a < b; // false
            - greater than or equal to (>=)
                - returns true if the value to the left if greater than or equal to the value in the right
                - example: 
                    let a: i32 = 10;
                    let b: i32 = 10;
                    a >= b; // true
            - less than or equal to (<=)
                - returns true if the value to the left if less than or equal to the value in the right
                - example: 
                    let a: i32 = 10;
                    let b: i32 = 20;
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
*/

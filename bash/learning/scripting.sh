#! /bin/bash

# Bash scripting
#   - syntax:
#       - comments in Bash is done through the pound # symbol
#           - example:
#               # this is a comment
#       - commands are run from top to bottom
#           - though, there are special cases wherein this is ignored
#               - like function calls
#       - multiple commands on the same line are able to be separated
#           - using a semicolon ;
#       - scripts usually start with a special declaration
#           - a shebang #!
#           - signifying that the file is a Bash script

#   - variables
#       - declaration and definition
#           - variables are declared using a variable name
#               - and then assigning it a value
#           - values are assigned using the assignment operator =
#           - syntax:
#               <variable_name>=<value>
#           - example:
#               my_variable="idkman"
#       - access and variable calls
#           - once variables are declared and defined
#               - they are called using a dollar sign $
#           - syntax:
#               $<variable_name>
#           - example:
#               #my_variable
#       - local variables
#           - these are variables that are only avariable in the block of code they reside in
#               - they are not able to be accessed from the outside
#           - unlike global variables
#               - which are able to be accessed from anywhere in the script
#               - only if that variable is declared before it is called

#   - opreations
#       - concatenation
#           - this operation concatenates (or combines) two string variables
#               - or string literals to a variable
#           - syntax:
#               $<variable1>$<variable2>
#           - example:
#               "$my_variable$my_variable"
#       - arithmetic
#           - this operation combines two numbers to one another
#               - using the adition + operator
#           - syntax:
#               $((<value1> + <value2>))
#           - example:
#               $((10 + 10))

#   - data types
#       - Bash natively supports strings, integers and arrays
#           - it does not have native support for floating points
#               - they are automatically evaluated as integers when operating on them
#       - strings
#           - these are values that are enclosed in double quotes
#           - example:
#               "idkman"
#       - numbers
#           - these are integers or values that are not envoloped in double quotes
#           - example:
#               1, 2, 3
#       - arrays
#           - these type holds multiple values
#           - they are able to hold both numbers and strings at the same time
#           - example:
#           ("idkman", 100, "yes, 3.14")
#       - associative arrays
#           - these are variables that associate with arrays
#               - adding values for each element of the array
#           - similar to dictionaries or maps
#           - syntax:
#               declare -A <associative_name>
#           - example:
#               declare -A lumbago
#               lumbago[idkman]="maybe"

#   - operators
#       - comparison operators
#           - sidenote:
#               - these are only used in comparing numbers
#           - -eq
#               - equal to
#               - checks if both values match
#                   - resulting as true if it is
#               - if not, returns false
#           - -ne
#               - not equal to
#               - checks if both values don't match
#                   - resulting as true if it is
#               - if not, returns false
#           - -lt
#               - less than
#               - checks if the value to the left is less that the value to the right
#                   - resulting as true if it is
#               - if not, returns false
#           - -le
#               - less than or equal to
#               - checks if the value to the left is less that the value to the right
#                   - or if it is equal to it
#                   - resulting as true if it is
#               - if not, returns false
#           - -gt
#               - greater than
#               - checks if the value to the left is greater that the value to the right
#                   - resulting as true if it is
#               - if not, returns false
#           - -ge
#               - greater than or equal to
#               - checks if the value to the left is greater that the value to the right
#                   - or if it is equal to it
#                   - resulting as true if it is
#               - if not, returns false
#       - string comparison operators
#           - =
#               - equal to
#               - if both string are equal, returns true
#                   - if not, it returns false
#           - !=
#               - note equal to
#               - if both string are not equal, returns true
#                   - if not, it returns false
#           - >
#               - greater than
#               - compares the characters of both strings from left to right
#                   - if the character to the left is greater than the right, returns true
#                   - if not, returns false
#               - numbers < UPPERCASE < lowercase
#           - <
#               - LESS than
#               - compares the characters of both strings from left to right
#                   - if the character to the left is LESS than the right, returns true
#                   - if not, returns false
#               - numbers < UPPERCASE < lowercase
#       - arithmetic operators
#           - +
#               - addition
#               - adds both numbers
#           - - 
#               - subtraction
#               - subtracts both numbers
#           - *
#               - multiplication
#               - multiplies both numbers
#           - /
#               - division
#               - divides both numbers
#           - %
#               - modulus
#               - returns the remainder of both numbers
#       - logical operators
#           - &&
#               - logical AND
#               - is true if both values are true
#           - ||
#               - logical OR
#               - is true if one of the values is true
#           - !
#               - logical NOT (negation)
#               - flips the truth value
#       - file test operators
#           - -e
#               - checks if a file exists
#           - -d
#               - checks if a directory exists
#           - -f
#               - checks if the file is regular file
#           - s
#               - checks if the file is not empty
#
#   - conditionals
#       - used for program flow
#       - if-elif-else
#           - sidenote:
#               - to end and if-elif-else statement
#                   - the keyword "fi" is required
#               - it marks an end to the conditional statements
#           - if
#               - runs a block of code if the condition is true
#               - syntax:
#                   if [[<condition>]]; then
#                       <code_block>
#                   fi
#                   #> or
#                   if [<condition>]; then
#                       <code_block>
#                   fi
#               - example:
#                   if [[ 10 -gt 9]]; then
#                       echo "idkman"
#                   fi
#           - elif
#               - runs a block of code if the condition is true
#                   - runs after an if block
#               - syntax:
#                   elif [[<condition>]]; then
#                       <code_block>
#                   fi
#                   #> or
#                   elif [<condition>]; then
#                       <code_block>
#                   fi
#               - example:
#                   elif [[ 11 -lt 90]]; then
#                       echo "lumbago"
#                   fi
#           - else
#               - runs if all conditions return false
#               - syntax:
#                   else
#                       <code_block>
#                   fi
#               - example:
#                   else
#                       echo "idk"
#                   fi
#           - sample code
#               if [[ "$my_name" == "tarcy"]]; then
#                   echo "hi"
#               elif [[ "$my_name" ==  "tracy" ]]; then
#                   echo "hello"
#               else
#                   echo "idkman"
#               fi
#       - case
#           - an altenative to if-elif-else statements
#           - syntax:
#               case <expression> in
#                   <condition>)
#                       <code_block>
#                       ;;
#                   <condition>)
#                       <code_block>
#                       ;;
#                   *)
#                       <code_block>
#                       ;;
#           - sidenote:
#               - the asterisk * is a wildcard
#                   - usually used for the remaining values
#                   - similar to default statements in other languages
#               - the double semicolon ;; is required for each case
#                   - it marks the case as terminated
#           - sameple code
#               case "$my_name" in
#                   "tarcy")
#                       echo "hi"
#                       ;;
#                   "tracy")
#                       echo "hello"
#                       ;;
#                   *)
#                       echo "idkman"
#                       ;;
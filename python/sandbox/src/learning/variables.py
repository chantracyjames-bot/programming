# variables
#   - are used to act as containers and used for storing data
#   
#   - declaration and initialization
#       - syntax:
#           <variable_name> = <value>
#       - example:
#           idkman = 'yes'
#       - rules for variable declaration:
#           - variables must have a name
#               - also called as identifiers
#               - it is not possible to declare a variable without a name
#           - variable names can use letters, numbers*, or underscores _
#               - *variable names cannot start with a number
#           - variable names must start with a letter or an underscore
#           - variable names must not contain any special characters
#               - examples are @, #, %, etc.
#           - variable names cannot be reserved names
#               - examples are int, float, class, etc.
#
#       - conventions in naming variables
#           - in Python, snake_case is the most preferred naming schene for variables and attributes
#               - example: my_var, float_value, current_temp, etc.
#           - variable names must match their purpose
#               - it makes reading variables easier to understand
#               - example: my_num, var_sum, etc.
#
#       - it is possible to declare a value alongside the variable
#           - syntax:
#               <variable_name> = <value>
#           - example:
#               my_num = 10
#
#       - it is possible to declare more than one variable in a single statement
#           - note that each variable must come with their values
#           - syntax:
#               <variable_name1>, <variable_name2>, <variable_name3> = <value1>, <value2>, <value3>
#           - example:
#               my_num, my_float, my_bool = 10, 3.14, False
#
#       - unlike in C/C++, Java and other similar programming languages
#           - data types are assigned to variable automatically
#               - example:
#                   x = 10    #> x is auto-assigned as int
#                   y = 'yes' #> y is auto-assigned as str
#           - it is possible to re-assign data types to variables
#               - example:
#                   x = 10   #> x is assigned as int
#                   y = 3.14 #> x is now assigned as float
#
#   - access and modification
#       - the values of variables are accessed by calling their name
#           - syntax:
#               <variable_name>
#           - example:
#               x = 10
#               x      #> returns the value of x
#
#       - it is possible to change the value of a variable
#           - syntax:
#               <variable_name> = <new_value>
#           example:
#               x = 100
#
#       - it is possible to set (or declare) the value of avariable equal to another
#           - they become "linked"
#               - changes in one variable affects the other
#           - syntax:
#               <variable_name1> = <variable_name2>
#           - example:
#               x = y #> y becomes equal to x
#
#       - type casting
#           - it is possible to specify (or change) the data type of a variable
#               - it is done through "casting"
#           - it uses the data type class to cast their data type
#               - examples are int(), float(), str(), etc.
#           - syntax:
#               <data_type>(<value>)
#           - example:
#               int("10") #> "10" becomes an int, or 10
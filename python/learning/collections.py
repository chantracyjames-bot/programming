# collections
#   - are used to store multiple values in a single variable
#       - instead of declaring multiple variables to store value, arryas makes the process easier
#   - note that lists are the commonly used as arrays in Python
#       
#   - declaration and initialization
#       - arrays are declared using square brackets [ ]
#           - values are separated by commas ,
#       - syntax:
#           <array_name> = [<values>]
#       - example:
#           my_array = []              #> empty array
#           my_list = [1, "idk", True] #> non-empty array
#
#   - access and modification
#       - the elements inside an array is accessed through the use of indices
#           - in most languages, the index usually starts at 0
#               - i.e. the first element starts at index 0
#           - trying to access an index that is greated than the size of the array will result in an IndexError
#           - syntax:
#               <array_name>[<index>]
#           - example:
#               my_array[0]
#           - the size of an array is obtained through the use of the len() function
#               - syntax:
#                   len(<array_name>)
#               - example:
#                   len(my_array)
#       - the elememts inside an array are able to be changed
#           - it is done through accessing their index and using the assignment operator to change the value
#           - syntax:
#               <array_name>[<index>] = <new_value>
#           - example:
#               my_array[0] = 3
#       - index pointers
#           - the index can either be a positive or negative number
#               - positive values incrementing starts from the first element
#                   - starts at 0 and ends at the last positive element
#               - negative values decrementing starts from the last element
#                   - starts from the last element and ends at the first element
#       - index slicing
#           - it is possible to "slice" the values of a list or a tuple
#           - syntax:
#               <array_name>[<start_value>:<stop_value>:<step_value>]
#           - example:
#               my_array[2]     #> starts at index 2 (third element)
#               my_array[3:6]   #> starts at index 3, ends at index 5
#               my_array[1:5:2] #> starts at index 1, ends at index 4, skips 2 indices
#           - start value:
#               - it is inclusive
#                   - includes the value
#               - dictates which part of a list or tuple the index will start in
#               - if there are no stop value (present but empty), it will read the entire list from the starting index
#               - example:
#                   my_array[3]  #> reads index 3
#                   my_array[2:] #> starts fron index 2 and reads until the end of the array
#           - stop value:
#               - it is exclusive
#                   - excludes the value
#               - dictates which part of a list of tuple the index will end in
#               - if there are no start value (present but empty), it will read the entire list from the start of the array until the stop value - 1
#               - example:
#                   my_array[1:3] #> reads index 1 until index 3 - 1 (2)
#                   my_array[:6]  #> starts from the beginning and reads until the stop value
#           - step value
#               - dictates how much the index increments or decrements
#               - default value is 1
#               - can be a positive or negative number
#                   - positive numbers will move the index forward
#                   - negative numbers will move the index backward
#               - example:
#                   my_array[1:5:2]  #> reads index from 1 to 5 but skips 2 per read
#                                    #> effectively being index 2 and 4
#                   my_array[5:1:-1] #> reads from index 5 to 1 buts skips -1 per read
#                                    #> effectively being index 5, 4, 3
#  
#           - value manipulation
#               - it is possible to modify values inside a list using inedx slicing
#               - note that when inserting values that is more that the values being replaced
#                   - the remaining values will get displaced
#                   - the same thing happens when inserting values that is less than the values being replaced
#               - syntax:
#                   <list_name>[<start_value>:<stop_value>] = <new_values>
#               - example:
#                   my_list[1:4] = 1, 2, 3, 4 #> changes the values of index 1, 2, and 3
#                                             #> inserts a new value after index 3
#
#   - multidimensional arrays
#       - also called "nested arrays"
#       - declaration and initialization
#           - it is possible to insert arrays inside arrays
#           - the elements inside a nested array can either be:
#               - mixed arrays
#                   - contains both arrays and normal values
#                   - example:
#                       my_nested_array = [1, "yes", [True, 0], "Hello World"]
#               - pure arrays
#                   - contains only array elements
#                   - example:
#                       my_nested_array = [[1, 2], ["idk", "man"], [True, False]]
#
#       - accessing and modofication
#           - accessing a nested array is done through the use of the index of the parent array and then the child array
#               - syntax:
#                   <array_name>[<parent_index>][child_index]
#               - example:
#                   my_nested_array[1][1]
#               - note that the leftmost index is the outermost array and the every succeesing index is the child array
#               - the size of an array inside a nested array is queried using the len() function
#                   - syntax:
#                       len(<array_name>[parent_index])
#                   - example:
#                       len(my_nested_array[1])
#           - modifying the vales is done through the same process as normal arrays
#               - syntax:
#                   <array_name>[parent_index][child_index] = <new_value>
#               - example:
#                   my_nested_array[1][0] = "maybe"
#
#   - types of collections in Python
#       - lists
#           - most commonly used array in Python
#           - elements are ordered, mutable and allows duplicate values
#               - ordered
#                   - new items are appended at the end of the list
#                       - some methods are able to add items
#                   - generally, lists elements are ordered
#               - mutable
#                   - items are able to be added, removed and modified
#               - duplicates
#                   - duplicates or reocurring values are allowed
# 
#           - declaration and initialization
#               - can be declared in two ways
#               - implicit declaration
#                   - uses square brackets [ ]
#                   - syntax:
#                       <list_name> = [<values>]
#                   - example:
#                       my_list = [1, "idk", True]
#               - explicit declaration
#                   - uses the list() class
#                   - syntax:
#                       list([<values>])
#                       #> or
#                       list(<iterable>)
#
#           - access and modification
#               - list values are able to be accessed through their index 
#                   - index values start at 0
#                   - syntax:
#                       <list_name>[<index>]
#                   - example:
#                       my_list[1]
#               - list values are able to be modified using the same way they are accessed
#                   - values are assigned using the assignment = operator
#                   - syntax:
#                       <list_name>[<index>] = <new_value>
#                   - example:
#                       my_list[1] = "man"
#                   - adding new elements are dont through the .insert(), .append() and .extend() methods
#                   - removing certain elements are done through the .remove() and .pop() methods
#                       - clearing the whole list is done through the .clear() method
#                       - the del keyword can do both tasks as well
#                   - sorting can also be accomplished through the .sort() methods
#                       - it sorts the list alphanumerically
#
#           - collection unpacking
#               - it is possible to unpack lists and assign their values to individual variables
#               - note that if the amount of variable to store the new values are not sufficient
#                   - the last variable will store the remaining values
#               - exmaple:
#                   x, y, z = my_list
#
#           - list duplication
#               - duplication is achieved through the use of the assignment = operator
#                   - syntax:
#                       <list_name1> = <list_name2>
#                   - example:
#                       my_list = my_other_list
#                   - sidenote:
#                       - both lists will become linked
#                           - any changes to one will affect the other
#                           - this is due to them pointing to the same reference in memory
#               - to duplicate a list without dealing with linking
#                   - .copy() solves this problem
#                   - syntax:
#                       <list_name1> = <list_name2>.copy()
#                   - example:
#                       my_list = my_other_list.copy()
#               - the slice operator can also be used to copy lists
#                   - syntax:
#                       <list_name> = <list_name2>[:]
#
#           - list concatenation
#               - lists are able to be merged together or conjoined through the + operator
#               - syntax:
#                   <list_name1> + <list_name2>
#               - example:
#                   my_new_list = my_list + my_other_list
#               - using the .extend() methods can also work
#                   - example:
#                       my_list.extend(my_other_list)
#
#           - list comprehension
#               - it is possible to create lists on the fly using list comprehension
#               - the expression is enclosed in square brackets [ ]
#               - syntax: 
#                   <list_name> = [<expression>]
#               - example:
#                   my_list = [x for x in range(5)] #> [0, 1, 2, 3, 4]
#
#       - tuples
#           - elements are ordered, immutable and allows duplicate values
#               - ordered
#                   - items have a fixed order
#               - immutable
#                   - items cannot be added, removed or modified
#                       - modification is achieved by converting the tuple into a list
#                       - or by tuple by tuple operations
#               - duplicates
#                   - duplicates or reocurring values are allowed
#
#           - declaration and initialization
#               - can be declared in two ways
#               - implicit declaration
#                   - uses parentheses ( )
#                   - syntax:
#                       <tuple_name> = (<values>)
#                   - example:
#                       my_typle = (0, "man", False)
#               - explicit declaration
#                   - uses the tuple() class
#                   - syntax:
#                       tuple((<values>))
#                       #> or
#                       tuple(<iterable>)
#
#           - access and modification
#               - tuple values are able ot be accessed through their index
#                   - index values start at 0
#                   - syntax:
#                       <tuple_name>[<index>]
#                   - example:
#                       my_tuple[1]
#               - while tuples are immutable, the only way to modify the elements is to convert the tuple into a list
#                   - after the modification, it can be returned to being a tuple
#                   - example:
#                       my_tuple = (1, 2, 3, 4)
#                       my_list = list(my_tuple)
#                       my_list.append(5)
#                       my_tuple = tuple(my_list)
#                   - the same workaround is able to be used to remove, modify and query items
#               - tuples are able to be added to other tuples
#                   - syntax:
#                       <tuple_name1> += <tuple_name2>
#                   - example:
#                       my_tuple += my_other_tuple
#               - tuples are also allowed to be multiplied with integers
#                   - effectively multiplying the elements
#                   - example:
#                       my_tuple = (1, 2, 3, 4)
#                       my_other_tuple = my_tuple * 2 #> (1, 2, 3, 4, 1, 2, 3, 4)
#                       
#           - collection unpacking
#               - it is possible to unpack tuples and assign their valuts to individual variables
#               - note that if the amount of variables to store the new values are not sufficient
#                   - the last variable will store the remaining values
#               - example:
#                   x, y, z = my_tuple
#
#       - sets
#           - elements are unordered, immutable, and does not allow duplicate values
#               - unordred
#                   - the values are stored in random order
#                   - sets do no have any fixed indices
#               - immutable
#                   - items cannot be modified
#                       - though there are methods to modify values
#               - duplicates
#                   - sets discards any duplicate values
#
#           - declaration and initialization
#               - can be declared in two ways
#               - implicit declaration
#                   - uses curly braces { }
#                   - syntax:
#                       <set_name> = {<vales>}
#                   - example:
#                       my_set = {1, 2, 3, 4}
#               - explicit declaration
#                   - uses the set() class
#                   - syntax:
#                       set({<values>})
#                       #> or
#                       set(<iterable>)
# 
#           - access and modification
#               - on sets, it is not possible to access values through indices
#                   - the reason being the unorderedness and sets being unindexed
#                   - the only way to view set elements is through the use of a loop
#                        - example:
#                           for i in my_set:
#                               print(i)
#               - while being immutable, it is still possible to add and remove items from a set
#                   - adding values is done through the use of the .add() method
#                       - example:
#                           my_set.add("yes")
#                   - removing values is done through the use of the .remove() method
#                       - example:
#                           my_set.remove("yes")
#                   - refer to set methods for more methods
#
#           - set duplication
#               - duplication is achieved through the use of the assignment = operator
#                   - syntax:
#                       <set_name1> = <set_name2>
#                   - example:
#                       my_set = my_other_set
#                   - sidenote:
#                       - both sets will become linked
#                           - any changes to one will affect the other
#                           - this is due to them pointing at the same reference in memory
#               - to duplicate a set with dealing with linking
#                   - .copy() avoids this problem
#                   - syntax:
#                       <set_name1> = <set_name2>.copy()
#                   - example:
#                       my_set = my_other_set.copy()
#       
#           - frozensets
#               - a fully immutable version of a set
#               - items cannot be removed or added
#                   - even through the use of set methods
#               - declaration
#                   - can be declared using the frozenset() class
#                   - syntax:
#                       frozenset({<values>})
#                       #> or 
#                       frozenset(<iterable>)
#
#       - dictionaries
#           - elements are ordered, immuatable and does not allow duplicates
#               - ordered
#                   - items stored have a fixed order
#               - immutable
#                   - items cannot be modified
#                       - there are some methods to bypass this
#               - duplicates
#                   - dictionary keys are not allowed to have duplicates
#                   - unlike keys, their value can be duplicates
#
#           - declaration and initialization
#               - can be declared using curly braces { }
#               - the entries must come in pairs
#                   - a key and its value separated by a colon :
#               - can be declared in two ways
#               - implicit declaration
#                   - syntax:
#                       <dict_name> = {<key>: <value>}
#                   - example:
#                       my_dict = {"yes": "no", "idk": "man"}
#                   - sidenote:
#                       - if the key is a string, it must be enclosed in quotes
#               - explicit declaration
#                   - syntax:
#                       <dict_name>: dict(<key_type>, <value_type>) = {<key_value>: <value>}
#                       #> or
#                       dict(<key_name>=<value>)
#                       #> or
#                       dict([(<>key_name1, <value1>), (<key_name2>, <value2>)])
#
#           - access and modification
#               - dictionary values are access by using their key
#                   - keys are case-sensitive
#                   - syntax:
#                       <dict_name>[<key>]
#                   - example:
#                       my_dict["yes"]
#                   - values can also be retrived using the .get() method
#                       - syntax:
#                           <dict_name>.get(<key>)
#                   - the .keys() method returns all keys inside a dictionary
#                   - the .values() method returns all values inside a dictionary
#               - modifying values of keys are sone by accessing their index
#                   - syntax:
#                       <dict_name>[<key>] = <new_value>
#                   - example:
#                       my_dict["idk"] = "lumbago"
#                   - it can also be done using the .update() method
#                       - if the key is not present, it will create a new entry
#                       - syntax:
#                           <dict_name>.update(<key>=<new_value>)
#                       - example:
#                           my_dict.update(yes = "idkman")
#
#           - dictionary duplication
#               - duplication is done through the use of the assignment = operator
#                   - syntax:
#                       <dict_name1> = <dict_name>
#                   - example:
#                       my_dict = my_other_dict
#                   - sidenote:
#                       - both dictionaries will become linked
#                           - any changes to one will affect the other
#                           - this is due to them pointing at the same reference in memory
#               - to duplicate a dictionary without dealing with memory linking
#                   - .copy() avoids this problem
#                   - syntax:
#                       <dict_name1> = <dict_name2>.copy()
#                   - example:
#                       my_dict = my_other_dict.copy()


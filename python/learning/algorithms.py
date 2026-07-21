# algorithms
#   - are a way of working with data and solving problems
#       - problems like sorting, searching, iterating, etc.
#   - sample code:
#       my_list = [2, 1, 5, 3, 4, 8, 0]
#       min_val = my_list[0]
#       for i in my_list:
#           min_val = i if min_val > i else min_val
#       #> loops though the list finding the minimum value
#   - note that algorithms are designed to be fast and efficient
#       - at a large enough data size
#           - algorithms will inevitably become slow
#       - that is why time complexity is very important in data structures
#           - and especially in algorithms
#
#   - time complexity
#       - the time for an algorithm to do its job is called "runtime"
#           - it is one of the fundamental concepts of algorithms
#           - as it dictates the time and efficiency of it
#       - runtime
#           - knowing the runtime of an algorithm will show it efficiency
#               - inefficient algorithms can make programs slow or even unworkable
#           - by understanding the runtime of an algorithm
#               - the right algorithm can be made for the problem to solve
#               - in return, making the program faster 
#                   - and enables the algorithm to deal with even larger stes of data
#       - actual runtime
#           - when looking at the runtime of a given algorithm
#               - the actual time is not considered
#           - this is due to varying factors that an algorithm have to account for
#               - 1. the programming language
#                   - the language that is used to implement the algorithm
#               - 2. how it is written
#                   - how the programmer writes and design the algorithm
#               - 3. the compier or interpreter
#                   - how the compiler or interpreter interprets the code
#                   - or how it translate it to machine code
#               - 4. the current hardware
#                   - the hardware that the algorithm is current running on
#                   - differing hardware can influence the efficiency of an algorithm
#               - 5. the operating system
#                   - the current operating system and the other ongoing background tasks
#                   - as different tasks in the background can limit resources
#               - 6. thw amount of data
#                   - larger amounts of data can increase the time that an algorithm takes
#                   - smaller amouns of data can do the opposite
#       - instead of looking at the actual runtime of the algorithm
#           - it is better to look at the time complexity of it
#           - as it is more abstract than actual tuntime
#               - and does not consider the hardware and the language
#           - time complexity is the number of operations needed to run an algorithm
#               - most specially when dealing with large amount of data
#               - this is were the number of operations is considered as "time"
#                   - as the computer takes time in-between operations
#           - for instance:
#               - an algorithm that find the minimum vakue of an array
#                   - the algortihm must go through every single value in that array
#                   - since it has to be compared to the current minimum value
#               - each comparison is considered as an operation
#                   - and each of those said comparisons must a certain amount of time
#               - so the total time that the algorithm takes to find the lowest value
#                   - depends on the number of items or values in that array
#               - as a result, if the array has a total of 100 items
#                   - then it will take 100 operations to do so
#               - the relationship for this instance of an algortihm is linear
#                   - as each value adds on to the number of operations
#                   - also known as a linear algorithm
#       - operation
#           - the term operation can become very misleading
#               - as some operations takes one or more CPU cycles
#           - "One operation in an algorithm can be understood as something we do in each iteration of the algorithm,"
#               - "or for each piece of data, that takes constant time"
#           - for instance:
#               - comparing two elements, and them swapping the bigger one
#                   - is considered as one operation
#                   - an example being the Bubble Sort algorithm
#               - understanding it as one or more operations doesn't really matter
#                   - as the algorithm takes a constant amount of time in-between
#           - if an operation takes the same amount of time when processing any amount of data
#               - it can be considered as taking a "constant" amount of time
#           - as comparing two elements, and then swapping the bigger one
#               - even if there are 10 or 1000 elements present
#               - it will still take a constant amount of time to finish
#       - Big O Notation
#           - from a mathematical concept
#               - this notation describes the upper bound of a function
#           - in computer science
#               - this notation more or so represents the worse case time complexity
#               - or the worse case scenario for the amount of time an algorithm takes
#           - this notation is usually represented by the capital letter O with parentheses
#               - and inside those parentheses, is an expression that indicatess the runtime of an algorithm
#               - as tuntime is represented with the letter n
#                   - which is the number of values in the data set being worked on by the algorithm
#           - examples of O()
#               - O(1)
#                   - the fastest algorithm with the smallest time complexity
#                   - usually is done by looking at a certain index on an array
#                       - example:
#                           my_array[24] #> O(1)
#                       - since looking up the value with using an index takes only one operation
#                   - note that not all algorithms can be made to be like this
#                       - it only serves as an example as to how important time complexity is
#               - O(n)
#                   - ome of the most ideal time complexities
#                   - usually done by finding a value by comparing all elements inside a data set
#                       - like finding the minimum or maximum value of an array
#                   - this algortihm is linear
#                       - the amount of time it takes is proportional to how many elements are present
#               - (On^2)
#                   - one of the slowest algorithms
#                   - usually is done by going through the data set twice
#                       - like sorting using Bubble or Insertion sort
#                   - this algorithm scales with how large the data set is
#                       - large data sets can slow down this algorithm dramatically
#               - O(n log n)
#                   - faster than O(n^2)
#                   - usually is implemented in the Quicksort algorithm
#                       - faster on average than Bubble or Insertion sort
#                       - though, it still has the O(n^2) worse case scenario
#                   - this algorithm doesn't scale as dramatically
#                       - it is one of the faster algortihms
#           - worst case scenario
#               - if an algotihm has to go through n values requiring n operations to do so
#                   - it will always have the same best, average and worst case scenarios
#               - though with some algorithms, even if n values stay the same
#                   - the amount of requirements is not the same, depending on how it is implemented
#                   - like in sorting algorithms
#                       - some can take a short amount of time (best case)
#                       - while some take a really long time (worst case)
#                   - these are all dependent on the data set they are given
#                       - and more importantly, how these algorithms are designed
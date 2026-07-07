# iterative statements
#   - common called as loops
#   - runs a code block until a certain condition is met
#       - until the loop counter reaches a certain condition, or the condition becomes false, etc.
#   - uses a boolean value to dictate if the loop runs or stops
#       - using loop counter values other than whole numbers will case errors
#           - except in the case of iterables
#   - loop keywords
#       - break
#           - the break keyword is used to stop loops
#           - breaking a loop ends it prematurely
#       - continue
#           - the continue keyword is used to skip the current loop iteration
#           - using it will end the current iteration and move on to the next
#   - types of loops:
#       - while
#           - runs a block of statement while the condition is True
#               - if the initial condition is false, the loop never runs
#           - syntax:
#               while(<condition>):
#                   <statements>
#           - example:
#               while (True):
#                   print(yes) #> note that this will get printed infinitely
#       - for
#           - an extensive type of loop
#               - differs from other loops from different languages with the same name
#           - a type of loop that uses an iterable instead of a loop counter
#               - can either be a list, tuple, string, etc.
#               - can also be used with the range() function
#           - syntax:
#               for <expression>:
#                   <stataments>
#           - example:
#               for i in range(10):
#                   print("idkman")
#   - else statement
#       - unlike what the name suggests, it runs after the loop has been finished
#           - it only runs if the loop runs without interuptions
#       - syntax:
#           while (<condition>):
#               <statements>
#           else:
#               <statements>
#           #> or
#           for <expression>:
#               <statements>
#           else:
#               <statements>
#       - example:
#           while (True):
#               break
#           else:
#               print"lumbago")
#
#   - iterators
#       - objects that contains countable elements
#       - is an object that can be iterated upon
#           - meaning traversable values
#       - an iterator is an object which implements the iterator protocol
#           - consisting of the __iter__() and __next__() methods
#       - iterables
#           - is a container which can possess an iterator
#               - lists, tuples, dictionaries, etc.
#               - strings are also iterable objects
#           - these objects have a iter() method which is used to get an iterator
#       - using the iterator of an iterable
#           - example:
#               my_list = [1, 2, 3, "yes"]
#               my_iterator = iter(my_list)
#               next(my_iterator)           #> 1
#               next(my_iterator)           #> 2
#               next(my_iterator)           #> 3
#               next(my_iterator)           #> "yes"
#               next(my_iterator)           #> StopIteration
#       - iterators are commonly used in a loop
#           - leveraging iterables
#           - example:
#               my_string = 'idkman'
#               for i in my_string:
#                   print(i)
#       - creating custom iterators
#           - uses the __iter__() and __next__() methods to initialize and advance an iterable
#           - example:
#               class MyNumbers:
#                   def __iter__(self):
#                       self.a = 1
#                       return self
#                   def __next__(self):
#                       x = self.a
#                       self.a += 1
#                       return x
#                   my_obj = MyNumbers
#                   my_iterator = iter(my_obj) #> initializes the __iter__() method
#                                              #> sets the first element to be 1
#                   print(next(my_iterator))   #> 1
#                                              #> next() returns the current value
#                                              #> and then initializes the next element, 1 += 1 (2)
#           - to stop the iteration from going on forever or to set a limit
#               - the StopIteration statement is used
#               - example:
#                   class MyNumber:
#                       def __iter__(self):
#                           self.yes = 1
#                           return self
#                       def __next__(self):
#                           if self.yes >= 10:
#                               no = self.yes
#                               self.yes += 1
#                               return no
#                           else:
#                               raise StopIteration #> stops the iteration after 10 next() calls



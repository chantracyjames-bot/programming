# exceptions
#   - Exception Handling
#       - Python has five main ways of exception handling
#           - try
#               - runs a block of code and "tests" for errors or exceptions while being executed
#               - any errors will be intercepted by the except statement
#               - syntax:
#                   try:
#                       <stataments>
#               - example:
#                   try:
#                       print("lumbago")
#           - except
#               - runs a block of code after the Exception is run
#               - can catch any exceptions in a program
#                   - from broad to specific Exceptions
#               - requires a try statement before it
#               - syntax:
#                   except <exception>:
#                       <statament>
#               - example:
#                   except:             #> catches all exceptions
#                       print('error')
#           - finally
#               - runs regardless of the result of the try-except stataments
#               - runs after a try-except
#               - requires a try-except statement before it
#               - syntax:
#                   finally:
#                       <statement>
#               - example:
#                   finally:
#                       print('code finished')
#           - else
#               - runs only if the try-except statements returns no errors
#               - requires a try-except statememt before it
#               - syntax:
#                   else:
#                       <statements>
#               - example:
#                   else:
#                       print('no errors')
#           - raise
#               - used to manually throw or raise exceptions
#               - typically used in a try-except statement
#                   - it can be used outside but note that the program will stop after an exception is thrown
#               - syntax:
#                   raise <exception>
#               - example:
#                   raise ArithmeticError
#
#       - multiple except blocks are able to declared in a try-except statement
#           - it can help in handling multiple exceptions by being more specific
#           - example:
#               try:
#                   my_list = [1, 2, 3, 4]
#                   my_list[5]             #> IndexError
#                   my_list[1] / 0         #> ZeroDivisionError
#               except IndexError as err:
#                   print('index out of bounds yo')
#               except ZeroDivisionError as err:
#                   print('idiot, cannot by zero bro')
#               finally:
#                   print('program finished')
#               else:
#                   print('program finished without errors, 5 starts')
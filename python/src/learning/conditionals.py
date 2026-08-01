# conditionals
#   - conditional statements control the flow of the program
#       - uses boolean as the logic with the conditional operations controlling the value of said boolean
#       - all conditional opearators must return a boolean value
#   - types of conditional statements
#       - if statements
#           - only runs the if the condition is True
#           - syntax:
#               if <condition>:
#                   <statements>
#           - example:
#               if 10 > 9:
#                   print("yes")
#       - elif statements
#           - offers another condition apart from the if statement
#           - similar syntax as the if statemnt
#           - syntax
#               elif <condition>:
#                   <statements>
#           - example:
#               elif (10 < 8):
#                   print("np")
#       - else statements
#           - runs if all conditions are false
#           - syntax:
#               else:
#                   <statemnts>
#           - example:
#               else:
#                   print("maybe")
#       - if-else statements
#           - a combination of the if and else stataments
#           - example:
#               if (100 == 28):
#                   print("Hello")
#               else:
#                   print("World")
#       - if-elif-else statements
#           - a combination of if, elif and else if statements
#           - multiple elif statements are possible
#           - example:
#               if ("idkman" == "lumbago"):
#                   print("no")
#               elif ("yes" == "maybe"):
#                   print("probs")
#               elif (True is False):
#                   print(10)
#               else:
#                   print(3.14)
#       - match-case statements
#           - an alternative approach to the if-elif-else stataments
#               - offers a clean and organized approach
#           - similar to the switch-case statement in Java
#           - syntax:
#               match <expression>:
#                   case <condition>:
#                       <statements>
#                   case _:
#                       <statements>
#           - example:
#               match (10):
#                   case 100:
#                       print("maybe")
#                   case 1:
#                       print("no")
#                   case _:
#                       print("yes")
#           - the case condition is similar to the if and elif statements
#               - being a conditional statement
#               - it runs the code block if is True
#           - case _ acts as the default state,emt
#               - it runs if all case confitions are false
#   - it is possible to nest conditional statements inside of each other
#       - example:
#           if 100 == 100:
#               if True is True:
#                   print("yes")
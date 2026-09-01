# Classes
class test:
    pass
    #the most basic class
    
class advanced_class:
    #Class Attributes
    section = "wanB"
    
    #Instance Attributes
    def __init__(self, nagan, iskor):
        self.nagan = nagan
        self.iskor = iskor
    def display_class(self):
        print(f'nagan ko keh {self.nagan}')
        print(f'iskor ko keh {self.iskor}')
    #basic class declaration

#test class calls
print(test())

#Instantiation
jammo = advanced_class("tarcyjams", "negative")
jammo.display_class()
print(jammo.section)

# Method Overriding
class Override:
    def class_to_be_overriden(self):
        #old function class
        print('this is the old thing`ma`bob before being overriden')
    
class New(Override):
    def class_to_be_overriden(self):
        # new funvtion class
        print('new thing`ma`bob')
        
#testing override
test_old = Override()
test_new = New()

test_old.class_to_be_overriden()
test_new.class_to_be_overriden()

#how to not override, just add stuff
class how_to_basics:
    def same_stuff(self):
        print('same thing')
class how(how_to_basics):
    def same_stuff(self):
        super().same_stuff()
        print('same thing but with old thing`ma`bob')
        
override1 = how_to_basics()
override2 = how()
override1.same_stuff()
override2.same_stuff()

# Method Overloading
class Overloading():
    def testing(self, x, y, z=0):
        return x + y + z

calc = Overloading()
print(calc.testing(1, 10))
print(calc.testing(1, 10, 100))


# Public Methods
def public_function():
    pass
    #public, accessible anytime

# Protected Methods
def _protected_function():
    pass
    #not necessarily private but it hints that it shouldn't be touched unless permitted

# Private Methods
def __private_method():
    pass
    #python intentionally overrides the name internally such that it can't be overriden

#example
class Private():
    def print_me(self):
        print('you can`t')
try_me = Private()
try_me.print_me
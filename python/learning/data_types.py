# data types
#   - Python has 8 data types
#       - being a text type, numeric type, sequence type, mapping type, set type, boolean type, binary type and none type
#       - Text Type:
#           - str
#               - stores string or text values
#               - encased in either single or double quotation marks
#                   - single quotes ' '
#                   - double quotes " "
#               - example:
#                   "Hello World"
#                   'idkman'
#               - values are able to be casted as str using the str() class
#                   - syntax:
#                       str(<value>)
#                   - example:
#                        str("Hello World")
#                        str('idkman')
#               - multiline strings
#                   - it is possible to have string that span multiple lines
#                   - it is done through the use of triple quotes
#                       - single quotes ''' '''
#                       - double quotes """ """
#               - strings are arrays
#                   - while python doesn't have a char type like other languages
#                       - a single characters is a string with a length of 1
#                   - strings are immutable
#                       - it cannot be modified after being declared
#
#       - Numeric Type:
#           - int
#               - are whole numbers
#               - it must be without decimals
#               - example:
#                   1, 2, 3, 4, 5
#               - values are able to be casted as int using the int() class
#                   - syntax:
#                       int(<value>)
#                   - example:
#                       int(23)
#                       int("12")
#                   - note that the string value when casting must only be numeric values
#                       - casting with letters or a mix of letters and numbers values will result into errors
#           - float
#               - are decimal numbers
#               - it can be declared with or without decimals
#               - example:
#                   3.14, 4.19, 5.15
#               - values are able to be casted as float using the float() class
#                   - syntax:
#                   float(<value>)
#                   - example:
#                   float(6.12)
#                   float"1.11")
#                   - note that the string value when casting must only be numeric values
#                       - casting with letters or a mix of letters and numbers values will result into errors
#           - complex
#               - combination of real and imaginary numbers
#               - j or J represents the imaginary number
#               - commonly represented as R + iJ
#                   - where R is the real number
#                   - where iJ is the imaginary number
#               - example:
#                   7j, 2 + 3j, 10J
#               - values are able to be casted as complex using the complex() class
#                   - syntax:
#                       complex(<value>)
#                   - example:
#                       complex(3 + 7j)
#                       complex("2+6J")
#                   - note that the string value when casting must be in the form of complex numbers
#                       - casting with any other string value will result into errors
#                       - the string must also not contain spaces
#
#       - Boolean Type
#           - bool
#               - contains a boolean value
#                   - either True or False
#               - example:
#                   True
#                   1
#                   "yes"
#               - any value can be a boolean
#                   - numeric values aside from 0 are True
#                       - 0 being false
#                   - text values aside from an empty string are True
#                       - an empty "" is false
#                   - collections aside from an empty collection are True
#                       - an empty [], {} or () is false
#               - values are able to be casted as a boolean using the boolean() class
#                   - syntax:
#                       boolean(<value>)
#                   - example:
#                       bool(True)
#                       bool(0)     #> False
#                       bool("yes") #> True
#
#       - Sequence Type:
#           - list
#               - contains ordered and mutable collections of values
#                   - allows duplicate entries
#               - example:
#                   [1, 3.14, "idkman"]
#               - lists are denoted by the brackets [ ] symbol
#                   - anything inside the brackets are considered as a list
#               - values or collections are able to be casted as a list using the list() class
#                   - syntax:
#                       list(<iterable>)
#                   - example:
#                       list([1, 2, 3])
#                       list("yes")
#                   - note that the value required by the list() class must be an iterable
#                       - it can be another list, tuple, dictionary, set, or strings
#           - tuples
#               - contains ordered and immutable collections of values
#                   - allows duplicate entries
#               - example:
#                   (1, 3.14, "lumbago")
#               - tuples are denoted by the parenthesis ( ) symbol
#                   - anything inside the parentheses are considered as a tuple
#               - values or collections are able to be casted as a tuple using the tuple() class
#                   - syntax:
#                       tuple(<iterable>)
#                   - example:
#                       tuple((4, 5, 6))
#                       tuple("no")
#                   - note that the value required by the tuple() class must be an iterable
#                       - it can be another tuple, list, dictionary, set, or strings
#           - range
#               - are a range of values
#               - the value inside must be an integer
#               - uses the range() class
#                   - syntax:
#                       range(<start>, <stop>, <step>)
#                   - example
#                       range(5)
#                       range(1, 4)
#                       range(2, 6, 3)    
#
#       - Mapping Type:
#           - dict
#               - shortened name for dictionaries
#               - contains unordered and mutable collection of pairs of values
#                   - pairs must be in the form of keys and value
#                   - keys duplicates are not allowed
#                   - value duplicates are allowed
#               - example:
#                   {"yes": "no", "idkman": "lumbago", "Hello": "World"}
#               - values or collections are able to be casted as a dictionary using the dict() class
#                   - syntax:
#                       dict(<dictionary>)
#                       #> or
#                       dict(<variable1> = <value1>, <variable2> = <value2>)
#                   - example:
#                       dict({"idk": "man"})
#               - note that the dict() class can only take in dictionary objects or a list of variable declarations
#
#       - Set Type:
#           - set
#               - contains unordered and immutable collections of values
#                   - does not allow duplicate entries
#               - example:
#                   (1, 10, 3, "maybe", false)
#               - values or collections are able to be casted as a set using the set() class
#                   - syntax:
#                       set(<iterable>)
#                   - example:
#                       ste((1, 2, 3, "yes"))
#                   - note that the value required by the set() class must be an iterable
#                       - it can be another set, list, tuple, dictionary, or strings
#           - frozenset
#               - a "frozen" form of a regular set
#                   - does not allow any modifications to the set
#               - example:
#                   frozenset(1, "maybe", True)
#               - values or collections are able to be casted as a frozen set using the frozenset() class
#                   - syntax:
#                       frozenset(<set>)
#                   - example:
#                       frozenset(("yes", "maybe", False))
#                   - note that the value required by the set() class must be an iterable
#                       - it can be another set, list, tuple, dictionary, or strings
#
#       - Binary Type
#           - bytes
#               - example:
#                   bytes(4)
#           - bytearray
#               - example:
#                   bytearray(2)
#           - memoryview
#               - example:
#
#       - NoneType
#           - None
#               - represents no type
#               - a special constant in Python
#                   - is the absence of a value
#               - is the only instance of the NoneType object
#               - commonly used to set a variable to 'no value' or 'not set'
#               - evaluates to False in a boolean context
#               - functions with no return statements return None by default
#               - example:
#                   x = None

def data_types():
    print('Python Data Types')
    text_type()
    numeric_type()
    boolean_type()
    sequence_type()
    mapping_type()
    set_types()
    binary_type()
    none_type()
def text_type():
    print('Text type:')
    print('str : ', "Hello World")
    print()
def numeric_type():
    print('int     : ', 127)
    print('float   : ', 3.14)
    print('complex : ', 2 + 3j)
    print()
def boolean_type():
    print('bool : ', True)
    print()
def sequence_type():
    print('list  : ', [1, "idkman", False])
    print('tuple : ', (2, "lumbago", True))
    print()
def mapping_type():
    print('dict : ', {"yes" : "no", "hello" : "world"})
    print()
def set_types():
    print('set       : ', (1, "maybe", 3.14))
    print('frozenset : ', 'frozenset', (2, "probs", 6.18))
    print() 
def binary_type():
    print('bytes      : ', bytes(1))
    print('bytesarray : ', bytearray(2))
    print('memoryview : ', memoryview(bytes(2)))
    print() 
def none_type():
    print('NoneType : ', None)
if __name__ == '__main__':
    data_types()
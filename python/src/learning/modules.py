# modules
#   - built-in modules
#       - datetime
#           - imports datetime objects
#               - allowing to work on date and time
#           - classes
#               - date
#                   - represents a date
#                   - year, month or day
#                   - based on the Gregorian Calendar
#               - time
#                   - represents a time
#                       - independent of any date
#                   - hour, minute, second, microsecond or tzinfo (timezoneinfo)
#               - datetime
#                   - combines both date and time
#                   - year, month, day, hour, minute, second, microsecond and tzinfo
#               - timedelta
#                   - represents the difference between two dates or times
#               - tzinfo
#                   - an abstract base class for timezene information
#               - timezone
#                   - fixed offset class
#                   - a subclass of tzinfo
#           - date class
#               - used to create and manipulate date objects
#               - when an instance of this class is created
#                   - it represents a specific calendar date in ISO 8601 format
#                   - YYYY-MM-DD
#               - creating a date object
#                   - syntax:
#                       datetime.date(<year>, <month>, <day>)
#                   - parameters:
#                       - year
#                           - an integer between MINYEAR and MAXYEAR
#                           - MINYEAR = 1
#                           - MAXYEAR = 9999
#                       - month
#                           - an integer between 1 to 12
#                           - 1 is January, 12 is December
#                       - day
#                           - an integer that is valid for the specified montn and year
#                           - note that on February, it is either 28 or 29 depending on the leap year
#                   - example:
#                       print(datetime.date(2026, 6, 26)) #> 2026-06-26
#                   - sidenote:
#                       - entering values that is not an integer will throw a TypeError
#                       - providing values larger than MAXYEAR or smaller than MINYEAR, will throw a ValueError
#                       - the date object does not include any time or timezone information
#                           - for that, refer to datetime
#               - attributes and methods
#                   - .ctime()
#                       - returns a string representation of the date
#                       - syntax:
#                           datetime.date.ctime(<datetime.date_object>)
#                       - example:
#                           import datetime
#                           date_today = datetime.date.today()
#                           print(datetime.date.ctime(date_today))
#                   - .isoformat()
#                       - converts the date into a string format
#                   - .today()
#                       - returns the date today
#                       - syntax:
#                           datetime.date.today()
#       - math
#           - extends the list of mathematical functions
#           - refer to methods for base Python math modules
#           - methods
#               - math.sqrt()
#                   - returns the square root of a number
#                   - syntax:
#                       math.sqrt(<number>)
#               - math.ceil()
#                   - returns the nearest ceiling rounding operation
#                   - syntax:
#                       math.ceil(<number>)
#               - math.floor()
#                   - returns the nearest floor rounding operation
#                   - syntax:
#                       math.floor(<number>)
#               - math.pi
#                   - returns the value of pi
#                   - is a constant value
#                   - syntax:
#                       math.pi
#       - re
#           - short for regular expressions
#               - RegEx
#           
#       - json
#           - stands for JavaScript objext notation
#           - syntax used for storing and exchanging data
#           - parsing JSON to Python
#               - uses the .loads() method
#               - syntax:
#                   json.loads(<json>)
#               - example:
#                   #> example json file as a variable
#                   json_test = '{ "yes":"no", "idk":"man", "Hello":"World"}'
#                   json.loads(json_test)                                     #> converts the json into a Python dict object
#           - dumping Python to JSON
#               - uses the .dumps() method
#               - syntax:
#                   json.dumps(<dict_name>)
#               - example:
#                   dict_test = '{ "yes":"no", "idk":"man", "Hello":"World"}'
#                   json.dumps(dict_test)                                     #> converts the dict object into a json string
#               - has an indent, separators and sort_keys parameters
#                   - json.dumps(<dict>, indent=<number>)
#                       - specifies the amoount of spaces per indent
#                   - json.dumps(<dict>, separators=<separators>)
#                       - specifies the separators to use
#                       - default value is (",", ":")
#                   - json.dumps(<dict>, sort_keys=<bool>)
#                       - specifies if the keys should be sorted or not
#                       - either a True or False
#           - list of objects convertible into JSON strings
#               Python      JSON 
#               - dict      Object
#               - list      Array
#               - tuple     Array
#               - str       String
#               - int       Number
#               - float     Number
#               - bool      true or false
#               - None      null
#
#   - Python PIP
#       - is Python's package manager
#       - used to install packages and modules online
#       - has to be used in Python's terminal
#       - downloading a package
#           - syntax:
#               pip install <package>
#           - example:
#               pip install camelcase
#       - using a package
#           - syntax:
#               #> inside a Python file
#               import <package>
#           - example:
#               import camelcase
#       - removing a package
#           - syntax:
#               pip uninstall <package>
#           - example:
#               pip uninstall camelcase
#       - list packages install
#           - syntax:
#               pip list
#
#   - user-defined modules
#       - a file containing a set of functions, methods or classes
#       - similar to packages in Java
#       - user-defined modules are done by creating and defining a Python file (.py)
#           - by default, Python looks for modules in the same folder as the current file
#           - changing paths are done view the use of the sys module
#               - example:
#                   import sys
#                   sys.path.append(/home/tarcy_arch/Documents/Programming/python/learning)
#                   #> Python will then look inside this path (folder) for modules when importing
#       - to import a module, the import keyword is used
#           - importing user-defined modules will require the filename without extensions
#           - syntax:
#               import <module_name>
#           - example:
#               #> importing a custom module named my_module.py
#               import my_module
#           - to import a module with an alias, the as keyword is added
#               - syntax:
#                   import <module_name> as <alias>
#               - example:
#                   import my_module as custom_mod
#           - to import a single attribute in a module, the from keyword is used
#               - syntax:
#                   from <module_name> import <attribute>
#               - syntax:
#                   #> importing a function called my_function
#                   from my_module import my_function
#       - when a module is imported, all of its attributes are available
#           - attributes like collections, functions, methods and classes
#               - lists, tuples, dictionaries, etc.
#           - example:
#               #> accessing a tuple named my_tuple in my_module
#               import my_module
#               my_module.my_tuple
#               #> accessing a function called my_function()
#               my_module.my_function()
#       - viewing and accessing the available attributes of a module is done through the dir() function
#           - syntax:
#               dir(<module_name>)
#           - example:
#               dir(my_module)




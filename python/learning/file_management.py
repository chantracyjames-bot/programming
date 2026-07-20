# file management
#   - file access
#       - accessing files in python is done through the open() function
#       - syntax:
#           open(<filename>, <file_mode>)
#       - the function has four files modes
#           - r
#               - read mode
#               - opens a file for reading
#                   - the default value
#                   - throws an error if the file does not exist
#               - syntax:
#                   open(<filename>, "r")
#               - example:
#                   open("my_file.txt", "r")
#           - w
#               - write mode
#               - opens a file for writing
#                   - overwrites the entire file when writing
#                   - creates a new file if it does not exist
#               - syntax:
#                   open(<filename>, "w")
#               - example:
#                   open("my_file.txt", "w")
#           - a
#               - append mode
#               - opens a file for appending
#                   - writes any changes to the end of the file
#                   - creats a new file if it does not exist
#               - syntax:
#                   open(<filename>, "a")
#               - example:
#                   open("my_file.txt", "a")
#           - x
#               - create mode
#               - creates a file with the specified name
#                   - thows an error if the file already exists
#               - syntax:
#                   open(<filename>, "x")
#               - example:
#                   open("my_file.txt", "x")
#       - the function also takes two more arguments
#           - determines the mode that the content is displayed
#           - t
#               - text mode
#               - opens the file as a text
#                   - the default mode
#               - syntax:
#                   open(<filename>, "<file_mode>t")
#               - example:
#                   open("my_file.txt", "wt") # opens the file to write text
#           - b
#               - binary mode
#               - opens the file in binary
#                   - used for images and other file formats
#               - syntax:
#                   open(<filename>, "<file_mode>b")
#               - example:
#                   open("my_file.txt", "rb") #> opens the file to read binary
#
#   - file location
#       - if the file is in the same folder as the program, it is same to use just the file name
#           - example:
#               // opening a file named "file"
#               file = open(file)
#       - if the file is not in the current folder. it can be accessed in two ways
#           - relative path
#               - it is the path that is relative to the current working directory
#                   - it is the folder where the program is currently running
#               - on Unix-like systems, it is commonly denoted by "./"
#                   - or the current working directory (cwd)
#               - example:
#                   // a file is inside a folder named "folder" in the same cwd 
#                   # cwd
#                   #  |--> my_program.py         // current program
#                   #  \--> folder
#                   #    \--> my_other_program.py // program trying to be accessed
#                   // the syntax to open the file would be:
#                   // Unix-like
#                   file = open("./folder/my_other_program.py")
#                   // Windows
#                   file = open(".\\folder\\my_other_program.py")
#               - explanation
#                   - ./                           // is the current directory
#                   - ./folder                     // is a folder inside the current directory
#                   - ./folder/my_other_program.py // is the file trying to be accessed inside a folder inside the current directory
#           - absolute path
#               - it is the path that starts from the root of the file system
#                   - C: for Windows
#                       - or any drive letter
#                   - / for Unix-like systems
#                       - / is used in Linux, macOS, etc.
#               - example:
#                   // in Linux, assuming program is at the default Docuemnts folder
#                   #  /                                                            // root
#                   #  |--> /home
#                   #  | |--> /home/user
#                   #  | | |--> /home/user/Documents
#                   #  | | | |--> /home/user/Documents/my_program.py
#                   #  | | | \--> /home/user/Documents/folder
#                   #  | | |   \--> /home/user/Documents/folder/my_other_program.py // file trying to be accessed
#                   // the syntax to open the file would be:
#                   // Linux
#                   file = open("/home/user/Documents/folder/my_other_program.py") 
#                   // macOS equivalent
#                   file = open("/User/user/Documents/folder/my_other_program.py") 
#                   // Windows equivalent
#                   file = open("C\\User\\user\\Documents\\folder\\my_other_program.py")
#
#   - file manipulation
#       - creating new files
#           - it is done through the use of the create file mode of the open() function
#           - syntax:
#               open(<filename>, "x")
#           - example:
#               open("my_file.txt", "x")
#           - sidenote:
#               - if the file already exists, the function will throw an error
#               - files can also be created using the write or append mode of the open() function
#                   - syntax:
#                       open(<filename>, "w")
#                       #> or
#                       open(<filename>, "a")
#                   - example:
#                       open("my_file.txt", "w")
#                       #> or
#                       open("my_file.txt", "a")
#
#       - reading a file
#           - it is done through the use of the read file mode of the open() function
#           - syntax:
#               open(<filename>, "r")
#           - example:
#               open("my_file.txt", "r")
#           - reading part of a file is done through certain methods
#               - reading only a number of characters
#                   - done through the .read() method
#                   - syntax:
#                       <file_variable>.read(<number>)
#                   - example:
#                       file.read(5) #> reads five characters inside the file
#               - reading a whole line
#                   - done through the .readline() method
#                   - syntax:
#                       <file_variable>.readline()
#                   - example:
#                       file.readline()
#                   - note that each succeeding use of this function will read the next lines
#               - reading multiple lines
#                   - done through the .readlines() method
#                   - syntax:
#                       <file_variable>.readlines()
#                   - example:
#                       file.readlines()
#
#       - writing to a file
#           - it is done through the use of the write file or append file mode of the open() function
#           - syntax:
#               open(<filename>, "w")
#               #> or 
#               open(<filename>, "a")
#           - example:
#               open("my_file.txt", "w")
#               #>
#               open("my_file.txt", "a")
#           - write mode
#               - note that using this mode is destructive
#               - it overwrites the files contents before writing into it
#                   - i.e. erases everything before writing new contents
#           - append mode
#               - unlike write mode, this mode does not erase the existing contents of afile
#               - it will only append the content it writes
#                   - i.e. add the new content to the end of the file
#           - writing to a file is done through certain methods
#               - writing a single string or entry
#                   - done through the .write() method
#                   - syntax:
#                       <file_variable>.write(<string>)
#                   - example:
#                       file.write("lumbago")
#               - writing multiple lines or a list of strings
#                   - done through the .writelines() method
#                   - syntax:
#                       <file_variable>.writelines(<string_list>)
#                   - example:
#                       file.writelines(["idkman", "lumbago"]) #> adding newlines \n will write each entry to a
#                                                              #>  separate line instead being on the same line
#           - to guarantee that the file is written without closing the file
#               - the .flush() method is used
#               - this method ensures that the internal buffer gets flushed out
#                   - i.e. Python will tell the system to write the contents without closing the file first
#               - syntax:
#                   <file_variable>.flush()
#               - example:
#                   file.flush()
#               - note that this method is usually used after writing to a file without closing it yet
#           - to truncate the file
#               - or shrink it to a certain number of bytes
#                   - the .truncate() method is used
#               - it truncates the file to the set number of bytes that the argument takes
#               - syntax:
#                   <file_variable>.truncate()
#               - example:
#                   file.truncate(10) #> truncates the file to 10 bytes
#                                     #> any text after ten bytes is deleted
#               - the default number of bytes that this method take is the current pointer position
#                   - i.e. if the pointer is at position 25, the .truncate() method truncates the file to 25 bytes
#
#       - closing the file
#           - after a file has been used or been tampered with
#               - it is recommended to close the file to ensure any changes are made
#               - sometimes, due to buffering, certain changes are not made until the file is closed
#           - it is done through the .close() method
#           - syntax:
#               <file_variable>.close()
#           - example:
#               file.close()
#           - it is generally recommended to use the "with" keyword in addition to the open() function
#               - as this makes closing the file easier and is considered the Pythonic way of handling files
#               - syntax:
#                   with open(<filename>, <mode>) as <variable_name>:
#                       <statements>
#               - example:
#                   with open("my_file.txt", "w") as file:
#                       file.write("idkman")
# 
#       - querying the file
#           - in order to know if the file is writable or readable, or even seekable
#               - the .writable() or .readable(), or seekable() methods are used
#               - these methods return a boolean corresponding to their purpose
#               - syntax:
#                   <file_variable>.writable()
#                   #> or
#                   <file_variable>.readable()
#                   #> or
#                   <file_variable>.seekable()
#               - example:
#                   file.writable() #> returns True if writable
#                   #> or
#                   file.readable() #> returns True if readbale
#                   #>
#                   file.seekable() #> returns True if seekable
#           - to change the current pointer of the file
#               - i.e. change the current position of the pointer
#               - the .seek() method is used
#                   - this method accepts a number as an argument and advances the pointer to that amount
#               - syntax:
#                   <file_variable>.seek(<number>)
#               - example:
#                   file.seek(5) #> advances the pointer by 5 bytes
#                                #> "idkman" becomes "n"
#           - to query the current pointer of the file
#               - the .tell() method is used
#                   - i.e. know what position it is current at after using the .seek() method
#               - syntax:
#                   <file_variable>.tell()
#               - example:
#                   file.tell()
#           - to query whether the file stream is interactible or not
#               - the .isatty() method is used
#               - if the current program is run using the terminal
#                   - the output of this meth0d is True
#               - if the current program is being piped to another stream or session
#                   - the output od this method is False
#               - syntax:
#                   <file_variable>.isatty()
#               - exaple:
#                   file.isatty()
#           - to query the current file descriptor of the current file handling session
#               - it is done through the .fileno() method
#               - usually, the output of this file is 3, or can be 4, 5 etc.abs
#                   - this is due to the first three descriptors being reserved to standard streams
#                   - 0 being reserved for sys.stdin
#                   - 1 being reserved for sys.stfout
#                   - 2 being reserved for sys.stderr
#               - syntax:
#                   <file_variable>.fileno()
#               - example:
#                   file.fileno()
#               - sidenote:
#                   - this is commonly used inside the os.fsync() (filesync) method to flush current buffer
#                   - example:
#                       file.flush()            #> Python to System
#                       os.fsync(file.fileno()) #> System to Dish
#
#       - deleting a file
#           - Python's native file handling does not have any file deletion methods
#               - though this is remedied using the os module
#               - syntax;
#                   os.remove(<filename>)
#               - example;
#                   os.remove("my_file.txt") #> deletes the file at the cwd
#               - it is coupled with a file check to see if the file exists or not
#                   - syntax:
#                       os.path.exists(<filename>)
#                   - example:
#                       os.path.exists("my_file.txt") #> returns True if the file exists
#               - folders and directories are able to be removed using a similar syntax
#                   - syntax;
#                       os.rmdir(<folder_name>)
#                   - example:
#                       os.rmdir("my_folder")
#                   - note that this command only removes empty folders
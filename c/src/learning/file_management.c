/* file management
    - file access
        - accessing files in C is achieved using a special pointer type called FILE
            - FILE is used like a data type, used to initialize variables
            - syntax:
                - FILE *<variable_name>;
        - after creating the file pointer variable, it is no possible to access files using the fopen() function
            - syntax:
                <variable_name> = fopen(<file_name>, <file_mode>)
            - sidenote:
                - <file_name>
                    - the file name is the name of the file or it's location in a filesystem
                    - the location of a file can either be a relative path or an absolute one
                - <file_mode>
                    - C has three types of access modes, w (write), a (append), or r (read)
        - once the file has been accessed, it is required to close it after use
            - achieved thourgh the fclose() function
            - leaving a file unclosed leads to data or resource leaks or memory hogging

    - file location
        - if the file is in the same folder as the program, it is same to use just the file name
            - example:
                // a file in the same folder named yes.txt
                FILE *maybe;
                maybe = fopen("yes.txt", "w"); // opens yes.txt in write mode
        - if the file is not in the current folder. it can be accessed in two ways
            - relative path
                - it is the path that is relative to the current working directory
                    - it is the folder where the program is currently running
                - on Unix-like systems, it is commonly denoted by "./"
                    - or the current working directory (cwd)
                - example:
                    // a file is inside a folder named "folder" in the same cwd 
                    # cwd
                    #  |--> my_program.c        // current program
                    #  \--> folder
                    #    \--> my_other_prgram.c // program trying to be accessed
                    // the syntax to open the file would be:
                    // Unix-like
                    FILE my_file;
                    my_file = fopen("./folder/my_other_program.c", "r");     // opens the file in read mode

                    // Windows
                    FILE my_win_file;
                    my_win_file = fopen(".\folder\my_other_program.c", "a"); // opens the file in append mode
                - explanation
                    - ./                          // is the current directory
                    - ./folder                    // is a folder inside the current directory
                    - ./folder/my_other_program.c // is the file trying to be accessed inside a folder inside the current directory
            - absolute path
                - it is the path that starts from the root of the file system
                    - C: for Windows
                        - or any drive letter
                    - / for Unix-like systems
                        - / is used in Linux, macOS, etc.
                - example:
                    // in Linux, assuming program is at the default Docuemnts folder
                    #  /                                                           // root
                    #  |--> /home
                    #  | |--> /home/user
                    #  | | |--> /home/user/Documents
                    #  | | | |--> /home/user/Documents/my_program.c
                    #  | | | \--> /home/user/Documents/folder
                    #  | | |   \--> /home/user/Documents/folder/my_other_program.c // file trying to be accessed
                    // the syntax to open the file would be:
                    // Linux
                    FILE linux_file;
                    linux_file = fopen("/home/user/Documents/folder/my_other_program.c", "r"); // opens the file in read mode

                    // macOS equivalent
                    FILE mac_file;
                    mac_file = fopen("/User/user/Documents/folder/my_other_program.c". "a")    // opens the file in append mode

                    // Windows equivalent
                    FILE win_file;
                    win_file = fopen("C:\Users\user\Documents\folder\my_other_program.c", "w") // opens the file in write mode

    - file manipulation
        - fopen() 
            - has three mode to access files
                - w
                    - the write mode
                    - it modifies the file and writes date into it
                    - note that using this mode will clear the previous contents of the file
                        - it will be overriden by the new data
                    - it can be used to create a new file if it doesn't exist
                - w+
                    - an advanced version of the write mode
                    - apart from the features of the write mode, it can also be used to read the file
                - a
                    - the append mode
                    - a less destructive version of the write mode
                    - it writes data into the file
                        - any new content gets added at the end of the file
                    - it can be used to create a new file if it doesn't exist
                - a+
                    - an advanced version of the append mode
                    - apart from the features of the append mode, it can also be used to read the file
                - r
                    - the read mode
                    - used to read data from a file
                    - note that it returns NULL is the file does not exist
                - r+
                    - an advanced version of the read mode
                    - aside from the feature of the read mode, it can also be used to write into files
                    - note that this mode does not truncate (or reset) the file
                        - but it still returns NULL is the file does not exist
                        - it doesn't create a new file if the file is not present
                    - the write mode acts like a replace mode (overtype)
                        - overriding the text wherever the cursor is at
            - to prevent errors when reading a NULL file, a conditional statement is used
                - example:
                    if (file_read == NULL) {...}
                - runs a code block is the fopen() returns NULL
    - fprintf()
        - used to write data into files
            - requires any of the write of append modes
        - syntax:
            fprintf(<file_variable>, <string>);
        - example:
            fprintf(file_write, "yes"); // writes yes to the file
    
    - fgets()
        - used to read files
            - requires any read modes
        - syntax:
            fgets(<variable_to_store>, <variable_size>, <file_variable>);
        - fgets() requires a variable to store the text to be read
            - example:
                char my_text[100];              // declaring a char[] (or string) variable to store the text
                fgets(my_text, 100, file_read); // first argument is the name of variable to store text
                                                // second argument is the amount of text to read, 
                                                // using the same size as the char array is recommended
                                                // third argument if the name of the file variable
        - sidenote:
            - fgets() only reada the first line, or a newline character ("\n")
                - to bypass this, a loop is utilized
                - example:
                    while(fgets(my_text, 100, file_read)) {...}
            - fgets() only reads until n - 1, where n is the size of the array or the number declared
            - fgets() stops when it has encounter the End-of-File
*/
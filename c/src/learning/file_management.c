/* file management
    - is the process of creating, opening, reading, writing and closing operations on a file
    - file access
        - accessing files in C is achieved using a special pointer type called FILE
            - FILE is used like a data type, used to initialize variables
            - syntax:
                - FILE *<variable_name>;
        - after creating the file pointer variable, it is now possible to access files using the fopen() function
            - syntax:
                <variable_name> = fopen(<file_name>, <file_mode>)
            - sidenote:
                - <file_name>
                    - the file name is the name of the file or it's location in a filesystem
                    - the location of a file can either be a relative path or an absolute one
                - <file_mode>
                    - C has three types of access modes, w (write), a (append), or r (read)
                    - plus more advanced file access modes like r+, w+, or a+
        - once the file has been accessed, it is required to close it after use
            - achieved thourgh the fclose() function
            - leaving a file unclosed leads to data or resource leaks or memory hogging

    - file location
        - if the file is in the same folder as the program, it is same to use only the file name
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
        - opening a file
            - fopen() 
                - has three mode to access files
                    - w
                        - write mode
                        - it modfies and writes into the file
                        - sidenote:
                            - using this mode will truncate the previous contents of the file
                                - i.e. the file will become blank before writing new data into it
                            - if the file does not exist
                                - this mode creates a new file with the same name
                        - syntax:
                            fopen(<file_name>, "w");
                        - example:
                            fopen("my_file", "w");
                    - w+
                        - an advanced version of the normal write mode
                        - apart from the features of the regualr write mode
                            - it is also able to be used to read files
                        - syntax:
                            fopen(<file_name>, "w+");
                        - example:
                            fopen("my_file", "w+");
                    - a
                        - append mode
                        - it writes data into the file
                            - a less destructive version of write mode
                            - any new content gets appended (or added) at the end of the file
                                - instead of clearing and writing into the file
                        - like write mode, it can also be used to create new files
                            - only if the file doesn't exists beforehand
                        - syntax:
                            fopen(<file_name>, "a");
                        - example:
                            fopen("my_file", "a");
                    - a+
                        - an advanced version of the normal append mode
                        - apart from the features of the regular append mode 
                            - it is also able to be used to read files
                        - syntax:
                            fopen(<file_name>, "a+");
                        - example:
                            fopen("my_file", "a+");
                    - r
                        - read mode
                        - it reads data from a file
                        - sidenote:
                            - if the file does not exists
                                - this function returns the value NULL
                        - syntax:
                            fopen(<file_name>, "r");
                        - example:
                            fopen("my_file", "r");
                    - r+
                        - an advanced version of the normal read mode
                        - apart from the features of the regular write mode
                            - it can also be used t write into files
                        - sidenote:
                            - unlike the write mode
                                - this mode does not truncate the file before use
                                - but will still return NULL is the file does not exits
                                    - it doesn't create a new file if the file is not present
                            - the write mode of this mode
                                - writing acts like overtype mode, or replace mode
                                - overriding where ever the cursor is at
                - has special special modes for binary file management
                    - wb
                        - same as the regular write mode
                        - writes the file in binary write mode
                    - ab
                        - same as the regular append mode
                        - writes the file in binary append mode
                    - rb
                        - same as the regular read mode
                        - opens the file in binary mode
                    - wb+
                        - same as the regular write + read mode
                        - writes the file in binary write mode
                    - ab+
                        - same as the regular append + read mode
                        - writes the file in binary append mode
                    - rb+
                        - same as the regular read + write mode
                        - opens the file in binary mode
                - sidenote:
                    - a conditional statement is used to prevent NULL pointers
                        - runs a code block is the fopen() returns NULL
                    - syntax:
                        if (<file_variable> == NULL) {...}
                    - example:
                        if (p_file == NULL) {
                            exit(1);          // exits the program if the file is NULL
                        }
                    
        - writing into files
            - fprintf()
                - similar to printf
                    - takes in format arguments to print output to files
                    - but used for writing data into files
                        - requires any of the write or append modes
                - syntax:
                    fprintf(<file_variable>, <string>);
                - example:
                    fprintf(file_write, "yes"); // writes "yes" to the file
            - fputs()
                - prints a whole line in the file
                    - also adds a newline '\n' at the end of said line
                - syntax:
                    fputs(<string>, <file_variable>);
                - example:
                    fputs(my_text, p_file);
            - fputc()
                - prints a single characted into the file
                - syntax:
                    fputc(<char>, <file_variable>);
                - example:
                    fputc('Y', p_file);
            - putw()
                - prints a number to the file
                - syntax:
                    putw(<int>, <file_variable>);
                - example:
                    putw(23, p_file);
        - reading from files
            - fscanf()  
                - simiar to scanf
                    - takes in format arguments to scan input from files
                    - but used for reading input from files
                        - requires any of the read files
                - syntax:
                    fscanf(<file_variable>, <format>);
                - example:
                    fscanf(p_file, "%10s");            // scans for 10 characters
            - fgets()
                - used to read whole lines from a file 
                    - requires a variable to store said lines
                - sidenote:
                    - fgets() reads data from a line until a newline '\n' is reached
                    - it is commonly used with a loop, to read the entire file
                        - until it reaches EOF, End Of File
                - syntax:
                    fgets(<variable>, <size>, <file_variable>);
                - exampe:
                    fgets(text, 100, p_file); // reads 100 characters and places it in the variable text
            - fgetc()
                - used to read a character from a fle
                - syntax:
                    fgetc(<file_variable>);
                - example:
                    fgetc(p_file); // grabs a character from the file
            - getw()
                - used to read a number from a fle
                - syntax:
                    getw(<file_variable>);
                - example:
                    getw(p_file); // grabs a character from the file
        - closing a file
            - fclose()
                - used to close any files opened during program execution
                - it is generally recommended to close files after use
                    - used to prevent any memory leaks or resource hog
                - syntax:
                    fclose(<file_variable>);
                - example:
                    fclose(p_file);
        - moving the pointer
            - fseek()
                - used to navigate through files
                - note that the file pointer points to the position according to the mode
                    - or the last read or write operation
                - it is possible to manually move the pointer to any position
                    - the offset position can be positive (advance) or negative (retract)
                - syntax:
                    fseek(<file_variable>, <offset_position>, <position>);
                - example:
                    fseek(p_file, 100, 0); // moves the pointer from 0, with a offset of positive 100
                
*/

#include <stdio.h>

int main() {
    FILE *p_file = fopen("test.file", "r");
    char text[100];
    printf("%i", getw(p_file));
}
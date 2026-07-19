#!/bin/bash

echo "Hello World"

# Bourne Again SHell
#   - Bash is a text-based interface wherein it enables an interface 
#       - an interface that talks to the System to perform operations
#       - created by Brian Fox in 1989
#   - Bash originated as an improved version of sh (Bourne Shell)
#       - the orginal Unix shell that was developed by Stephen Bourne
#   - why Bash?
#       - it is widely available in all Unix or Unix-like systems
#           - like in BSD and its derivatives like macOS, and Linux distributions
#       - it supports powerful scripting features
#           - like loops, conditionals and functions
#       - it provides command history and tab completion
#           - mainly for ease of use
#       - it is able to be integrated with other Unix or Unix-like tools
#           - importanty like automated scripts

# Command List Overview
# alias
#   - used to create shortcuts for verbose commands
#   -
# cat
#   - concatenate and display files (like .txt)
#   - 
# cd
#   - moves to a different working directory
#   -
# cp
#   - copies files to another location or a different name
#   - 
# echo
#   - displays a line of text to the terminal
#   -
# grep
#   - used to search for text patterns within files
#   -
# ls
#   - lists the contents of a directory
#   -
# mkdir
#   - creates a new folder
#   -
# mv
#   - moves files to another location or to rename it
#   - 
# pwd
#   - prints the current working directory
#   - 
# rm
#   - removes or deletes files or folders
#   - 
# touch
#   - queries a file or creates a new file

# alias
#   - used to create shortcut names or nicknames for other commands
#   - syntax:
#       alias <alias> <command>
#   - example:
#       alias gc'git commit'
#   - aliases are commonly written to the file "~/.bash_rc" or "~/.bash_profile"
#       - it makes the alias permanent

# cat
#   - shows the content of files in the terminal
#   - syntax:
#       cat <file>
#       #> or
#       cat <option> <file>
#   - example:
#       cat my_file.txt
#   - can also be used to concatenate files
#       - syntax:
#           cat <file1> <file2> > <output_file>
#       - example:
#           cat my_file.txt my_other_file.txt > result.txt
#   - options
#       - -n
#           - adds numbers to each line
#               - including blank lines
#           - syntax:
#               cat -n <file>
#           - example:
#               cat -n my_file.txt
#       - -b
#           - adds number to each line
#               - excluding blank lines
#           - syntax:
#               cat -b <file>
#           - example:
#               cat -b my_file.txt
#       - -s
#           - supresses empty lines
#               - i.e. does not show any enty lines
#           - syntax:
#               cat -s <file>
#           - example:
#               cat -s my_file.txt
#       - -v
#           - used to show non-printing characters
#               - used for debugging
#           - syntax:
#               cat -v <file>
#           - example:
#               cat -v my_file.txt


# cd
#   - used to change the current working directory
#   - syntax:
#       cd <directory>
#   - example:
#       cd my_folder/
#   - common options
#       - ..
#           - two dots
#           - moves back a single directory level
#               - i.e. to the parent directory
#           - syntax:
#               cd ..
#               #> or
#               cd ../
#       - ~
#           - tilde
#           - moves to the home directory
#               - usually /home/user
#           - syntax:
#               cd ~
#               #> or
#               cd ~/
#       - -
#           - hyphen
#           - moves to the last directory visitedd
#               - i.e. the directory before the cd command
#           - syntax:
#               cd -
#       - /
#           - frontslash
#           - moves to the root directory
#           - syntax:
#               cd /

# cp
#   - used to copy files and directories from one location to another
#   - syntax:
#       cp <source> <destination>
#       #> or
#       cp <option> <source> <destination>
#   - example:
#       cp my_file.txt my_folder/copy.txt
#   - options
#       - -r
#           - enables recursive copying
#           - copies all files from a directory
#           - syntax:
#               cp -r <source> <destination>
#           - example:
#               cp -r my_folder/ my_other_folder/
#       - -v
#           - enables verbose mode
#           - displays the progress of files being copied
#           - syntax:
#               cp -v <source> <destination>
#           - example:
#               cp -r my_file.txt my_folder
#       - -i
#           - enables a prompt before overwriting
#           - used to avoid replacing files when both share the same name
#           - syntax:
#               cp -i <source> <destination>
#           - example:
#               cp -r my_file.txt my_folder/
#       - u
#           - only copies the files if the source file is newer
#               - i.e. overwrites the file with the same name
#               - if the source file if newer than the destination file
#           - syntax:
#               cp -u <source> <destination>
#           - example:
#               cp -r my_file.txt my_folder/

# echo
#   - used to display a line of text to the terminal
#   - syntax:
#       echo <message>
#       #> or
#       echo <options> <message>
#   - example:
#       echo "Hello World"
#   - options
#       - -n
#           - prevents echo from adding a newline "\n" at the end
#           - any succeeding echo calls appends to the end of the current line
#           - syntax:
#               echo -n <message>
#           - example:
#               echo -n "my_message"
#       - -e
#           - allows special characters to manipulate output
#               - like newlines and horizontal tabs spaces
#           - syntax:
#               echo -e <message>
#           - example:
#               echo -e "my_message\n"
#       - -E
#           - does not allow special characters
#               - default mode of echo
#           - syntax:
#               echo -E <message>
#           - example:
#               echo -E "my_message"

# grep
#   - used to query and search for text patterns in files
#   - syntax:
#       grep <pattern> <file>
#       #> or
#       grep <option> <pattern> <file>
#   - example:
#       grep 'text here' my_file.txt
#   - options
#       - -i
#           - ignores case-sensitivity
#               - i.e. searches both uppercase and lowercase patterns
#           - syntax:
#               grep -r <pattern> <file>
#           - example:
#               grep -r 'tExt HeRE' my_file.txt
#       - -r
#           - searches through files inside a specific directory
#           - syntax:
#               grep -r <pattern> <directory>
#           - example:
#               grep -r 'text here' my_file.txt
#       - -v
#           - finds files that do not match the pattern
#           - syntax:
#               grep -v <pattern> <file>
#           - example:
#               grep -v 'text here' my_file.txt

# ls
#   - used to list the contents of a directory
#   - can list files, folders, and even information about said contents
#   - syntax:
#       ls <folder>
#       #> or
#       ls <options> <folder>
#   - example:
#       ls
#       #> or
#       ls my_folder/
#   - options
#       - -l
#           - enables the long listing format
#           - displays these information:
#               - file or folder name
#               - file permissions
#               - number of links
#               - owners name
#               - owners group
#               - file size
#               - time of last modification
#           - syntax:
#               ls -l
#       - -a
#           - toggles hidden files
#               - files that start with a dot .
#           - enables to list them
#               - by default, ls does not list them
#           - syntax:
#               ls -a
#       - -h
#           - enables human-readable sizes
#           - converts byte counts into readable formats
#               - like Kilobytes (K), Megabytes (M), ets
#           - commonly used with the -l option
#           - syntax:
#               ls -lh
#       - -t
#           - enables sorting by time
#               - specifically, modification time
#           - used to query the latest files
#           - syntax:
#               ls -t
#       - -r
#           - enables reverse sorting
#           - flips the current sorting order
#           - syntax:
#               ls -r
#       - -R
#           - enables recursive listing
#           - lists files and folders inside of folders
#           - syntax:
#               ls -R
#       - -S
#           - enables sorting by size
#               - sorts the files by largest first
#           - syntax:
#               ls -S
#       - -1
#           - lists contents per line
#               - i.e. one line per element
#           - syntax:
#               ls -1
#       - -d
#           - lists only directorys
#               - does not list any files
#           - syntax:
#               ls -d
#       - -F
#           - appends an indicator for certain files
#               - e.g. * for executables (.sh)
#           - syntax:
#               ls -F

# mkdir
#   - used to create new folders or directories
#   - syntax:
#       mkdir <new_directory>
#       #> or
#       mkdir <option> <new_directory>
#   - example:
#       mkdir new_folder
#   - options
#       - -p
#           - creates a new parent directory
#               - i.e. creates a new folder if the parent doesn't exist
#           - syntax:
#               mkdir -p <parent_directory>/<new_directory>
#       - -v
#           - enables verbose mode
#           - displays the progress of folders being created
#           - syntax:
#               mkdir -v <new_directory>
#       - -m
#           - sets the file mode of the new directory
#               - i.e. folder permissions
#           - syntax:
#               mkdir -m <permissions> <new_directory>

# mv
#   - used to move files and directories from one location to another
#   - syntax:
#       mv <source> <destination>
#       #> or
#       mv <option> <source> <destination>
#   - example:
#       mv my_file.txt my_folder/
#   - mv can also be used to rename files
#       - syntax:
#           mv <old_name> <new_name>
#       - example:
#           mv my_file.txt renamed_file
#   - options
#       - -v
#           - enables verbose mode
#           - displays the progress of files being copied
#           - syntax:
#               mv -v <source> <destination>
#       - -i
#           - enables a prompt before overwriting
#           - used to avoid replacing files when both share the same name
#           - syntax:
#               mv -i <source> <destination>
#       - u
#           - only copies the files if the source file is newer
#               - i.e. overwrites the file with the same name
#               - if the source file if newer than the destination file
#           - syntax:
#               mv -u <source> <destination> 

# pwd
#   - used to print the current working directory
#   - syntax:
#       pwd
#       #> or
#       pwd <options>
#   - options
#       - -L
#           - prints the logical path
#               - including any symbolic links
#           - syntax:
#               pwd -L
#       - -P
#           - prins the physical path
#               - does not include symbolic links
#           - syntax:
#               pwd -P

# rm
#   - used to remove files or folders
#   - note that this command is extremely powerful
#       - any removed files are not easily recovered
#   - syntax:
#       rm <file>
#       #> or
#       rm <option> <file>
#   - example:
#       rm my_file
#       #> or
#       rm my_folder
#   - options
#       - -v
#           - enables vebose mode
#           - displays progress of removal
#           - syntax:
#               rm -v <file>
#           - example:
#               rm -v my_file.txt
#       - -i
#           - enables prompt before removing
#           - used to avoid making accidental deletions
#           - syntax:
#               rm -i <file>
#           - example:
#               rm -i my_file.txt
#       - r
#           - enables recursive removal
#           - removes files and folders inside of folders
#           - syntax:
#               rm -r <folder>
#           - example:
#               rm -r my_file.txt
#       - f
#           - enables force removal
#           - removes files without any warning
#           - syntax:
#               rm -f <file>
#           - example:
#               rm -f my_file.txt

# touch
#   - used to change timestamps of files
#   - or can be used to create new empty files
#       - only if the file does not exist
#   - syntax:
#       touch <file>
#       #> or
#       touch <option> <file>
#   - example:
#       touch my_file
#   - options
#       - -a
#           - updates the access time of a file
#           - syntax:
#               touch -a <file>
#           - example:
#               touch -a my_file.txt
#       - -m
#           - updates the modification time of a file
#           - syntax:
#               touch -m <file>
#           - example:
#               touch -m my_file.txt
#       - -t
#           - sets a specific timestamp to a file
#           - syntax:
#               touch -t <timestamp> <file>
#           - example:
#               touch -t 202607191200.00 my_file.txt
#       - -c
#           - disables the create new files flag
#           - does not create a new file when the file doesn't exist
#           - syntax:
#               touch -c <file>
#           - example:
#               touch -c my_file.txt
#       - -r
#           - sets a specific timestamp to a file
#           - uses another file as reference 
#           - syntax:
#               touch -r <reference_file> <file>
#           - example:
#               touch -r reference.txt my_file.txt
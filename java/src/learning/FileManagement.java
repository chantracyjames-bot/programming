/* file management
    - file access
        - accessing files in Java requires the importing of the java.io.File class
            - syntax:
                import Java.io.File;
        - after importing the required class
            - files are now able to be assigned to variables
                - similar to declaraing an object of a class
            - syntax:
                File <variableName> = new File(<filename>);
            - example:
                File myFile new File("General.java");
        
        - the File class has many methods to use when manipulating file variables
            - .canRead()
                - retuns a Boolean value
                - checks whether the file is readable or not
                - syntax:
                    <fileVariable>.canRead();
                - example:
                    myFile.canRead();
            - .canWrite()
                - returns a Boolean value
                - checks whether the file can be written to or not
                - syntax:
                    <fileVariable>.canWrite();
                - example:
                    myFile.canWrite();
            - .createNewFile()
                - returns a Boolean value
                - creates a new file
                    - returns true if the operation if successful
                    - returns false if not
                - must be wrapped inside a try-catch block
                    - this is due to it throwing a IOException if an error occurs during the file creation
                - syntax:
                    <fileVariable>.createNewFile();
                - example:
                    myFile.createNewFile();
            - .delete()
                - returns a Boolean value
                - deletes the file
                - syntax:
                    <fileVariable>.delete();
                - example:
                    myFile.delete();
            - .exists()
                - returns a Boolean value
                - checks if the file exists
                - syntax:
                    <fileVariable>.exists()
                - example:
                    myFile.exists();
            - .getName()
                - returns a String value
                - retrieves the name of the file
                - syntax:
                    <fileVariable>.getName();
                - example:
                    myFile.getName();
            - .getAbsolutePath()
                - returns a String value
                - retrieves the absolute path of the file
                - syntax:
                    <fileVariable>.getAbsolutePath();
                - example:
                    myFile.getAbsolutePath();
            - .length()
                - returns a long value
                - retrieves the size of the file
                    - in bytes
                - syntax:
                    <fileVariable>.length();
                - example:
                    myFile.length();
            - .list()
                - returns a String array
                - lists all files in the current directory
                - syntax:
                    <dirVariable>.list();
                - example:
                    myDir.list();
            - .mkdir()
                - returns a Boolean value
                - creates a new folder
                    - returns true if the operation is successful
                    - returns false if not
                - syntax:
                    <dirVariable>.mkdir();
                - example:
                    myDir.mkdir();

    - file location
        - if the file is in the same folder as the program, it is same to use just the file name
            - example:
                // opening a file named "file"
                File myFile = new File("file");
        - if the file is not in the current folder. it can be accessed in two ways
            - relative path
                - it is the path that is relative to the current working directory
                    - it is the folder where the program is currently running
                - on Unix-like systems, it is commonly denoted by "./"
                    - or the current working directory (cwd)
                - example:
                    // a file is inside a folder named "folder" in the same cwd 
                    # cwd
                    #  |--> MyProgram.java        // current program
                    #  \--> folder
                    #    \--> MyOtherProgram.java // program trying to be accessed
                    // the syntax to open the file would be:
                    // Unix-like
                    File myFile = new File("./folder/MyOtherProgram.java");

                    // Windows
                    File myFile = new File(".\\folder\\MyOtherProgram.java");
                - explanation
                    - ./                           // is the current directory
                    - ./folder                     // is a folder inside the current directory
                    - ./folder/MyOtherProgram.java // is the file trying to be accessed inside a folder inside the current directory
            - absolute path
                - it is the path that starts from the root of the file system
                    - C: for Windows
                        - or any drive letter
                    - / for Unix-like systems
                        - / is used in Linux, macOS, etc.
                - example:
                    // in Linux, assuming program is at the default Docuemnts folder
                    #  /                                                            // root
                    #  |--> /home
                    #  | |--> /home/user
                    #  | | |--> /home/user/Documents
                    #  | | | |--> /home/user/Documents/my_program.c
                    #  | | | \--> /home/user/Documents/folder
                    #  | | |   \--> /home/user/Documents/folder/MyOtherProgram.java // file trying to be accessed
                    // the syntax to open the file would be:
                    // Linux
                    File myFile = new File("/home/user/Documents/folder/MyOtherProgram.java"); 

                    // macOS equivalent
                    FILE mac_file;
                    File myFile = new File("/User/user/Documents/folder/MyOtherProgram.java"); 
                    // Windows equivalent
                    File myFile = new File("C\\User\\user\\Documents\\folder\\MyOtherProgram.java");
                    
    - file manipulation
        - creating new files
            - it is done through the use of the createNewFile() method of the File class
            - example:
                // inside main()
                try {                               // it must be inside a try-catch block
                    File myFile = new File("file");
                    myFile.createNewFile();         // creates a new file
                                                    // with the name "file"
                } catch (IOException e) {
                    System.out.println!("failed");  // prints an error message if the
                                                    // file cannot be created 
                }
            - sidenote
                - the method will return false if the file with the dame name is present
        - deleting files
            - it is done through the use of the delete() method of the File class
            - example:
                // inside main()
                File myFile = new File("file");
                myFile.delete()
            - the delete() method can also be used to delete folders
                - note that the folder (or directory) must be empty
                - example:
                    // inside main()
                    File myDir = new File("./folder");
                    myDir.delete();

        - writing to a file
            - file modification is able to be achieve through the use of the FileWriter class
                - which is imported from java.io.FileWriter
                - used for basic text file writing
            - syntax:
                import java.io.FileWriter;
            - after importing, it is now possible to write into files
                - through creating an object similar to the File class
                - syntax:
                    FileWriter <writerVariable> = new FileWriter(<filename>);
                - example:
                    FileWriter myWriter = new FileWriter("file");
                - note that the FileWriter class takes in a second argument
                    - dictating if it enters append mode or not
                    - ny default, without append mode, FileWriter overwrites the entire file with the .write() method is used
                    - but using append mode, FileWriter will only write to the end of the pre-existing file
                        - instead of overwriting it, it adds on to it
                    - syntax:
                        FileWriter <writerVariable> = new FileWriter(<filename>, <boolean>);
                    - example:
                        FileWriter myWriter = new FileWriter("file", true); // turns on append mode
                - note that FileWriter can also take in a File object as an argument
                    - syntax:
                        FileWriter <writerVariable> = new FileWriter(<fileVariable>, <boolean>);
                    - example:
                        FileWriter myWriter = new FileWriter(myVariable, true);
            - writing is done through the .write() method
                - note that after writing, it must be closed using the .close() method
                - syntax:
                    <writerVariable>.write(<string>);
                    <writerVariable>.close();
                - example:
                    myWriter.write("idkman");
                    myWriter.close();
                - sidenote:
                    - if FileWriter is not set to append mode
                        - it will overwrite the contents of the file
                        - deleting any previous entries
            - it is recommended to wrap the entire process inside a try-with-resources
                - using it, there is no need to close the stream with
                - since the try-with-resources block automatically closes it after the try block ends
                - example:
                    try (File myFile = new File("file")) {
                        myFile.createNewFile();
                    } catch (IOException e) {
                        System.out.println("idkman"); 
                        }

        - reading a file
            - reading into a file is done through the Scanner class 
                - imported from java.util.Scanner
                - used when only dealing with simple text files
            - the File class must also be present in order for the Scanner class to read the file
            - syntax:
                import java.io.File;
                import java.util.Scanner;
            - after importing the prerequisite modules
                - it is now possible to read files
                - but objects of both imported classes must be made
                - syntax:
                    File <fileVariable> = new File(<filename>);
                    Scanner <readerVariable> = new Scanner(<fileVariable>);
                    // or
                    File <fileVariable> = new File(<filename>);
                    try (Scanner <readerVariable> = new Scanner(<fileVariable>)) {...}
                - example:
                    File myFile = new File("file");
                    Scanner myReader = new Scanner(myFile);            // note that Scanner must be closed after use
                    // or
                    File myFile = new File("file");
                    try (Scanner myReader = new Scanner(myFile)) {...} // automatically closes Scanner object after use
            - the FileNotFoundException class is also imported to handle Exceptions when using the file
                - it is found through the java.io.FileNotFoundException package
                    - syntax
                        import java.io.FileNotFoundException;
                - sample code:
                    import java.io.File;
                    import java.io.FileNotFoundException
                    import java.util.Scanner;

                    // inside main()
                    File myFile = new File("file");

                    try (Scanner myReader = new Scanner(myFile)) {
                        System.out.println(myReader.nextLine());
                    } catch (FileNotFoundException e) {
                        System.out.println("idkman"); 
                    }

    - I/O Streams
        - unlike file management through the File class
            - it is unable to write or read files with out the FileWriter and Scanner class
            - it can only query if the file exists, query the name or size, or create and delete files
        - I/O Streams are move advanced than the File class due to it being able to handle both text and binary data
            - binary data like images, audio, PDFs, etc.
        - Byte Streams
            - examples are FileInputStream and FileOutputStream
        - Character Streams
            - examples are FileReader, FileWriter, BufferedReader and Bufferedriter

        - FileInputSream
            - used to read a file's contents byte by byte
            - using the FileInputStream class, it must first be imported
                - imported from the java.io.FileInputStream package
                - syntax:
                    import java.io.FileInputStream;
            - similar to the File class, an object must be created to use the class method
                - syntax:
                    FileInputStream <inputVariable> = new FileInputStream(<file>);
                - example:
                    FIleInputStream myInput = new FileInputStream("file");
                    // or
                    try (FileInputStream myInput = new FileInputStream("file")) {...}

                - note that FileInputStream can also take a File object as an argument
                    - syntax:
                        FileInputStream <inputVariable> = new FileInputStream(<fileVariable>);
                    - example:
                        FIleInputStream myInput = new FileInputStream(myFile);
                        // or
                        try (FileInputStream myInput = new FileInputStream(myFile)) {...}

            - reading data from any file is done by storing each byte in a variable through the .read() method
                - and converting that byte into a character by type casting it through (char)
                - note that a value of -1 indicates that the variable is at the end of file
                - sample code:
                    try (FileInputStream myInput = new FileInputStream("file")) {
                        int i;                                                    // used to store each raw bytes
                        while((i = myInput.read()) != -1) {                       // runs it through a loop
                                                                                  // storing each consequtive byte to the variable i
                            System.out.print((char) i);                           // prints each byte and casting them as a character                                    
                        }
                    } catch (IOExeption e) {
                        System.out.println("idkman"); 
                    }

        - FileOutputStream
            - used to write to a file, byte by byte
            - using the FileOutputStream class, it must first be imported
                - imported from the java.io.FileOutputStream package
                - syntax:
                    import java.io.FileOutputStream;
            - similar to the File class, an object must be created to use the class method
                - syntax:
                    FileOutputStream <outputVariable> = new FileOutputStream(<file>);
                - example:
                    FileOutputStream myOutput = new FileOutputStream("file");
                    // or
                    try (FileOutputStream myOutput = new FileOutputStream("file")) {...}

                - note that FileOutputStream can also take a File object as an argument
                    - syntax:
                        FileOutputStream <outputStream> = new FileOutputStream(<fileVariable>);
                    - example:
                        FileOutputStream myOutput = new FileOutputStream(myFile);
                        // or
                        try (FileOutputStream myOutput = new FileOutputStream(myFile)) {...}

                - similar to the FileWriter class, FileOutputStream can also take in a second argument
                    - dictating if it enters append mode or not
                    - ny default, without append mode, FileOutputStream overwrites the entire file with the .write() method is used
                    - but using append mode, FileOutputStream will only write to the end of the pre-existing file
                        - instead of overwriting it, it adds on to it
                    - syntax:
                        fileOutputStream <outputVariable> = new FileOutputStream(<file>, <boolean>);
                    - example:
                        FileOutputStream myOutput = new FileOutputStream("file", true); // turns on append mode

            - writing data to a file is done through the .write() method
                - note that the output must be binary
                - text is not allowed
                - sample code:
                // uses FileInputStream to copy a file
                try (FileInputStream myInput = new FileInputStream("file");           // uses the FileInputClass
                     FileOutputStream myOutput = new FileOutputStream("otherFile")) { 
                    int i;                                                            // used to store each raw bytes
                    while ((i = myInput.read()) != -1) {                              // runs reading each byte into a loop
                        myOutput.write(i);                                            // each loop, it writes the raw bytes from 
                                                                                        // variable i into the output file
                                                                                      // writing in binary format
                    }     
                } catch (IOException) {
                    System.out.println("idkman"); 
                }

        - BufferedReader
            - a faster version of the Scanner class
                - replacing due to its faster speeds and less performance overheads
            - usually combined with the FileReader class. which handles the opening of files
            - using the BuffedReader class, it must first imported
                - imported from the java.io.BufferecReader package
                - syntax:
                    import java.io.BufferedReader;
            - using the FileWriter class as an argument
                - BufferedReade enables line by line reading at faster speeds than the Scanner class
                - syntax:
                    BufferedReader <readerVariable> = new BufferedReader(new FileReader(<filename>));
                    // or 
                    BufferedReader <readerVariable> = new BufferedReader(new FileReader(<fileVariable>));
                - example:
                    try (BufferedReader myReader = new BufferedReader(new FileReader("file"))) {...}
                    
            - reading text line by line is done through the .readLine() method
                - with a similar syntax to the Scanner class
                - sample code:
                    try (BufferedReader myReader = new BufferedReader(new FileReader("file"))) {
                        String line;                                                             // used to store each line
                        while((line = myReader.readLine()) != null) {                            // loops through each line in the file
                                                                                                    // assigning each line to the line variable
                                                                                                    // stops when the loop reaches the end of the file
                                                                                                        // indicated by null
                            System.out.println(line);                                            // prints each line
                        }
                    } catch (IOException e) {
                        System.out.println("idkman"); 
                    }

        - BufferedWriter
            - an advanced version of the FileWriter class
                - being able to handle large text at the same time
            - usually combimed with the FileWriter class, which handles the writing to files
            - using the BufferedWriter class, it must first be imported
                - imported from the java.io.BufferedWriter package
                - syntax:
                    import java.io.BufferedWriter;

            - using the FileWriter class as an argument
                - syntax:
                    BufferedWriter <writerVariable> = new BufferedWriter(new FileWriter(<filename>));
                    // or 
                    BufferedWriter <writerVariable> = new BufferedWriter(new FileWriter(<fileVariable>));
                - example:
                    try (BufferedWriter myWriter = new BufferedWriter(new FileWriter("file"))) {...}
                - note that FIleWriter can also take in a Boolean as a second argument to toggle append mode
                              
            - writing text line by line is done though the .write() method
                - using the .newLine() to add a line break or new line
                - sample code:
                    try (BufferedWriter myWriter = new BufferedWriter(new FileWriter("file"))) {
                        myWriter.write("idkman");                                                // writes to the first line
                        myWriter.newLine();                                                      // inserts a new line
                        myWriter.write("idkman");                                                // writes to the second line 
                    } catch (IOException e) {
                        System.out.println("idkman"); 
                    }


*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManagement {
    static void basicFiles(String[] args) {
        try{
            String argument = args[0];

            File file = new File(argument);

            System.out.printf("%s %b%n%s %b%n%s %b%n%s %s%n%s %s%n%s %d%n%s %b%n%s %b",
                "createNewFile:", file.createNewFile(),
                "canRead:", file.canRead(),
                "canWrite:", file.canWrite(),
                "getAbsolutePath:", file.getAbsolutePath(),
                "getName:", file.getName(),
                "length:", file.length(),
                "exists:", file.exists(),
                "delete:", file.delete()
            );

            String argument2 = args[1];
            File dir = new File("./yes");

            dir.mkdir();
            dir.delete();

            FileWriter writer = new FileWriter(args[0]);
            writer.write("idkman");
            writer.close();

        } catch (IOException e) {
            System.out.println("file error");
        }
    }

    static void ioStreamFiles(String[] args) {
        //String argument = args[0];

        try(FileInputStream input = new FileInputStream("../../../main.txt")) {
            int i;
            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("idkman");
        }
    }

    static void bufferedFiles(String[] args) {
        String argument = args[0];

        try (BufferedReader myReader = new BufferedReader(new FileReader(argument))) {
            String line;

            while((line = myReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("idkman");
        }
    }

    public static void main(String[] args) {
        bufferedFiles(args);
    }
}

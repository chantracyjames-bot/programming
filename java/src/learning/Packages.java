/* packages and APIs
    - in Java, a package is a group of classes
        - they differ by name to avoid naming conflicts
    - built-in packages in java is part of the Java API
        - is a library of prewritten classes that are free of use
        - incluses in the Java Development Environment (JDE)
    - to import packages in Java, it is done through the import keyword
        - it is declared before any classes
        - importing a single class
            - syntax:
                import <packageName>.<className>;
            - example:
                import java.time.LocalTime;
        - importing the entire package
            - syntax:
                import <packageName>.*;
            - example:
                import java.util.*;
    - Java has two types of packages
        - built-in packages
            - time and date
                - while java does not have a built-in class for date and time, it is available through the java.time package
                    - imported either with a single class or the whole package
                - it is used to work with the date and time APE
                - java.time classes
                    - LocalDate
                        - represents a date
                        - year, month, day
                        - yyyy-MM-dd
                    - LocalTime
                        - represents a time
                        - hour, minute, second, nanoseconds
                        - HH-mm-ss-ns
                    - LocatDateTime
                        - represents both a date a time
                        - yyyy-MM-dd-HH-mm-ss-ns
                    - DateTimeFormatter
                        - formatter for displaying and parsing date-time objets
                
                - to display the current date, it is done by importing the LocalDate class from the java.time package
                    - using the .now() method will return the current date
                    - example:
                        // inside main()
                        LocalDate myObj = LocalDate.now();
                        myObj;                             // current date
                - to display the current time, it is done by importing the LocalTime class from the java.time package
                    - using the .now() method will return the current date
                    - example:
                        // inside main()
                        LocalTime myObj = LocalTime.now();
                        myObj                              // current time
                - to display both the current date and time, it is done by importing the LocalDateTime class from the javaa.time package
                    - using the .now() method will retrun the current data and time
                    - example:
                        // inside main()
                        LocalDateTime myObj = LocalDateTime.now();
                        myObj;                                     // current date and time

                - to format date and time, it is done by importing the DateTimeFormatter class from java.time package
                    - using the .ofPattern() method will format the given date and time into a format
                    - example:
                        LocalDateTime myObj = LocalDateTime.now();                                       // returns the current date time
                        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // calls the ofPatter() method
                                                                                                        // uses the dd-MM-yyyy date format
                                                                                                        // uses the HH:mm:ss time format
                                                                                                        // removes the T and nanoseconds from the original forma
                        String formmattedStuff = myObj.format(formatObj);                                // uses the LocalDateTime to convert the date time to a readable format
                        formattedStuff;                                                                  // 16-06-2026 12:57:39
                    - sample formats
                        - yyyy-MM-dd
                        - dd/MM/yyyy
                        - dd-MMM-yyyy
                        - E, MMMM dd yyyy
            
            - user input
                - extracting user input is done through the Scanner class
                - it is imported from the java.util package
                - input types / Scanner methods:
                    method          purpose
                    nextBoolean() - reads a boolen value
                    nextByte()    - reads a byte value
                    nextDouble()  - reads a double value
                    nextFloat()   - reads a float value
                    nextInt()     - reads a int value
                    nextLine()    - reads a String value
                    nextLong()    - reads a long vallue
                    nextShort()   - reads a short value
                - to use the Scanner class, an object must to assigned to it
                    - syntax:   
                        Scanner <objectName> = new Scanner(System.in);
                    - example:
                        Scanner in = new Scanner(System.in);

        - user-defined packages
            - Java uses a file system to store packages, similar to folders on a computer
            - to create a package, it is done using the package keyword
                - it must be declared before any classes
            - syntax:
                package <packageName>;
            - example:
                - package mypackage;
            - it is generally recommended to assign lowercase names to packages to avoid name conflicts
            - to compile or export the package, a flag in the javac terminal command is specified
                - syntax:
                    java -d . <filename>
                - example:
                    java -d . idkman
            - dots . represents a folder /
                - compiling with a dot in the package name will let the compiler know to nest the package
                - example:
                    my.package -> ./my/package
*/

public class Packages {

}

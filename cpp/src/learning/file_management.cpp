/* file management
    - in C++, file access and management is achieved through the use of the <iostream> and <fstream> headers
    - file access
        - can be done through declaring a variable to hold the file
        - there are two different ways to open a file in C++
        - std::ifstream and std::ofstream
            - offers a simpler syntax than stf::fstream
            - only requires the filename
            - syntax:
                std::ifstream <variableName>(<fileName>);
                // or
                std::ofstream <variableName>(<fileName>);
            - example:
                std::ifstream hello("world");
                // or
                std::ofstream world("hello");
        - std::fstream
            - offers more advanced control on how C++ opens the file
            - introduces a <mode> argument
            - syntax:
                <fileMode> <variableName>(<fileName>, <mode>);
            - example:
                std::fstream idkman("lumbago.yes", "std::ios::in"); // opens the file in read-only modde

    - file modes
        - there are three main modes to access files in C++
            - std::ofstream
                - used to create and write into files
                - the insertion operator is used to write into files
                - syntax
                    <fileVariable> << <string>;
                - example:
                    std::ofstream myFile("filen.ame");
                    myFile << "idkman";
            - std::ifstream
                - used to read files
                - uses the getline() function to read file contents
                - sidenote:
                    - the getline() function only reads the first line of a file
                    - using a loop enables multi-line reading
                - syntax
                    - getline(<fileVariable>, <containerVariable>)
                - example:
                    std::ifstream myFile("namef.ile");
                    std::string idkman;
                    getline(myFile, idkman);           // reads the first line and hands it to idkman
            - std::fstream
                - combination of std::ofstream and std::ifstream
                - uses the same syntax as the previous two file access classes
                - typically used to as an alternative to std::ofstream and std::ifstream
                - able to use lower-level modes of file access
                - these are the more advanced, lower-level modes for file access
                    - std::ios::in
                        - default behavior of std::ifstream
                        - fails when the file being accessed does not exist
                        - used for reading files
                    - std::ios::out
                        - default behavior of std::ofstream
                        - creatas a new file if it does not exist
                        - used for writing content into files
                        - sidenote:
                            - this mode automatically truncates the file
                    - std::ios::app
                        - used to add content to files
                        - adds text to the end of a file
                            - similar to the function .append()
                    - std::ios::ate
                        - used to add content at the end of the file
                        - default pointer is at the end of a file
                        - sidenote:
                            - while it may be similar to std::ios::app, it automatically truncates the file
                        - unlike std::ios::app, it is possible to change the write pointer
                            - presumably through the seek() function
                    - std::ios::trunc
                        - used to clear files
                        - sidenote:
                            - std::ios::out and std::ios::ate use this mode automatically
                            - std::ios::in and std::ios::app does not use this mode and preserves contents
                        - clears everysingle byte from the file
                    - std::ios::binary
                        - opens the file in binary mode
                        - i.e. all operations are binary more rather than text
                    - it is possible to chain together modes using the or (|) operator
                        - example:
                            std::fstream idkman("file.name", std::ios::in | std::ios::out); // opens the file in read and write mode
                                                                                            // does not truncate file contents
        - it is good practice to use the .close() method after opening a file
            - it saves memory and prevents perfomance degradation
            - syntax:
                - <variableName>.close();
            - example:
                - // assuming myFile is the file variable
                  myFile.close();
*/
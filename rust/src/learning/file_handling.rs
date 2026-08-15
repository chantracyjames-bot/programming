/* file handling
    - in Rust, file handling is handled through the use of the File struct
        - representing a file that has been opened due to being wrapped by a file descriptor
            - and gives either reading, writhing or both reading and writing access to the file
        - all File methods in Rust returns a io::Result<T> type, an alias of the Result<T, io::Error>
            - making all failure of all I/O operations explicit
            - due to this, it is possible to see all failure paths
            - being encouraged to handling them in a proactive manner
    - there are multiple ways to access files in Rust
        - through the std::fs::File struct
            - it is required to bring the struct into scope before using it
            - syntax:
                use std::fs::File;
            - opening files using the File struct can be achieved in two ways
                - either in read-only, or write-only mode 
            - read-only mode
                - done through the use of the File::open() function
                    - opens the file in read-only mode
                - syntax:
                    File::open(<file>);
                - example:
                    File::open("my_file.txt");
                - sidenote:
                    - the File::open() function returns a Result<T, std::io::Error>
                        - which requires pattern matching to unpack the returned type
                    - sample code:
                        let mut my_file: File = match File::open("my_file") {
                            Err(error) => println!("Error: {}", error),
                            Ok(file) => file,
                        };
                - to read the contents of the file, the Read trait os brought into scope
                    - from the std::io module
                    - syntax:
                        use std::io::Read;
                - after importing the required trait, it is now possible to read the file
                    - through the .read_to_string() method
                    - sidenote:
                        - a String variable it required to store the content of the file
                        - the method returns a Result<T, std::io::Error> type
                            - meaning, pattern matching is required to unpack the returned type
                    - syntax:
                        match <file_variable>.read_to_string(&mut <string>) {
                            Err(<var>) => <statement>,
                            Ok(<var>) => <statement>
                        }
                    - sample code:
                        let mut s: String = String::new();
                        match my_file.read_to_string() {
                            Ok(_) => println!("{}" s),
                            Err(error) => println!("Error: {}", error),
                        }
                - another method can also be used to read files
                    - through the .read() method
                    - sidenote:
                        - this method requires a Vec<u8> variable to store the read lines
                        - if the buffer is insufficient, the .read() method fails
                    - syntax:
                        match <file_variable>.read(&mut <vector>) {
                            Err(<var>) => <statement>,
                            Ok(<var>) => <statement>,
                        }
                    - sample code:
                        let mut buffer: Vec<u8> = Vec::new();
                        match <file_variable>.read(&mut <vector>) {
                            Err(<var>) => <statement>,
                            Ok(<var>) => <statement>,
                        }
                    - sample code:
                        let mut buf = [0; 128];
                        match file.read(&mut buf) {
                            Err(error) => println!("yes {}", error),
                            Ok(yes) => match str::from_utf8(&buf[0..yes]) {
                                Err(error) => println!("yes {}", error),
                                Ok(no) => print!("{}", no),
                            }
                        }

            - write-only mode
                - done through the use of the File::create() function
                    - opens the file in write-only mode
                - syntax:
                    File::create(<file>);
                - example:
                    File::create("my_file.txt");
                - sidenote:
                    - the File::create() function returns a Result<T, std::io::Error>
                        - which requires pattern matching to unpack the returned type
                    - like other languages, if the file does not exists, Rust creates a new file
                        - if it does, then Rust truncates the file into zero bytes and then writes into it
                    - sample code:
                        let mut my_file = match File::create("yes") {
                            Err(error) => panic!("Error {}", error),
                            Ok(file) => file,
                        };
                - to write to te file, the Write trait is brought into scope
                    - from the std::io module
                    - syntax:
                        use std::io::Write;
                - after importing the required trait, it is now possible to write to the file
                    - through the .write_all() method
                    - sidenote:
                        - a byte slice [u8] type is required instead of a String
                        - the method requires a Result<T, std::io::Error>
                            - meaning, pattern matching is required to write into the file
                    - syntax:
                        match <file_variable>.write_all(<byte_slice>) {
                            Err(<var>) => <statement>,
                            Ok(<var>) => <statement>,
                        }
                    - sample code:
                        let mut b: &[u8] = b"idkman";
                        match my_file.write_all(b) {
                            Err(error) => panic!("Error {}", error),
                            Ok(_) => print!("yes"),
                        }

        - through the std::fs module
            - the std::fs module contains some shortcut when dealing with files
                - like one line-liners that can shorten the syntax required to manipulate files
            - read-only mode
                - .read()
                    - opens tha file and reads its contents
                        - requires a Vec<u8> as a buffer and pattern matching
                    - syntax:
                        let <vector>: Vec<u8> = match fs::read(<file>) {
                            Err(<var>) => <statement>,
                            Ok(<var>) => <statement>,
                        }
                    - sample code
                        let file: Vec<u8> = match fs::read("yes") {
                            Err(error) => { print!("Error: {}", error);
                                            Vec::new() },
                            Ok(yes) => yes
                        };
                - .read_to_string()
                    - opens tha file and reads its contents
                        - requires a String as a buffer and pattern matching
                    - syntax:
                        let <string>: String = match fs::read(<file>) {
                            Err(<var>) => <statement>,
                            Ok(<var>) => <statement>,
                        }
                    - sample code
                        let file: String = match fs::read("yes") {
                            Err(error) => { print!("Error: {}", error);
                                            String::new() },
                            Ok(yes) => yes
                        };

            - write-only mode
                - write()
                    - opens the file in write-only mode
                        - similar to the .write_all() method in the std::io::Write module
                        - requires a byte slice as output and pattern matching to handle possible errors
                    - syntax:
                        match fs::write(<file>, <byte_slice>) {
                            Err(<var>) => <statement>,
                            Ok(<var>) => <statement>,
                        }
                    - sample code
                        let file: String = match fs::write("yes", b"maybe") {
                            Err(error) => print!("Error: {}", error),
                            Ok(_) => print!("Success"),
                        };

    - std::io::prelude
        - brings the Read, Write, Seek and BufRead traits into scope
            - without having to declare each import one by one
        - syntax:
            use std::io::prelude::*
        - instead of:
            use std::io::Read;
            use std::io::Write;
            use std::io::Seek;
            use std::io::BufRead;
*/

use std::fs;
use std::fs::File;
use std::path::Path;
use std::io::prelude::*;

fn main() {
    other_other_test();
}

fn read_test() {
    let path = Path::new("test.lang");
    let display = path.display();

    let mut file = match File::open(&path) {
        Err(error) => panic!("Error: {}", error),
        Ok(file) => file,
    };

    let mut s = String::new();
    match file.read_to_string(&mut s) {
        Err(error) => panic!("Error {}", error),
        Ok(_) => print!("{}", s),
    }
}

fn write_test() {
    let path = Path::new("test.lang");
    let display = path.display();

    let mut file = match File::create(&path) {
        Err(error) => panic!("Error: {}", error),
        Ok(file) => file,
    };

    let mut b: &[u8] = b"test";
    match file.write_all(b) {
        Err(error) => panic!("Error {}", error),
        Ok(_) => print!("sakses"),
    }
}

fn test() {
    let path = Path::new("general.rs");
    let display = path.display();

    let mut file = match File::open(&path) {
        Err(error) => panic!("Error: {}", error),
        Ok(file) => file,
    };

    let mut buf = [0; 128];
    match file.read(&mut buf) {
        Err(error) => println!("yes {}", error),
        Ok(yes) => match str::from_utf8(&buf[0..yes]) {
            Err(error) => println!("yes {}", error),
            Ok(no) => print!("{}", no),
        }
    }
}

fn other_test() {
    let path = Path::new("yes");

    let mut file = match File::open(&path) {
        Err(error) => panic!("Error: {}", error),
        Ok(file) => file,
    };

}

fn other_other_test() {
    let file: Vec<u8> = match fs::read("general.rs") {
        Err(error) => { print!("Error: {}", error);
                        Vec::new()
                      },
        Ok(yes) => yes
    };
}
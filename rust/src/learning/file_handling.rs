/* file handling
    - in Rust, file handling is handled through the use of the File struct
        - representing a file that has been opened due to being wrapped by a file descriptor
            - and gives either reading, writhing or both reading and writing access to the file
        - all File methods in Rust returns a io::Result<T> type, an alias of the Result<T, io::Error>
            - making all failure of all I/O operations explicit
            - due to this, it is possible to see all failure paths
            - being encouraged to handling them in a proactive manner
        - syntax:
            use std::fs::File;
        - opening files is done in a few ways, either in read-only, write-only, or append mode
            - read-only mode
                - done through the File::open() function
                - syntax:
                    File::open(<file>);
                - example:
                    File::open("my_file.txt");
                - this method returns a Result<File, std::io::Error>, making pattern matching a requirement
                - sample code:
                    // opens the file in read-only mode
                    let mut my_file = match File::open("yes") {
                        Err(error) => panic!("Error {}", error),
                        Ok(file) => file,
                    };
                - to read the contents of the file, the Read trait is brought into scope
                    - syntax:
                        use std::io::Read;
                - after importing the required trait, .the read_to_string() method is able to be used to read the file
                    - note that a String variable is needed to store the read lines, also requiring pattern matching
                    - syntax:
                        match <file_variable>.read_to_string(&mut <string>) {
                            Err(<var>) => <statement>,
                            Ok(<var>) => <statement>,
                        }
                    - example:
                        let mut s: String = String::new();
                        match my_file.read_to_string(&mut s) {
                            Err(yes) => panic!("Error {}", yes),
                            Ok(_) => print("{}", s),
                        }
            - write-only mode
                - done through the File::create() function
                - syntax:
                    File::create(<file>);
                - example:
                    File::create("my_file.txt");
                - sidenote:
                    - similar to the other write mode in other languages, the Rust implementation is almost identical
                        - if the file does not exists, this method creates a new file
                        - if the file already exists, this method truncates and wipes the contents to zero bytes before writing
                    - this method also returns a Result<T, std::io::Error> type
                        - requiring pattern matching to resolve
                - sample code:
                    // opens the file in write-only mode
                    let mut my_file = match File::create("yes") {
                        Err(error) => panic!("Error {}", error),
                        Ok(file) => file,
                    };
                - to read the contents of the file, the Write trait is brought into scope
                    - syntax:
                        use std::io::Write;
                - after importing the required trait, .the write_all() method is able to be used to write to the file
                    - note that it requires a byte slice, and it also requires pattern matching
                    - syntax:
                        match <file_variable>.write_all(<byte_slice>) {
                            Err(<var>) => <statement>,
                            Ok(<var>) => <statement>,
                        }
                    - example:
                        let mut b: &[u8] = b"idkman";
                        match my_file.write_all(b) {
                            Err(error) => panic!("Error {}", error),
                            Ok(_) => print!("yes"),
                        }
        - files can be opened on the file with some shortcuts
            - using the std::fs scope, providing some helper functions for quick access to files
            - reading files
                - used through the fs::read_to_string() function
                    - similar syntax to the .read_to_string() function of the std::io::Read trait
                - syntax:
                    fs::read_to_string(<file>);
                - example:
                    let my_text = fs::read_to_string("yes.txt");
            - writing to files
                - used through the fs::write() function
                    - similar syntax to the .write_all() function of the std::io::Write trait
                - syntax:
                    fs::write(<file>, <string>);
                - example:
                    fs::write("yes.txt", "idkman");

*/

use std::fs::File;
use std::path::Path;
use std::io::prelude::*;

fn main() {
    read_test();
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
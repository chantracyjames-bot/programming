#!/usr/bin/env pwsh

$ASSEMBLY_BIN="/home/tarcy/Documents/Projects/programming/assembly/bin"
$C_BIN="/home/tarcy/Documents/Projects/programming/c/bin"
$CPP_BIN="/home/tarcy/Documents/Projects/programming/cpp/bin"
$JAVA_BIN="/home/tarcy/Documents/Projects/programming/java/bin"
$PYTHON_BIN="/home/tarcy/Documents/Projects/programming/python/bin"
$RUST_BIN="/home/tarcy/Documents/Projects/programming/rust/bin"

function separate {
    Write-Output "==================================================="
}
function out_common {
    Write-Output "=================== Code Output ==================="
    separate
}
function out_assembly {
    Write-Output "============== Code Output: Assembly =============="
    separate
}
function out_bash { 
    Write-Output "================ Code Output: Bash ================"
    separate
}
function out_c(){ 
    Write-Output "================== Code Output: C ================="
    separate
}
function out_cpp_gpp(){ 
    Write-Output "============== Code Output: C++ (g++) ============="
    separate
}
function out_cpp_clang() { 
    Write-Output "============= Code Output: C++ (clang) ============"
    separate
}
function out_java() { 
    Write-Output "================ Code Output: Java ================"
    separate
}
function out_python() { 
    Write-Output "=============== Code Output: Python ==============="
    separate
}
function out_rust() { 
    Write-Output "================ Code Output: Rust ================"
    separate
}

function help() {
    Write-Output "NAME"
    Write-Output "        quick - A simple Bash script to eliminate verbose Code Runner Terminal Output."
    Write-Output ""
    Write-Output "DESCRIPTION"
    Write-Output "        A shortcut for compiling and running languages with a clean termincal output, using Code Runner."
    Write-Output "        Unlike Code Runner's verbose syntax to run programs, this script feeds from Code Runner's arguments without being too long."
    Write-Output "        # Resulting into a cleaner terminal environment, easier to debug and diagnose."
    Write-Output ""
    Write-Output "SYPNOSIS"
    Write-Output "        quick [OPTIONS] [LANGUAGE] [DIRECTORY] [FILE_WITHOUT_EXTENSION] [FILE_WITH_EXTENTION]"
    Write-Output "        quick [-h | --help]"
    Write-Output ""
    Write-Output "OPTION"
    Write-Output "        -cr, --compile-run"
    Write-Output "                Compiles a given source file to an output directory and runs its output file"
    Write-Output "        -c, --compile"
    Write-Output "                Compiles a given source file and places it in an output directory."
    Write-Output "        -r, --run"
    Write-Output "                Runs a given output file from a specified directory."
    Write-Output "        -s, --separate"
    Write-Output "                Prints the 'Code Output' text header."
    Write-Output "NOTE"
    Write-Output "        [DIRECTORY] is the directory where the script will change directory (cd) into."
    Write-Output "        Not where it will place the output files in. Read the source file for more information."
    Write-Output ""
    Write-Output ""
    Write-Output "EXIT STATUS"
    Write-Output "        0       Success. The script run without any problems."
    Write-Output "        1       Error. An error was encountered during execution."
    Write-Output ""
    Write-Output "EXAMPLES"
    Write-Output "        Compile a C source file from a specific directory."
    Write-Output "                quick -c c $HOME/Documents my_program my_program.c"
    Write-Output "        Run a C++ (clang++) output file from a specified directory."
    Write-Output "                quick -r cpp_clang $HOME/Documents my_program_clang.o"
    Write-Output "        Compile a .rs source file from a specific directory and run it."
    Write-Output "                quick -cr rust $HOME/Documents my_program my_program.rs"
    Write-Output "        Compile a C source file with header files from a specific directory and run it"
    Write-Output "                quick -wr c $HOME/Documents output main.c my_header.c"
}

function check_args {
    switch ($args[0]) {
        "-c|-cr|--compile|--compile-run" { 
            switch ($args[1]) {
                "assembly|c|cpp_gpp|cpp_clang|java|rust" {
                    if ((Test-Path -Path $args[2] -PathType Leaf) -or (Test-Path -Path $args[3] -PathType Leaf) -or (Test-Path -Path $args[4] -PathType Leaf)) {
                        Write-Output "Error: Invalid Input: A directory, a file without extension and a file is required. i.e quick -c lang $HOME/my_folder my_file my_file.ext"
                        exit 1
                    } elseif ($null -ne $args[4]) {
                        Write-Output "Error: Too Many Arguments: This option takes only 5 arguments at most."
                        exit 1
                    } break
                } "bash|python" {
                    if ((Test-Path -Path $args[2] -PathType Leaf) -or (Test-Path -Path $args[3] )) {
                        Write-Output "Error: Invalid Input: A directory, and a file is required. i.e quick -c lang $HOME/my_folder my_file.ext"
                        exit 1
                    } elseif (Test-Path -Path $args[4] -PathType Leaf) {
                        Write-Output "Error: Too Many Arguments: This option takes only 4 arguments at most."
                        exit 1
                    } break
                } Default {
                    Write-Output "tarcy sux"
                    exit 1
                }
            }
        } "-r|--run" {
            switch ($args[1]) {
                "bash|c|cpp_gpp|cpp_clang|python|rust" { 
                    if ((Test-Path -Path $args[2] -PathType Leaf) -or (Test-Path -Path $args[3] -PathType Leaf)) {
                        Write-Output "Error: Invalid Input: A directory, and a file is required. i.e quick -r lang $HOME/my_folder my_file.o"
                        exit 1
                    } elseif ($null -ne $args[4]) {
                        Write-Output "Error: Too Many Arguments: This option takes only 4 arguments at most."
                        exit 1
                    } break
                } "assembly|java" {
                    if ((Test-Path -Path $args[2] -PathType Leaf) -or (Test-Path -Path $args[3] -PathType Leaf)) {
                        Write-Output "Error: Invalid Input: A directory, and a file without its extension is required. i.e quick -r lang $HOME/my_folder my_file"
                        exit 1
                    } elseif ($null -ne $args[4]) {
                        Write-Output "Error: Too Many Arguments: This option takes only 4 arguments at most."
                        exit 1
                    } break
                } Default {
                        Write-Output "tarcy sux"
                        exit 1
                } 
            }
        } "wr|--compile-with-header" {
            switch ($args[1]) {
                "c" { 
                    if ((Test-Path -Path $args[2] -PathType Leaf) -or (Test-Path -Path $args[3] -PathType Leaf) -or (Test-Path -Path $args[4] -PathType Leaf)) {
                        Write-Output "Error: Invalid Input: A directory, a file without extension and a file is required. i.e quick -wr lang $HOME/my_folder my_file my_file.ext"
                        exit 1
                    }
                    $paths = $args[4..($args.Count - 1)]
                    for ($i = 0; $i -lt $paths.Count - 1; $i++) {
                        if (Test-Path -Path $paths[$i] -PathType Leaf) {
                            Write-Output "Error: Invalid Input: A directory, a file without extension, and a main file with its headers is required."
                            exit 1
                        }
                    } break
                } Default {
                    Write-Output "tarcy sux"
                    exit 1
                }
            }
        }
    }
}

function check_file_validity {
    if (($args[0] -eq "-c") -or ($args[0] -eq "-cr") -or ($args[0] -eq "--compile") -or ($args[0] -eq "--compile-run")) {
        switch ($args[1]) {
            "assembly" { 
                if ($args[2] -notlike "*.asm") {
                    Write-Output "Error: Invalid Source File: This script only validates .asm source files."
                    exit 1
                } break
            } "bash" { 
                if ($args[2] -notlike "*.sh") {
                    Write-Output "Error: Invalid Script File: This script only validates .sh shell script files."
                    exit 1
                } break
            } "c" { 
                if (($args[2] -notlike "*.c") -and ($args[2] -notlike "*.h")) {
                    Write-Output "Error: Invalid Source File: This script only validates .c or .h source files."
                    exit 1
                } break
            } "cpp" { 
                if (($args[2] -notlike "*.c") -and ($args[2] -notlike "*.cc") -and ($args[2] -notlike "*.cxx") -and ($args[2] -notlike "*.h") -and ($args[2] -notlike "*.hh") -and ($args[2] -notlike "*.hpp")) {
                    Write-Output "Error: Invalid Source File: This script only validates C++ source files."
                    exit 1
                } break
            } "java" { 
                if ($args[2] -notlike "*.java") {
                    Write-Output "Error: Invalid Source File: This script only validates .java source files."
                    exit 1
                } break
            } "python" { 
                if ($args[2] -notlike "*.py") {
                    Write-Output "Error: Invalid Source File: This script only validates .py script files."
                    exit 1
                } break
            } "rust" { 
                if ($args[2] -notlike "*.rs") {
                    Write-Output "Error: Invalid Source File: This script only validates .rs source files."
                    exit 1
                } break
            } Default {
                Write-Output "how did you get here?"
                break
            }
        }
    } elseif (($args[0] -eq "-w") -or ($args[0] -eq "--compile-with-header")) {
        switch ($args[1]) {
            "c" { 
                $paths = $args[2..($args.Count - 1)]
                for ($i = 0; $i -lt $paths.Count - 1; $i++) {
                    if (($paths[$i] -notlike "*.c") -and ($paths[$i] -notlike "*.h")) {
                        Write-Output "Error: Invalid Input: A directory, a file without extension, and a main file with its headers is required."
                        exit 1
                    }
                } break
            } Default {
                Write-Output "how did you get here?"
            }
        }
    } elseif (($args[0] -eq "-r") -or ($args[0] -eq "--run")) {
        switch ($args[1]) {
            "assembly" {
                if ($args[2] -eq "*.*") {
                    echo "Error: Invalid Output File: This script only runs Assembly files without any file extensions."
                    exit 1
                } break
            } "c|cpp_clang|cpp_gpp|rust" {
                if ($args[2] -notlike "*.*") {
                    echo "Error: Invalid Output File: This script only runs output files."
                    exit 1
                } break
            } "java" {
                if ($args[2] -notlike "*.class") {
                    echo "Error: Invalid Output File: When running java, check output extension."
                    exit 1
                } break
            } "python" {
                if ($args[2] -notlike "*.py") {
                    echo "Error: Invalid Output File: This script only runs .py source files."
                    exit 1
                } break
            } Default {
                Write-Output "bug detected, tarcy must be eliminated."
            }
        }
    }
}

check_args

$RUN_TYPE = $args[0]
$args = $args[1..($args.Count - 1)]
$RUN_LANGUAGE = $args[0]
$args = $args[1..($args.Count - 1)]

# compiles and runs the output file
if ($RUN_TYPE -eq "-cr" -or $RUN_TYPE -eq "--compile-run") {
    $DIRECTORY = $args[0]
    $args = $args[1..($args.Count - 1)]
    Set-Location -Path $DIRECTORY -ErrorAction SilentlyContinue; if (-not $?) { Write-Output "Warning: Chanding directory via command 'cd' failed." }
    switch ($RUN_LANGUAGE) {
        "assembly" {
            $OUTPUT_FILE = $args[0] -replace '\.[^.]+$'
            $args = $args[1..($args.Count - 1)]
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            if (Test-Path -Path "${ASSEMBLY_BIN}/${OUTPUT_FILE}" -PathType Leaf) { 
                Remove-Item -Path "${ASSEMBLY_BIN}/${OUTPUT_FILE}" -Force
            } 
            & nasm "$INPUT_FILE" -f elf64 -o "${ASSEMBLY_BIN}/${OUTPUT_FILE}.o"
            & ld "${ASSEMBLY_BIN}/${OUTPUT_FILE}.o" -o "${ASSEMBLY_BIN}/${OUTPUT_FILE}"
            if (Test-Path -Path "${ASSEMBLY_BIN}/${OUTPUT_FILE}" -PathType Leaf) { 
                out_assembly
                & "${ASSEMBLY_BIN}/${OUTPUT_FILE}" 
            } 
            else {
                Write-Output "Error: File Not Found: Did the source file successfully compiled?"
            }
        }
        "bash" {
            $INPUT_FILE = $args[0]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            $args = $args[1..($args.Count - 1)]
            out_bash
            & bash "$INPUT_FILE"
        }
        "c" {
            $OUTPUT_FILE = $args[0] -replace '\.[^.]+$'
            $args = $args[1..($args.Count - 1)]
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            if (Test-Path -Path "${C_BIN}/${OUTPUT_FILE}.o" -PathType Leaf) { 
                Remove-Item -Path "${C_BIN}/${OUTPUT_FILE}.o" -Force
            } 
            & gcc "$INPUT_FILE" -o "${C_BIN}/${OUTPUT_FILE}.o"
            if (Test-Path -Path "${C_BIN}/${OUTPUT_FILE}.o" -PathType Leaf) { 
                out_c
                & "${C_BIN}/${OUTPUT_FILE}.o" 
            } 
            else {
                Write-Output "Error: File Not Found: Did the source file successfully compiled?"
            }
        }
        "cpp_gpp" {
            $OUTPUT_FILE = $args[0] -replace '\.[^.]+$'
            $args = $args[1..($args.Count - 1)]
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            if (Test-Path -Path "${CPP_BIN}/${OUTPUT_FILE}_gpp.o" -PathType Leaf) { 
                Remove-Item -Path "${CPP_BIN}/${OUTPUT_FILE}_gpp.o" -Force
            } 
            & g++ -std=c++23 -Wall -Wextra -Wpedantic "$INPUT_FILE" -o "${CPP_BIN}/${OUTPUT_FILE}_gpp.o"
            if (Test-Path -Path "${CPP_BIN}/${OUTPUT_FILE}_gpp.o" -PathType Leaf) { 
                out_cpp_gpp
                & "${CPP_BIN}/${OUTPUT_FILE}_gpp.o" 
            }  
            else {
                Write-Output "Error: File Not Found: Did the source file successfully compiled?"
            }
        }
        "cpp_clang" {
            $OUTPUT_FILE = $args[0] -replace '\.[^.]+$'
            $args = $args[1..($args.Count - 1)]
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            if (Test-Path -Path "${CPP_BIN}/${OUTPUT_FILE}_clang.o" -PathType Leaf) { 
                Remove-Item -Path "${CPP_BIN}/${OUTPUT_FILE}_clang.o" -Force
            } 
            & clang++ -std=c++23 -Wall -Wextra -Wpedantic "$INPUT_FILE" -o "${CPP_BIN}/${OUTPUT_FILE}_clang.o"
            if (Test-Path -Path "${CPP_BIN}/${OUTPUT_FILE}_clang.o" -PathType Leaf) { 
                out_cpp_clang
                & "${CPP_BIN}/${OUTPUT_FILE}_clang.o" 
            }  
            else {
                Write-Output "Error: File Not Found: Did the source file successfully compiled?"
            }
        }
        "java" {
            $OUTPUT_FILE = $args[0] -replace '\.[^.]+$'
            $args = $args[1..($args.Count - 1)]
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            if (Test-Path -Path "${JAVA_BIN}/${OUTPUT_FILE}.class" -PathType Leaf) { 
                Remove-Item -Path "$JAVA_BIN/${OUTPUT_FILE}.class" -Force
            } 
            & javac "$INPUT_FILE" -d "$JAVA_BIN"
            if (Test-Path -Path "${JAVA_BIN}/${OUTPUT_FILE}.class" -PathType Leaf) { 
                out_java
                & java -cp "$JAVA_BIN" "$OUTPUT_FILE" 
            }  
            else {
                Write-Output "Error: File Not Found: Did the source file successfully compiled?"
            }
        }
        "python" {
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            out_python
            & "${PYTHON_BIN}/python" -u "$INPUT_FILE"
        }
        "rust" {
            $OUTPUT_FILE = $args[0] -replace '\.[^.]+$'
            $args = $args[1..($args.Count - 1)]
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            if (Test-Path -Path "${RUST_BIN}/${OUTPUT_FILE}.o" -PathType Leaf) { 
                Remove-Item -Path "${RUST_BIN}/${OUTPUT_FILE}.o" -Force
            } 
            & rustc "$INPUT_FILE" -o "${RUST_BIN}/${OUTPUT_FILE}.o"
            if (Test-Path -Path "${RUST_BIN}/${OUTPUT_FILE}.o" -PathType Leaf) { 
                out_rust
                & "${RUST_BIN}/${OUTPUT_FILE}.o" 
            }  
            else {
                Write-Output "Error: File Not Found: Did the source file successfully compiled?"
            }
        }
        Default {
            Write-Output "how did you get here?"
        }
    }
}
# only compiles the file
elseif ($RUN_TYPE -eq "-c" -or $RUN_TYPE -eq "--compile") {
    $DIRECTORY = $args[0]
    $args = $args[1..($args.Count - 1)]
    Set-Location -Path $DIRECTORY -ErrorAction SilentlyContinue; if (-not $?) { Write-Output "Warning: Chanding directory via command 'cd' failed." }
    switch ($RUN_LANGUAGE) {
        "assembly" {
            $OUTPUT_FILE = $args[0] -replace '\.[^.]+$'
            $args = $args[1..($args.Count - 1)]
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            & nasm "$INPUT_FILE" -f elf64 -o "${ASSEMBLY_BIN}/${OUTPUT_FILE}.o"
            & ld "${ASSEMBLY_BIN}/${OUTPUT_FILE}.o" -o "${ASSEMBLY_BIN}/${OUTPUT_FILE}"
            Write-Output "Finished: Assembly Program Compiled: Build output is at '${ASSEMBLY_BIN}/${OUTPUT_FILE}'."
        }
        "bash" {
            Write-Output "Finished: Note: Bash scripts are automatically compiled when run."
        }
        "c" {
            $OUTPUT_FILE = $args[0] -replace '\.[^.]+$'
            $args = $args[1..($args.Count - 1)]
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            & gcc "$INPUT_FILE" -o "${C_BIN}/${OUTPUT_FILE}.o"
            Write-Output "Finished: C Program Compiled: Build output is at '${C_BIN}/${OUTPUT_FILE}.o.'"
        }
        "cpp_gpp" {
            $OUTPUT_FILE = $args[0] -replace '\.[^.]+$'
            $args = $args[1..($args.Count - 1)]
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            & g++ -std=c++23 -Wall -Wextra -Wpedantic "$INPUT_FILE" -o "${CPP_BIN}/${OUTPUT_FILE}_gpp.o"
            Write-Output "Finished: C++ Program Compiled: Build output is at '${CPP_BIN}/${OUTPUT_FILE}_gpp.o'."
        }
        "cpp_clang" {
            $OUTPUT_FILE = $args[0] -replace '\.[^.]+$'
            $args = $args[1..($args.Count - 1)]
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            & clang++ -std=c++23 -Wall -Wextra -Wpedantic "$INPUT_FILE" -o "${CPP_BIN}/${OUTPUT_FILE}_clang.o"
            Write-Output "Finished: C++ Program Compiled: Build output is at '${CPP_BIN}/${OUTPUT_FILE}_clang.o'."
        }
        "java" {
            $OUTPUT_FILE = $args[0] -replace '\.[^.]+$'
            $args = $args[1..($args.Count - 1)]
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            & javac "$INPUT_FILE" -d "$JAVA_BIN"
            Write-Output "Finished: Java Program Compiled: Build output is at '${JAVA_BIN}/${OUTPUT_FILE}.class'."
        }
        "python" {
            Write-Output "Finished: Note: Python programs are automatically compiled when run."
        }
        "rust" {
            $OUTPUT_FILE = $args[0] -replace '\.[^.]+$'
            $args = $args[1..($args.Count - 1)]
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            & rustc "$INPUT_FILE" -o "${RUST_BIN}/${OUTPUT_FILE}.o"
            Write-Output "Finished: Rust Program Compiled: Build output is at '${RUST_BIN}/${OUTPUT_FILE}.o'."
        } 
        Default {
            Write-Output "how did you get here?"
        }
    }
}
# compiles the file with its headers and runs the output file
elseif ($RUN_TYPE -eq "-wr" -or $RUN_TYPE -eq "--compile-and-run-with-header") {
    $DIRECTORY = $args[0]
    $args = $args[1..($args.Count - 1)]
    Set-Location -Path $DIRECTORY -ErrorAction SilentlyContinue; if (-not $?) { Write-Output "Warning: Chanding directory via command 'cd' failed." }
    switch ($RUN_LANGUAGE) {
        "c" {
            $OUTPUT_FILE = $args[0] -replace '\.[^.]+$'
            $args = $args[1..($args.Count - 1)]
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE $args
            if (Test-Path -Path "${C_BIN}/${OUTPUT_FILE}.o" -PathType Leaf) { 
                Remove-Item -Path "${C_BIN}/${OUTPUT_FILE}.o" -Force
            } 
            & gcc "$INPUT_FILE" $args -o "${C_BIN}/${OUTPUT_FILE}.o"
            if (Test-Path -Path "${C_BIN}/${OUTPUT_FILE}.o" -PathType Leaf) { 
                out_c
                & "${C_BIN}/${OUTPUT_FILE}.o" 
            } 
            else {
                Write-Output "Error: File Not Found: Did the source file/s successfully compiled?"
            }
        }
        Default {
            Write-Output "how did you get here?"
        }
    }
}
# only compiles the file with its headers
elseif ($RUN_TYPE -eq "-w" -or $RUN_TYPE -eq "--compile-with-header") {
    $DIRECTORY = $args[0]
    $args = $args[1..($args.Count - 1)]
    Set-Location -Path $DIRECTORY -ErrorAction SilentlyContinue; if (-not $?) { Write-Output "Warning: Chanding directory via command 'cd' failed." }
    switch ($RUN_LANGUAGE) {
        "c" {
            $OUTPUT_FILE = $args[0] -replace '\.[^.]+$'
            $args = $args[1..($args.Count - 1)]
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE $args
            if (Test-Path -Path "${C_BIN}/${OUTPUT_FILE}.o" -PathType Leaf) { 
                Remove-Item -Path "${C_BIN}/${OUTPUT_FILE}.o" -Force
            } 
            & gcc "$INPUT_FILE" $args -o "${C_BIN}/${OUTPUT_FILE}.o"
            Write-Output "Finished: C Program Compiled: Build output is at '${C_BIN}/${OUTPUT_FILE}.o.'"
        }
        Default {
            Write-Output "how did you get here?"
        }
    }
}
# only runs the output file
elseif ($RUN_TYPE -eq "-r" -or $RUN_TYPE -eq "--run") {
    $DIRECTORY = $args[0]
    $args = $args[1..($args.Count - 1)]
    Set-Location -Path $DIRECTORY -ErrorAction SilentlyContinue; if (-not $?) { Write-Output "Warning: Chanding directory via command 'cd' failed." }
    switch ($RUN_LANGUAGE) {
        "assembly" {
            $COMPILED_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $COMPILED_FILE
            if (Test-Path -Path "${ASSEMBLY_BIN}/${COMPILED_FILE}" -PathType Leaf) { 
                out_assembly
                & "${ASSEMBLY_BIN}/${COMPILED_FILE}" 
            } 
            else {
                Write-Output "Error: File Not Found: Did the source file successfully compiled?"
            }
        }
        "bash" {
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            out_bash
            & bash "$INPUT_FILE"
        }
        "c" {
            $COMPILED_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $COMPILED_FILE
            if (Test-Path -Path "${C_BIN}/${COMPILED_FILE}" -PathType Leaf) { 
                out_c
                & "${C_BIN}/${COMPILED_FILE}" 
            } 
            else {
                Write-Output "Error: File Not Found: Did the source file successfully compiled?"
            }
        }
        "cpp_gpp" {
            $COMPILED_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $COMPILED_FILE
            if (Test-Path -Path "${CPP_BIN}/${COMPILED_FILE}" -PathType Leaf) { 
                out_cpp_gpp
                & "${CPP_BIN}/${COMPILED_FILE}" 
            }  
            else {
                Write-Output "Error: File Not Found: Did the source file successfully compiled?"
            }
        }
        "cpp_clang" {
            $COMPILED_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $COMPILED_FILE
            if (Test-Path -Path "${CPP_BIN}/${COMPILED_FILE}" -PathType Leaf) { 
                out_cpp_clang
                & "${CPP_BIN}/${COMPILED_FILE}" 
            }  
            else {
                Write-Output "Error: File Not Found: Did the source file successfully compiled?"
            }
        }
        "java" {
            $COMPILED_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $COMPILED_FILE
            if (Test-Path -Path "${JAVA_BIN}/${COMPILED_FILE}" -PathType Leaf) { 
                out_java
                $JAVA_CLASS_NAME = $COMPILED_FILE -replace '\.[^.]+$'
                & java -cp "$JAVA_BIN" "$JAVA_CLASS_NAME" 
            }  
            else {
                Write-Output "Error: File Not Found: Did the source file successfully compiled?"
            }
        }
        "python" {
            $INPUT_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $INPUT_FILE
            out_python
            & "${$PYTHON_BIN}/python" -u "$INPUT_FILE"
        }
        "rust" {
            $COMPILED_FILE = $args[0]
            $args = $args[1..($args.Count - 1)]
            check_file_validity $RUN_TYPE $RUN_LANGUAGE $COMPILED_FILE
            if (Test-Path -Path "${RUST_BIN}/${COMPILED_FILE}" -PathType Leaf) { 
                out_rust
                & "${RUST_BIN}/${COMPILED_FILE}" 
            }  
            else {
                Write-Output "Error: File Not Found: Did the source file successfully compiled?"
            }
        }
        Default {
            Write-Output "how did you get here?"
        }
    }
}
# prints the separators
elseif ($RUN_TYPE -eq "-s" -or $RUN_TYPE -eq "--separate") {
    switch ($RUN_LANGUAGE) {
        "simple" {
            separate
        }
        "common" {
            out_common
        }
        "assembly" {
            out_assembly
        }
        "bash" {
            out_bash
        }
        "c" {
            out_c
        }
        "cpp_gpp" {
            out_cpp_gpp
        }
        "cpp_clang" {
            out_cpp_clang
        }
        "java" {
            out_java
        }
        "python" {
            out_python
        }
        "rust" {
            out_rust
        }
        Default {
            Write-Output "tell tarcy to git gud"
        }
    }
}
# prints the help page
elseif ($RUN_TYPE -eq "-h" -or $RUN_TYPE -eq "--help") {
    help
}
# runs when the input option is invalid
else {
    Write-Output "Error: Invalid Argument: '$RUN_TYPE' is not a valid argument."
    Write-Output "SYPNOSIS"
    Write-Output "        quick [OPTIONS] [LANGUAGE] [DIRECTORY] [FILE_WITHOUT_EXTENSION] [FILE_WITH_EXTENSION]"
    Write-Output "        quick [-h | --help]"
}
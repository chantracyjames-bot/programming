#!/bin/bash

# A shortcut for compiling and running languages with a clean termincal output, using Code Runner.
# Unlike Code Runner's verbose syntax to run programs, this script feeds from Code Runner's arguments without being too verbose.
# Resulting into a cleaner terminal environment, easier to debug and diagnose.

# From:
# cd /home/user/Documents/ && clang++ my_program.cpp -o ~/Documents/my_program.o && ~/Documents/my_program.o
# To:
# quick -cr cpp_clang /home/user/Documents/ my_program my_program.cpp

# build folder locations for each language
ASSEMBLY_BIN="/home/tarcy_arch/Documents/Programming/assembly/bin"
C_BIN="/home/tarcy_arch/Documents/Programming/c/bin"
CPP_BIN="/home/tarcy_arch/Documents/Programming/cpp/bin"
JAVA_BIN="/home/tarcy_arch/Documents/Programming/java/bin"
PYTHON_BIN="/home/tarcy_arch/Documents/Programming/python/bin"
RUST_BIN="/home/tarcy_arch/Documents/Programming/rust/bin"

# functions used for a clean output
separate()      { echo "==================================================="; }
out_common()	{ echo "=================== Code Output ==================="; separate; }
out_assembly()	{ echo "============== Code Output: Assembly =============="; separate; }
out_bash()		{ echo "================ Code Output: Bash ================"; separate; }
out_c()			{ echo "================== Code Output: C ================="; separate; }
out_cpp_gpp()	{ echo "============== Code Output: C++ (g++) ============="; separate; }
out_cpp_clang()	{ echo "============= Code Output: C++ (clang) ============"; separate; }
out_java()		{ echo "================ Code Output: Java ================"; separate; }
out_python()	{ echo "=============== Code Output: Python ==============="; separate; }
out_rust()		{ echo "================ Code Output: Rust ================"; separate; }

# help page
help() {
	echo "NAME"
	echo "        quick - A simple Bash script to eliminate verbose Code Runner Terminal Output."
	echo ""
	echo "DESCRIPTION"
	echo "        A shortcut for compiling and running languages with a clean termincal output, using Code Runner."
	echo "        Unlike Code Runner's verbose syntax to run programs, this script feeds from Code Runner's arguments without being too long."
	echo "        # Resulting into a cleaner terminal environment, easier to debug and diagnose."
	echo ""
	echo "SYPNOSIS"
	echo "        quick [OPTIONS] [LANGUAGE] [DIRECTORY] [FILE_WITHOUT_EXTENSION] [FILE_WITH_EXTENTION]"
	echo "        quick [-h | --help]"
	echo ""
	echo "OPTION"
	echo "        -cr, --compile-run"
	echo "                Compiles a given source file to an output directory and runs its output file"
	echo "        -c, --compile"
	echo "                Compiles a given source file and places it in an output directory."
	echo "        -r, --run"
	echo "                Runs a given output file from a specified directory."
	echo "        -s, --separate"
	echo "                Prints the 'Code Output' text header."
	echo "NOTE"
	echo "        [DIRECTORY] is the directory where the script will change directory (cd) into."
	echo "        Not where it will place the output files in. Read the source file for more information."
	echo ""
	echo ""
	echo "EXIT STATUS"
	echo "        0       Success. The script run without any problems."
	echo "        1       Error. An error was encountered during execution."
	echo ""
	echo "EXAMPLES"
	echo "        Compile a C source file from a specific directory."
	echo "                quick -c c ~/Documents my_program my_program.c"
	echo "        Run a C++ (clang++) output file from a specified directory."
	echo "                quick -r cpp_clang ~/Documents my_program_clang.o"
	echo "        Compile a .rs source file from a specific directory and run it."
	echo "                quick -cr rust ~/Documents my_program my_program.rs"
    echo "        Compile a C source file with header files from a specific directory and run it"
    echo "                quick -wr c ~/Documents output main.c my_header.c"
}

# validates the arguments
check_arguments() {
	case "$1" in
		"-c"|"-cr"|"--compile"|"--compile-run")
			case "$2" in
				"assembly"|"c"|"cpp_gpp"|"cpp_clang"|"java"|"rust")
					if [[ -z "$3" || -z "$4" || -z "$5" ]]; then
						echo "Error: Invalid Input: A directory, a file without extension and a file is required. i.e quick -c lang ~/my_folder my_file my_file.ext"
						exit 1
					elif [[ -n "$6" ]]; then
						echo "Error: Too Many Arguments: This option takes only 5 arguments at most."
						exit 1
					fi
				;;
				"bash"|"python")
					if [[ -z "$3" || -z "$4" ]]; then
						echo "Error: Invalid Input: A directory, and a file is required. i.e quick -c lang ~/my_folder my_file.ext"
						exit 1
					elif [[ -n "$5" ]]; then
						echo "Error: Too Many Arguments: This option takes only 4 arguments at most."
						exit 1
					fi
				;;
				*)
					echo "tarcy sux"
					exit 1
				;;
			esac
		;;
		"-r"|"--run")
			case "$2" in
				"bash"|"c"|"cpp_gpp"|"cpp_clang"|"python"|"rust")
					if [[ -z "$3" || -z "$4" ]]; then
						echo "Error: Invalid Input: A directory, and a file is required. i.e quick -r lang ~/my_folder my_file.o"
						exit 1
					elif [[ -n "$5" ]]; then
						echo "Error: Too Many Arguments: This option takes only 4 arguments at most."
						exit 1
					fi
				;;
				"assembly"|"java")
					if [[ -z "$3" || -z "$4" ]]; then
						echo "Error: Invalid Input: A directory, and a file without its extension is required. i.e quick -r lang ~/my_folder my_file"
						exit 1
					elif [[ -n "$5" ]]; then
						echo "Error: Too Many Arguments: This option takes only 4 arguments at most."
						exit 1
					fi
				;;
				*)
					echo "tarcy sux"
					exit 1
				;;
			esac
        ;;
        "-wr"|"--compile-with-header")
			case "$2" in
				"c")
					if [[ -z "$3" || -z "$4" || -z "$5" ]]; then
						echo "Error: Invalid Input: A directory, a file without extension and a file is required. i.e quick -wr lang ~/my_folder my_file my_file.ext"
						exit 1
					fi
                    shift; shift; shift; shift; shift;
                    for file in "$@"; do
                        if [[ -z "$file" ]]; then 
                            echo "Error: Invalid Input: A directory, a file without extension, and a main file with its headers is required. i.e. quick -wr lang ~/my_folder my_file my_file.ext my_header.ext etc."
                            exit 1
                        fi
                    done
				;;
				*)
					echo "tarcy sux"
					exit 1
				;;
			esac
        ;;
    esac
}

# checks the validity of the file arguments
check_file_validity() {
    if [[ "$1" == "-c" || "$1" == "-cr" || $1 == "--compile" || "$1" == "--compile-run" ]]; then
		case "$2" in
			"assembly")
				if [[ "$3" != *.asm ]]; then
					echo "Error: Invalid Assembly Source File: This script only validates .asm source files."
					exit 1
				fi
			;;
			"bash")
				if [[ "$3" != *.sh ]]; then
					echo "Error: Invalid Bash Script: This script only validates .sh shell script files."
					exit 1
				fi
			;;
			"c")
				if [[ "$3" != *.c && "$3" != *.h ]]; then
					echo "Error: Invalid C Source File: This script only validates .c and, .h source files."
					exit 1
				fi
			;;
			"cpp_clang"|"cpp_gpp")
				case "$3" in
				*.cpp|*.cc|*.cxx|*.h|*.hh|*.hpp)
					:
				;;
				*.c)
					echo "Error: Deprecated Feature: Compiling C using a C++ compiler is deprecated."
					exit 1
				;;
				*)
					echo "Error: Invalid C++ Source File: This script only validates .cpp, .cc, .cxx, .h, .hh, and .hpp source files."
					exit 1
				;;
				esac
			;;
			"java")
				if [[ "$3" != *.java ]]; then
					echo "Error: Invalid Java Source File: This script only validates .java source files."
					exit 1
				fi
			;;
			"python")
				if [[ "$3" != *.py ]]; then
					echo "Error: Invalid Python Soruce File: This script only validates .py source files."
					exit 1
				fi
			;;
			"rust")
				if [[ "$3" != *.rs ]]; then
					echo "Error: Invalid Rust Source File: This script only validates .rs source files."
					exit 1
				fi
			;;
			*)
				echo "how did you get here?"
			;;
		esac
    elif [[ "$1" == "-w" || "$1" == "--compile-with-header" ]]; then
        case "$2" in
            "c")
                shift; shift;
                for file in "$@"; do
                    if [[ "$file" != *.c && "$file" != *.h ]]; then
                        echo "Error: Invalid C Source File: This script only validates .c and, .h source files."
                        exit 1
                    fi
                done
            ;;
            *)
                echo "how did you get here?"
            ;;
        esac
	elif [[ "$1" == "-r" || "$1" == "--run" ]]; then
		case "$2" in
			"assembly")
				if [[ "$3" == *.* ]]; then
					echo "Error: Invalid Output File: This script only runs Assembly files without any file extensions."
					exit 1
				fi
			;;		
			"c"|"cpp_clang"|"cpp_gpp"|"rust")
				case "$3" in
					*.o)
						:
					;;
					*)
						echo "Error: Invalid Output File: This script only runs .o output files."
						exit 1
					;;
				esac
			;;
			"java")
				if [[ "$3" != *.class ]]; then
					echo "Error: Invalid Output File: When running java, the .java extension is omiited."
					exit 1
				fi
			;;
			"python")
				if [[ "$3" != *.py ]]; then
					echo "Error: Invalid Output File: This script only runs .py source files."
					exit 1
				fi
			;;
			*)
				echo "how did you get here?"
			;;
		esac
	else
		echo "bug detected, tarcy must be eliminated."
	fi
}

# checks the validity of the arguments
check_arguments "$@"

# global variables
RUN_TYPE="$1"
shift
RUN_LANGUAGE="$1"
shift

# compiles and runs the output file
if [[ ${RUN_TYPE} == "-cr" || ${RUN_TYPE} == "--compile-run" ]]; then
    DIRECTORY="$1"
    shift
    cd "${DIRECTORY}" || echo "Warning: Chanding directory via command 'cd' failed."
    case "${RUN_LANGUAGE}" in
        "assembly")
            # no extensions
            OUTPUT_FILE="${1%.*}"
            shift
            # input file
            INPUT_FILE="$1"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
			if [[ -f "${ASSEMBLY_BIN}/${OUTPUT_FILE}" ]]; then { 
				rm "${ASSEMBLY_BIN}/${OUTPUT_FILE}" 
			} fi
			nasm "${INPUT_FILE}" -f elf64 -o "${ASSEMBLY_BIN}/${OUTPUT_FILE}.o"
			ld "${ASSEMBLY_BIN}/${OUTPUT_FILE}.o" -o "${ASSEMBLY_BIN}/${OUTPUT_FILE}"
			if [[ -f "${ASSEMBLY_BIN}/${OUTPUT_FILE}" ]]; then { 
				out_assembly
				"${ASSEMBLY_BIN}/${OUTPUT_FILE}" 
			} 
			else 
				echo "Error: File Not Found: Did the source file successfully compiled?"
			fi
        ;;
        "bash")
            # input file
            INPUT_FILE="$1"
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
            shift
            out_bash
            bash "${INPUT_FILE}"
        ;;
        "c")
            # no extensions
            OUTPUT_FILE="${1%.*}"
            shift
            # input file
            INPUT_FILE="$1"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
			if [[ -f "${C_BIN}/${OUTPUT_FILE}.o" ]]; then { 
				rm "${C_BIN}/${OUTPUT_FILE}.o" 
			} 
			fi
			gcc "${INPUT_FILE}" -o "${C_BIN}/${OUTPUT_FILE}.o"
			if [[ -f "${C_BIN}/${OUTPUT_FILE}.o" ]]; then { 
				out_c
				"${C_BIN}/${OUTPUT_FILE}.o" 
			} 
			else 
				echo "Error: File Not Found: Did the source file successfully compiled?"
			fi
        ;;
        "cpp_gpp")
            # no extensions
            OUTPUT_FILE="${1%.*}"
            shift
            # input file
            INPUT_FILE="$1"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
			if [[ -f "${CPP_BIN}/${OUTPUT_FILE}_gpp.o" ]]; then { 
				rm "${CPP_BIN}/${OUTPUT_FILE}_gpp.o" 
			} fi
			g++ -std=c++23 -Wall -Wextra -Wpedantic "${INPUT_FILE}" -o "${CPP_BIN}/${OUTPUT_FILE}_gpp.o"
			if [[ -f "${CPP_BIN}/${OUTPUT_FILE}_gpp.o" ]]; then { 
				out_cpp_gpp
				"${CPP_BIN}/${OUTPUT_FILE}_gpp.o" 
			}  
			else 
				echo "Error: File Not Found: Did the source file successfully compiled?"
			fi
        ;;
        "cpp_clang")
            # no extensions
            OUTPUT_FILE="${1%.*}"
            shift
            # input file
            INPUT_FILE="$1"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
			if [[ -f "${CPP_BIN}/${OUTPUT_FILE}_clang.o" ]]; then { 
				rm "${CPP_BIN}/${OUTPUT_FILE}_clang.o" 
			} fi
			clang++ -std=c++23 -Wall -Wextra -Wpedantic "${INPUT_FILE}" -o "${CPP_BIN}/${OUTPUT_FILE}_clang.o"
			if [[ -f "${CPP_BIN}/${OUTPUT_FILE}_clang.o" ]]; then { 
				out_cpp_clang
				"${CPP_BIN}/${OUTPUT_FILE}_clang.o" 
			}  
			else 
				echo "Error: File Not Found: Did the source file successfully compiled?"
			fi
        ;;
        "java")
            # no extensions
            OUTPUT_FILE="${1%.*}"
            shift
            # input file
            INPUT_FILE="$1"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
			if [[ -f "${JAVA_BIN}/${OUTPUT_FILE}.class" ]]; then { 
				rm "$JAVA_BIN/${OUTPUT_FILE}.class"
			} fi
			javac "${INPUT_FILE}" -d "${JAVA_BIN}"
			if [[ -f "${JAVA_BIN}/${OUTPUT_FILE}.class" ]]; then { 
				out_java
				java -cp "${JAVA_BIN}" "${OUTPUT_FILE}" 
			}  
			else 
				echo "Error: File Not Found: Did the source file successfully compiled?"
			fi
        ;;
        "python")
            # input file
            INPUT_FILE="$1"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
			out_python
			"${PYTHON_BIN}/python" -u "${INPUT_FILE}"
        ;;
        "rust")
            # no extensions
            OUTPUT_FILE="${1%.*}"
            shift
            # input file
            INPUT_FILE="$1"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
			if [[ -f "${RUST_BIN}/${OUTPUT_FILE}.o" ]]; then { 
				rm "${RUST_BIN}/${OUTPUT_FILE}.o" 
			} fi
			rustc "${INPUT_FILE}" -o "${RUST_BIN}/${OUTPUT_FILE}.o"
			if [[ -f "${RUST_BIN}/${OUTPUT_FILE}.o" ]]; then { 
				out_rust
				"${RUST_BIN}/${OUTPUT_FILE}.o" 
			}  
			else 
				echo "Error: File Not Found: Did the source file successfully compiled?"
			fi
        ;;
        *)
            echo "how did you get here?"
        ;;
    esac
# only compiles the file
elif [[ ${RUN_TYPE} == "-c" || ${RUN_TYPE} == "--compile" ]]; then
    DIRECTORY="$1"
    shift
    cd "${DIRECTORY}" || echo "Warning: Chanding directory via command 'cd' failed."
    case "${RUN_LANGUAGE}" in
		"assembly")
            # no extensions
            OUTPUT_FILE="${1%.*}"
            shift
            # input file
            INPUT_FILE="$1"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
			nasm "${INPUT_FILE}" -f elf64 -o "${ASSEMBLY_BIN}/${OUTPUT_FILE}.o"
			ld "${ASSEMBLY_BIN}/${OUTPUT_FILE}.o" -o "${ASSEMBLY_BIN}/${OUTPUT_FILE}"
			echo "Finished: Assembly Program Compiled: Build output is at '${ASSEMBLY_BIN}/${OUTPUT_FILE}'."
		;;
		"bash")
			echo "Finished: Note: Bash scripts are automatically compiled when run."
		;;
        "c")
            # no extensions
            OUTPUT_FILE="${1%.*}"
            shift
            # input file
            INPUT_FILE="$1"
            shift
			check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
			gcc "${INPUT_FILE}" -o "${C_BIN}/${OUTPUT_FILE}.o"
			echo "Finished: C Program Compiled: Build output is at '${C_BIN}/${OUTPUT_FILE}.o.'"
		;;
		"cpp_gpp")
            # no extensions
            OUTPUT_FILE="${1%.*}"
            shift
            # input file
            INPUT_FILE="$1"
            shift
			check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
			g++ -std=c++23 -Wall -Wextra -Wpedantic "${INPUT_FILE}" -o "${CPP_BIN}/${OUTPUT_FILE}_gpp.o"
			echo "Finished: C++ Program Compiled: Build output is at '${CPP_BIN}/${OUTPUT_FILE}_gpp.o'."
		;;
		"cpp_clang")
            # no extensions
            OUTPUT_FILE="${1%.*}"
            shift
            # input file
            INPUT_FILE="$1"
            shift
			check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
			clang++ -std=c++23 -Wall -Wextra -Wpedantic "${INPUT_FILE}" -o "${CPP_BIN}/${OUTPUT_FILE}_clang.o"
			echo "Finished: C++ Program Compiled: Build output is at '${CPP_BIN}/${OUTPUT_FILE}_clang.o'."
		;;
		"java")
            # no extensions
            OUTPUT_FILE="${1%.*}"
            shift
            # input file
            INPUT_FILE="$1"
            shift
			check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
			javac "${INPUT_FILE}" -d "${JAVA_BIN}"
			echo "Finished: Java Program Compiled: Build output is at '${JAVA_BIN}/${OUTPUT_FILE}.class'."
		;;
		"python")
			echo "Finished: Note: Python programs are automatically compiled when run."
		;;
		"rust")
            # no extensions
            OUTPUT_FILE="${1%.*}"
            shift
            # input file
            INPUT_FILE="$1"
            shift
			check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
			rustc "${INPUT_FILE}" -o "${RUST_BIN}/${OUTPUT_FILE}.o"
			echo "Finished: Rust Program Compiled: Build output is at '${RUST_BIN}/${OUTPUT_FILE}.o'."
		;; 
        *)
            echo "how did you get here?"
        ;;
    esac
# compiles the file with its headers and runs the output file
elif [[ ${RUN_TYPE} == "-wr" || ${RUN_TYPE} == "--compile-and-run-with-header" ]]; then
    DIRECTORY="$1"
    shift
    cd "${DIRECTORY}" || echo "Warning: Chanding directory via command 'cd' failed."
    case "${RUN_LANGUAGE}" in
        "c")
            # no extensions
            OUTPUT_FILE="${1%.*}"
            shift
            # input file
            INPUT_FILE="$1"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}" "$@"
			if [[ -f "${C_BIN}/${OUTPUT_FILE}.o" ]]; then { 
				rm "${C_BIN}/${OUTPUT_FILE}.o" 
			} 
			fi
			gcc "${INPUT_FILE}" "${@}" -o "${C_BIN}/${OUTPUT_FILE}.o"
			if [[ -f "${C_BIN}/${OUTPUT_FILE}.o" ]]; then { 
				out_c
				"${C_BIN}/${OUTPUT_FILE}.o" 
			} 
			else 
				echo "Error: File Not Found: Did the source file/s successfully compiled?"
			fi
        ;;
        *)
            echo "how did you get here?"
        ;;
    esac
# only compiles the file with its headers
elif [[ ${RUN_TYPE} == "-w" || ${RUN_TYPE} == "--compile-with-header" ]]; then
    DIRECTORY="$1"
    shift
    cd "${DIRECTORY}" || echo "Warning: Chanding directory via command 'cd' failed."
    case "${RUN_LANGUAGE}" in
        "c")
            # no extensions
            OUTPUT_FILE="${1%.*}"
            shift
            # input file
            INPUT_FILE="$1"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}" "$@"
			if [[ -f "${C_BIN}/${OUTPUT_FILE}.o" ]]; then { 
				rm "${C_BIN}/${OUTPUT_FILE}.o" 
			} 
			fi
			gcc "${INPUT_FILE}" "${@}" -o "${C_BIN}/${OUTPUT_FILE}.o"
			echo "Finished: C Program Compiled: Build output is at '${C_BIN}/${OUTPUT_FILE}.o.'"
        ;;
        *)
            echo "how did you get here?"
        ;;
    esac
# only runs the output file
elif [[ ${RUN_TYPE} == "-r" || ${RUN_TYPE} == "--run" ]]; then
    DIRECTORY="$1"
    shift
    cd "${DIRECTORY}" || echo "Warning: Chanding directory via command 'cd' failed."
    case "${RUN_LANGUAGE}" in
        "assembly")
            # no extensions
            COMPILED_FILE="${1}"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${COMPILED_FILE}"
			if [[ -f "${ASSEMBLY_BIN}/${COMPILED_FILE}" ]]; then { 
				out_assembly
				"${ASSEMBLY_BIN}/${COMPILED_FILE}" 
			} 
			else 
				echo "Error: File Not Found: Did the source file successfully compiled?"
			fi
        ;;
        "bash")
            # input file
            INPUT_FILE="$1"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
            out_bash
            bash "${INPUT_FILE}"
        ;;
        "c")
            # no extensions
            COMPILED_FILE="${1}"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${COMPILED_FILE}"
			if [[ -f "${C_BIN}/${COMPILED_FILE}" ]]; then { 
				out_c
				"${C_BIN}/${COMPILED_FILE}" 
			} 
			else 
				echo "Error: File Not Found: Did the source file successfully compiled?"
			fi
        ;;
        "cpp_gpp")
            # no extensions
            COMPILED_FILE="${1}"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${COMPILED_FILE}"
			if [[ -f "${CPP_BIN}/${COMPILED_FILE}" ]]; then { 
				out_cpp_gpp
				"${CPP_BIN}/${COMPILED_FILE}" 
			}  
			else 
				echo "Error: File Not Found: Did the source file successfully compiled?"
			fi
        ;;
        "cpp_clang")
            # no extensions
            COMPILED_FILE="${1}"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${COMPILED_FILE}"
			if [[ -f "${CPP_BIN}/${COMPILED_FILE}" ]]; then { 
				out_cpp_clang
				"${CPP_BIN}/${COMPILED_FILE}" 
			}  
			else 
				echo "Error: File Not Found: Did the source file successfully compiled?"
			fi
        ;;
        "java")
            # no extensions
            COMPILED_FILE="${1}"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${COMPILED_FILE}"
			if [[ -f "${JAVA_BIN}/${COMPILED_FILE}" ]]; then { 
				out_java
				java -cp "${JAVA_BIN}" "${COMPILED_FILE%.*}" 
			}  
			else 
				echo "Error: File Not Found: Did the source file successfully compiled?"
			fi
        ;;
        "python")
            # input file
            INPUT_FILE="$1"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${INPUT_FILE}"
			out_python
			"${PYTHON_BIN}/python" -u "${INPUT_FILE}"
        ;;
        "rust")
            # no extensions
            COMPILED_FILE="${1}"
            shift
            check_file_validity "${RUN_TYPE}" "${RUN_LANGUAGE}" "${COMPILED_FILE}"
			if [[ -f "${RUST_BIN}/${COMPILED_FILE}" ]]; then { 
				out_rust
				"${RUST_BIN}/${COMPILED_FILE}" 
			}  
			else 
				echo "Error: File Not Found: Did the source file successfully compiled?"
			fi
        ;;
        *)
            echo "how did you get here?"
        ;;
    esac
# prints the separators
elif [[ ${RUN_TYPE} == "-s" || ${RUN_TYPE} == "--separate" ]]; then
    case "${RUN_LANGUAGE}" in
		"simple")
			separate
		;;
		"common")
			out_common
		;;
		"assembly")
			out_assembly
		;;
		"bash")
			out_bash
		;;
		"c")
			out_c
		;;
		"cpp_gpp")
			out_cpp_gpp
		;;
		"cpp_clang")
			out_cpp_clang
		;;
		"java")
			out_java
		;;
		"python")
			out_python
		;;
		"rust")
			out_rust
		;;
		*)
			echo "tell tarcy to git gud"
		;;
    esac
# prints the help page
elif [[ "${RUN_TYPE}" == "-h" || "${RUN_TYPE}" == "--help" ]]; then
    help
# runs when the input option is invalid
else
    echo "Error: Invalid Argument: '$RUN' is not a valid argument."
	echo "SYPNOSIS"
	echo "        quick [OPTIONS] [LANGUAGE] [DIRECTORY] [FILE_WITHOUT_EXTENSION] [FILE_WITH_EXTENSION]"
	echo "        quick [-h | --help]"
fi
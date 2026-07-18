#!/bin/bash

# A shortcut for compiling and running languages with a clean termincal output, using Code Runner.
# Unlike Code Runner's verbose syntax to run programs, this script feeds from Code Runner's arguments without being too verbose.
# Resulting into a cleaner terminal environment, easier to debug and diagnose.

# From:
# cd /home/user/Documents/ && clang++ my_program.cpp -o ~/Documents/my_program.o && ~/Documents/my_program.o
# To:
# quick -cr cpp_clang /home/Documents/ my_program.o my_program

# build folder locations for each language
c_bin="/home/tarcy_arch/Documents/Programming/c/bin"
cpp_bin="/home/tarcy_arch/Documents/Programming/cpp/bin"
java_bin="/home/tarcy_arch/Documents/Programming/java/bin"
rust_bin="/home/tarcy_arch/Documents/Programming/rust/bin"

# functions used for a clean output
separate()      { echo "============================================================"; }
out_common()	{ echo "======================== Code Output ======================="; separate; }
out_c()			{ echo "======================= Code Output: C ====================="; separate; }
out_cpp_gpp()	{ echo "=================== Code Output: C++ (g++) ================="; separate; }
out_cpp_clang()	{ echo "================== Code Output: C++ (clang) ================"; separate; }
out_java()		{ echo "===================== Code Output: Java ===================="; separate; }
out_python()	{ echo "==================== Code Output: Python ==================="; separate; }
out_rust()		{ echo "===================== Code Output: Rust ===================="; separate; }

# help page
help() {
	echo "NAME"
	echo "        quick - A simple Bash script to eliminate verbose Code Runner Terminal Output."
	echo ""
	echo "DESCRIPTION"
	echo "        A shortcut for compiling and running languages with a clean termincal output, using Code Runner."
	echo "        Unlike Code Runner's verbose syntax to run programs, this script feeds from Code Runner's arguments without being too verbose."
	echo "        # Resulting into a cleaner terminal environment, easier to debug and diagnose."
	echo ""
	echo "SYPNOSIS"
	echo "        quick [OPTIONS] [LANGUAGE] [DIRECTORY] [FILE_WITH_EXIT] [FILE_NO_EXT]"
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
	echo "        Compile a C source file to a specified directory."
	echo "                quick -c c ~/Documents my_program.c my_program"
	echo "        Run a C++ (clang++) output file from a specified directory."
	echo "                quick -r cpp_clang ~/Documents my_program_clang.o"
	echo "        Compile a .rs source file and run it from a specified output directory."
	echo "                quick -cr rust ~/Documents my_program.rs my_program"
}

# checks if the arguments are valid
check_args() {
	case "$1" in
		"-c"|"-cr"|"--compile"|"--compile-run")
			case "$2" in
				"c"|"cpp_gpp"|"cpp_clang"|"java"|"rust")
					if [[ -z "$3" || -z "$4" || -z "$5" ]]; then
						echo "Error: Invalid Input: A directory, a file and a file without its extension is required. i.e quick -c ~/my_folder my_file.ext my_file"
						exit 1
					elif [[ -n "$6" ]]; then
						echo "Error: Too Many Arguments: This language takes only 5 arguments at most."
						exit 1
					fi
				;;
				"python")
					if [[ -z "$3" || -z "$4" ]]; then
						echo "Error: Invalid Input: A directory, and a file is required. i.e quick -c ~/my_folder my_file.ext"
						exit 1
					elif [[ -n "$5" ]]; then
						echo "Error: Too Many Arguments: This language takes only 4 arguments at most."
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
				"c"|"cpp_gpp"|"cpp_clang"|"python"|"rust")
					if [[ -z "$3" || -z "$4" ]]; then
						echo "Error: Invalid Input: A directory, and a file is required. i.e quick -c ~/my_folder my_file.o"
						exit 1
					elif [[ -n "$5" ]]; then
						echo "Error: Too Many Arguments: This language takes only 4 arguments at most."
						exit 1
					fi
				;;
				"java")
					if [[ -z "$3" || -z "$4" ]]; then
						echo "Error: Invalid Input: A directory, and a file without its extension is required. i.e quick -c ~/my_folder my_file"
						exit 1
					elif [[ -n "$5" ]]; then
						echo "Error: Too Many Arguments: This language takes only 4 arguments at most."
						exit 1
					fi
				;;
				*)
					echo "tarcy sux"
					exit 1
				;;
			esac
		;;
	esac

	if [[ ! -d "$3" ]]; then
		echo "Error: Invalid Input: '$3' is not a valid directory."
		exit 1
	elif [[ ! -f "$3/$4" ]]; then
		echo "Error: Invalid Input: '$4' is not a valid file."
		exit 1
	fi
}

# checks if the file given is valid
check_valid() {
    if [[ "$1" == "-c" || "$1" == "-cr" || $1 == "--compile" || "$1" == "--compile-run" ]]; then
		case "$2" in
			"c")
				if [[ "$4" != *.c && "$4" != *.h ]]; then
				echo "Error: Invalid C Source File: This script only validates .c and, .h source files."
				exit 1
				fi
			;;
			"cpp_clang"|"cpp_gpp")
				case "$4" in
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
				if [[ "$4" != *.java ]]; then
				echo "Error: Invalid Java Source File: This script only validates .java source files."
				exit 1
				fi
			;;
			"python")
				if [[ "$4" != *.py ]]; then
				echo "Error: Invalid Python Soruce File: This script only validates .py source files."
				exit 1
				fi
			;;
			"rust")
				if [[ "$4" != *.rs ]]; then
				echo "Error: Invalid Rust Source File: This script only validates .rs source files."
				exit 1
				fi
			;;
			*)
				echo "how did you get here?"
			;;
		esac
	elif [[ "$1" == "-r" || "--run" ]]; then
		case "$2" in
			"c"|"cpp_clang"|"cpp_gpp"|"rust")
				case "$4" in
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
				if [[ "$4" != *.class ]]; then
					echo "Error: Invalid Output File: When running java, the .java extension is omiited."
					exit 1
				fi
			;;
			"python")
				if [[ "$4" != *.py ]]; then
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

# compiles the program to its respective build folders and runs the compiled program
if [[ $1 == "-cr" || $1 == "--compile-run" ]]; then
    check_args "$@"
    dir="$3"
    cd "$dir"
    case "$2" in
        "c")
			check_valid "$@"
			gcc "$4" -o "$c_bin/$5.o"
			out_c
			"$c_bin/$5.o"
		;;
		"cpp_gpp")
			check_valid "$@"
			g++ -std=c++23 -Wall -Wextra -Wpedantic "$4" -o "$cpp_bin/$5_gpp.o"
			out_cpp_gpp
			"$cpp_bin/$5_gpp.o"
		;;
		"cpp_clang")
			check_valid "$@"
			clang++ -std=c++23 -Wall -Wextra -Wpedantic "$4" -o "$cpp_bin/$5_clang.o"
			out_cpp_clang
			"$cpp_bin/$5_clang.o"
		;;
		"java")
			check_valid "$@"
			javac "$4" -d "$java_bin"
			out_java
			java -cp "$java_bin" "$5"
		;;
		"python")
			check_valid "$@"
			out_python
			python -u "$4"
		;;
		"rust")
			check_valid "$@"
			rustc "$4" -o "$rust_bin/$5.o"
			out_rust
			"$rust_bin/$5.o"
		;; 
        *)
            echo "how did you get here?"
        ;;
    esac
# only compiles the program to its respective build folder
elif [[ $1 == "-c" || $1 == "--compile" ]]; then
    check_args "$@"
    dir="$3"
    cd "$dir"
    case "$2" in
        "c")
			check_valid "$@"
			gcc "$4" -o "$c_bin/$5.o"
			echo "Finished: C Program Compiled: Build output is at '$c_bin/$5.o.'"
		;;
		"cpp_gpp")
			check_valid "$@"
			g++ -std=c++23 -Wall -Wextra -Wpedantic "$4" -o "$cpp_bin/$5_gpp.o"
			echo "Finished: C++ Program Compiled: Build output is at '$cpp_bin/$5_gpp.o'."
		;;
		"cpp_clang")
			check_valid "$@"
			clang++ -std=c++23 -Wall -Wextra -Wpedantic "$4" -o "$cpp_bin/$5_clang.o"
			echo "Finished: C++ Program Compiled: Build output is at '$cpp_bin/$5_clang.o'."
		;;
		"java")
			check_valid "$@"
			javac "$4" -d "$java_bin"
			echo "Finished: Java Program Compiled: Build output is at '$java_bin/$5.class'."
		;;
		"python")
			check_valid "$@"
			echo "Finished: Note: Python programs are automatically compiled when run."
		;;
		"rust")
			check_valid "$@"
			rustc "$4" -o "$rust_bin/$5.o"
			echo "Finished: Rust Program Compiled: Build output is at '$rust_bin/$5.o'."
		;; 
        *)
            echo "how did you get here?"
        ;;
    esac
# runs a program from a specified build folder
elif [[ $1 == "-r" || $1 == "--run" ]]; then
    check_args "$@"
    dir="$3"
    cd "$dir"
    case "$2" in
        "c")
			check_valid "$@"
			out_c
			"$c_bin/$4"
		;;
		"cpp_gpp")
			check_valid "$@"
			out_cpp_gpp
			"$cpp_bin/$4"
		;;
		"cpp_clang")
			check_valid "$@"
			out_cpp_clang
			"$cpp_bin/$4"
		;;
		"java")
			check_valid "$@"
			out_java
			java -cp "$java_bin" "${4%.*}"
		;;
		"python")
			check_valid "$@"
			out_python
			python -u "$4"
		;;
		"rust")
			check_valid "$@"
			out_rust
			"$rust_bin/$4"
		;; 
			*)
				echo "how did you get here?"
		;;
    esac
# prints the help page
elif [[ $1 == "-h" || $1 == "--help" ]]; then
	help;
# only prints out the output separator
elif [[ $1 == "-s" || $1 == "--separate" ]]; then
    case "$2" in
		"simple")
			separate
		;;
		"common")
			out_common
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
# runs when an invalid argument is used
else
    echo "Error: Invalid Argument: '$1' is not a valid argument."
	echo "SYPNOSIS"
	echo "        quick [OPTIONS] [LANGUAGE] [DIRECTORY] [FILE_WITH_EXIT] [FILE_NO_EXT]"
	echo "        quick [-h | --help]"
fi

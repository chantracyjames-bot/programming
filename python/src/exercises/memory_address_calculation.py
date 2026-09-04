from time import sleep


# prints the main menu
def print_menu() -> None:
    print("\n" + "─" * 30)
    print("Type of array to calculate?:")
    print("  1. 1D arrays")
    print("  2. 2D arrays")
    print("  3. 3D arrays")
    print("  t. Type sizes")
    print("  x. Exit")
    print("Input: ", end="")


# prints the size of data types
def print_type_size() -> None:
    print("\n" + "─" * 30)
    print("Size of data types")
    print("  char      -> 1 bytes")
    print("  short     -> 2 bytes")
    print("  int       -> 4 bytes")
    print("  long      -> 4 bytes")
    print("  float     -> 4 bytes")
    print("  double    -> 8 bytes")
    print("  long long -> 8 bytes")
    print("─" * 30)


# calculates 1D arrays
# uses `A[i] = BASE + ESIZE * i`
def calc_1d() -> None:
    print("\n" + "─" * 30)

    # gathers the esize
    esize: int = int(input("Enter data type size: "))

    # gathers the starting address
    start: int = int(input("Enter starting address: "))

    # gathers the upper bounds of the 1st dimension
    ui: int = int(input("\nEnter the upper bound of i (1st): "))

    # gathers the index of the element
    i: int = int(input("\nEnter the index of element: "))

    # checks if the index is out of bounds or not
    if index_in_bounds(index=i, upper_bound=ui):
        # raises an error if it is out of bounds
        raise IndexError

    # calculates the result
    result: int = start + (esize * i)

    # prints the output
    print(f"\nA[{i}] = {result}")
    print("─" * 30)


# calculates 2D arrays
# uses `A[i][j] = BASE + ESIZE * (UJ * i + j)`
def calc_2d() -> None:
    print("\n" + "─" * 30)

    # gathers the esize
    esize: int = int(input("Enter data type size: "))

    # gathers the starting address
    start: int = int(input("Enter starting address: "))

    # gathers the upper bounds of the 1st dimension
    ui: int = int(input("\nEnter the upper bound of i (1st): "))

    # gathers the upper bounds of the 2nd dimension
    uj: int = int(input("Enter the upper bound of j (2nd): "))

    # gather the index of i of the element
    i: int = int(input("\nEnter the index of element (i): "))

    # chacks if the index is out of bounds or not
    if index_in_bounds(index=i, upper_bound=ui):
        # raises an error if it is out of bounds
        raise IndexError

    # gathers the index of j of the element
    j: int = int(input("Enter the index of element (j): "))

    # checks if the index is out of bounds or not
    if index_in_bounds(index=j, upper_bound=uj):
        # raises an error if it is out of bounds
        raise IndexError

    # calculates the results
    result: int = start + (esize * (i * uj + j))

    # prints the output
    print(f"\nA[{i}][{j}] = {result}")
    print("─" * 30)


# calculates 3D arrays
# uses `A[i][j][k] = BASE + ESIZE * (UK * UJ * i + UK * j + k)`
def calc_3d() -> None:
    print("\n" + "─" * 30)

    # gathers the esize
    esize: int = int(input("Enter data type size: "))

    # gathers the starting address
    start: int = int(input("Enter starting address: "))

    # gathers the upper bounds of the first dimension
    ui: int = int(input("\nEnter the upper bound of i (1st): "))

    # gathers the upper bounds of the second dimension
    uj: int = int(input("Enter the upper bound of j (2nd): "))

    # gathers the upper bounds of the third dimension
    uk: int = int(input("Enter the upper bound of k (3rd): "))

    # gathers the index of i of the element
    i: int = int(input("\nEnter index of element (i): "))

    # checks if the index is out of bounds or not
    if index_in_bounds(index=i, upper_bound=ui):
        # raises an error if it is out of bounds
        raise IndexError

    # gathers the index of j of the element
    j: int = int(input("Enter index of element (j): "))

    # checks if the index is out of bounds or not
    if index_in_bounds(index=j, upper_bound=uj):
        # raises an error if it is out of bounds
        raise IndexError

    # gathers the index of k of the element
    k: int = int(input("Enter index of element (k): "))

    # checks if the index is out of bounds or not
    if index_in_bounds(index=k, upper_bound=uk):
        # raises an error if it is out of bounds
        raise IndexError

    # calculates the result
    result: int = start + (esize * ((uk * uj * i) + (uk * j) + k))

    # prints the output
    print(f"\nA[{i}][{j}][{k}] = {result}")
    print("─" * 30)


# functions that ends the program
def exit_program() -> None:
    print("\nExiting", end="")
    for i in range(3):
        print(".", end="", flush=True)
        sleep(1)
    exit(0)


# validates the index if it is valid
# if it goes above the upper bound, it is considered as `out of bounds`
def index_in_bounds(index: int, upper_bound: int) -> bool:
    return index > upper_bound


# main program
def main() -> None:
    # loops the program
    while True:
        # uses exception handl;ing
        try:
            print_menu()
            user_input: str = input()
            print("─" * 30)

            # similar to switch-case in Java
            match (user_input):
                # calculates 1D arrays
                case "1":
                    calc_1d()
                # calculates 2D arrays
                case "2":
                    calc_2d()
                # calculates 3D arrays
                case "3":
                    calc_3d()
                # exit point
                case "t":
                    print_type_size()
                case "x":
                    exit_program()
                # default case
                case _:
                    sleep(0.5)
                    print("Invalid input! Try again.")
                    print("─" * 30)

        # runs if the user placed the wrong type of data
        # i.e. float values on an input expecting an int value
        except ValueError as err:
            sleep(0.5)
            print("Invalid input! Only integer values are allowed.")
            print("─" * 30)

        # clever reusing of exceptions, or i am just an imbecile
        # runs if the index is out of bounds, or index > upper bounds of index
        except IndexError as err:
            print("Invalid input! Index is out of bounds")
            print("─" * 30)

        # runs if the user uses CTRL + C to exit the program
        except KeyboardInterrupt as err:
            print("\nbruh")
            exit(1)

        # runs if there is an Exception other than the above
        except Exception as err:
            sleep(0.5)
            print("blame tarcy")
            print("─" * 30)


# entry point
if __name__ == "__main__":
    main()

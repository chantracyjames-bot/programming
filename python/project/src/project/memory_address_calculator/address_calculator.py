from abstract import AbstractCalculator
from time import sleep


class AddressCalculator(AbstractCalculator):
    def __init__(self) -> None: ...

    # prints the main menu
    def print_menu(self) -> None:
        print("\n" + "─" * 40)
        print("Type of array to calculate?:")
        print("  1. 1D arrays")
        print("  2. 2D arrays")
        print("  3. 3D arrays")
        print("  4. 4D arrays")
        print("  t. Type sizes")
        print("  x. Exit")
        print("Input: ", end="")

    # prints the size of data types
    def print_type_size(self) -> None:
        print("\n" + "─" * 40)
        print("Size of data types")
        sleep(0.1)
        print("  char      -> 1 bytes")
        sleep(0.1)
        print("  short     -> 2 bytes")
        sleep(0.1)
        print("  int       -> 4 bytes")
        sleep(0.1)
        print("  long      -> 4 bytes")
        sleep(0.1)
        print("  float     -> 4 bytes")
        sleep(0.1)
        print("  double    -> 8 bytes")
        sleep(0.1)
        print("  long long -> 8 bytes")
        sleep(0.1)
        
        input("\nPress enter to continue.")
        print("─" * 40)

    # calculates 1D arrays
    # uses `A[i] = BASE + ESIZE * i`
    def calc_1d(self) -> None:
        print("\n" + "─" * 40)

        # gathers the esize
        esize: int = int(input("Enter data type size: "))
        # gathers the starting address
        start: int = int(input("Enter starting address: "))
        # gathers the upper bounds of the 1st dimension
        ui: int = int(input("\nEnter the upper bound of i (1st): "))
        # gathers the index of the element
        i: int = int(input("\nEnter the index of element: "))
        print("─" * 40)

        # checks if the index is out of bounds or not
        if self.index_in_bounds(index=i, upper_bound=ui):
            # raises an error if it is out of bounds
            raise IndexError

        # calculates the result
        result: int = start + (esize * i)

        # prints the output
        print("\n" + "─" * 40)
        print(f"Solution for A[{i}]:")
        # formula
        print(f"  A[{i}] = start + esize * i")
        sleep(0.2)
        # substitutes variables
        print(f"  A[{i}] = {start} + {esize} * {i}")
        sleep(0.2)
        # solves for esize * i
        print(f"  A[{i}] = {start} + {esize * i}")
        sleep(0.2)
        # solves for start + esize * i
        print(f"  A[{i}] = {start + esize * i}")
        sleep(0.2)

        # screen stalling
        input("\nPress enter to continue")
        print("─" * 40)

    # calculates 2D arrays
    # uses `A[i][j] = BASE + ESIZE * (UJ * i + j)`
    def calc_2d(self) -> None:
        print("\n" + "─" * 40)

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
        if self.index_in_bounds(index=i, upper_bound=ui):
            # raises an error if it is out of bounds
            raise IndexError

        # gathers the index of j of the element
        j: int = int(input("Enter the index of element (j): "))
        print("─" * 40)

        # checks if the index is out of bounds or not
        if self.index_in_bounds(index=j, upper_bound=uj):
            # raises an error if it is out of bounds
            raise IndexError

        # prints the output
        print("\n" + "─" * 40)
        print(f"Solution for A[{i}][{j}]:")
        # formula
        print(f"  A[i][j] = start + esize * (i * uj + j)")
        sleep(0.2)
        # substitutes variables
        print(f"  A[{i}][{j}] = {start} + {esize} * ({i} * {uj} + {j})")
        sleep(0.2)
        # solves for i * uj
        print(f"  A[{i}][{j}] = {start} + {esize} * ({i * uj} + {j})")
        sleep(0.2)
        # solves for i * uj + j
        print(f"  A[{i}][{j}] = {start} + {esize} * ({i * uj + j})")
        sleep(0.2)
        # solves for esize * (i * uj + j)
        print(f"  A[{i}][{j}] = {start} + {esize * (i * uj + j)}")
        sleep(0.2)
        # solves for start + esize * (i * uj + j)
        print(f"  A[{i}][{j}] = {start + (esize * (i * uj + j))}")
        sleep(0.2)

        # screen stalling
        input("\nPress enter to continue")
        print("─" * 40)

    # calculates 3D arrays
    # uses `A[i][j][k] = BASE + ESIZE * (UK * UJ * i + UK * j + k)`
    def calc_3d(self) -> None:
        print("\n" + "─" * 40)

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
        if self.index_in_bounds(index=i, upper_bound=ui):
            # raises an error if it is out of bounds
            raise IndexError

        # gathers the index of j of the element
        j: int = int(input("Enter index of element (j): "))

        # checks if the index is out of bounds or not
        if self.index_in_bounds(index=j, upper_bound=uj):
            # raises an error if it is out of bounds
            raise IndexError

        # gathers the index of k of the element
        k: int = int(input("Enter index of element (k): "))
        print("─" * 40)

        # checks if the index is out of bounds or not
        if self.index_in_bounds(index=k, upper_bound=uk):
            # raises an error if it is out of bounds
            raise IndexError

        # prints the output
        print("\n" + "─" * 40)
        print(f"Solution for A[{i}][{j}][{k}]:")
        sleep(0.2)
        # formula
        print(f"  A[i][j][k] = start + esize * [(i * uj * uk) + (j * uk) + k]")
        sleep(0.2)
        # substitutes variables
        print(
            f"  A[{i}][{j}][{k}] = {start} + {esize} * [({i} * {uj} * {uk}) + ({j} * {uk}) + {k}]"
        )
        sleep(0.2)
        # solves for i * uj * uk and j * uk
        print(
            f"  A[{i}][{j}][{k}] = {start} + {esize} * [({i * uj * uk}) + ({j * uk}) + {k}]"
        )
        sleep(0.2)
        # solves for (i * uj * uk) + (j * uk) + k
        print(
            f"  A[{i}][{j}][{k}] = {start} + {esize} * [{(i * uj * uk) + (j * uk) + k}]"
        )
        sleep(0.2)
        # solves for esize * [(i * uj * uk) + (j * uk) + k]
        print(
            f"  A[{i}][{j}][{k}] = {start} + {esize * ((i * uj * uk) + (j * uk) + k)}"
        )
        sleep(0.2)
        # solves for base + esize * [(i * uj * uk) + (j * uk) + k]
        print(f"  A[{i}][{j}][{k}] = {start + esize * ((i * uj * uk) + (j * uk) + k)}")
        sleep(0.2)

        # screen stalling
        input("\nPress enter to continue.")
        print("─" * 40)
        

    # calculates 4D arrays
    # uses `A[i][j][k][l] = BASE + ESIZE * (UL * UK * UJ * i + UL * UK * j + UL * k + l)`
    def calc_4d(self) -> None:
        print("\n" + "─" * 40)

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
        # gathers the upper bounds of the fourth dimension
        ul: int = int(input("Enter the upper bound of l (4th): "))
        # gathers the index of i of the element
        i: int = int(input("\nEnter index of element (i): "))

        # checks if the index is out of bounds or not
        if self.index_in_bounds(index=i, upper_bound=ui):
            # raises an error if it is out of bounds
            raise IndexError

        # gathers the index of j of the element
        j: int = int(input("Enter index of element (j): "))

        # checks if the index is out of bounds or not
        if self.index_in_bounds(index=j, upper_bound=uj):
            # raises an error if it is out of bounds
            raise IndexError

        # gathers the index of k of the element
        k: int = int(input("Enter index of element (k): "))

        # checks if the index is out of bounds or not
        if self.index_in_bounds(index=k, upper_bound=uk):
            # raises an error if it is out of bounds
            raise IndexError

        # gathers the index of k of the element
        l: int = int(input("Enter index of element (l): "))
        print("─" * 40)

        # checks if the index is out of bounds or not
        if self.index_in_bounds(index=l, upper_bound=ul):
            # raises an error if it is out of bounds
            raise IndexError

        # prints the output
        print("\n" + "─" * 40)
        print(f"Solution for A[{i}][{j}][{k}][{l}]:")
        sleep(0.2)
        # formula
        print(f"  A[i][j][k][l] = start + esize * [(i * uj * uk * ul) + (j * uk * ul) + (k * ul) + (l)]")
        sleep(0.2)
        # substitutes variables
        print(
            f"  A[{i}][{j}][{k}][{l}] = {start} + {esize} * [({i} * {uj} * {uk} * {ul}) + ({j} * {uk} * {ul}) + ({k} * {ul}) + {l}]"
        )
        sleep(0.2)
        # solves for i * uj * uk and j * uk
        print(
            f"  A[{i}][{j}][{k}][{l}] = {start} + {esize} * [({i * uj * uk * ul}) + ({j * uk * ul}) + {k * ul} + {l}]"
        )
        sleep(0.2)
        # solves for (i * uj * uk) + (j * uk) + k
        print(
            f"  A[{i}][{j}][{k}][{l}] = {start} + {esize} * [{(i * uj * uk * ul) + (j * uk * ul) + (k * ul) + l}]"
        )
        sleep(0.2)
        # solves for esize * [(i * uj * uk) + (j * uk) + k]
        print(
            f"  A[{i}][{j}][{k}][{l}] = {start} + {esize * ((i * uj * uk * ul) + (j * uk * ul) + (k * ul) + l)}"
        )
        sleep(0.2)
        # solves for base + esize * [(i * uj * uk) + (j * uk) + k]
        print(f"  A[{i}][{j}][{k}][{l}] = {start + esize * ((i * uj * uk * ul) + (j * uk * ul) + (k * ul) + l)}")
        sleep(0.2)

        # screen stalling
        input("\nPress enter to continue.")
        print("─" * 40)

    # calculates 4D arrays
    # uses `A[i][j][k][l] = BASE + ESIZE * (UL * UK * UJ * i + UL * UK * j + UL * k + l)`
    def calc_5d(self) -> None:
        print("\n" + "─" * 40)

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
        # gathers the upper bounds of the fourth dimension
        ul: int = int(input("Enter the upper bound of l (4th): "))
        # gathers the upper bounds of the fourth dimension
        um: int = int(input("Enter the upper bound of m (5th): "))
        # gathers the index of i of the element
        i: int = int(input("\nEnter index of element (i): "))

        # checks if the index is out of bounds or not
        if self.index_in_bounds(index=i, upper_bound=ui):
            # raises an error if it is out of bounds
            raise IndexError

        # gathers the index of j of the element
        j: int = int(input("Enter index of element (j): "))

        # checks if the index is out of bounds or not
        if self.index_in_bounds(index=j, upper_bound=uj):
            # raises an error if it is out of bounds
            raise IndexError

        # gathers the index of k of the element
        k: int = int(input("Enter index of element (k): "))

        # checks if the index is out of bounds or not
        if self.index_in_bounds(index=k, upper_bound=uk):
            # raises an error if it is out of bounds
            raise IndexError

        # gathers the index of k of the element
        l: int = int(input("Enter index of element (l): "))

        # checks if the index is out of bounds or not
        if self.index_in_bounds(index=l, upper_bound=ul):
            # raises an error if it is out of bounds
            raise IndexError
        
        # gathers the index of k of the element
        m: int = int(input("Enter index of element (m): "))
        print("─" * 40)

        # checks if the index is out of bounds or not
        if self.index_in_bounds(index=m, upper_bound=um):
            # raises an error if it is out of bounds
            raise IndexError

        # prints the output
        print("\n" + "─" * 40)
        print(f"Solution for A[{i}][{j}][{k}][{l}][{m}]:")
        sleep(0.2)
        # formula
        print(f"  A[i][j][k][l][m] = start + esize * [(i * uj * uk * ul * um) + (j * uk * ul * um) + (k * ul * um) + (l * um) + m]")
        sleep(0.2)
        # substitutes variables
        print(
            f"  A[{i}][{j}][{k}][{l}][{m}] = {start} + {esize} * [({i} * {uj} * {uk} * {ul} * {um}) + ({j} * {uk} * {ul} * {um}) + ({k} * {ul} * {um}) + ({l} * {um}) + m]"
        )
        sleep(0.2)
        # solves for i * uj * uk and j * uk
        print(
            f"  A[{i}][{j}][{k}][{l}][{m}] = {start} + {esize} * [({i * uj * uk * ul * um}) + ({j * uk * ul * um}) + {k * ul * um} + ({l} * {um}) + {m}]"
        )
        sleep(0.2)
        # solves for (i * uj * uk) + (j * uk) + k
        print(
            f"  A[{i}][{j}][{k}][{l}][{m}] = {start} + {esize} * [{(i * uj * uk * ul * um) + (j * uk * ul * um) + (k * ul * um) + (l * um) + m}]"
        )
        sleep(0.2)
        # solves for esize * [(i * uj * uk) + (j * uk) + k]
        print(
            f"  A[{i}][{j}][{k}][{l}][{m}] = {start} + {esize * ((i * uj * uk * ul * um) + (j * uk * ul * um) + (k * ul * um) + (l * um) + um)}"
        )
        sleep(0.2)
        # solves for base + esize * [(i * uj * uk) + (j * uk) + k]
        print(f"  A[{i}][{j}][{k}][{l}][{m}] = {start + esize * ((i * uj * uk * ul * um) + (j * uk * ul * um) + (k * ul * um) + (l * um) + m)}")
        sleep(0.2)

        # screen stalling
        input("\nPress enter to continue.")
        print("─" * 40)

    # functions that ends the program
    def exit_program(self) -> None:
        print("\nExiting", end="")
        for i in range(3):
            print(".", end="", flush=True)
            sleep(1)
        exit(0)

    # validates the index if it is valid
    # if it goes above the upper bound, it is considered as `out of bounds`
    def index_in_bounds(self, index: int, upper_bound: int) -> bool:
        return index > upper_bound

    @staticmethod
    def console() -> None:
        cal: AddressCalculator = AddressCalculator()
        # loops the program
        while True:
            # uses exception handlling
            try:
                cal.print_menu()
                user_input: str = input()
                print("─" * 40)

                # similar to switch-case in Java
                match (user_input):
                    # calculates 1D arrays
                    case "1":
                        cal.calc_1d()
                    # calculates 2D arrays
                    case "2":
                        cal.calc_2d()
                    # calculates 3D arrays
                    case "3":
                        cal.calc_3d()
                    # calculates 4D arrays
                    case "4":
                        cal.calc_4d()
                    # calculates 4D arrays
                    case "5":
                        cal.calc_5d()
                    # prints a legend
                    case "t":
                        cal.print_type_size()
                    # exit point
                    case "x":
                        cal.exit_program()
                    # default case
                    case _:
                        sleep(0.5)
                        print("Invalid input! Try again.")
                        print("─" * 40)

            # runs if the user placed the wrong type of data
            # i.e. float values on an input expecting an int value
            except ValueError as err:
                sleep(0.5)
                print("Invalid input! Only integer values are allowed.")
                print("─" * 40)

            # clever reusing of exceptions, or i am just an imbecile
            # runs if the index is out of bounds, or index > upper bounds of index
            except IndexError as err:
                print("Invalid input! Index is out of bounds")
                print("─" * 40)

            # runs if the user uses CTRL + C to exit the program
            except KeyboardInterrupt as err:
                print("\nbruh")
                exit(1)

            # runs if there is an Exception other than the above
            except Exception as err:
                sleep(0.5)
                print("blame tarcy" + err)
                print("─" * 40)

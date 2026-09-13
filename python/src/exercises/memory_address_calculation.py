



def main() -> None:
    running = True
    while running:
        try:
            print("DSA Memory Address Calculator")
            print("1. Two-Dimensional arrays")
            print("2. Three-Dimensional arrays")
            print("3. Exit")
            print("Input: ", end="")
            choice = input()

            if choice == "1":
                starting_address = int(input("\nStarting address: "))
                UB2 = int(input("Upper bound of j (UB3): "))
                i = int(input("Index of element (i): "))
                j = int(input("Index of element (j): "))
                element_size = int(input("Data type size: "))

                output = starting_address + (element_size * (i * UB2 + j))
                print(f"\nAddress of A[{i}][{j}] = {output}\n")

            elif choice == "2":
                starting_address = int(input("Starting Address (alpha): "))
                UB2 = int(input("Upper bound of j (UB2): "))
                UB3 = int(input("Upper bound of k (UB3): "))
                i = int(input("Index of element (i): "))
                j = int(input("Index of element (j): "))
                k = int(input("Index of element (k): "))
                element_size = int(input("Data type size: "))

                output = starting_address + (element_size * ((UB3 * UB2 * i) + (UB3 * j) + k))
                print(f"\nAddress of A[{i}][{j}][{k}] = {output}\n")

            elif choice == "3":
                running = False

            else:
                print("Invalid input! Try again.")

        except ValueError as err:
            print("Invalid input! Only integer values are allowed.")

        except Exception as err:
            print(f"Error: {err}")

if __name__ == "__main__":
    main()

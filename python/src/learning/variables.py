# constant variable (by convention)
CONSTANT_NUMBER: int = 1000


def local_var() -> None:
    # local variable
    local_var: int = 1


def create_global_var() -> None:
    # global variable
    global global_var
    global_var = "no"


create_global_var()


def nonlocal_var() -> None:
    local_var: str = "this is modified"

    def modify_nonlocal() -> None:
        nonlocal local_var
        local_var = "this is now modified"

    modify_nonlocal()


# variable linking
my_num: int = CONSTANT_NUMBER

# type casting
my_int: int = int(3.14)

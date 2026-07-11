# floor rounding - is the highest whole number lower that the decimal number
# ceiling rounding - is the lowest whole number higher than the dedimal number

# Linear Search Algorithm
# - for linear array (1D array)
# - for sorted and unsorted lists
# - best case - O(1)
# - worst case - O(n)

# How to declare a simple program
'''
# Start with numbers or any list 
arr = [3, 100, 50, 60, 90, 10]
# Assign a search key as a target value to find
key = int(input())

# declare a user-defined function
def linear_search(arr, key):
    # Create a Loop to go through the entire list
    for i in range(len(arr)):
        # Compares if the value is the same as the key
        if key == arr[i]:
            # If True, runs a statement
            return True
    # fallback statement if the key is not present in the list
    return False

# Running the function (Runs if the return statement is True)
if linear_search(arr, key):
    print('True')
# Fallback if the return statement is not True
else:
    print('False')
'''

# Binary Search Algorithms
# - for sorted lists

# How to declare a simple program
'''
# start with declaring an ordered list or array
arr = [2, 4, 7, 8, 15, 21, 23, 30, 40]
# Assign a search key as a target value to find
key = int(input())

# declare a user-defined function
def binary_search(arr, key):
    # default values for the loweer and upper limits
    LL = 0
    UL = len(arr) - 1
    # loops if lower limit is less than or equal to the upper limits
    while LL <= UL:
        # calculates the midpoint
        mid = LL + (UL - LL) // 2
        # Runs if the value at the midpoint is the same as the key
        if key == arr[mid]:
            return True
        # if the key is greater than the value at the midpoint, midpoint + 1 will
        # be the new lower limit
        elif key > arr[mid]:
            LL = mid + 1
        # if the key is not greater that the value at the midpoint, the value must
        # either be lower than the midpoint or not part of the list at all
        else:
            UL = mid - 1
    return False

test = binary_search(arr, key)
print(str(test))
'''
























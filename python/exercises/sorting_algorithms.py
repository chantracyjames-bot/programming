#################################
# # Insertion and Bubble Sort # #
#################################

###############
# Bubble Sort #
###############

# O(n^2)
# is a sorting algorithm that sorts by comparing two elements at a time, swwapping them based on their value
# very inefficient compared to insertion sort due to it sorting and comparing numbers one at a time

# Example:
# -1, 4, 5, 3, 8, 2 (starts at the leftmost element "-1", then compare it to the next element which is "4")
# -1, 4, 5, 3, 8, 2 (remains the same due to -1 being smaller than 4, next step is to move to element that was compared previously, "4")
# -1, 4, 5, 3, 8, 2 (also remains the same due to 4 being smaller than 5, move on to the next element)
# -1, 4, 5, 3, 8, 2 (5 and 3 swaps places due to 5 being larger than 3, move to the next element)
# -1, 4, 3, 5, 8, 2 (5 and 8 remains the same due to 5 being smaller than 5, move on to the next number)
# -1, 4, 3, 5, 8, 2 (8 and 2 swaps places due to 8 being larger than 2)

# after finishing the last element, verify that the elements are the correct place going back to the being, repeating the process until the set is complete)

# -1, 4, 3, 5, 8, 2
# -1, 3, 4, 5, 8, 2 
# -1, 3, 4, 5, 8, 2 
# -1, 3, 4, 5, 8, 2 
# -1, 3, 4, 5, 8, 2 
# -1, 3, 4, 5, 2, 8
# -1, 3, 4, 2, 5, 8 
# -1, 3, 2, 4, 5, 8 

# Code
'''
def bubble_sort(arr):
    for i in range(len(arr)):
        for j in range(0, len(arr) - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

    return arr

numbers = [5, 3, 1, 4]
print(bubble_sort(numbers))
'''

###############################

##################
# Insertion Sort #
##################

# O(n^2)
# is a sorting algorithm that sorts on element at a time, inserting them based on their value 
# can insert to previously sorted elements, wherein the place before n>3 (n is the number being inserted)
# more superior than bubble sort since it requires less time by inserting numbers rather than swapping per cycle

# Example:
# -1, 4, 5, 3, 8, 2 (start from the leftmost side, compare the leftmost number to the left)
# -1, 4, 5, 3, 8, 2 (-1 and 4 stays at the same spot due to -1 being smaller than 4, move to the next element 4)
# -1, 4, 5, 3, 8, 2 (4 and 5 stays at the same spot due to 4 being smaller than 5, move to the next element 5)
# -1, 4, 5, 3, 8, 2 (5 and 3. 5 is larger than 3, insert 3 before >3 which is 4, move to the next element 5)
# -1, 3, 4, 5, 8, 2 (5 and 8 stays at the same spot due to 5 being smaller than 8, move to the next element 8)
# -1, 3, 4, 5, 8, 2 (8 and 2. 8 is larger than 2, insert 2 before >2 which is 3)

# Code:

"""
def insertion_sort(arr):
    for i in range(len(arr)):
        key = arr[i]
        j = i - 1

        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -=1

        arr[j + 1] = key

    return arr

numbers = [5, 3, 1, 4]
print(insertion_sort(numbers))
"""
def sum_of_two(a: int, b: int) -> int:
    return a + b

def array_sum(arr: []) -> int:
    sum: int = 0
    for i in arr:
        sum += i
    return sum

def compare_triplets(a: [], b: []) -> []:
    result: [] = [0, 0]
    for i in range(len(a)):
        if a[i] > b[i]:
            result[0] += 1
        elif a[i] < b[i]:
            result[1] += 1
    return result

def a_very_big_sum(arr: []) -> int:
    sum: int = 0
    for i in arr:
        sum += i
    return sum

def diagonal_difference(arr: [[]]) -> int:
    left: int = 0
    right: int = 0
    for i in range(len(arr)):
        left += arr[i][i]
    counter: int = len(arr) - 1
    for j in range(len(arr)):
        right += arr[j][counter]
        counter -= 1
    return abs(left - right)

def plus_minus(arr: []) -> None:
    num: [] = [0] * 3
    for i in arr:
        if i > 0:
            num[0] += 1
        elif i < 0:
            num[1] += 1
        else:
            num[2] += 1
    print(f'{num[0]/len(arr):.6f}')
    print(f'{num[1]/len(arr):.6f}')
    print(f'{num[2]/len(arr):.6f}')

def stair_case(n: int) -> None:
    for i in range(n):
        for j in range(n - i + 1):
            print(' ', end='')
        for k in range(i + 1):
            print('#', end='')
        print() 

def min_max_sum(arr: []) -> None:
    sum: int = 0
    for i in arr:
        sum += i
    min: int = sum - arr[-1]
    max: int = arr[0]
    for i in arr:
        temp: int = sum - 1
        if min > temp:
            min = temp
        elif max < temp:
            max = temp
    print(f'{min} {max}')
    
def birthday_cake_candles(candles: []) -> int:
    tallest: int = 0 
    num: int = 0
    for i in candles:
        if i > tallest:
            tallest = i
    for j in candles:
        if j == tallest:
            num += 1
    return num
    
def time_conversion(s: str) -> str:
    meridian: str = 'AM' if s.endswith('AM') else 'PM'
    temp: [] = s.split(meridian)
    times: [] = temp[0].split(":")
    time: [] = []
    try:
        for i in times:
            if type(int(i)) is int:
                time.append(i)
    except ValueError as e:
        pass
    print(meridian)
    if meridian == 'AM' and time[0] == '12':
        time[0] = 0
    if meridian == 'PM' and time[0] != '12':
        time[0] += 12
    return f'{time[0]:02}:{time[1]:02}:{time[2]:02}' 
    
def two_pointer(arr: [], num: int) -> None:
    right: int = len(arr) - 1
    left: int = 0
    
    while left < right:
        sum: int = arr[left] + arr[right]
        if num < sum:
            right -= 1
        elif num > sum:
            left += 1
        else:
            print(f'Indexes {left} and {right} ({arr[left] + arr[right]}) add up to {num}')
            return
    print("No match found")

if __name__ == '__main__':
    result = None
    print(f'{result}')
    two_pointer([10, 1, 3, 12, 2, 7], 12)
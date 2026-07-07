inFirst = int(input('Enter First Number Here: '))
inSecond = int(input('Enter Second Number Here: '))

for i in range(inFirst):
    for j in range(inSecond):
        print(f'{i + 1} x {j + 1} = {(i + 1) * (j + 1)}')
    print()
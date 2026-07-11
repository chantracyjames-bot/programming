master, sum = int(input('Enter # of Elements to Add Together: ')), 0
for i in range(master):
    sum = sum + int(input(f'(Iteration {i}) Enter Number Here: '))
print(f'The sum is {sum}')
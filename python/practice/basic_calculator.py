dec = True
num1 = float(input('Enter Number: '))
while dec is True:
    print('Enter Operation (+, -, x, /) or "q" to exit: ')
    opr = input('Input: ')
    if opr != 'q':
        num2 = float(input('Enter Number: '))
        if opr == '+':
            num1 = num1 + num2
        elif opr == '-':
            num1 = num1 - num2
        elif opr == 'x':
            num1 = num1 * num2
        elif opr == '/':
            num1 = num1 / num2
        else:
            print('Error: Invalid Operation!!!')
    if opr == 'q'or opr == 'Q':
        print(f'The result is {num1}')
        dec = False
            
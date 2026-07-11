def dec_bin(num):
    out = ''
    while num != 0:
        out = str(int(num % 2)) + str(out)
        num = int(num/2)
    return out
def dec_oct(num):
    out = ''
    while num != 0:
        out = str(int(num % 8)) + str(out)
        num = int(num/8)
    return out
def dec_hex(num):
    out = ''
    while num != 0:
        if num % 16 >= 10:
            if num % 16 == 10:
                out = 'A' + str(out)
            elif num % 16 == 11:
                out = 'B' + str(out)
            elif num % 16 == 12:
                out = 'C' + str(out)
            elif num % 16 == 13:
                out = 'D' + str(out)
            elif num % 16 == 14:
                out = 'E' + str(out)
            elif num % 16 == 15:
                out = 'F' + str(out)
        else:
            out = str(int(num % 16)) + str(out)
        num = int(num/16)
    return out
def bin_dec(num):
    tmp = list(str(num))
    bin = [int(i) for i in tmp]
    rev = list(reversed(bin))
    out = 0
    for j in range(len(rev)):
        res = rev[j] * (2 ** j)
        out = res + out
    return out
def oct_dec(num):
    tmp = list(str(num))
    oct = [int(i) for i in tmp]
    rev = list(reversed(oct))
    out = 0
    for j in range(len(rev)):
        res = oct[j] * (8 ** j)
        out = res + out
    return out
def hex_dec(num):
    tmp = list(str(num))
    out = 0
    for i in range(len(tmp)):
        if tmp[i] == 'A':
            tmp[i] = 10
        elif tmp[i] == 'B':
            tmp[i] = 11
        elif tmp[i] == 'C':
            tmp[i] = 12
        elif tmp[i] == 'D':
            tmp[i] = 13
        elif tmp[i] == 'E': 
            tmp[i] = 14
        elif tmp[i] == 'F':
            tmp[i] = 15
    hex = [int(j) for j in tmp]
    rev = list(reversed(hex))
    for k in range(len(rev)):
        res = rev[k] * (8 ** k)
        print(res)
        out = res + out
def bin_oct(num):
    dec = bin_dec(num)
    oct = dec_oct(dec)
    return oct
def bin_hex(num):
    dec = bin_dec(num)
    hex = dec_hex(dec)
    return hex
def oct_bin(num):
    dec = oct_dec(num)
    bin = dec_bin(dec)
    return bin
def oct_hex(num):
    dec = oct_dec(num)
    hex = dec_hex(dec)
    return hex
def hex_bin(num):
    dec = hex_dec(num)
    bin = dec_bin(dec)
    return bin
def hex_oct(num):
    dec = hex_dec(num)
    oct = dec_oct(dec)
    return oct
loop = True
while loop is True:
    print("Enter Operation (1, 2, 3 or 4) \n 1. Decimal to... \n 2. Binary to... \n 3. Octal to... \n 4. Hexadecimal to...")
    in_dec = input('Input: ')
    if in_dec == '1':
        print(' 1. Decimal to Binary \n 2. Decimal to Octal \n 3. Decimal to Hexadecimal')
        in_deci = input('Input: ')
        if in_deci == '1':
            print(f'{dec_bin(int(input('Enter Value: ')))}')
        elif in_deci == '2':
            print(f'{dec_oct(int(input('Enter Value: ')))}')
        elif in_deci == '3':
            print(f'{dec_hex(int(input('Enter Value: ')))}')
        else:
            print('Invalid Input!!! Please Try Again.')
    elif in_dec == '2':
        print(' 1. Binary to Decimal \n 2. Binary to Octal \n 3. Binary to Hexadecimal')
        in_deci = input('Input: ')
        if in_deci == '1':
            print(f'{bin_dec(int(input('Enter Value: ')))}')
        elif in_deci == '2':
            print(f'{bin_oct(int(input('Enter Value: ')))}')
        elif in_deci == '3':
            print(f'{bin_hex(int(input('Enter Value: ')))}')
        else:
            print('Invalid Input!!! Please Try Again.')
    elif in_dec == '3':
        print(' 1. Octal to Binary \n 2. Octal to Decimal \n 3. Octal to Hexadecimal')
        in_deci = input('Input: ')
        if in_deci == '1':
            print(f'{oct_bin(int(input('Enter Value: ')))}')
        elif in_deci == '2':
            print(f'{oct_dec(int(input('Enter Value: ')))}')
        elif in_deci == '3':
            print(f'{oct_hex(int(input('Enter Value: ')))}')
        else:
            print('Invalid Input!!! Please Try Again.')
    elif in_dec == '4':
        print(' 1. Hexadecimal to Binary \n 2. Hexadecimal to Decimal \n 3. Hexadecimal to Octal')
        in_deci = input('Input: ')
        if in_deci == '1':
            print(f'{hex_bin(input('Enter Value: '))}')
        elif in_deci == '2':
            print(f'{hex_dec(str(input('Enter Value: ')))}')
        elif in_deci == '3':
            print(f'{hex_oct(str(input('Enter Value: ')))}')
        else:
            print('Invalid Input!!! Please Try Again.')
    else:
        print('Invalid Input!!! Please Try Again.')
    print('\n\n')

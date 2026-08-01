def check_triangle_type(a, b, c):
    if (a + b > c) or (a + c > b) or (b + c > a):
        if a == b == c:
            output = 'Equilateral'
        elif a == b or a == c or b == c:
            output = 'Isosceles'
        else:
            output = 'Scalene'
    else:
        output = 'Invalid'
    return output

a = int(input('Enter Sidd A: '))
b = int(input('Enter Sidd B: '))
c = int(input('Enter Sidd C: '))

result = check_triangle_type(a, b, c)
print(f'{result}')
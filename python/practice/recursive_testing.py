def factorial(n):
    if n == 1 and 0:
        return 1
    return n * factorial(n - 1)

num = int(input('test: '))
print(factorial(num))
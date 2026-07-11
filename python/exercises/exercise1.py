def calculate_grade(grade):
    if grade >= 90 and grade <= 100:
        output = 'A'
    elif grade <= 89 and grade >= 80:
        output = 'B'
    elif grade <= 79 and grade >= 70:
        output = 'C'
    elif grade <= 69 and grade >= 60:
        output = 'D'
    elif grade < 60 and grade >= 0:
        output = 'F'
    else:
        output = 'Invalid Input!!'
    
    return output  
        
input = int(input('Enter Grade Here: '))
print(f'Your grade of "{input}" is evaluated as {calculate_grade(input)}')
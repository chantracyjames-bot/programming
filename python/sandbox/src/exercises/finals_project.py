try:
    print("Importing needed modules. Please wait...")
    from abc import ABC, abstractmethod
    import os
    import time
except ImportError as err:
    print(f'Error: {err} \nImport Failed. Please check python environment for any errors.')
    exit('Exitting...')

class InvalidProductIDError(ABC, Exception):
    @abstractmethod
    def __init__(self, message):
        pass
    def print_error(self):
        pass

class ProductIDNotFoundError(InvalidProductIDError):
    def __init__(self, message):
        super().__init__(message)
        self.__message = message
    def print_error(self):
        return self.__message
    
class ProductIDAlreadyExistsError(InvalidProductIDError):
    def __init__(self, message):
        super().__init__(message)
        self.__message = message
    def print_error(self):
        return self.__message

class InputMismatchError(Exception):
    def __init__(self, message):
        super().__init__(message)
        self.__message = message
    def print_error(self):
        return self.__message                

def main_program():
    try:
        with open('inventory_database.txt', 'r') as inv: 
            inv.read()
        
        main_screen()
        
        user_input = int(input('Enter your choice (1-6): '))
        user_choice(user_input)
        
    except FileNotFoundError as err:
        print(f'Error: {err} \nFile does not exist! Trying to create file...')
        open('inventory_database.txt', 'w')
        for i in reversed(range(1, 4)):
            print(f'{i}...', end = ' ', flush = True)
            momentary_pause(0)
        print('\nFile `inventory_database.txt` has been created.\n')
        momentary_pause(1)
        
    except PermissionError as err:
        print(f'Error: {err} \nUnable to access file! Permission Denied.')
        momentary_pause(1)
        print('Please check OS permissions!', end = ' ')
        program_exit()
        
    except ValueError as err:
        print(f'\nError: {err} \nInvalid input detected!\n')
        momentary_pause(1)
        print('Please try again.')
        
    except InputMismatchError as err:
        print(f'\nError: InputMismatchError \n{err.print_error()}')
        momentary_pause(1)
        
    except ProductIDAlreadyExistsError as err:
        print(f'\nError: ProductIDAlreadyExistsError \n{err.print_error()} ')
        momentary_pause(1)
        
    except ProductIDNotFoundError as err:
        print(f'\nError: ProductIDDoesNotExist \n{err.print_error()}')
        momentary_pause(1)
        
def main_screen():
    print('Inventory Management System')
    print('1. Add Product')
    print('2. Update Stock')
    print('3. Remove Product')
    print('4. Display Product')
    print('5. Display All Products')
    print('6. Exit')
    
def user_choice(user_input):
    choices = {0: placeholder,
               1: add_product,
               2: update_product,
               3: remove_product,
               4: display_product,
               5: display_all,
               6: program_exit}
    choice = choices.get(user_input)
    if user_input not in choices: 
        raise InputMismatchError(f'User input `{user_input}` is not a valid choice! Please try again.')
    choice()
    
def momentary_pause(option):
    if option == 1: input('\nPress the Enter key to continue.')
    else: time.sleep(1)

def placeholder():
    print('\nThis is a placeholder option.')
    momentary_pause(1)
    
def add_product():
    search_item = input('\nEnter Product ID: ')
    with open('inventory_database.txt', 'r') as inv:
        content = inv.readlines()
    for line in content:
        part = line.strip().split(',')
        if search_item in part[0]:
            raise ProductIDAlreadyExistsError(f'Product ID `{search_item}` is already taken! Please choose another Product ID.')
    new_entry = []
    new_entry.append(f'\n{search_item}')
    new_entry.append(f"{input('Enter Product Name: ')}")
    new_entry.append(f"${float(input('Enter Product Price: '))}")
    new_entry.append(f"{int(input('Enter Product Stock: '))}")
    with open('inventory_database.txt', 'a') as inv:
        content = inv.write(','.join(new_entry) + '\n')
    print(f'\nProduct `{search_item}` has been added.')
    momentary_pause(1)

def update_product():
    search_item = str(input('\nEnter Product ID: '))
    with open('inventory_database.txt', 'r') as inv:
        content = inv.readlines()
    key = False
    for num, line in enumerate(content):
        part = line.strip().split(',')
        if search_item == part[0]:
            temp_input = float(input('Enter New Price: '))
            part[2] = str(f'${temp_input}')
            temp_input = int(input('Enter New Stock: '))
            part[3] = str(temp_input)
            content[num] = ','.join(part) + '\n'
            key = True
            break
    if key:
        with open('inventory_database.txt', 'w') as inv:
            content = inv.writelines(content)
        print(f'\nProduct `{search_item}` has been updated.')
        momentary_pause(1)
    else: raise ProductIDNotFoundError(f'Product ID `{search_item}` does not exist! Add product using option `Add Product`.')

def remove_product():
    search_item = str(input('\nEnter Product ID: '))
    with open('inventory_database.txt', 'r') as inv:
        content = inv.readlines()
    for num, line in enumerate(content):
        part = line.strip().split(',')
        key = False
        if search_item == part[0]:
            content[num] = ''
            key = True
            break
    if key:
        with open('inventory_database.txt', 'w') as inv:
            content = inv.writelines(content)
        print(f'\nProduct `{search_item}` has been removed.')
        momentary_pause(1)
    else: raise ProductIDNotFoundError(f'Product ID `{search_item}` does not exist! Add product using option `Add Product`.')

def display_product():
    search_item = str(input('\nEnter Product ID: '))
    with open('inventory_database.txt', 'r') as inv:
        content = inv.readlines()
    for num, line in enumerate(content, 1):
        part = line.strip().split(',')
        key = False
        if search_item == part[0]:
            key = True
            break
    if key:
        print(f'\n- ID: {part[0]} | Name: {part[1]} | Price: {part[2]} | Stock: {part[3]}')
        momentary_pause(1)
    else: raise ProductIDNotFoundError(f'Product ID `{search_item}` does not exist! Add product using option `Add Product`.')
    
def display_all():
    with open('inventory_database.txt', 'r') as inv:
        content = inv.readlines()
    print('')
    key = False
    for line in content:
        part = line.strip().split(',')
        if len(part) >= 4:
            print(f'- ID: {part[0]} | Name: {part[1]} | Price: {part[2]} | Stock: {part[3]}')
            key = True
    if key is False:
        print('No valid entries found in the database! Please add using option `Add Product`.')
    momentary_pause(1)
        
def program_exit():
    exit('Exitting...\n')

if __name__ == '__main__':
    os.system('cls' if os.name == 'nt' else 'clear')
    while True: 
        main_program()
        print("=============================")
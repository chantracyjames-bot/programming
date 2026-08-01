def linearSearch(array, key):
    found = False
    for i in array:
        if key == i:
            found = True
    return found

fruits = ['apple', 'grape', 'orange', 'banana', 'mango']

search_key = input('Enter a Fruit: ')

if linearSearch(fruits, search_key):
    print(f'{search_key} is in the list') 
else:
    print(f'{search_key} is not in the list')
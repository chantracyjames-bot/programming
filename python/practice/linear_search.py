def sort(target, test):
    for i in range(len(test)):
        if target == test[i]:
            return f'the item is at index {i}'
    return 'the item is not on the list'
num = 0
text = [1,2,3,4,5,6,7,8,9,0,'q','w','e','r','t','y']
print(sort(num, text))

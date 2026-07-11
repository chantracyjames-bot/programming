database = []
text = [
    [ 'First Name:  ', 'Middle name: ', 'Last Name:   ' ], 
    [ 'Barangay: ', 'Municipality/City: ', 'Province: ' ],
    [ 'Mailing Address: ', 'Contact Number: ', 'E-mail Address: ' ],
    [ 'Elementary School: ', 'Scondary School: ', 'Tertiary School: ' ]
]
for a in range(int(input('Enter Number of Personal Information to Fill Up: '))):
    info, name, addr, cnum, educ = [], [], [], [], []
    print(f'\nPersonal Profile #{a+1}\n \nEnter Full Legal Name')
    for b in range(0, 3):   name.append(input(f'{text[0][b]}'))
    info.append(name), print()
    for c in range(0, 3):
        addr.append(input(f'{text[1][c]}'))
    info.append(addr), print()
    for d in range(0, 3):
        cnum.append(input(f'{text[2][d]}'))
    info.append(cnum), print()
    for e in range(0, 3):
        educ.append(input(f'{text[3][e]}'))
    info.append(educ), database.append(info), print(f'\033c \n{'T-T ' * 15}')

for x in range(len(database)):
    print(f'\nPersoanl Profile #{x+1} \n\nFull Name:', end = '')
    for p in range(0, 3):
        print(f'{database[x][0][p]}', end = ' ')
    print('\n\nPermanent Address')
    for q in range(0, 3):
        print(f'{text[1][q]}{database[x][1][q]}')
    print('\nContact Details')
    for r in range(0, 3):
        print(f'{text[2][r]}{database[x][2][r]}')
    print('\nEducational Attainment')
    for s in range(0, 3):
        print(f'{text[3][s]}{database[x][3][s]}')
    print(f'\n{'T-T ' * 15}')
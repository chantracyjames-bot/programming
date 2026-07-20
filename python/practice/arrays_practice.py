array3d = [
        [
            [10, 20, 30],
            [40, 50, 60]
        ],

        [
            [50, 60, 70],
            [10, 30, 45]
        ]
]


for i in range(len(array3d)):
    for j in range(len(array3d[i])):
        print()
        for k in range(len(array3d[i][j])):
            #print(f'{(i, j, k)} -> {array3d[i][j][k]}')
            print(array3d[i][j][k], end = ' ')
    print()

print()


for l in range(len(array3d)):
    sum = 0
    for m in range(len(array3d[l])):
        for n in range(len(array3d[l][m])):
            sum = sum + array3d[l][m][n]
    print(f'Page Index #{l} has a sum of {sum}')
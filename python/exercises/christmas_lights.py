num = int(input('Enter number here: '))
colors = [ "\033[91m", "\033[92m", "\033[93m", "\033[94m", "\033[0m"]
text = colors[2]
for h in range(num):
    i = float((num - h*0.5) - (num/2))
    for j in range(int(i)):
        print(' ', end = '')
    for k in range(h):
        for l in range(k):
            if l % 6 == 1:
                text = colors[0]
            elif l % 6 == 3:
                text = colors[3]
            elif l % 6 == 5:
                text = colors[2]
            else:
                text = colors[1]
        print(f'{text}*', end = '')
        text = colors[1]
    print(colors[4])

m = (num / 7.5) + 1
for n in range(int(m)):
    o = ((num - (num / 10) + (num / 20)) - (num/2))
    for p in range(int(o)):
        print(' ', end = '')
    q = (num / 10) + 1
    for r in range(int(q)):
        print('|', end = '')
    print()
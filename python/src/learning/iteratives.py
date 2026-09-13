# loop variable for iteration
loop_var: int = 1

# while loop
while loop_var < 100:
    print("-" * loop_var, end="")
    loop_var += 1
    print()

# for loop
for i in range(loop_var):
    print("+" * i, end="")
    print()

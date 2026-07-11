######################
# # Clear Terminal # #
######################

# Keyboard Shortcut
# Press Ctrl + L while in a active terminal
  
# User-Defined Version (good for in-script terminal clearing)
'''
# For Checking the Operating System and Clearing the Terminal
import os
# Creating a User-Defined Function to Execute Commnads
def clear():
    # Checking the Operating System for execute the correct syntax / command
    if os.name == 'nt':         # nt refers to the Windows OS
        _ = os.system('cls')
    elif os.name == 'posix':    # posix refers to POSIX-based kernels (e.g. Linux and MacOS(BSD-based))
        _ = os.system('clear')
    else:                       # refers to other types of Operating Systems (non-NT and non-POSIX)
        _ = print(f'Unknown Operating System Detected')
clear()
'''

# Short Version (without function call)
'''
import os
os.system('cls' if os.name == 'nt' else 'clear')
'''

# ANSI Escape Code
'''
print("\033c", end = '')
'''
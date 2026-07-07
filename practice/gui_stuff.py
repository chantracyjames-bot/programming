import tkinter as tk

def click(char):
    cute = dply.get()
    if char == "=":
        try:
            result = eval(dply.get())
            dply.delete(0, tk.END)
            dply.insert(tk.END, str(result))
        except:
            dply.delete(0, tk.END)
            dply.insert(tk.END, "Error")
    elif char == "C":
        dply.delete(0, tk.END)
    else:
        dply.insert(tk.END, char)
            
main = tk.Tk()
main.title('Calculator')

dply = tk.Entry(main, font=("Arial", 18), bd = 20, justify="right")
dply.grid(row = 0, column = 0, columnspan = 4, pady = 15)

btn1 = tk.Button(main, text="1", width=5, height=5, command=lambda: click("1"))
btn1.grid(row=1, column=0)

btn2 = tk.Button(main, text="2", width=5, height=5, command=lambda: click("2"))
btn2.grid(row=1, column=1)

btn3 = tk.Button(main, text="3", width=5, height=5, command=lambda: click("3"))
btn3.grid(row=1, column=2)

btn4 = tk.Button(main, text="4", width=5, height=5, command=lambda: click("4"))
btn4.grid(row=2, column=0)

btn5 = tk.Button(main, text="5", width=5, height=5, command=lambda: click("5"))
btn5.grid(row=2, column=1)

btn6 = tk.Button(main, text="6", width=5, height=5, command=lambda: click("6"))
btn6.grid(row=2, column=2)

btn7 = tk.Button(main, text="7", width=5, height=5, command=lambda: click("7"))
btn7.grid(row=3, column=0)

btn8 = tk.Button(main, text="8", width=5, height=5, command=lambda: click("8"))
btn8.grid(row=3, column=1)

btn9 = tk.Button(main, text="9", width=5, height=5, command=lambda: click("9"))
btn9.grid(row=3, column=2)

btn0 = tk.Button(main, text="0", width=5, height=5, command=lambda: click("0"))
btn0.grid(row=4, column=0)

spe1 = tk.Button(main, text="*", width=5, height=5, command=lambda: click("*"))
spe1.grid(row=4, column=1)

spe2 = tk.Button(main, text="/", width=5, height=5, command=lambda: click("/"))
spe2.grid(row=4, column=2)

spe3 = tk.Button(main, text="+", width=5, height=5, command=lambda: click("+"))
spe3.grid(row=5, column=0)

spe4 = tk.Button(main, text="-", width=5, height=5, command=lambda: click("-"))
spe4.grid(row=5, column=2)

spe5 = tk.Button(main, text="C", width=5, height=5, command=lambda: click("C"))
spe5.grid(row=5, column=2)

spe6 = tk.Button(main, text="=", width=5, height=5, command=lambda: click("="))
spe6.grid(row=1, column=3)

main.mainloop()
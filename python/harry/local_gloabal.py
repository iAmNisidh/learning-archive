x= 7
print(x)
y= 444
z= 99
def nisidh():
    x=77
    global z
    z= 3
    y=6
    print(x)
    print(y)
    print(f"local varible {x}")
    print("hello my name is nisidh")
print(f"global                   variable{x}")
nisidh()
print("global variable is {x}")
print(y)
print(f"hlobal of z is {z}")
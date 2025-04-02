num=int(input("type the number:"))
if(num<0):
    print("no.is negetive")

elif(num>0):
    if(num<=10):
        print("no. is in between 0 to 10")
    elif(num>10 and num<=20):
        print("no is in between 10 to 20")
    else:
        print("no. is greater than 20")
else:
    print("print no is 0")         
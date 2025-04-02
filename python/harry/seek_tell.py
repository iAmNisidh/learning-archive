with open('nisidh.txt','r')as f:
    print(type(f))
    f.seek(10) #move to 10 th byte in the file 
    data = f.read(57)#reeds the next 5 
    print(data)
    print(f.tell())
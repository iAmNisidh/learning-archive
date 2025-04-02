x=int(input("tell the no.:"))

match(x):
    case 0:
        print("x is zero")
    case 10:
        print("x is 10")    
    case _ if (x > 10):
        print("x is greater than 10") 
    case _ if (x!=200):
        print("angru bangru")
    case _ if(x!=100 ):
        print("divisible by 2")      
    case _:
        print (x)


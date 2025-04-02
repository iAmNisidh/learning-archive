class employee:
    def __init__(self):
        self.__name= "nisidh"



a= employee()
#print(a.__name) #CAN NOT BE ACCED DIRECTLY 
print(a._employee__name) # this can be accesed in derectly ((this is namemangling))
# print(a.__dir__()) 

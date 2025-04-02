class employee:
    def __init__(self,name):
        self.name = name 
    def show(self):
        print(f"{self.name} is the name of employee :")
class dancer:
    def __init__(self,dn):
        self.dance_name = dn
    def show(self):
        print(f" {self.dance_name} is very tough ")
    

class danceremployee(dancer,employee):
    def __init__(self,dn,name):
        self.dance_name = dn
        self.name = name

obj = danceremployee("kathak","nisidh")
print(obj.name)
print(obj.dance_name)
obj.show()
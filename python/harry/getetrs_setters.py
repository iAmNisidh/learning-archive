class myClass():
    def __init__(self,value):
        self._value= value
    def show(self):
        print(f" value is:-{self._value}")

    @property
    def ten_value(self):
        return 10*self._value    

    @ten_value.setter
    def ten_value(self,new_value):
        self._value = new_value/10
 

obj= myClass(9)


print(obj.ten_value)
obj.ten_value= 76
obj.show()
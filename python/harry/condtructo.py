class person():
    def __init__(self,n,o):
        print("hello")
        self.name=n
        self.occ= o

    def info(self):
        print(f"{self.name} is a {self.occ}")
a=person("harry","Developer")
b=person("prem","HR")
c=person(1,"h",2)
a.info()
b.info()
c.info()
#c me TypeError: person.__init__() takes 3 positional arguments but 4 were given ye is liye aa ra hai kiu ki c ka value automaatically use add ho ja ra hai or 3 value put ho gaya hai 
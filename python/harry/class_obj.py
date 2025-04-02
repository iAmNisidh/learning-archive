class person:
    name = "nisidh"
    age = 20
    sex = "male"
    college = "Bennet"
    def info(self):
        print(f"{self.name} is in {self.college}")


a=  person()
b= person()
c= person()
b.name= "radhika"
b.sex = "female"
print(b.name,b.sex)
a.name= "vishal"
a.age = 112
print(a.age)

print(a.name,a.sex)

a.info()
#self ka matlab jispe wo obj calll hoa ra haib 
b.info()
c.info()
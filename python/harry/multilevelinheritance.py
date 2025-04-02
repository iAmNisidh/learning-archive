class animal():
    def __init__ (self,name, species):
        self.name = name
        self.species = species
    def showDetails(self):
        print(f"Name:-{self.name} ")
        print(f"species:-{self.species}")
class dog(animal):
    def __init__(self,name,breed,):
        animal.__init__(self,name,species="dog")
        self.breed=breed
    def showDetails(self):
        animal.showDetails(self)
        print(f"breed = {self.breed}")

class gs(dog):
    def __init__(self,name,color):
        dog.__init__(self,name,breed = "gs")
        self.color = color

    def showDetails(self):
        dog.showDetails(self)
        print(f"clour:-{self.color}")
# d= gs("vishal","white")
# d.showDetails()  
x= dog("vishal","gs") 
x.showDetails()              

    
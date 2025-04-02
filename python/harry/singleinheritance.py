class animal :
    def __init__(self,name,species):
        self.name= name
        self.species = species

    def make_sound( self):
        print(f"sound made by the {self.name} is  and itsn{self.species}is" )


class dog(animal):
    def __init__(self,name,breed):
        animal.__init__(self,name,species="dog")
        self.breed = breed 


    def make_sound(self):
        print("bark")


d= dog("doyy","dogggyyy")
d.make_sound()

a= animal("hello","gh")
a.make_sound()

# class cat:
#     def __init__(self,name,owne_name):
#         self.name = name
#         self.owne_name= owne_name
# class dog(cat):
#     print("it is a dog") 

# obj = dog("vbfgb","hfgfg")
# obj1 = cat("ghfgh","hgdhfg")
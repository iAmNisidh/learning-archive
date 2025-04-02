class employee:
    def __init__(self,name,id):
        self.name = name 
        self.id = id


    def showDetails(self):
        print(f"name of the employ is {self.name} and his id is {self.id}")


class Nisidh(employee):
    def nk(self):
        print("hello sexy lady")

e= employee("Rohan das",1230987)
e.showDetails()
e.nk()   #yaha pe 1 galti jan buch ke kiya h 

x= Nisidh("Nisidh",489264)
x.showDetails() 
x.nk()

#employ ke  sare methods nisidh ke pass hai or nnisidh me 1 nk or jada hai 

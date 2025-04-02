class vector:

    def __init__(self,i,j,k):

        self.i = i 

        self.j = j

        self.k = k


    def __str__(self):

        return (f"{self.i}i+{self.j}j+{self.k}k")

v=vector(1,2,7)

print (v)
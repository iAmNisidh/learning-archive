class shape:
    def __init__(self,x,y):
        self.x= x
        self.y = y
    def area(self):
        return self.x*self.y


# rect = shape(3,4)
# print(rect.area())
class circle(shape):
    def __init__(self,radious):
        self.radious= radious
    def area(self):
        return 3.14*self.radious*self.radious   


c=circle(4)
print(c.area())
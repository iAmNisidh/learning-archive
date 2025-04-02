class Math:
    def __init__(self,num):
        self.num=num
    def addtonum(self,n):
        self.num= self.num+n


    @staticmethod
    def add(a,b):
        return (a+b)

# result = Math.add( 1,3 )
# print(result)
a=Math(7)
print(a.num)
a.addtonum(7)
print(a.num)

print(a.add(7,1))

#static meathod is like normal fn but it is present inside class ass we have to give the code to other mean
#  if someone import this class it can be used there static  meathod me self ka use karne ka jarurat ni hai 
#BAD ME USKO A.ADD YA CLASS KE NAMM SE BHI USE KAR SAKTE MATH.ADD KARKE  A INSTANCE HAI 

# self dena hota hai kiu ki self se ham obj ko reference karte hai jispe ye meathod chalayA GAYA HAI
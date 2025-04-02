
def greet(fx):
    def mfx(*args,**kwargs):
        print("good morning")
        fx(*args,**kwargs)
        print("thanks for using this fn")
    return mfx

# @greet
# def nisidh():
#     print("hello nisidh")

# nisidh()


def add(a,b):
    print(a+b)
a= int(input())
b= int(input())
greet (add)(a,b) 
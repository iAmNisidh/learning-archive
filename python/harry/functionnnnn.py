# def leap(a):
#     leapyear=a%4==0 or a%100!=0
#     print("is a leap  year")

# b=int(input()) 
# leap(b)   


# def gmean(a,b):
#     mean=(a*b)/(a+b)
#     print(mean)
# def greatest(a,b):
#     if (a>b):
#         print("a is grater")
#     else:
#         print("b is smaller")
# def smaller(a,b):
#     pass

# a=int(input())
# b=int(input())
# gmean(a,b)
# greatest(a,b)
# c=int(input())
# d=int(input())
# gmean(c,d)
# greatest(a,b)

def leap_year(year):
    if year%4==0 and year%100 != 0:
        print("It's a leap year")
    else:
        print("Not a leap year")
user_year = int(input("Enter the Year"))
leap_year(user_year)
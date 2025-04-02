def f(n):
    if (n==0 or n==1):
            return 1
    else:
          return n*f(n-1)
print(f(5))

# 5*factorial(4)
# 5*4*factorial(3)
# 5*4*3*factorial(2)
# 5*4*3*2*factorial(1)   value of factorial 1 = 1 
# 5*4*3*2*1
#In Python, we know that a function can call other functions.
#  It is even possible for the function to call itself. 
# These types of construct are termed as recursive functions.




#calculation of fibonachi series:
#f(0)=0
#f(1)=1

# def fibonachi (a,a-1):
#       fibonachi(a+b)
      
      
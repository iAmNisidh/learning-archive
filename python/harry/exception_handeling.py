# a = int(input("enter the number:"))

# print (f"multipilcation table of {a} is :")
# def jls_extract_def():
#     try:
#         for i in range (1,11):
#             print(f"{a}X{i}={a*i}")
#     except:
#         print("gdgxdjhgjkdhx")
#         return i





# print ("code ends here")

# print ("written by nisidh ")



# # try:k

# #     num = int(input())

# #     a=[6,3]

# #     print(a[num])

# # except ValueError:

# #     print("nummber interd is not a integer")    


# # except IndexError:
# # #     print("index errror")

# # def func1():

# #     try:

# #         l= [1,2,4,5,7,9]

# #         i = int(input("Enter the index:"))

# #         print(i[l])

# #         return 1 
# #     except:

# #         print("some error occoured")

# #         return 0 


# #     finally:

# #         print("its executed")    

# # x= func1()
# # print(x)

# try:
#     numerator = float(input("Enter numerator: "))
#     denominator = float(input("Enter denominator: "))
#     result = numerator / denominator
#     print("Result:", result)
# except ZeroDivisionError:
#     print("Error: Cannot divide by zero.")
# except ValueError:
#     print("Error: Invalid input.")
# finally:
#     print("Division attempt completed.")
# p=10
# q=20
# p*=q//3
# q+=p+q**2
# print(p, q)
import os
dp ='D:\Grand Theft Auto V'

contents = os.listdir(dp)

for i in contents:
    print(i)
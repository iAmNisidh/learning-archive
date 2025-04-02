import time
t= time.strftime('%H:%M:%S')
hour=int(time.strftime('%H'))
min=int(time.strftime('%M'))
sec=int(time.strftime('%S'))
hour=int(input("tell the hour"))
min=int(input("tell the min"))
sec=int(input("tell the sec"))
print(hour,":",min,":",sec)
 
if(hour==6):
    if(min>=0 and min<=20):
        print(" ho gaya phone dekhna ")




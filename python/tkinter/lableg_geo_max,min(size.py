from tkinter import *
from PIL import ImageTk, Image

root = Tk()

# Set window size
root.geometry("600x400")
f1 = Frame(root,bg = "Red",borderwidth= 7)
f1.pack(side=LEFT)


l= Label(f1,text="Nisidh")
l.pack()














# for title
root.title("Nisidh's GUI")
#important lable options 
# text - adds the text
# bd -background
# fg - foreground
# font - sets the font 
# 1.("Comicsansms",20,"bold")
# 2."Courier 20 bold"
# padd x - pdding X
# padd y - padding y 
# relif - bodder styling -SUNKEN ,RAISED GROOVE, RIDGE

title_lable  = Label(text = '''Hello there! The name's Nisidh, 
and I must say, it's an absolute delight to make your acquaintance.
 I hope you're ready for some fun because 
 I'm here to bring a little cheer to your day! ''', bg = "Blue",fg = "White", padx = 55 , pady = 50, font= "Courier 20 bold",borderwidth =77,
 relief= GROOVE  )

 #important pack option
#anchor = nw
#side = toop,bottom ,left,right
# fill
# padx
# pady
title_lable.pack(side=LEFT,fill='y')




#for text 
txt = Label(text="hello i ima nisidh kumar")
txt.pack()

# For jpg image
image = Image.open("D:\\clg\\python\\tkinter\\images tikiniter\\andrea-de-santis-kMl4FSGXQRo-unsplash.jpg")
photo = ImageTk.PhotoImage(image)

# # Create and pack the label with the image
img= Label(image=photo)
img.pack()

# Set min and max window size
# root.minsize(200, 100)
# root.maxsize(500, 400)

root.mainloop()

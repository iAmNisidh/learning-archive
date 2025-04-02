# x =[a,e,i,o,u]



# with open ('nisidh.txt','r') as f:
#     text = f.read()
#     if x in text:
        

# print(2>>2)
# def print_numbers(n):
#     for i in range(1, n + 1):
#         print(i)

# n = int(input("Enter a number: "))
# print_numbers(n)

# for i in range(0,58):
#     print (i)

# i = 10
# while i >0:
#     print(i)
#     i -= 1  # incrementing the value of i
# def gcd(a, b):
#     while b:
#         a, b = b, a % b
#     return a

# num1 = 36
# num2 = 60
# print("GCD of", num1, "and", num2, "is:", gcd(num1, num2))


# import turtle
# x= turtle.Turtle()
# for i in range(4):
#     x.color("red")
#     x.forward(150)
#     x.right(90)
    
# turtle.done()    
# import turtle

# # Set up the turtle
# star = turtle.Turtle()
# star.speed(2)  # Adjust speed as needed

# # Draw a star
# for _ in range(10):
#     star.forward(100)  # Move forward by 100 units
#     star.right(144)    # Turn right by 144 degrees

# # Hide the turtle and display the window
# star.hideturtle()
# turtle.done()
# import tkinter as tk

# # Create the main window
# root = tk.Tk()
# root.title("Simple Tkinter App")
# root.geometry("300x200")

# # Create a label widget
# label = tk.Label(root, text="Hello, Tkinter!")
# label.pack(pady=20)

# # Create a button widget
# button = tk.Button(root, text="Click Me", command=lambda: label.config(text="Button Clicked!"))
# button.pack(pady=10)

# # Start the Tkinter event loop
# root.mainloop()

from flask import Flask

app = Flask(__name__)

@app.route('/')
def home():
    return "<h1>Welcome to My Simple Website</h1><p>This is a Flask web application.</p>"

if __name__ == '__main__':
    app.run(debug=True)


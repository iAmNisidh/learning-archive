import tkinter as tk
from tkinter import messagebox
from PIL import Image, ImageTk
import pyttsx3

def generate_message():
    name = name_entry.get().strip()
    if name:
        message = (
            f"klnndvjknkjdf"
            "hjdfvfjvhb"
        )
        message_label.config(text=message, bg="white")
        speak_message(message)
    else:
        messagebox.showerror("Input Error", "Please enter a name.")

def speak_message(message):
    engine = pyttsx3.init()
    engine.setProperty('rate', 150)  # Speed of speech
    engine.setProperty('volume', 0.9)  # Volume level (0.0 to 1.0)
    engine.say(message)
    engine.runAndWait()

# Create the main application window
app = tk.Tk()
app.title("Birthday Message Generator")
app.geometry("600x400")
app.resizable(False, False)

# Load and set the background image
bg_image_path = ""  # Replace with the path to your image
try:
    bg_image = Image.open(bg_image_path)
    bg_image = bg_image.resize((600, 400))  # Adjust to the window size
    bg_photo = ImageTk.PhotoImage(bg_image)
    bg_label = tk.Label(app, image=bg_photo)
    bg_label.place(x=0, y=0, relwidth=1, relheight=1)
except Exception as e:
    messagebox.showerror("Image Error", f"Unable to load background image: {e}")

# Widgets
title_label = tk.Label(app, text="hvegghr", font=("Arial", 16), fg="green", bg="white")
title_label.pack(pady=10)

name_label = tk.Label(app, text="jhfvfhjbvjkfk", font=("Arial", 12), bg="white")
name_label.pack(pady=5)

name_entry = tk.Entry(app, font=("Arial", 12), width=30)
name_entry.pack(pady=5)

generate_button = tk.Button(app, text="Generate Message", font=("Arial", 12), command=generate_message)
generate_button.pack(pady=10)

message_label = tk.Label(app, text="", font=("Arial", 12), wraplength=500, justify="center", bg="white")
message_label.pack(pady=10)

# Run the application
app.mainloop()

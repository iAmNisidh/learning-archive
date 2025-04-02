import tkinter as tk
import time
import random

def flash_message(message, n, interval, num_tabs):
    def show_message(window, label):
        for _ in range(n):
            label.config(text=message)
            window.update()
            time.sleep(interval)
            label.config(text="")
            window.update()
            time.sleep(interval)
        

    # Create a root window to get screen dimensions
    dummy_root = tk.Tk()
    screen_width = dummy_root.winfo_screenwidth()
    screen_height = dummy_root.winfo_screenheight()
    

    windows = []

    for _ in range(num_tabs):
        root = tk.Tk()
        root.title("Flash Message")

        # Randomize window position
        x_pos = random.randint(0, screen_width - 300)
        y_pos = random.randint(0, screen_height - 100)
        root.geometry(f"300x100+{x_pos}+{y_pos}")

        label = tk.Label(root, text="", font=("Helvetica", 20))
        label.pack(pady=20)

        windows.append((root, label))

    for window, label in windows:
        window.after(0, show_message, window, label)

    tk.mainloop()

# Example usage
flash_message("hhjgg", 15, 0.5, 1)

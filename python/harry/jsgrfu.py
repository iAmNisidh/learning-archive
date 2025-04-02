import webbrowser
import time

url = "https://www.youtube.com/watch?v=dQw4w9WgXcQ"  

def prank():
    while True:
        webbrowser.open(url)
        time.sleep(2)

prank()
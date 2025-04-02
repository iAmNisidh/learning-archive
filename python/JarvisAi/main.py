import win32com.client
import speech_recognition as sr
import os 
import webbrowser
import datetime
import time

speaker = win32com.client.Dispatch("SAPI.SpVoice")
    

def say(text):
    speaker.Speak(text)

def takeCommand():
    print("Recognizing")
    r = sr.Recognizer()  # Correct class name
    with sr.Microphone() as source:  # Instantiate Microphone with parentheses
        #r.pause_threshold = 1
        audio = r.listen(source)
        try:
            query = r.recognize_google(audio, language="en-in")
            print(f"User said: {query}")
            return query
        except Exception as e:
            return"Some error occured.sorry from jarvis"
        

if __name__ == '__main__':
    print("Starting Jarvis...")
    say("Hello, I am Jarvis AI")
    while True:
        print("Listening...")
        query = takeCommand()
        sites = [["youtube","https://www.youtube.com/"],
                 ["wikipedia","https://www.wikipedia.org/"],
                 ["google","https://www.google.com/"],
                 ["chat GPT","https://chatgpt.com/"]] 
        for site in sites:
            if f"open {site[0]}".lower() in query.lower():
                say ("opening {site[0]} sir...")
                webbrowser.open(site[1]) 
        if "open music" in query:
            musicPath = "D:\\clg\\python\\JarvisAi\\music_jarvis\\flute-traditional-v1-251387.mp3"
            os.startfile(f"open{musicPath}")
        if "time" in query:
            hour = datetime.datetime.now().strftime("%H")
            mini = datetime.datetime.now().strftime("%M")
            say(f"sir the time is {hour} bajj ke {mini}minute") 
        if "open wallpaper engion" in query:
            wallpaper="C:\\Users\\nisid\\OneDrive\\Desktop\\Wallpaper Engine.url"
            os.startfile(wallpaper)
        



        #say(query)

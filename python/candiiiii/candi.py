import win32com.client
import speech_recognition as sr
import os
import webbrowser

speaker = win32com.client.Dispatch("SAPI.SpVoice")

def say(text):
    """Speak the given text."""
    speaker.Speak(text)

def takeCommand():
    """Listen to the user's voice command and return it."""
    print("Listening...")
    r = sr.Recognizer()
    with sr.Microphone() as source:
        print("Recognizing...")
        try:
            audio = r.listen(source)
            query = r.recognize_google(audio, language="en-in")
            print(f"User said: {query}")
            return query
        except sr.UnknownValueError:
            say("Sorry, I did not understand that.")
            return ""
        except sr.RequestError:
            say("Microphone not working properly.")
            return ""
        except Exception as e:
            say("An error occurred.")
            print(f"Error: {e}")
            return ""

if __name__ == '__main__':
    print("Starting Jarvis...")
    say("Hello, I am Jarvis AI")
    while True:
        query = takeCommand().lower()

        # Open websites
        sites = [["youtube", "https://www.youtube.com/"],
                 ["wikipedia", "https://www.wikipedia.org/"],
                 ["google", "https://www.google.com/"],
                 ["chat gpt", "https://chat.openai.com/"]]
                 
        
        for site in sites:
            if f"open {site[0]}" in query:
                say(f"Opening {site[0]}, sir...")
                webbrowser.open(site[1])

        # Play music
        if "play music" in query:
            musicPath = r"D:\\python\JarvisAi\\music_jarvis\\embrace-the-stars-cinematic-249994.mp3"
            say("Playing your music.")
            os.startfile(musicPath)

        

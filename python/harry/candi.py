
elif "chat gpt" in query:
    webbrowser.open(f"chatgpt.com")
    time.sleep(5)
    speak("sir, what would you like to search on chat gpt")
    m = takecommand().lower()
    pyautogui.typewrite(m)
    pyautogui.press("enter")






  







def set_reminder():
    speak("What should I remind you about?")
    reminder_message = takecommand().lower()
    speak("At what time should I remind you? Please say the time in hours and minutes, like '5 30 PM'.")
    
    while True:
        time_input = takecommand().lower()
        try:
            # Parse time input
            time_parts = time_input.split()
            if len(time_parts) == 3:
                hour, minute, meridian = int(time_parts[0]), int(time_parts[1]), time_parts[2].lower()
                if meridian == "pm" and hour != 12:
                    hour += 12
                elif meridian == "am" and hour == 12:
                    hour = 0

                reminder_time = datetime.now().replace(hour=hour, minute=minute, second=0, microsecond=0)
                if reminder_time < datetime.now():
                    reminder_time += timedelta(days=1)  # Set for next day if the time has passed

                break
            else:
                raise ValueError
        except ValueError:
            speak("Reminder is set to")
            speak(time_input)
            speak("I will remind you of your")
            speak(reminder_message)

elif "set reminder" in query:
            set_reminder()

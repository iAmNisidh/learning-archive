import random

# Generate a random number between 0 and 100
secret_number = random.randint(0, 100)
attempts = 0

print("Welcome to the Number Guessing Game!")
print("I'm thinking of a number between 0 and 100.")

while True:
    guess = input("Enter your guess (or 'exit' to quit): ")

    if guess.lower() == 'exit':
        print("Thanks for playing!")
        break

    try:
        guess = int(guess)
        attempts += 1

        if guess < 0 or guess > 100:
            print("Please guess a number between 0 and 100.")
        elif guess < secret_number:
            print("Too low! Try again.")
        elif guess > secret_number:
            print("Too high! Try again.")
        else:
            print(f"Congratulations! You've guessed the number {secret_number} in {attempts} attempts.")
            break
    except ValueError:
        print("Please enter a valid number.")
        
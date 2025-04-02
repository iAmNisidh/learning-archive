def leap_year(year):
    if year%4==0 and year%100 != 0:
        print("It's aleap year")
    else:
        print("Not a leap year")

leap_year(2024)
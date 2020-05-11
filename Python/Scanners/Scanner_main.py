#!/usr/bin/python

def main():
    print("Welcome to the Area Calculator")
    name = input("What is your name: ")

    age = input('Welcome ' + name + ' how old are you?')
    print('Your age: ' + age)

    city = input('What city are you from ' + name + '?')

    print('Your city: ' + city)

    print('Enter the number of the shape you want to calulate:')
    print('1: Rectangle')
    print('2: Circle')
    print('3: Triangle')

    choice = input('Your choice: ')
    choice = (int)(choice)

    if choice == 1:
        Rectangle()
    elif choice == 2:
        Circle()
    elif choice == 3:
        Triangle()

def Rectangle():
    print('Please enter the length and width values of the Rectangle')
    rectLength = input('Length: ')
    rectLength = (int)(rectLength)
    rectWidth = input('Width: ')
    rectWidth = (int)(rectWidth)

    rectArea = (int)(rectLength * rectWidth)

    print('The area is: ' + str(rectArea))

    Menu()

def Circle():
    print('Please enter the radius value of the Circle')
    radius = input('Radius: ')
    radius = (int)(radius)

    pi  = 3.14
    cirArea = pi * (radius*radius)

    print('The area is: ' + str(cirArea))

    Menu()

def Triangle():
    print('Please enter the base and height values of the Triangle')
    base = input('Base: ')
    base = (int)(base)

    triHeight = input('Height: ')
    triHeight = (int)(triHeight)

    half = 0.5
    triArea = half * (base * triHeight)

    print('The area is: ' + str(triArea))

    Menu()

def Menu():
    print('Enter the number of the shape you want to calulate:')
    print('1: Rectangle')
    print('2: Circle')
    print('3: Triangle')

    choice = input('Your choice: ')

    if choice == 1:
        Rectangle()
    elif choice == 2:
        Circle()
    elif choice == 3:
        Triangle()


if __name__ == "__main__":
    main()

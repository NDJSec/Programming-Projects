import Python.Casting.Casting_doubles as ds
import Python.Casting.Casting_movie as mv

def main():
    ds = ds.Casting_doubles()
    mv = mv.Casting_movie()

    option = 0

    while option != 3:
        print("Welcome to Casting")
        print("What would you like to see")
        print("1: Print Doubles")
        print("2: Print Rounded Doubles")
        print("3: Enter Movie Rating")

        option = input('You choice: ')

        switcher =
        {
            1: ds.pNormalVals(),
            2: pRoundVals(),
            3: mv.rating(),
            4: exit()

        }

if __name__ == "__main__":
    main()
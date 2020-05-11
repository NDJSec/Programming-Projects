package Java.Casting;

import java.util.Scanner;

public class Casting_main 
{
    public static void main(String[] args) 
    {
        Casting_doubles ds = new Casting_doubles();
        Casting_movie mv = new Casting_movie();

        Scanner scan_numbers = new Scanner(System.in);

        int option=0;
        while (option!=3)
        {
            System.out.println("Welcome to Casting");
            System.out.println("What would you like to see");
            System.out.println("1: Print Doubles");
            System.out.println("2: Print Rounded Doubles");
            System.out.println("3: Enter Movie Rating");

            option = scan_numbers.nextInt();

            switch (option) 
            {
                case 1:
                    ds.pNormVals();
                    break;
                case 2:
                    ds.pRoundVals();
                    break;
                case 3:
                    mv.rating();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("1: Print Doubles");
                    System.out.println("2: Print Rounded Doubles");
                    System.out.println("3: Enter Movie Rating");
                    System.out.println("4: Done");
                    break;
            }
        }
			
    }
    
}
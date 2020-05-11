package Java.Casting;

import java.util.Scanner;

public class Casting_movie 
{

    Scanner user = new Scanner(System.in);
        
    public void rating()
    {
        System.out.println("");
		System.out.println("Please enter a movie rating to be rounded.");
		System.out.print("Your movie rating: ");
		double score = user.nextDouble();
		
		int score_rounded = (int) (score + 0.5);
        System.out.println("Your rouned movie rating: " + score_rounded);
    }
		
    
}
package Java.Scanners;

import java.util.Scanner;

class Scanner_main 
{
    public static void main(String[] args) 
    {

        Scanner user = new Scanner(System.in);
		
		System.out.println("Welcome to the Area Calculator");
		System.out.println("What is your name: ");
		String name = user.nextLine();
		
		System.out.println("Welcome " + name + " how old are you?");
		int age = user.nextInt();
		
		System.out.println("Your age: " + age);
		
		System.out.println("What city are you from " + name + "?");
		String city = user.next();
		
		System.out.println("Your city: " + city);
		
		
		System.out.println("Enter the number of the shape you want to calulate:");
		System.out.println("1: Rectangle");
		System.out.println("2: Circle");
		System.out.println("3: Triangle");
		
		System.out.println("Your choice: ");
		int choice = user.nextInt();
		
		if(choice == 1) 
		{
			Rectangle();
		}
		
		if(choice == 2)
		{
			Circle();
		}
		
		if(choice == 3)
		{
			Triangle();
		}

	}
	
	public static void Rectangle() 
	{
		Scanner rectIn = new Scanner(System.in);
		
		System.out.println("Please enter the length and width values of the Rectangle");
		System.out.println("Length: ");
		int length = rectIn.nextInt();
		
		System.out.println("Width: ");
		int width = rectIn.nextInt();
		
		int rectArea = length * width;
		
		System.out.println("The area is: " + rectArea);
		
		Menu();
	}
	
	public static void Circle() 
	{
		Scanner CirIn = new Scanner(System.in);
		System.out.println("Please enter the radius value of the Circle");
		System.out.println("Radius: ");
		int radius = CirIn.nextInt();
		
		double pi = 3.14;
		double cirArea = pi * (radius * radius);
		
		System.out.println("The area is: " + cirArea);
		
		Menu();
	}
	
	public static void Triangle() 
	{
		Scanner TriIn = new Scanner(System.in);
		System.out.println("Please enter the base and height values of the Triangle");
		System.out.println("Base: ");
		int base = TriIn.nextInt();
		
		System.out.println("Height: ");
		int height = TriIn.nextInt();
		
		double half = 0.5;
		double TriArea = half * (base * height);
		
		System.out.println("The area is: " + TriArea);
		
		Menu();
	}
	
	public static void Menu()
	{
		Scanner user = new Scanner(System.in);
		System.out.println("Please enter the number of the shape you want to calulate:");
		System.out.println("1: Rectangle");
		System.out.println("2: Circle");
		System.out.println("3: Triangle");
		
		System.out.println("Your choice: ");
		int choice = user.nextInt();
		
		if(choice == 1) 
		{
			Rectangle();
		}
		
		if(choice == 2)
		{
			Circle();
		}
		
		if(choice == 3)
		{
			Triangle();
		}

	}

    
}
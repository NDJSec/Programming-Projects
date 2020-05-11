package Java.Caesar_Cipher;

import java.util.ArrayList;
import java.util.Scanner;

public class Caesar_cipher 
{

    public Caesar_cipher()
    {

    }

    public void cipher()
    {
        Scanner scan_numbers = new Scanner(System.in);
        Scanner scan_Strings = new Scanner(System.in);
        
        String user_input;
        String message;
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> msg = new ArrayList<Character>();
        ArrayList<Character> emsg = new ArrayList<Character>();

        System.out.println("Please enter something you like to be encrypted: ");
        user_input = scan_Strings.nextLine();
        System.out.println("Please enter the shift for the cipher: ");
	    int shift = scan_numbers.nextInt();
        
        user_input = user_input.toLowerCase();

        for(char c: user_input.toCharArray())
        {
            msg.add(c);
        }

        for (char c : msg) 
        {
            if (c <= 'z')
	    	{
	    		c = (char)((c+shift)%26+78);
	    		emsg.add(c);
            }
            else
	    	{
	    		c = (char)(c + shift);
	    		emsg.add(c);
	    	}
        }

        for (char c : emsg) 
        {
            sb.append(c);
        }

        message = sb.toString();

        System.out.println("Your encrypted message is: " + message);


    }
    
}
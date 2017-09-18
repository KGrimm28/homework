/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   9/18/2017
 ******************************************************************************/
 import java.util.Scanner;

public class PrintGreeting 
{
	public static void main(String[] args)
	{
		Scanner keyboard;
		String name;
		keyboard = new Scanner(System.in);
		System.out.println("Hello! What is your name?");
		name = keyboard.nextLine();
		System.out.println("Hello! " + name);
	}
}

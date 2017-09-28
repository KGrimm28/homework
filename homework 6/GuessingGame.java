/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   9/28/2017
 ******************************************************************************/
 import java.util.Scanner;

public class GuessingGame
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int a;

		System.out.print("Guess what number I'm thinking of between 1 and 500,000: ");
		a = keyboard.nextInt();

		if ((a > 3096) && (a < 500000))
		{
			System.out.print("Uh boi! Too high lol!");
		}
		if ((a > 1) && (a < 3095))
		{
			System.out.print("Uh boi! Too low lol!");
		}
		else if (a == 3096)
		{
			System.out.print("Ayyyyyyyyy, good job :D");
		}
	}
}

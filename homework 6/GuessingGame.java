/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   11/21/2017
 ******************************************************************************/
 import java.util.Scanner;

public class GuessingGame
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int a;
		int sum = 0;

		System.out.print("Guess what number I'm thinking of between 1 and 10,000: ");
		a = keyboard.nextInt();

		while(a > 0)
		{
			sum += a; 
			if ((a > 3096) && (a < 10000))
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
		System.out.print("The number of times it took you to guess the number was: %d" , sum);
	}
}

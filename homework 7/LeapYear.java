/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   10/4/2017
 ******************************************************************************/
 import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int year;

		System.out.print("Enter a year: ");
		year = keyboard.nextInt();

		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					System.out.print("That's a leap year :D");
				}
				else 
				{
					System.out.print("That's a regular year lol");
				}
			}
			else 
			{
				System.out.print("That's a leap year :D");
			}
		}
		else
		{
			System.out.print("That's a regular year lol");
		}
	}
}
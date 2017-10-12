/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   10/4/2017
 ******************************************************************************/
import java.util.Scanner;

public class Negative
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int num;
		int sum;
		int smaller;
		int larger; 
		
		System.out.print("Enter a negative number: ");
		num = keyboard.nextInt();

		while (num > 0)
		{
			System.out.print("That is positive! \nNow give me a negative number: ");
			num = keyboard.nextInt(sum);
			
			sum += num;

		}
		System.out.println("Ayyyyyy, that's negative! :D");
		System.out.printf("The sum of numbers is %d!" , sum);
	}
}
/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   10/13/2017
 ******************************************************************************/
import java.util.Scanner;

public class Negative
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int num;
		int sum = 0;
		int largest = 0; 
		
		System.out.print("Enter a negative number: ");
		num = keyboard.nextInt();
		
		while (num > 0)
		{
			System.out.print("That is positive! \nNow give me a negative number: ");
			sum += num;
			num = keyboard.nextInt();
			if (largest < num)
			{
				largest = num;
			}
			
		}
		System.out.println("Ayyyyyy, that's negative! :D");
		System.out.printf("The sum of numbers is %s!\n" , sum);
		System.out.printf("The largest number is %s!\n" , largest);
	}
}
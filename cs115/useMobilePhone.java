import java.util.Scanner;
import java.io.*;

public class useMobilePhone
{
	public static void main (String [] args)
	{
		MobilePhone mp = new MobilePhone();
		Scanner scan = new Scanner(System.in);
		double newPrice = 0.0;
		String newBrand;
		
		System.out.println("the default brand is: " + mp.GetBrand());
		System.out.println("the default price is: " + mp.GetPrice());
		System.out.print("Please enter the brand you want: ");
		newBrand = scan.nextLine();
		mp.SetBrand(newBrand);
		System.out.print("Please enter the price you want: ");
		newPrice = scan.nextInt();
		if (mp.SetPrice(newPrice))
		{
			System.out.println("price set to: " + newPrice);
		}
		else
			System.out.println("price should between 500 and 20000");
		
		System.out.println("Thank you! The phone you want right now is: " + mp.GetBrand() + " " + mp.GetPrice());
	}
}
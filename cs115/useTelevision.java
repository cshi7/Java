import java.util.Scanner;

public class useTelevision
{
	public static void main(String [] args)
	{
		Television tel1 = new Television();
		Scanner scan = new Scanner(System.in);
		double newPrice = 0.0;
		String newBrand;
		System.out.println("Brand is: " + tel1.GetBrand());
		System.out.println("Price is: " + tel1.GetPrice());
		System.out.print("Enter the brand you want: ");
		newBrand = scan.nextLine();
		tel1.SetBrand(newBrand);
		System.out.print("Enter the price of the television you want: ");
		newPrice = scan.nextDouble();
		if (tel1.SetPrice(newPrice))
		{
			System.out.println("Price set to " + tel1.GetPrice());
			System.out.println("Thank you!The television you want is: " + tel1.GetBrand() + " " + tel1.GetPrice() + "$");
		}
		else
		{
			System.out.println("Price range should be 0-100000");
			System.out.println("Price not set");
		}
		
	}
}
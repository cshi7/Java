import java.util.Scanner;
public class pfw7
{
	public static void main( String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int result = 1;
		
		System.out.print("Please enter an integer: ");
		int a = scan.nextInt();
		for (int i = a; i>0;i--)
			result *= i;
		System.out.println("The factorial of " + a + " is " + result);
	}
	
}
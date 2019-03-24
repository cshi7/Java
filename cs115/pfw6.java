import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class pfw6
{
	public static void main( String [] args) throws IOException
	{
		int n;
		int a = 1;

		
		//File inputFile = new File("input.txt");
		//Scanner file = new Scanner(inputFile);
        Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter the number that you want the computer say Hello World");
        n = scan.nextInt();
		
		

		
		while (a <= n)
		   {
			System.out.println("Hello World");
			a++;
		   }
		
		//while(file.hasNext())
	        //number = file.nextDouble();
			
		
	}
	
}
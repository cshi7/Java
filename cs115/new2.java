import java.util.Scanner;

public class new2
{
	public static void main( String [] args)
	{
        Scanner scan = new Scanner(System.in);
        
		double b,c;
		double n = 0;
		double j = 0;
		
		System.out.println("Please enter the first value ");
		b = scan.nextDouble();
		System.out.println("Please enter the second value ");
		c = scan.nextDouble();
		
		for (int a = 1; a<=8; a++)
		  {
			if (b <= c)
		     {
			   n = b;
			   System.out.println("Please enter the next value ");
			   c = scan.nextDouble();
			   j = c;
		     }  
		    else 
			 {
				n = c;
				System.out.println("Please enter the next value ");
			    b = scan.nextDouble();
				j = b;
			 }
		  }
		if (n > j)
		{
			n = j;
			System.out.println("The minimum value of all value entered is " + n);
		}
		else
			System.out.println("The minimum value of all value entered is " + n);
		 
	}
	
}
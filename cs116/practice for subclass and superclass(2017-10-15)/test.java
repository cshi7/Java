import java.util.*;
import java.io.*;

public class test
{
	public static void main(String[]args)throws IOException
	{
		File inputfile = new File("practice.txt");
		Scanner scan = new Scanner(inputfile);
		
		int a;
		while (scan.hasNextInt())
		{
			a = scan.nextInt();
			System.out.println(a);
		}
		
	}
	
}
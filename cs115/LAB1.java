import java.util.*;
import java.io.*;

public class LAB1
{
	public static void main (String [] args)throws IOException
	{
		File inputFile = new File("myexpenses.txt");
		Scanner file = new Scanner(inputFile);
		
		Scanner scan = new Scanner(System.in);
		int howmanybills=0;
		String p;
		int plength;
		/*String p;
		int plength = 0;
		int a;
		while(file.hasNextLine())
		{
			p = file.nextLine();
			while (p.charAt(0)=='m'||p.charAt(0)=='M')
			{
				p = file.nextLine();
				String [] tokens = p.split(",");
                plength = tokens.length;
			    System.out.println(plength);
					
				double [] eachday = new double[plength];
				i = 0;
				while(i<=plength)
				{
					eachday[i] = Double.parseDouble(tokens[i]);
				    i++;
				}
				System.out.println("length is: " + plength + "\n" + eachday);
			}
				
		}
		while(file.hasNextLine())
		{
			p = file.nextLine();
			howmanybills++;
		}
		howmanybills = howmanybills/2;
		System.out.println(howmanybills);
		*/
		while(file.hasNextLine())
		{
			p = file.nextLine();
			while (p.charAt(0)=='m'||p.charAt(0)=='M')
			{
				p = file.nextLine();
				String [] tokens = p.split(",");
                plength = tokens.length;
				String [] array1 = new String[plength];
				for (int i = 0; i<plength; i++)
				{
					array1[i] = tokens[i];
				}
					System.out.println(array1[]);
			}
		}
	}
}
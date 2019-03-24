import java.io.*;
import java.util.Scanner;

public class PracticeForInput
{
	public static void main(String [] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Please enter 10 integet that you want to put into the file: ");
		FileOutputStream wow = new FileOutputStream("recordofnumE.txt",false);
		PrintWriter pw = new PrintWriter(wow);
		for (int i=0;i<10;i++)
		{
			
			int numE;
		    while(!scan.hasNextInt())
		     {
				 String garbage = scan.nextLine();
				 System.out.println("Integer please");
			
		     }
			 numE = scan.nextInt();
			 pw.println(numE);
		}
		pw.close();*/
		
		File wow1 = new File("recordofnumE.txt");
		Scanner scan1 = new Scanner(wow1);

		while (scan1.hasNextInt())
		{
			int i = scan1.nextInt();
            System.out.println(i);
		}


		
	}
}
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class pfw9

{
   public static void main(String[] args) throws IOException
   {
	   File inputFile = new File ("input.txt");
	   Scanner file = new Scanner( inputFile);
	   String str;
	   int a = 0;
	   while (file.hasNextLine())
	   { 
          str = file.nextLine();
		  a++;
		  
	   }  
	   System.out.println("The total line is: " + a);
	   
   }
}
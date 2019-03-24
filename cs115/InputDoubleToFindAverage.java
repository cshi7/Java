import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class InputDoubleToFindAverage

{
   public static void main(String[] args) throws IOException
   {
	   File inputFile = new File ("grades.txt");
	   Scanner file = new Scanner( inputFile);
	   
	   int a = 0;
	   Double sum = 0.0;
	   Double average = 0.0;
	   
	   while (file.hasNext())
	   {
		   a++;
		   sum += file.nextDouble();
		   
	   }
	   average = sum/a;
	   System.out.println("The total number is: " + a);
	   System.out.println("The average grade is: " + average);
 
	   
	   
   }
}
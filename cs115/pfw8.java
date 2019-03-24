import java.util.Scanner;
public class pfw8 

{
   public static void main(String[] args) 
   {
	   Scanner scan = new Scanner(System.in);
	   String garbage;
	   Double numA;
	   int numE;
	   int i=1;
	   
	   System.out.print("Please enter an integer bigger than 10 : ");
	   numE = scan.nextInt();
	   while (numE<=10)
	   {
		   System.out.println("Please try again.");
		   System.out.print("Enter an integer bigger than 10 : ");
		   numE = scan.nextInt();
	   }
	   numA = Math.sqrt(numE);
	   do
	   {
		   numA = Math.sqrt(numA);
		   i++;
	   }
	   while (numA>1.01);
	   
		   System.out.println("The square root times is: " + i);
	   
	   
   }
}
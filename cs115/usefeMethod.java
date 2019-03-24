import java.util.Scanner;
import java.io.*;

public class usefeMethod
{
	public static void main (String [] args)throws IOException
	{
		File inputFile = new File("runwaycs115.txt");
		Scanner file = new Scanner(inputFile);
		
		Scanner scan = new Scanner(System.in);
        
		int qStatic = 0;
		int mStatic = 0;
		int lStatic = 0;
		int dStatic = 0;
		int sStatic = 0;
		int tStatic = 0;  
        int errorStatic = 0;
		//set the static for each letter
		
		int numofDesigner = 0;
		String garbage = "a";
		int cn2 = 0;
		int cn3 = 0;
		int cn4 = 0;
		
		
		while(file.hasNextLine())
		{
			garbage = file.nextLine();
			if (garbage.length()<= 1)
			{
				numofDesigner = garbage.charAt(0)-48;
			}
			
		    feMethod [] season1 = new feMethod[numofDesigner];
			for (int cn1 = 0;cn1<numofDesigner;cn1++)
				season[cn1] = new feMethod();
				
			//how many people for each season
				
		}
		
		
		//start of the menu
		System.out.println("Press 'm' or 'M' to call menu");
		System.out.println("Press 'q' or 'Q' to call finalStats");
		char presschar = 'a'; 
        boolean justify1 = false;
		String lastnameSearch;
		
		//beginning
	    do
		{
			presschar = scan.nextLine().charAt(0);
			if(presschar == 'm'||presschar == 'M'||presschar == 'q'||presschar == 'Q')//can if || have more than one statement?
			{
				justify1 = true;
				if (presschar == 'm' || presschar == 'M')
					mStatic = mStatic + 1;
				else 
					qStatic = qStatic + 1;
			}
			else
			{
				justify1 = false;
				System.out.println("Please enter the valid value");
				errorStatic = errorStatic + 1;
			}
				
		}
		while (!justify1);
		switch (presschar)
		{
			case 'm':case'M':
			  System.out.println("[");
			  System.out.println("Press 'l' or 'L' to call list");
			  System.out.println("Press 'd' or 'D' to call designerReport");
			  System.out.println("Press 's' or 'S' to call seasonReport");
			  System.out.println("Press 'm' or 'M' to call salaryReport");
			  System.out.println("Press 't' or 'T' to call statusReport");
			  System.out.println("Press 'q' or 'Q' to call menu");
			  System.out.println("]");
			  presschar = scan.nextLine().charAt(0);
              if (presschar == 'l'||presschar == 'L')
		      {
			      while(file.hasNextLine())
			        {
				        System.out.println(file.nextLine());
			        }	
				  lStatic = lStatic + 1;
		      }
			  /*if (presschar == 'd'||presschar == 'D')
			  {
				  dStatic = dStatic + 1;
				  System.out.println("Please enter the last name of the designer you want to search for: ");
				  lastnameSearch = scan.nextLine;
				  if (???.designerReport(lastnameSearch))
				  {
					  while()
				  }
				  else
				  {
					  
				  }
			  }
			  */
			  
			  
			  
			  
			  
			  
			  
			  break;
			case 'q':case'Q':
			  System.out.println("Here is the static board");
			  System.out.println("for letter Q is: " + qStatic);
			  System.out.println("for letter M is: " + mStatic);
			  System.out.println("for letter L is: " + lStatic);
			  System.out.println("for letter D is: " + dStatic);
			  System.out.println("for letter S is: " + sStatic);
			  System.out.println("for letter T is: " + tStatic);
			  System.out.println("for bad letter input is: " + errorStatic);
			  break;
			default:
			  System.out.println("Error input, please enter the valid value");	
		}

    }
	
}
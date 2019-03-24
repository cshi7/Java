import java.util.Scanner;
import java.io.*;

public class pfFE
{
	public static void main (String [] args)throws IOException
	{
		File inputFile = new File("runwaycs115.txt");
		Scanner file = new Scanner(inputFile);
		
		Scanner scan = new Scanner(System.in);
		
		String a = "a";
		int i=0;
		int peoplenum = 0;
		String firstName = "a";
		String lastName = "a";
		int age = 0;
		double salary = 0.0;
		String status = "a";
		String tvShow = "a";
		
		char letter;
		boolean justify1;
		int errorhappens = 0;
		
		//String passedLastname = "a";
		//System.out.println("Enter the last name");
		//passedLastname = scan.nextLine();
		
		/*while(file.hasNextLine())
		{
			a = file.nextLine();
			if (a.length()== 9)
			{
			    if (a.substring(0,6).equals("Season"))
				{
					i = a.charAt(8)-48;
				}
			}
             // find how many season
			
			if (a.length()<= 1)
			{
				i = a.charAt(0)-48;
			}
             // find how many designers
			
			
			a = file.next();
			i = file.nextInt();
			int p = 0;
			peoplenum = file.nextInt();
			a = a+i;
			feMethod [] s = new feMethod[peoplenum];
			do
			{
				firstName = file.next();
				s.setFirstName(firstName);
				lastName = file.next();
				s.setLastName(lastName); 
				age = file.nextInt();
				s.setAge(age);
				salary = file.nextDouble();
				s.setSalary(salary);
				status = file.next();
				s.setStatus(status);
				tvShow = file.nextln();
				s.setNameofshow(tvShow);
				s [p] = new feMethod();
				System.out.println(s[p]);
				p++;
			}
			while(p<peoplenum);
		}
		*/
		
	    while(true)
		{
			System.out.println("Press 'm' or 'M': enter the menu");
		    System.out.println("Press 'q' or 'Q': enter the finalStats");
		    do
		    {
			    letter = scan.nextLine().charAt(0);
			    if(letter == 'm'||letter == 'M'||letter == 'q'||letter == 'Q')// question: can if has many ||? test answer: yes
			        {
				        justify1 = true;
			        }
			    else
			        {
				        justify1 = false;
				        System.out.println("Please enter the valid value");
				        errorhappens ++;
			        }
				
		    }
		    while (!justify1);
		
	
			if (letter == 'm' || letter == 'M')
		    {
			    //test System.out.println("Here is the menu");
			    menu ();
		    }
			
		    else 
		    {
			    //System.out.println("Here is the counter");
		        //finalStats(counters);
		        break;
		    }	
		}

	}
	public static void menu()
	{
		Scanner scanmenu = new Scanner(System.in);
		int [] counters = new int[7];
		while (true)
		{
			System.out.println("'L' or 'l': List all of the designer data available");
            System.out.println("'D' or 'd': Display information for a particular designer.");
            System.out.println("'S' or 's': Display designer information for designers from a particular season.");
            System.out.println("'M' or 'm': Display salary (money) information.");
            System.out.println("'T' or 't': Display status information.");
            System.out.println("'Q' or 'q': Quit and return to main().");
			char choice = scanmenu.next().charAt(0);
			// test (System.out.println("success to excess in menu");)
			
			if (choice == 'l' || choice == 'L')
			{
				//listall();
				counters[0] ++;
			}
			else if (choice == 'd' || choice == 'D')
			{
				//designerReport();
				counters[1]++;
			}
			else if (choice == 's' || choice == 'S')
			{
				//seasonReport();
				counters[2] ++;
			}
			else if (choice == 'm' || choice == 'M')
			{
				//salaryReport();
				counters[3] ++;
			}
			else if (choice == 't' || choice == 'T')
			{
				//statusReport();
				counters[4] ++;
			}
			else if (choice == 'q' || choice == 'Q')
			{
				counters[5] ++;
				return;
			}
			else 
			{
				System.out.println("Invalid input, try again");
				counters[6] ++ ;
			}
		}
	}

}


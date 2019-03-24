import java.util.Scanner;
import java.util.ArrayList;//for extra credit part and easy way
import java.io.*;

public class chengxishi
{
	public static void main (String [] args)throws IOException
	{
		File inputFile = new File("runwaycs115.txt");
		Scanner file = new Scanner(inputFile);
		// test for two scanner in one file? answer: yes
		Scanner scan = new Scanner(System.in);
		
		// try to use arraylist method for extra credit
		ArrayList<chengxishiDesigner> designers = new ArrayList<chengxishiDesigner>();

		// Beginning 
		String lastName,firstName,favoriteTv;
		int age,season,number;
		double salary;
		char status,letter;
		boolean justify1;
		int [] counters = new int[7];//final counters part
        //read files
		while (file.hasNext())
		{
			file.next();
			{
				if (file.hasNext()==false)
					break;//justify has next or not
				season = file.nextInt();
				number = file.nextInt();
				for (int p = 0; p < number; ++p)
				{
					lastName = file.next();
					firstName = file.next();
					age = file.nextInt();
					salary = file.nextDouble();
					status = file.next().charAt(0);
					favoriteTv = file.nextLine();
					// test (System.out.println(lastName + firstName + age + salary + status + favoriteTv);)
					designers.add(new chengxishiDesigner(lastName, firstName, age, salary, status, favoriteTv, season));
					// for new method arraylist
				}

				
			}
		}
		//Beginning for the client use
		while(true)
		{
		System.out.println("Press 'm' or 'M': enter the menu");
		System.out.println("Press 'q' or 'Q': enter the finalstats");
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
				counters[6] ++;
			}
				
		}
		while (!justify1)// a test here to find the right use for do-while loop
		{
		
			if (letter == 'm' || letter == 'M')
		    {
			    //test System.out.println("Here is the menu");
			    menu (designers, counters);
		    }
			
		    else 
		    {
			    //test System.out.println("Here is the counter");
		        finalStats(counters);
		        break;
		    }	
		}
		

	}
	//Beginning of different methods in the menu list
	public static void menu(ArrayList<chengxishiDesigner> designers, int []counters)
	{
		Scanner scanmenu = new Scanner(System.in);
		while (true)//loop for continue choosing from the menu
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
				listall(designers);
				counters[0] ++;
			}
			else if (choice == 'd' || choice == 'D')
			{
				designerReport(designers,counters);
				counters[1]++;
			}
			else if (choice == 's' || choice == 'S')
			{
				seasonReport(designers,counters);
				counters[2] ++;
			}
			else if (choice == 'm' || choice == 'M')
			{
				salaryReport(designers,counters);
				counters[3] ++;
			}
			else if (choice == 't' || choice == 'T')
			{
				statusReport(designers,counters);
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
	public static void listall(ArrayList<chengxishiDesigner> designers)
	{
		for (int i = 0; i < designers.size();i++)
		{
			chengxishiDesigner designer = designers.get(i);
			/* test(System.out.println("  " + "apple"
			+ "   "+ "banana");)*/
			System.out.println(designer.getLastName()
			+" "+designer.getFirstName()
			+"              "+designer.getAge()
			+"        "+designer.getSalary()
			+"        "+designer.getStatus()
			+"        "+designer.getFavoriteTv()
			+"              "+"season: "+designer.getSeason());
		}
	}
	public static boolean designerReport(ArrayList<chengxishiDesigner> designers, int [] counters)
	{
		System.out.print("Please enter the last name you want to search: ");
		Scanner scanDR = new Scanner(System.in);
		String lastName = scanDR.next();
		boolean message = false;
		//loop to search for the designer
		for (int i = 0; i<designers.size();i++)
		{
			if (designers.get(i).getLastName().equals(lastName))
			{
				System.out.println(designers.get(i).getLastName()
				+" "+designers.get(i).getFirstName()
				+" "+designers.get(i).getFavoriteTv());
				message = true;
			}
		}
		if (message == false)
		{
			System.out.println("No designer found");
			counters[6]++;
		}
		return message;
	}
	public static boolean seasonReport(ArrayList<chengxishiDesigner> designers, int[]counters)
	{
		System.out.println("Please enter the season you want to search: ");
		System.out.println("Just put the number or the word 'all'");
		Scanner scanseasonR = new Scanner(System.in);
		String passed = scanseasonR.next();
		Double totalsalary =0.0;
		Double averagesalary=0.0;
		int n = 1;
		int cn = 0;//count the number for each season(meet problem about using arraylist"seasonNum")
		if (passed.equals("all"))//it seems will repeat for the season 2 first one and season 3 first one, however, it doesnot effect the result for total and average
		{
			for (int i = 0; i <designers.size();i++)//for all information
		    {
			    chengxishiDesigner designer = designers.get(i);
				if (designers.get(i).getSeason() == n)
			    {
					totalsalary += designers.get(i).getSalary();
					cn++;
				}
				else
				{
					System.out.println("The total salary for "+"Season"+n+" is: " + totalsalary);
				    averagesalary = totalsalary/cn;
				    System.out.println("The average salary for"+"Season"+n+" is: " + averagesalary);
					
				    totalsalary=0.0;
					averagesalary=0.0;
					i--;
					n++;
					cn=0;
				}
			    System.out.println(designer.getLastName()+" "+designer.getFirstName()
			    +"         "+designer.getAge()+"   "+designer.getSalary()
			    +"   "+"season: "+designer.getSeason());
		    }
			System.out.println("The total salary for "+"Season"+n+" is: " + totalsalary);
		    averagesalary = totalsalary/cn;
		    System.out.println("The average salary for"+"Season"+n+" is: " + averagesalary);
			return true;
		}
		//test: else if (passed.charAt(0)-48<4 && passed.charAt(0)-48>0)
		else if (passed.charAt(0)-48<4 && passed.charAt(0)-48>0)// failed to get max season, use 4 instead
		{
			for (int i = 0; i <designers.size();i++)
		    {
			    chengxishiDesigner designer = designers.get(i);
				if (designers.get(i).getSeason() == passed.charAt(0)-48)
			    {
					totalsalary += designers.get(i).getSalary();
					cn++;
				}
				else
				{
					System.out.println("The total salary for "+"Season"+n+" is: " + totalsalary);
				    averagesalary = totalsalary/cn;
				    System.out.println("The average salary for"+"Season"+n+" is: " + averagesalary);
					break;
		        }
				System.out.println(designer.getLastName()+" "+designer.getFirstName()
			    +"         "+designer.getAge()+"   "+designer.getSalary()
			    +"   "+"season: "+designer.getSeason());
			}
			return true;
		}
		else 
		{
			System.out.println("No season found.");
			counters[6]++;
			return false;
		}
			
        
	}
	public static boolean salaryReport(ArrayList<chengxishiDesigner> designers, int [] counters)
	{
		System.out.print("Please enter the last name you want to search: ");
		Scanner scansalaryR = new Scanner(System.in);
		String lastName = scansalaryR.next();
		boolean salarystatus = false;
		//loop to search for the designer
		for (int i = 0; i<designers.size();i++)
		{
			if (designers.get(i).getLastName().equals(lastName))
			{
				System.out.println(designers.get(i).getLastName()
				+" "+designers.get(i).getFirstName()
				+" "+designers.get(i).getSalary());
				salarystatus = true;
			}
		}
		if (salarystatus == false)
		{
			System.out.println("No designer found");
			counters[6]++;
		}
		return salarystatus;
	}
	public static boolean statusReport(ArrayList<chengxishiDesigner> designers, int [] counters)
	{
		System.out.println("Please enter the status you want to search: ");
		System.out.println("Only acceptted to put 'a','p' or the word 'All'");
		Scanner scanstaticR = new Scanner(System.in);
		boolean statusstatus = false;
		String passedstatus = scanstaticR.next();
		double potentialearning= 0.0;
		final int MAXAge = 75;//can change in the future
		final int MINAge = 16;//can change in the future
		if (passedstatus.charAt(0)=='a')
		{
			for (int i = 0; i <designers.size();i++)
		    {
			    chengxishiDesigner designer = designers.get(i);
				if (designers.get(i).getStatus()=='a')
				{
					System.out.println(designers.get(i).getLastName()
				    +" "+designers.get(i).getFirstName()
				    +" "+"CURRENTLY AMATEUR");
				    statusstatus = true;
				}
			}
		}
		else if(passedstatus.charAt(0)=='p')//confusing about "the lesser of" in the requirement, choose A
		// char do not need to use equals here
		{
			for (int i = 0; i <designers.size();i++)
		    {
			    chengxishiDesigner designer = designers.get(i);
				if (designers.get(i).getStatus()=='p')
				{
					potentialearning = (MAXAge-designers.get(i).getAge())*412000+(designers.get(i).getAge()-MINAge)*designers.get(i).getSalary();
					System.out.println(designers.get(i).getLastName()
				    +" "+designers.get(i).getFirstName()
				    +" "+designers.get(i).getAge()
					+" "+designers.get(i).getSalary()
					+" "+"potential earning is: " + potentialearning);
				    statusstatus = true;
				}
			}
		}
		else if(passedstatus.equals("All"))
		{
			for (int i = 0; i <designers.size();i++)
		    {
			    chengxishiDesigner designer = designers.get(i);
				if (designers.get(i).getStatus()=='a')
				{
					System.out.println(designers.get(i).getLastName()
				    +" "+designers.get(i).getFirstName()
				    +" "+"CURRENTLY AMATEUR");
				    statusstatus = true;
				}
				else
				{
					potentialearning = (MAXAge-designers.get(i).getAge())*412000+(designers.get(i).getAge()-MINAge)*designers.get(i).getSalary();
					System.out.println(designers.get(i).getLastName()
				    +" "+designers.get(i).getFirstName()
				    +" "+designers.get(i).getAge()
					+" "+designers.get(i).getSalary()
					+" "+"potential earning is: " + potentialearning);
				    statusstatus = true;
				}
			}
		}
        else
		{
		    System.out.println("No status found.");
            statusstatus = false;			
		}
		return statusstatus;
	}
	public static void finalStats(int []counters)throws IOException
	{
		FileOutputStream  writer = new FileOutputStream("resultforFinalStats.txt",false);
		PrintWriter pw = new PrintWriter(writer);

        String totalstatic = "LDSMTQE";
        for (int i = 0; i < totalstatic.length(); i++)
		{
            System.out.println("For letter " +totalstatic.charAt(i)+" : "+counters[i]);
			pw.println("For letter " +totalstatic.charAt(i)+" : "+counters[i]);
		    
        }
		pw.close();
		System.out.println("All stats data has in file resultforFinalStats.txt");
		System.out.println("Thanks for your using and hope you can have a nice day!");
         

    }

}


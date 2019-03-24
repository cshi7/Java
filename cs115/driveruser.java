import java.util.*;


public class driveruser
{
	public static void main(String [] args)
	{		
		Scanner scan = new Scanner(System.in);
		
		String garbage1,Lastname;
		int age,license,garbage2;
		double drivingyear;

		driver newdriver = new driver(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2]),Double.parseDouble(args[3]));//use of the args
		driveruser driver1 = new driveruser();
		driveruser driver2 = new driveruser();
		
		

			System.out.println("Please enter the name of the driver: ");
		    Lastname = scan.nextLine();
		    System.out.println("Please enter the age of the driver: ");
		    age = scan.nextInt();
		    System.out.println("Please enter the license number: ");
		    license = scan.nextInt();			
			System.out.println("Please enter the years of driving: ");
			drivingyear = scan.nextDouble();
			
			garbage1 = newdriver.Getlastname();
			garbage2 = newdriver.Getlicense();

			
			
			driver newdriver1 = new driver();
		    newdriver1.Setlastname(Lastname);
		    newdriver1.Setage(age);
			newdriver1.Setlicense(license);
			newdriver1.Setdrivingyear(drivingyear);
			
			//System.out.println(newdriver1.Getlastname()+"\n"+newdriver1.Getlicense());
			//System.out.println(garbage1+"\n"+garbage2);                                 test
			
			if (garbage1.equals(newdriver1.Getlastname()) && garbage2 == newdriver1.Getlicense()) // for compare string, it should be equals method!!!
			{
			    System.out.println("They are the same driver!");
            }
			else
			{
				System.out.println(newdriver);
			    System.out.println("The fee for the first object is: " + driver1.licenseFee(newdriver) +"\n");
			    System.out.println(newdriver1);
			    System.out.println("The fee for the second object is: " + driver2.licenseFee(newdriver1));
			}
		    
			

			
			
				
			

		

	}
	
	public int licenseFee(driver dr)
    {
		int licenseFee =0;
		licenseFee = ((dr.Getage())*(dr.Getlicense())/10000+50);
		if (licenseFee >= 100)
		{
			licenseFee = 100;
		}
		return licenseFee;
	}
	
}
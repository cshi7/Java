public class driver
{
	private String LastName;
	private int age,license;
	private double drivingyear;
	
	public driver()
	{
		LastName = "No name";
		age = 16;
		license = 11111;
		drivingyear = 0.5;
	}
	
	public driver(String a,int b,int c,double d)
	{
		LastName = a;
		age = b;
		license = c;
		drivingyear = d;
	}

	public boolean Setlastname(String passedlastname)
	{
		LastName = passedlastname;
		return true;
	}
	public boolean Setage(int passedage)
	{
		age = passedage;
		return true;
	}
	public boolean Setlicense(int passedlicense)
	{
		license = passedlicense;
		return true;
	}
	public boolean Setdrivingyear(double passeddrivingyear)
	{
		drivingyear = passeddrivingyear;
		return true;
	}
	
	
	public String Getlastname()
	{
		return LastName;
	}
	public int Getage()
	{
		return age;
	}
	public int Getlicense()
	{
		return license;
	}
	public double Getdrivingyear()
	{
		return drivingyear;
	}
	public String toString()
	{
		return "The name of the driver is: " + LastName +"\n" +
		       "The age is: " + age +"\n" +
			   "The license number is: " + license + "\n" +
			   "The year of driving is: " + drivingyear;
	}
}
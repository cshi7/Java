public class Employee
{
	private String firstName;
	private String lastName;
	private double salary;
	private final double MAXSALARY = 2000000;
	public Employee()
	{
		firstName = "NoFirstName";
		lastName = "NoLastName";
		salary = 0.0;
	}
	public String GetFistName()
	{
		return firstName;
	}
	public String GetLastName()
	{
		return lastName;
	}
	public double GetSalary()
	{
		return salary;
	}
	public boolean SetSalary(double passedSalary)
	{
		if (passedSalary <= MAXSALARY)
		{
			salary = passedSalary;
			return true;
		}
		else
		{
			return false;
		}
	}
}
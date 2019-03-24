import java.util.Scanner;

public class useEmployee
{
	public static void main(String [] args)
	{
		Employee emp1 = new Employee();
		Scanner scan = new Scanner(System.in);
		double newSal = 0.0;
		System.out.println("Salary is: " + emp1.GetSalary());
		System.out.print("Enter new salary");
		newSal = scan.nextDouble();
		if (emp1.SetSalary(newSal))
		{
			System.out.println("Salary set to " + emp1.GetSalary());
		}
		else
		{
			System.out.println("Salary not set.");
		}
	}
}
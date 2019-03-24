import java.util.Scanner;
import java.io.*;

public class feMethod
{
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	private String status;
	private String nameOfshow;
	
	public feMethod()
	{
		firstName = "None";
		lastName = "None";
		age = 0;
		salary = 0.0;
		status = "a";
		nameOfshow = "None";
	}
	public void setFirstName(String a)
	{
		firstName = a;
		return;
	}
	public void setLastName(String b)
	{
		lastName = b;
		return;
	}
	public void setAge(int c)
	{
		age = c;
		return;
	}
	public void setSalary(double d)
	{
		salary = d;
		return;
	}
	public void setStatus(String e)
	{
		status = e;
		return;
	}
	public void setNameofshow(String f)
	{
		nameOfshow = f;
		return;
	}
	
	/*public boolean designerReport(String passedLastname)
	{
		if ()
		    return true;
		else
			return false;
	}
	*/

}


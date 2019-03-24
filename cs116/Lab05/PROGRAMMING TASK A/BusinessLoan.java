public class BusinessLoan extends Loan
{
	public BusinessLoan()
	{
		super();
	}
	public BusinessLoan(String p1,int p2,int p3,double p4)
	{
		super(p1,p2,p3);
		interestrate = p4*1.01;
	}
	public String toString()
	{
		String temp = "";
		temp = temp + super.toString() + "\n";
		temp = temp + "Interest rate is: " + interestrate + "\n";
		return temp;
	}
}
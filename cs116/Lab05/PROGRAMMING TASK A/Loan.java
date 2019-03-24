public abstract class Loan implements LoanConstants
{
	private static int loannumber;
	private String lastname;
	private int loanamount;
	public double interestrate;
	private int term;
	private int id;
	
	public Loan()
	{
		lastname = "";
		loanamount = 0;
		term = 0;
	}
	public Loan(String passedname,int passedamount,int passedterm)
	{
		this.setLastname(passedname);
		this.setLoanamount(passedamount);
		this.setTerm(passedterm);
		loannumber++;
		id = 10000 + loannumber;
	}
	public void setLastname(String a)
	{
		lastname = a;
	}
	public void setLoanamount(int m)
	{
		if (m > 100000)
		{
			System.out.println("Wrong input, should smaller than 100,000!");
			return;
		}
		loanamount = m;
	}
	public void setTerm(int t)
	{
		if(t!=1&&t!=3&&t!=5)
			term = 1;
		else 
			term = t;
	}
	public void setInterestrate(double ir)
	{
		interestrate = ir;
	}
	public String getLastname()
	{
		return lastname;
	}
	public int getLoanamount()
	{
		return loanamount;
	}
	public int getTerm()
	{
		return term;
	}
	public double getInterestrate()
	{
		return interestrate;
	}
	public String toString()
	{
		String temp = "";
		temp = temp + "Loan number is: " + id + "\n";
		temp = temp + "Customer's last name is: " + this.getLastname() + "\n";
		temp = temp + "Loan amount is: " + this.getLoanamount() + "\n";
		temp = temp + "Loan term is: " + this.getTerm() + "\n";
		return temp;
	}
}
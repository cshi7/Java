import java.io.*;
import java.util.*;

public class CreateLoans
{
	public static void main(String[]args)throws IOException
	{
		Scanner scan = new Scanner(System.in);
		//String p = args[0];
		//File inputFile = new File(p);
		//Scanner file = new Scanner(inputFile);
		
		Loan newloan[] = new Loan[1];
		System.out.println("Please type the current interest rate: ");
		double newinterestrate = scan.nextDouble();
		
		String lastname;
		int loanamount;
		int term;
		String loantype;
		for (int i = 0;i<1;i++)
		{
			System.out.println("Please enter the loan type you want: (including business and personal)");
			loantype = scan.next();
		    System.out.println("Please enter your lastname: ");
			lastname = scan.next();
			System.out.println("Please enter the loanamount: ");
			loanamount = scan.nextInt();
			System.out.println("Please enter the term you want: ");
			term = scan.nextInt();
			if (loantype.equals("business"))
			{
				newloan[i] = new BusinessLoan(lastname,loanamount,term,newinterestrate);
				
			}
			else if(loantype.equals("personal"))
			{
				newloan[i] = new PersonalLoan(lastname,loanamount,term,newinterestrate);
			}
		}

		for (int j = 0;j<1;j++)
		{
			System.out.println(newloan[j].toString());
		}
	}
}
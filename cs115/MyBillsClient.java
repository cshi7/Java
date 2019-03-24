package Client.Client;
 
import Client.Services.BillsType;
import Client.Services.Classes.MyBills;
import java.text.DecimalFormat;

import java.util.*;
import java.io.*;

public class MyBillsClient
{
	public static void main(String[]args)throws IOException
	{
		File inputFile = new File("myexpenses.txt");
		Scanner file = new Scanner(inputFile);
		Scanner file2 = new Scanner(inputFile);
		MyBillsClient mbc = new MyBillsClient();
		DecimalFormat df = new DecimalFormat("#.00"); 
		String p,q;
		String[]monthN = {"January","February","March","April"};
		double[]monthV = {0,0,0,0};
		
		int howmanybills=0;
		int a = 0;
		int tokens2count,days;
		BillsType tokenBill = null;
		
		while(file.hasNextLine())
		{
			p = file.nextLine();
			howmanybills++;
		}
		howmanybills = howmanybills/2;
		System.out.println(howmanybills);
		
		MyBills [] totalBills = new MyBills[howmanybills];
		while(file2.hasNextLine())
		{
			p = file2.nextLine();

				q = file2.nextLine();
				String [] tokens1 = p.split(":");
				String [] tokens2 = q.split(",");
				for (int l = 0;l<4;l++)
				{
					if (tokens1[1].equals(monthN[l].toUpperCase()))
						monthV[l] += mbc.totalexpenses(tokens2);
				}
			    if (tokens1[3].equals("School"))
					tokenBill = BillsType.School;
				else if (tokens1[3].equals("Restaurant"))
					tokenBill = BillsType.Restaurant;
				else if (tokens1[3].equals("Clothing"))
					tokenBill = BillsType.Clothing;
				else if (tokens1[3].equals("Other"))
					tokenBill = BillsType.Other;
				totalBills[a] = new MyBills(tokens1[1],tokenBill);
		        totalBills[a].eachdays(tokens2);
				totalBills[a].Days(tokens2);
				a++;
		}
		System.out.println("Output 1");
		for (int j = 0;j<howmanybills;j++)
		{
			System.out.println(totalBills[j].toString());
		}
		
		System.out.println("Output 2");
		for (int l = 0;l<4;l++)
		{
			System.out.println("The total of all the expenses for the month of "+ monthN[l] + " is: $" + df.format(monthV[l]));
		}
	}
	public double totalexpenses(String[]r)
	{
	    double totalexpenses = 0.0;
		for(int k = 0; k < r.length; k++)
		{
			totalexpenses += Double.parseDouble(r[k]);
		}
		return totalexpenses;
	}
}

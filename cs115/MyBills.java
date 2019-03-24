package Client.Services.Classes;

import Client.Services.BillsType;

public class MyBills
{
    private String month;
	private BillsType type;
	private int objectid;
	private int days;
	private int count;
	private String eachdays;
    private int id;
	private static int billid;


    public MyBills(String m,BillsType t)
    {
	    month = m;
	    type = t;
        eachdays = "";
		billid ++;
		id = billid;
    }
    public void Days(String [] passedeachday)
	{
	    days = passedeachday.length;
	}
	public int count(int passedcount)
	{
		count = passedcount++;
		return count;
	}
	public void eachdays(String[]p)
	{
		for(int i = 0;i<p.length;i++)
		{
			eachdays += p[i] + " ";
		}
	}
	

    public String toString()
    {
	    return "The Month is: " + month + " " + "The type of expenses is: " + type + " " + "The amounts are: " + eachdays +"The number of days for data is "+ days
		        + "The number of days for data is " + id + " " + "And the static id value is " + billid;  
    }

}
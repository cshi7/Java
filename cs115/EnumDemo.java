class EnumDemo
{
	/*public static void main(String[]args)
	{
		String str = "";
		int count = 0;
		try
		{
			File myFile = new File("text.txt");
			Scanner scan = new Scanner(myFile);
			while(scan.hasNextLine())
			{
				str = scan.nextLine();
				System.out.println(str);
				count++;
				
			}
		}
		catch(IOException ioe)
		{
			System.out.println("The file cannot be read");
		}
		System.out.println("The number of strings tokens read is: " + count);
	}*/
    public enum Days{Sun, Mon, Tue, Wed, Thur, Fri, Sat };
	public static void main(String[]args)
	{
		Days d1,d2,d3;//declare two Days object reference
		d1 = Days.Wed;
		d2 = Days.Fri;

		/*System.out.println("Comparing objects using equals");
		if(d1.equals(d2))
			System.out.println(d1 + " equals " + d2);
		else
			System.out.println(d1 + " doesn't equals " + d2);
		if(d1.compareTo(d2)>0)
			System.out.println(d1 + " is greater than " + d2);
		else if (d1.compareTo(d2)<0)
			System.out.println(d1 + " is less than " + d2);
		else
			System.out.println(d1 + " is equal to " + d2);
		System.out.println("\nGetting the ordinal value");
		System.out.println("The value of " + d1 + " is " + d1.ordinal());
		System.out.println("\nGetting the ordinal value");
		System.out.println("The value of " + d2 + " is " + d2.ordinal());
		
		String temp = "Sun";
		Days d3;
		d3 = Days.valueOf("Sun");
		System.out.println(d3);*/
		String [] suit = new String [13];
		/*suit[0] = "ACE";
		suit[1] = "TWO";
		suit[2] = "Three";
		suit[3] = "FOUR";
		suit[4] = "FIVE";
		suit[5] = "SIX";
  		suit[6] = "SEVEN";
		suit[7] = "EIGHT";
		suit[8] = "NINE";
		suit[9] = "TEN";
		suit[10] = "JACK";
		suit[11] = "QUEEN";
		suit[12] = "KING";
		*/
		suit[0] = "Sun";
		suit[1] = "Mon";
		suit[2] = "Tue";
		suit[3] = "Wed";
		suit[4] = "Thur";
		suit[5] = "Fri";
  		suit[6] = "Sat";
		int min = 0;
		int max = 6;
		int rd;
		int range = max-min+1;
		for (int i = 0;i<10;i++)
		{
			rd = (int)(Math.random()*(range)+min);
			d3 = Days.valueOf(suit[rd]);
		    System.out.println(d3);
		}
	}
}
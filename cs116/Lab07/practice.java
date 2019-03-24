public class practice
{
	public static void main(String [] args)
	{
	    int result;
		result = calc(1,5);
		System.out.println(result);
	}
    public static int calc (int a, int b)
	{
		int sum;
		if(a==b)
		{
			return a;
		}
		else
		{
			sum = calc(a+1,b)+a;
			//a++;
			System.out.println("Now a is: " + a);
			return sum;
		}
	}
	
}
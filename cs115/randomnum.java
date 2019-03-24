public class randomnum
{
	public static void main(String[]args)
	{
		int min = 0;
		int max = 100;
		int rd;
		int range = max-min+1;
		for (int i = 0;i<10;i++)
		{
			rd = (int)(Math.random()*(range)+min);
			System.out.println(rd);
		}
	}
}
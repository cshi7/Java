public class classD extends classC
{
	public String str;
	
	public classD()
	{
		super();
		str = "";
		System.out.println("Default constructor of Class D");
	}
	public classD(int g1,double g2,double g3,String g4)
	{
		super(g1,g2,g3);
		this.setStr(g4);
	}
	public void setStr(String passedp)
	{
		str = passedp;
	}
	public String getStr()
	{
		return str;
	}
	public void m3()
	{
		System.out.println("I am executing m3 as implemented in classD");
	}
	public int m2(char c)
	{
		int x;
		if(c == 'e')
		{
			x = super.m2(c);
			System.out.println("The m2(char c)version of D is executing now with returned value =" + x);
		}
		else
		{
			x = super.m2(100);
			System.out.println("The m2(int x1)version of D is executing now with returned value =" + x);
		}
		return x;
	}
	
}
public abstract class classA
{
	public int a;
	private double aa;
	
	public classA()
	{
		a = 0;
		aa = 0.0;
		System.out.println("Default constructor of Class A");
	}
	public classA(int passeda, double passedb)
	{
		this.setA(passeda);
		this.setB(passedb);
	}
	public void setA(int g1)
	{
		a = g1;
	}
	public void setB(double g2)
	{
		aa = g2;
	}
	public int getA()
	{
		return a;
	}
	public double getAA()
	{
		return aa;
	}
	public int m2(char a)
	{
		//int x = Integer.parseInt(a);
		int x = (int)(a);
		System.out.println("m2 of A is executing now");
		return x;
	}
	public int m2(int x1)
	{
		int y = 10+x1;
		System.out.println("Second version of m2 in A is executing now");
		return y;
	}
	public void m3()
	{
		System.out.println("m3 of A is executing now");
	}
	public abstract int m1();
	
	public String toString()
	{
		String temp = "";
		temp = temp + "a is: " + this.getA() + "\n";
		temp = temp + "aa is: " + this.getAA() + "\n";
		return temp;
	}
}
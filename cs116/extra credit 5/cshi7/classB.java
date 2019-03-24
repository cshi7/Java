public class classB extends classA
{
	public String s;
	
	public classB()
	{
		super();
		s = "test";
		System.out.println("Default constructor of Class B");
	}
	public classB(int g1,double g2,String g3)
	{
		super(g1,g2);
		this.setS(g3);
	}
	public void setS(String passedString)
	{
		s = passedString;
	}
	public String getS()
	{
		return s;
	}
	public int m1()
	{
		int i1 = 5*(super.getA())+(int)(super.getAA());
		System.out.println("m1 implementation of B is executing now");
		return i1;
	}
	public String toString()
	{
		String temp = "";
		temp = temp + super.toString() + "\n";
		temp = temp + this.getS() +"\n";
		return temp;
	}
	
}
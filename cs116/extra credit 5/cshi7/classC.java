public class classC extends classA
{
	public double c;
	
	public classC()
	{
		super();
		c = 0.0;
		System.out.println("Default constructor of Class C");
	}
	public classC(int g1,double g2,double g3)
	{
		super(g1,g2);
		this.setC(g3);
	}
	public void setC(double passedC)
	{
		c = passedC;
	}
	public double getC()
	{
		return c;
	}
	public int m1()
	{
		int i2 = super.getA()+(int)((this.getC())/2);
		System.out.println("m1 implementation of C is executing now");
	    return i2;
	}
	public String toString()
	{
		String temp = "";
		temp = temp + super.toString() + "\n";
		temp = temp + this.getC() + "\n";
		return temp;
		
	}
}
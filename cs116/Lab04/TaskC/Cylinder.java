public class Cylinder extends CircleVolume
{
	private float height;
	private double volume;
	
	Cylinder()
	{
		super();
		height = 0;
		volume = 0;
	}
	Cylinder(double r,float h1)
	{
		super(r);
		this.setHeight(h1);
		this.Volume(r,h1);
	}
	Cylinder(CircleVolume c,float h2)
	{
		super(c.getRadius());
	    this.setHeight(h2);	
		this.Volume(c,h2);
	}
	public void setHeight(float h3)
	{
		this.height = h3;
	}
	public void Volume(double r1,float h4)
	{
		super.setArea(r1);
		volume = (super.getArea())*h4;
	}
	public void Volume(CircleVolume c1,float h4)
	{
		volume = (c1.getArea())*h4;
	}
	public double getVolume()
	{
		return volume;
	}
	public float getHeight()
	{
		return height;
	}
	public String toString()
	{
		String temp = "";
		temp = temp + super.toString();
	    temp = temp + "Height is: " + this.getHeight() + "\n";
		temp = temp + "Volume is: " + this.getVolume() + "\n";
		return temp;
	}
}
public class Sphere extends Circle
{
	private double volume;
	
	Sphere()
	{
		super();
		volume = 0.0;
	}
	Sphere(double radius)
	{
		super(radius);
		this.setVolume(radius);
	}
	Sphere(Circle c)
	{
		super(c.getRadius());
		this.setVolume(c.getRadius());
	}
	public void setVolume(double passedradius)
	{
		volume = passedradius*passedradius*passedradius*pi*4/3;
	}
	public double getVolume()
	{
		return volume;
	}
	public String toString()
	{
		String temp = "";
		temp = temp + super.toString();
		temp = temp + "Sphere volume is: " + this.getVolume() + "\n";
		return temp;
	}
}
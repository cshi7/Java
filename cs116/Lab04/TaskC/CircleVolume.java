public abstract class CircleVolume
{
	private double radius;
	private double circumference;
	private double area;
	public final double pi = 3.14;
	
	CircleVolume()
	{
		radius = 0.0;
		circumference = 0.0;
		area = 0.0;
	}
	CircleVolume(double r)
	{
		this.setRadius(r);
		this.setCircumference(r);
		this.setArea(r);
	}
	CircleVolume(CircleVolume cv)
	{
		this.setRadius(cv.getRadius());
		this.setCircumference(cv.getCircumference());
		this.setArea(cv.getArea());
	}
	public void setRadius(double garbage1)
	{
		this.radius = garbage1;
	}
	public void setCircumference(double garbage2)
	{
		this.circumference = garbage2*2*pi;
	}
	public void setArea(double garbage3)
	{
		this.area = garbage3*garbage3*pi;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getCircumference()
	{
		return circumference;
	}
	public double getArea()
	{
		return area;
	}
	public String toString()
	{
		String temp = "";
		temp= temp + "Radius is: " + this.getRadius() + "\n";
		temp= temp + "Circumference is: " + this.getCircumference() + "\n";
		temp= temp + "Area is: " + this.getArea() + "\n";
		return temp;
	}
	
}
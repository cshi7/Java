public class Circle
{
	private double radius;
	private double circumference;
	private double area;
	public final double pi = 3.14;
	
	Circle()
	{
		radius = 0.0;
		circumference = 0.0;
		area = 0.0;
	}
	Circle(double r)
	{
		this.setRadius(r);
		this.setCircumference(r);
		this.setArea(r);
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
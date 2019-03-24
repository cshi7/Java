import java.io.*;
import java.util.*;

public class CylinderClient
{
	public static void main(String[]args)throws IOException
	{
		Scanner scan = new Scanner(System.in);
		double radius;
		float height;
		
		Circle circle1 = new Circle();
		System.out.println(circle1.toString());
		Cylinder cylinder1 = new Cylinder();
		System.out.println(cylinder1.toString());
		Cylinder cylinder2 = new Cylinder(circle1,0);
		System.out.println(cylinder2.toString());
		
		System.out.println("print the radius you want: ");
		radius = scan.nextDouble();
		System.out.println("print the height you want: ");
		height = scan.nextFloat();
		circle1 = new Circle(radius);
		System.out.println(circle1.toString());
		cylinder1 = new Cylinder(circle1,height);
		System.out.println(cylinder1.toString());
	}
}
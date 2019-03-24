import java.util.*;
import java.io.*;

public class SphereClient
{
	public static void main(String[]args)throws IOException
	{
		Scanner scan = new Scanner(System.in);
		
		Cylinder cylinder1 = new Cylinder(28,35);
		System.out.println("new cylinder create, radius is: " + cylinder1.getRadius() + " height is: " + cylinder1.getHeight());
		Sphere sphere1 = new Sphere(6);
		System.out.println("new sphere create, radius is: " + sphere1.getRadius());
		
		double numbofsphere;
		numbofsphere = Math.floor(cylinder1.getVolume()/(sphere1.getVolume()));
		System.out.println("There can be " + numbofsphere + " sphere into the cylinder");
		
		double radius;
		float height;
		System.out.println("Type the radius you want: ");
		radius = scan.nextDouble();
		System.out.println("Type the height you want: ");
		height = scan.nextFloat();
		Circle circle1 = new Circle(radius);
		System.out.println("The circle you want is: " + circle1.toString());
		
		cylinder1 = new Cylinder(circle1,height);
		System.out.println(cylinder1.toString());
		sphere1 = new Sphere(circle1);
		System.out.println(sphere1.toString());
		
		Circle [] circlearray = new Circle[3];
		System.out.println("Type the radius you want: ");
		radius = scan.nextDouble();
		System.out.println("Type the height you want: ");
		height = scan.nextFloat();
		circlearray[0] = new Circle(radius);
		circlearray[1] = new Cylinder(radius,height);
		circlearray[2] = new Sphere(radius);
		for (int i = 0;i<3;i++)
		{
			System.out.println(circlearray[i].toString());
		}
	}
}
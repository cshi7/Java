import java.util.*;
import java.io.*;

public class CylinderSphereClient
{
	public static void main(String[]args)throws IOException
	{
		Cylinder cy1 = new Cylinder();
		Cylinder cy2 = new Cylinder();
		Sphere s1 = new Sphere();
		Sphere s2 = new Sphere();
		
		System.out.println(cy1.toString());
		System.out.println(s1.toString());
		
		System.out.println("Now radius is changing to 10,height is changing to 10");
		cy1 = new Cylinder(10,10);
		s1 = new Sphere(10);
		System.out.println("Test for non-abstract methods");
		System.out.println(cy1.toString());
		System.out.println(s1.toString()+"\n");
		
		System.out.println("Now radius is changing to 20,height is changing to 10");
		System.out.println("Test for abstract methods");
		CircleVolume cv1;
		cy2 = new Cylinder(20,10);
		s2 = new Sphere(20);
		cv1 = cy2;
		System.out.println(cv1.toString());
		cv1 = s2;
		System.out.println(cv1.toString());
        
		System.out.println("Here is the polymorphism test for the array \n");
		System.out.println("================================================");
		CircleVolume [] cvlist = new CircleVolume[4];
		cvlist[0] = cy1;
		cvlist[1] = cy2;
		cvlist[2] = s1;
		cvlist[3] = s2;
		for (int i = 0; i<4;i++)
		{
			System.out.println(cvlist[i].toString());
		}
		
		
	}
}
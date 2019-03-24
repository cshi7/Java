import java.io.*;
import java.util.*;

public class client
{
	public static void main(String[]args)throws IOException
	{
		System.out.println("Here is the FIRST OUTPUT\n");
		classB objectsB = new classB();
		classC objectsC = new classC();
		objectsB.m1();
		objectsC.m1();
		System.out.println("\n");
		
		System.out.println("Here is the SECOND OUTPUT\n");
		classD objectsD = new classD();
		objectsD.m3();
		System.out.println("\n");
		
		
		System.out.println("Here is the THIRD OUTPUT\n");
		int garbage;
		objectsD.m2('e');
        objectsD.m2('p');
	}
}
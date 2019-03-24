import java.util.Scanner;

public class pfw3

{
     public static void main(String [] args)
       {
          Scanner scan = new Scanner(System.in);
          
          double radius;
          double pi = 3.14159;
          
          System.out.println("Enter the radius:");
          radius = scan.nextDouble();

          double area = pi*radius*radius;
          double circumference = 2*pi*radius;

          
                  
          System.out.println("The area for the circle is " + area + "and the circumference for the circle is" + circumference);
          System.exit(0);
       }
}
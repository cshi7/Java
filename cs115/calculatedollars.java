import java.util.Scanner;

public class pfw3
{
    public static void main(String [] args)
       {
      
       Scanner scan = new Scanner(System.in);
       double quarters;
       double dimes;
       double nickels;
       double dollars;
       System.out.println("Enter the number of quarters:");
       quarters = scan.nextInt();
       System.out.println("Enter the number of dimes:");
       dimes = scan.nextInt();
       System.out.println("Enter the number of nickels:");
       nickels = scan.nextInt();
       dollars = quarters/4+dimes/10+nickels/20;
       System.out.println("The total coin amount to dollars is " + dollars +"$");
       System.exit(0);
       }
}
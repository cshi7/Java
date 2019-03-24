import java.util.Scanner;
public class practice

{
   public static void main(String [] args)
     {
         final double a = 1.5;
         double b;
         int c;
         Scanner scan = new Scanner(System.in);
         int numEntered;
         System.out.println("Please enter an integer");
         numEntered = scan.nextInt();
         System.out.println("The num you entered is " + numEntered);
         if (numEntered <= 3 && numEntered == 1 || numEntered == 2 || numEntered == 3)
          {switch(numEntered)
           {
             case(1):
               {
                 b = numEntered + a;               
                 System.out.println("The result is " + b);
                 break;
               }
             case(2):
               {
                 b = numEntered*a;
                 System.out.println("The result is " + b);
                 break;

               }
             case(3):
               {
                 b = numEntered/a;
                 System.out.println("The result is " + b);
                 break;
               }
           }
          }
         else 
          {
            c = 10086;
            System.out.println("Wrong result: " + "Wrong Code " + c);
          }          
         System.exit(0);
     }

}

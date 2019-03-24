import java.util.Scanner;
public class pfw4

{
     public static void main(String [] args)
       {
          Scanner scan = new Scanner(System.in);
          String userID;
          String password;
          String a = "admin";
          String o = "open";
          
          System.out.println("please enter your userID");
          userID = scan.nextLine();
          System.out.println("please enter your password");
          password = scan.nextLine();
          
          if (userID.equals(a))
           {
              if(password.equals(o))
                System.out.println("Welcome");
              else
                System.out.println("Wrong password");
           }
          
          else
           {
               if (password.equals(o))
                System.out.println("Wrong userID");
               else
                System.out.println("Sorry, wrong ID and password");
           }
          System.exit(0);
       }
}
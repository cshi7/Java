// ��ȡ�ļ�������ÿ�д������ �Լ�ԭ�ļ�������
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class fospractice

{
   public static void main(String[] args) throws IOException
   {
	   File inputFile = new File ("input.txt");
	   Scanner file = new Scanner( inputFile);
	   String str;
	   int a = 0;
	   
	   while (file.hasNextLine())
	   { 
          str = file.nextLine();
		  a++;
          try
	       {
		     FileOutputStream fos = new FileOutputStream
		     ("copy.txt",true);
		     PrintWriter pw = new PrintWriter(fos);
		     pw.print("line" + a + " : ");
			 pw.println(str);
		     pw.close();
	       }
          catch(FileNotFoundException fnfe)
	       {
		     System.out.println("Unable to find grades.txt");
	       }	 
         
		  
	   }  
	   
   }
}
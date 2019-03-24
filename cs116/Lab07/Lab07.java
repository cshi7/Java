import java.io.*;
import java.util.*;
import java.lang.*;

public class Lab07
{
	public static void main(String[]args)throws IOException
	{
		Scanner scan = new Scanner(System.in);
		String inputvalue,recorder;
		char garbage2;
		int inputsize;
		int arraysize = 1;
		int denominator = 1;
		int counter = 0;
		int counter2 = 1;
		int garbage1 = 0;
		int garbage3 = 0;
		int counterforgroup = 0;
		
		System.out.println("Type the digits: ");
		inputvalue = scan.nextLine();
		inputsize = inputvalue.length();
		String [] copyofinput = new String[inputsize];
		
		//try to find out 1 and 0 and ignore them
		for(int a =0;a<inputsize;a++)
		{
			if((Character.getNumericValue(inputvalue.charAt(a)))!=1||(Character.getNumericValue(inputvalue.charAt(a))!=0))
			{
				copyofinput[counter]=Character.toString(inputvalue.charAt(a));
				counter++;
				if (Character.getNumericValue(inputvalue.charAt(a))==7||Character.getNumericValue(inputvalue.charAt(a))==9)
				{
					garbage1++;
				}
			}
		}
		inputsize = copyofinput.length-garbage1;

		for(int i =0;i<inputsize;i++)
		{
			arraysize = arraysize*3;
		}
		for(int i =0;i<garbage1;i++)
		{
			arraysize = arraysize*4;
		}
		String []mnemonics = new String[arraysize];
		for (int a = 0;a<arraysize;a++)
		{
			mnemonics[a] = "-";
		}
		//for things up are trying to establish the array for different mnemonics;
		// Here for create different numbs
		String []numb2 = {"A","B","C"};
		String []numb3 = {"D","E","F"};
		String []numb4 = {"G","H","I"};
		String []numb5 = {"J","K","L"};
		String []numb6 = {"M","N","O"};
		String []numb7 = {"P","Q","R","S"};
		String []numb8 = {"T","U","V"};
		String []numb9 = {"W","X","Y","Z"};
		counter = 1;
		counter2 = 3;
		counterforgroup = arraysize;
		for(int b = 0;b<copyofinput.length;b++)
		{
			
			garbage2 = copyofinput[b].charAt(0);
			if((Character.getNumericValue(garbage2))!=7&&(Character.getNumericValue(garbage2))!=9)//
			{
						
				//counterforgroup = counterforgroup/3;
				denominator = (int)Math.pow(3,counter);
				System.out.println(denominator);
				switch(garbage2)
				{
					case '2':  for(garbage1=0;garbage1<(arraysize/3);garbage1++)
					           {
								   mnemonics[garbage1*(arraysize/((int)Math.pow(3,counter2)))] = mnemonics[garbage1*(arraysize/((int)Math.pow(3,counter2)))]+numb2[0];
								   mnemonics[garbage1*(arraysize/((int)Math.pow(3,counter2)))+(arraysize/denominator)]=mnemonics[garbage1*(arraysize/((int)Math.pow(3,counter2)))+(arraysize/denominator)]+numb2[1];
								   mnemonics[garbage1*(arraysize/((int)Math.pow(3,counter2)))+(2*arraysize/denominator)]=mnemonics[garbage1*(arraysize/((int)Math.pow(3,counter2)))+(2*arraysize/denominator)]+numb2[2];
								   //mnemonics[garbage1] = mnemonics[garbage1]+numb2[0];
								   //mnemonics[garbage1+(arraysize/denominator)] = mnemonics[garbage1+(arraysize/denominator)]+numb2[1];
								   //mnemonics[garbage1+(2*arraysize/denominator)] = mnemonics[garbage1+(2*arraysize/denominator)]+numb2[2];
							   }
							   counter++;
							   counter2--;
							   
							   break;
					/*case '3':  for(int c=0;c<counterforgroup;c++)
					           {
						            mnemonics[c] = mnemonics[c]+numb3[0];
                                    mnemonics[c+counterforgroup] = mnemonics[c+counterforgroup]+numb3[1];
                                    mnemonics[c+counterforgroup*2] = mnemonics[c+counterforgroup*2]+numb3[2];					
					           }
							   break;
					case '4':  for(int c=0;c<counterforgroup;c++)
					           {
						            mnemonics[c] = mnemonics[c]+numb4[0];
                                    mnemonics[c+counterforgroup] = mnemonics[c+counterforgroup]+numb4[1];
                                    mnemonics[c+counterforgroup*2] = mnemonics[c+counterforgroup*2]+numb4[2];						
					           }
							   break;
					case '5':  for(int c=0;c<counterforgroup;c++)
					           {
						            mnemonics[c] = mnemonics[c]+numb5[0];
                                    mnemonics[c+counterforgroup] = mnemonics[c+counterforgroup]+numb5[1];
                                    mnemonics[c+counterforgroup*2] = mnemonics[c+counterforgroup*2]+numb5[2];					
					           }
							   break;
					case '6':  for(int c=0;c<counterforgroup;c++)
					           {
						            mnemonics[c] = mnemonics[c]+numb6[0];
                                    mnemonics[c+counterforgroup] = mnemonics[c+counterforgroup]+numb6[1];
                                    mnemonics[c+counterforgroup*2] = mnemonics[c+counterforgroup*2]+numb6[2];					
					           }
							   break;
					case '8':  for(int c=0;c<counterforgroup;c++)
					           {
						            mnemonics[c] = mnemonics[c]+numb8[0];
                                    mnemonics[c+counterforgroup] = mnemonics[c+counterforgroup]+numb8[1];
                                    mnemonics[c+counterforgroup*2] = mnemonics[c+counterforgroup*2]+numb8[2];				
					           }
							   break;*/
				}
			}
			/*else 
			{
				if ((counterforgroup/4)!=1)
				{
					counter++;
				}
				counterforgroup = counterforgroup/4;
				switch(garbage2)
				{
					case '7':  for(int c=0;c<counterforgroup;c++)
					           {
						            mnemonics[c] = mnemonics[c]+numb7[0];
                                    mnemonics[c+counterforgroup] = mnemonics[c+counterforgroup]+numb7[1];
                                    mnemonics[c+counterforgroup*2] = mnemonics[c+counterforgroup*2]+numb7[2];	
									mnemonics[c+counterforgroup*3] = mnemonics[c+counterforgroup*3]+numb7[3];	
					           }
							   break;
					case '9':  for(int c=0;c<counterforgroup;c++)
					           {
						            mnemonics[c] = mnemonics[c]+numb9[0];
                                    mnemonics[c+counterforgroup] = mnemonics[c+counterforgroup]+numb9[1];
                                    mnemonics[c+counterforgroup*2] = mnemonics[c+counterforgroup*2]+numb9[2];	
									mnemonics[c+counterforgroup*3] = mnemonics[c+counterforgroup*3]+numb9[3];
					           }
							   break;
				}
			}*/
		}
		for (int d = 0;d<mnemonics.length;d++)
		{
			System.out.println(mnemonics[d]);
		}
	}
}
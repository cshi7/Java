import java.util.*;
import java.io.*;

public class FinalProject
{
	public static class Appliance 
	{
		public String name;
		public int onW, offW; 
		public double probOn; 
		public boolean smart; 
		public double probSmart;

		public Appliance (String n, int on, int off, double pOn, boolean s, double pSmart)
		{ name=n; onW=on; offW=off; probOn=pOn; smart=s; probSmart=pSmart; }
        public int getonW()
		{
			return onW;
		}
		public int getoffW()
		{
			return offW;
		}
		public double getpOn()
		{
			return probOn;
		}
		public boolean getSmart()
		{
			return smart;
		}
		public String toString () 
		{
			return name + "," + onW + "," + offW + "," + probOn + "," + smart + "," + probSmart;
		}
	}
	public static int Event(int a,int b, char[]c)
	{
		int numb = 0;
		switch(c[b])
		{
			case 'A':  numb = (int)a*2-1;
			           break;
			case 'B':  numb = a+1;
			           break;
			case 'C':  numb = (int)a/2+2;
			           break;
			case 'D':  numb = (int)a*3-3;
			           break;
			case 'E':  numb = a + (int)(Math.random()*10) ;
			           break;
		}
		return numb;
	}
	public static void main(String[]args)throws IOException
	{
		Appliance [] app = new Appliance[100];  // default 100 possible appliance types
		File inputFile = new File("ApplianceDetail.txt");
		Scanner file = new Scanner(inputFile);
		Scanner scan = new Scanner(System.in);
		Random rn = new Random();
		
		String garbage;
		char choice;
		int count=0;
		int totalpower = 0;
		int maximumpower;
		int numberofappliance;
		int garbagelength;
		
		while (file.hasNextLine())
		{
			garbage = file.nextLine();
			count++;
		}
		file = new Scanner(inputFile);
		app = new Appliance[count];
		count = 0;
		while (file.hasNext())
		{
			StringTokenizer stringToken = new StringTokenizer(file.nextLine());
			app[count] = new Appliance(stringToken.nextToken(","),
						Integer.parseInt(stringToken.nextToken(",")),
						Integer.parseInt(stringToken.nextToken(",")),
						Double.parseDouble(stringToken.nextToken(",")),
						Boolean.parseBoolean(stringToken.nextToken(",")),
						Double.parseDouble(stringToken.nextToken()));
			count++;
		}
		
		while(true)
		{
		System.out.println("Type the function you want to choose: ");
		System.out.println("'T' for adding a appliancedetail txt file.");
		System.out.println("'E' for exhibit all the appliance.");
		System.out.println("'P' to begin the power using simulation.");
		System.out.println("'S' to begin the event simulation.");
		System.out.println("'Q' to exit.");
		choice = scan.nextLine().charAt(0);
		switch (choice)
		{
			case 'T':case 't': System.out.println("Please enter the file name you want to add: ");
			                   garbage = scan.nextLine();
							   File inputFileadding = new File(garbage);
							   file = new Scanner(inputFileadding);
							   count = 0;
							   while (file.hasNextLine())
							   {
								   garbage = file.nextLine();
								   count++;
							   }		
                               file = new Scanner(inputFileadding);							   
							   Appliance [] newapp = new Appliance[count];
							   count = 0;
		                       while (file.hasNext()) 
		                       {
			                        StringTokenizer stringToken = new StringTokenizer(file.nextLine());
			                        newapp[count] = new Appliance(stringToken.nextToken(","),
						            Integer.parseInt(stringToken.nextToken(",")),
						            Integer.parseInt(stringToken.nextToken(",")),
						            Double.parseDouble(stringToken.nextToken(",")),
						            Boolean.parseBoolean(stringToken.nextToken(",")),
						            Double.parseDouble(stringToken.nextToken()));
			                        count++;
		                       }
							   count = newapp.length + app.length;
							   Appliance [] copyofapp = new Appliance[count];
							   for (int i =0;i<app.length;i++)
							   {
								   copyofapp[i] = app[i];
							   }
							   for (int i =0;i<newapp.length;i++)
							   {
								   copyofapp[i+app.length] = newapp[i];
							   }
							   app = new Appliance[count];
							   for (int i = 0;i<count;i++)
							   {
								   app[i] = copyofapp[i];
							   }
							   System.out.println("Now finishing adding!");
							   break;
			case 'E':case 'e': for (int i =0;i<app.length;i++)
			                   {
	                                System.out.println(app[i].name+","
									                  +String.valueOf(app[i].onW)+","
													  +String.valueOf(app[i].probOn)+","
													  +String.valueOf(app[i].smart)+","
													  +String.valueOf(app[i].probSmart));			
			                   }
							   System.out.println("=============================================================================================");
							   System.out.println("In the exhibition, first one is the machine type");
							   System.out.println("second part is the using power when machine is on");
							   System.out.println("third part is the using power for 'low' mode machine, which is only used for smart devices");
							   System.out.println("forth part with the '0.xx'is the possibility that device is on or not");
							   System.out.println("fifth part, with 'true' or 'false', shows it is a smart device or not");
							   System.out.println("sixth part shows the energy that smart devices save when turning on to low situation");
							   System.out.println("=============================================================================================");
							   break;
			case 'P':case 'p': System.out.println("How many minutes long is the simulation?");
			                   while (!scan.hasNextInt()) 
							   {
				                    scan.nextLine();
				                    System.out.print("Please enter an integer: ");
			                   }
			                   count = scan.nextInt();
							   System.out.println("What is the maximum range for power?");
							   while (!scan.hasNextInt()) 
							   {
				                    scan.nextLine();
				                    System.out.print("Please enter an integer: ");
			                   }
							   maximumpower = scan.nextInt();
							   System.out.println("How many appliance you want to open usually?");
							   while (!scan.hasNextInt()) 
							   {
				                    scan.nextLine();
				                    System.out.print("Please enter an integer: ");
			                   }
							   numberofappliance = scan.nextInt();
							   garbage = scan.nextLine();
							   System.out.println("Default output will be file 'output.txt', if you want to change the name of the output file, please type 'C'");
							   garbage = scan.nextLine();
							   if (garbage.charAt(0) == 'C'||garbage.charAt(0) == 'c')
							   {
								   System.out.println("Now type the output file's name you want: ");
								   garbage = scan.nextLine();
								   System.out.println("Now name change to " + garbage);
							   }
							   else
							   {
								   garbage = "output.txt";
							   }
		                       try
							   {
								   FileWriter fw = new FileWriter(garbage, false);
			                       BufferedWriter bw = new BufferedWriter(fw);
								   
								   for (int location=1;location<=count;location++) 
								   {
									   int applianceCount = numberofappliance; 
									   Appliance [] simulationapp = new Appliance[applianceCount];
									   totalpower = 0;
									   for (int i=0;i<applianceCount;i++)
									   {
										   int index= rn.nextInt(app.length)-1;
										   if (index <= 0)
										   {
											  index = 0;
										   }
										   int possibility = rn.nextInt(100);
										   if (possibility <= (int)(100*(app[index].getpOn()))&&i>=1)
										   {
											   simulationapp[i]=app[index];
											   totalpower = totalpower + simulationapp[i].getonW();
										   }
										   else
										   {
											   if(i == 0)
											   {
												   simulationapp[i]=app[index];
											       totalpower = totalpower + simulationapp[i].getonW();
											   }
											   else
											   {
												   i=i-1;
											   }
										   }
									   }
									   garbagelength = simulationapp.length;
									   String status[] = new String[garbagelength];
									   for (int z = 0;z<garbagelength;z++)
									   {
										   status[z] = "On";
									   }
									   while(true)
									   {
										   if(totalpower > maximumpower&&simulationapp[garbagelength-1].getSmart())
										   {
												totalpower = totalpower - simulationapp[garbagelength-1].getonW()+simulationapp[garbagelength-1].getoffW();
												status[garbagelength-1] = "Low";
												garbagelength--;
										   }
										   else
										   {
											   if (totalpower > maximumpower&&(simulationapp[garbagelength-1].getSmart()==false))
											   {
												   totalpower = totalpower - simulationapp[garbagelength-1].getonW();
												   status[garbagelength-1] = "Off";
												   garbagelength--;
											   }
											   else
											   {
												   break;
											   }
										   }
									   }
									   
									   if (garbagelength > 0){
									   for (int p = 0;p<simulationapp.length;p++)
									   {
										   bw.write(String.valueOf(10000000+location));
					                       bw.write(",");		
					                       bw.write(simulationapp[p].name);
					                       bw.write(",");		
					                       bw.write(String.valueOf(simulationapp[p].onW));
					                       bw.write(",");									
					                       bw.write(String.valueOf(simulationapp[p].probOn));
					                       bw.write(",");		
					                       bw.write(String.valueOf(simulationapp[p].smart));
					                       bw.write(",");
					                       bw.write(String.valueOf(simulationapp[p].probSmart));
										   bw.write(",");
										   bw.write(status[p]);
					                       bw.newLine();
					                       bw.flush();
										  
									   }}
									   else
									   {
										   bw.write(String.valueOf(10000000+location)); 
                                           bw.write(",");
                                           bw.write("Low maximum power range, no machine run!");		
                                           bw.newLine( );
					                       bw.flush();										   
									   }   
										   
									   
								   }
									   bw.close(); 
							   }
							   
							   catch( IOException ioe )
		                       {
			                        ioe.printStackTrace( );
		                       }
							   System.out.println("======================================");
							   System.out.println("Now finish simulation, all the details in file " + garbage);
							   System.out.println("======================================");
							   //garbage = scan.nextLine();
			                   break;
			case 'S':case's':  System.out.println("How many minutes long is the simulation?");
			                   while (!scan.hasNextInt()) 
							   {
				                    scan.nextLine();
				                    System.out.print("Please enter an integer: ");
			                   }
			                   count = scan.nextInt();
							   garbage = scan.nextLine();
							   System.out.println("Default output will be file 'EventSimulationReport.txt', if you want to change the name of the output file, please type 'C'");
							   garbage = scan.nextLine();
							   if (garbage.charAt(0) == 'C'||garbage.charAt(0) == 'c')
							   {
								   System.out.println("Now type the output file's name you want: ");
								   garbage = scan.nextLine();
								   System.out.println("Now name change to " + garbage);
							   }
							   else
							   {
								   garbage = "EventSimulationReport.txt";
							   }
			                   int counter = 0;
							   int minutes = 0;
							   int timestop;
							   char option [] = {'A','B','C','D','E'};
							   timestop = minutes + Event(3,rn.nextInt(5),option);
							   try
							   {
								   FileWriter fiwi = new FileWriter(garbage, false);
			                       BufferedWriter biwi = new BufferedWriter(fiwi);
								   while (minutes<=count)
							       {
								      while(minutes==timestop&&minutes<=count)
								      {
									      counter++;
									      biwi.write("Minute: ");
										  String temp1 = Integer.toString(minutes);
										  biwi.write(temp1);
										  biwi.write(" ");
										  biwi.write("Event# ");
										  String temp2 = Integer.toString(counter);
										  biwi.write(temp2);
										  biwi.newLine();
										  biwi.flush();
									      timestop = minutes + Event(3,rn.nextInt(5),option);
								      }			
                                      minutes++;								  
							       }
							       biwi.write("Total number of events is: "); 
								   String temp3 = Integer.toString(counter);
								   biwi.write(temp3);
								   biwi.close();
							   }
							   catch(IOException ioe)
							   {
			                        ioe.printStackTrace( );
		                       }
							   System.out.println("======================================");
							   System.out.println("All details in file " + garbage);
							   System.out.println("Now finish Event Simulation!");
							   System.out.println("======================================");
							   break;
			case 'Q':case'q': System.out.println("Quitting now!");
			                   System.exit(0);
							   break;
			default:          System.out.println("Unknown Command, please choose a valid option!");
							   
		}
		
		}
		
	}
}
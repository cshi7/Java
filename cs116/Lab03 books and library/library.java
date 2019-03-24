package library.client.classes;
import library.service.classes.BookGenre;
import library.service.classes.BookRecord;

import java.util.*;
import java.io.*;

public class library
{
	public static void main(String[]args)throws IOException
	{
		
		String p = args[0];
		BookRecord [] library1 = new BookRecord[5]; 
		int counter1 = 0;
		int counter2 = 5;
		int addnum = Integer.parseInt(args[1]);
		char option1;
		String option2;
		boolean justify1,justify2;
		int numofbooks = 1;

		File inputFile = new File(p);
		Scanner scan = new Scanner(System.in);
		Scanner file = new Scanner(inputFile);
		while (file.hasNextLine())
		{
			p = file.nextLine();
			String []garbage = p.split(":");
			library1[counter1] = new BookRecord(garbage[0],garbage[1],garbage[2],garbage[3],garbage[4]);
			if (counter1 >= 1&&library1[counter1]!= null)
			{
				for (int i = 0; i < counter1; i++)
				{
					justify2 = library1[i].equalsornot(library1[counter1],library1[i]);
					if (justify2)
					{
						System.out.println("Found a duplicate");
						System.out.println(library1[i]);
						counter1 = counter1-1;
						break;
					}
				}
			}
			counter1 ++;
			if (counter1 == counter2)
			{
				counter2 = counter1 + addnum;
				System.out.println("Resized the array from " + counter1 + "to " + counter2);
				BookRecord []library2 = new BookRecord[counter2];
				for(int i = 0;i < counter1;i++)
				{
					library2[i]=library1[i];
				}
				library1 = new BookRecord[counter2];
				for(int i = 0;i < counter1;i++)
				{
					library1[i]=library2[i];
				}
			}
		}
		//adjust the library1's length to fill all of the null blank
		while (true)
		{
			if (library1[numofbooks]!= null)
				numofbooks ++;
			else
			{
				numofbooks = numofbooks-1;
				BookRecord []library3 = new BookRecord[numofbooks];
				for(int i = 0;i < numofbooks;i++)
				{
					library3[i]=library1[i];
				}
				library1 = new BookRecord[numofbooks];
				for(int i = 0;i < numofbooks;i++)
				{
					library1[i]=library3[i];
				}
				break;
			}	
		}
		BookRecord []copy0 = new BookRecord[numofbooks];
		BookRecord []copy1 = new BookRecord[numofbooks];
		BookRecord []copy2 = new BookRecord[numofbooks];
        for (int i = 0;i<numofbooks;i++)
		{
			copy0[i] = library1[i];
			copy1[i] = library1[i];
			copy2[i] = library1[i];
		}
		
		BookRecord []taglibrary = new BookRecord[numofbooks];
		taglibrary = sortString(copy0,numofbooks);
        
		BookRecord []pagelibrary = new BookRecord[numofbooks];
		pagelibrary = sortPages(copy1,numofbooks);
		
		/*for (int i = 0; i<numofbooks;i++)
		{
			System.out.println(library1[i]);
		}*/

		while(true)
		{
			System.out.println("Select an option: ");
			System.out.println("Type 'S' to list books of a genre");
			System.out.println("Type 'P' to print out all the book recors");
			System.out.println("Type 'T' to look for the tag");
			System.out.println("Type 'Q' to Quit");
            
			do
		    {
			    option1 = scan.nextLine().charAt(0);
			    if(option1 == 's'||option1 == 'S'||option1 == 'p'||option1 == 'P'||option1 == 't'||option1 == 'T'||option1 == 'q'||option1 == 'Q')
			    {
				    justify1 = true;
			    }
			    else
			    {
			  	    justify1 = false;
				    System.out.println("Please enter the valid value");
			    }	
		    }
			while(!justify1);
            
			switch(option1)
			{
				case 's':case 'S':
				    System.out.println("Type a genre. The genres are:");
                    for (BookGenre d : BookGenre.values()) 
					{
                        System.out.println(d);
                    }
                    
				    option2=scan.nextLine();
					option2="GENRE_"+option2;
					
					int sublength = 0;
					for(int i = 0;i < library1.length;i++)
		            {
						if (library1[i]!=null)
						{
							if ((library1[i].getBooksGenre()).equals(option2))
			                {
                                sublength++;
			                }
			            }
		            }
					System.out.println(sublength);
					BookRecord[]slibrary = new BookRecord[sublength];
					int garbage1 = 0;
					for(int i = 0;i < library1.length;i++)
		            {
						if (library1[i]!=null)
						{
							if ((library1[i].getBooksGenre()).equals(option2))
			                {
                                slibrary[garbage1] = library1[i];
								garbage1++;
			                }
			            }
		            }
					slibrary = sortString(slibrary,sublength);
					for (int i = 0;i < sublength;i++)
					{
						System.out.println(slibrary[i]);
					}
				    //Compare(library1, option2);
					break;
				case 'p':case 'P':
				    copy2 = sortString(copy2,numofbooks);
					for(int i = 0;i<counter1;i++)
		            {
			            System.out.println(copy2[i]);
		            }
					break;
				case 't':case 'T':
				    System.out.println("Please enter the tag you want to find for: ");
					String garbage2 = scan.nextLine();
					searchTag(taglibrary,garbage2);
					break;
				case 'q':case 'Q':
				    System.out.println("Quitting program!");
				    System.exit(0);
				// or give up do while loop to type default value;
				// here is a practice for the loop that learned last semester;
			}

		}
	}
	public static BookRecord[]sortString(BookRecord[]myArray,int noRecords)
	{
        BookRecord[]blanklibrary = new BookRecord[noRecords];
		int subarraylength,index,x;
		for (int i = 0;i<=noRecords-1;i++)
		{
			subarraylength = noRecords - i;
			index = 0;
			for (int j = 0;j<subarraylength;j++)
			{
				x = (myArray[j].getBooksTag()).compareTo(myArray[index].getBooksTag());
				if (x>0)
				{
					index = j;
				}
			}
			blanklibrary[0] = myArray[index];
			myArray[index] = myArray[noRecords-i-1];
			myArray[noRecords-i-1] = blanklibrary[0];
		}
		return myArray;
	}
    public static BookRecord[]sortPages(BookRecord[]myArray,int noRecords)
	{
		BookRecord[]blanklibrary = new BookRecord[noRecords];
		int subarraylength,index,x;
		for (int i = 0;i<=noRecords-1;i++)
		{
			subarraylength = noRecords - i;
			index = 0;
			for (int j = 0;j<subarraylength;j++)
			{
				if (myArray[j].getBooksPages()>myArray[index].getBooksPages())
				{
					index = j;
				}
			}
			blanklibrary[0] = myArray[index];
			myArray[index] = myArray[noRecords-i-1];
			myArray[noRecords-i-1] = blanklibrary[0];
		}
		return myArray;
	}
	public static void searchTag(BookRecord[]myArray,String tag)
	{
		int start = 0, end = myArray.length-1;
		while(end>=start)
		{
			int middle = (start + end) / 2;
			if ((myArray[middle].getBooksTag().compareTo(tag))==0)
			{
				System.out.println(myArray[middle]);
				return;
			}
			else if ((myArray[middle].getBooksTag().compareTo(tag))>0)
				end = middle - 1;
			else
				start = middle + 1;
		}
		System.out.println("No match found");
	}
	/*public static void Compare(BookRecord []library1,String option1)
	{
		for(int i = 0;i < library1.length;i++)
		{
			if ((library1[i].getBooksGenre()).equals(option1))
			{
				System.out.println(library1[i]);
			}
		}
		return;
	}*/
	
}
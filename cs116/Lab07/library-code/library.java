package library.client.classes;
import java.util.Scanner;
import java.util.Vector;
import java.io.*;
import library.service.classes.BookGenre;
import library.service.classes.BookRecord;
class library{
	Vector <BookRecord> books; //vector of objects
	
	public Vector<BookRecord> sortString(Vector<BookRecord> myArray){//sort the Vector based on strings		
		int insertPt;
		int maxIndex;
		for(int i=myArray.size()-1;i>=1;--i){
			insertPt=i;
			maxIndex=0;
			
			for(int j=1;j<=i;++j){
				//find the index with the max value in this sub array
				if(myArray.get(maxIndex).getTag().compareTo(myArray.get(j).getTag())<0){
					maxIndex=j;					
				}
			}
			//swap values
			BookRecord tmp=myArray.get(insertPt);
			myArray.set(insertPt,myArray.get(maxIndex));
			myArray.set(maxIndex,tmp);
		}
		return myArray;
	}
	public Vector<BookRecord> sortPages(Vector<BookRecord> myArray){//sort the array based on pages
		int insertPt;
		int maxIndex;
		for(int i=myArray.size()-1;i>=1;--i){
			insertPt=i;
			maxIndex=0;
			
			for(int j=1;j<=i;++j){
				//find the index with the max value in this sub array
				if(myArray.get(maxIndex).getPages() < myArray.get(j).getPages()){
					maxIndex=j;					
				}
			}
			//swap values
			BookRecord tmp=myArray.get(insertPt);
			myArray.set(insertPt,myArray.get(maxIndex));
			myArray.set(maxIndex,tmp);
		}
		return myArray;
	}
	
	public void searchByGenre(BookGenre genre){
		
		//loop through the book records and find the number of matches
		int noMatches=0;
		for(int i=0;i<this.books.size();++i){
			if(this.books.get(i).getGenre()==genre){
				noMatches++;
			}
		}
		if(noMatches==0){
			System.out.println("No books of this genre found");
			return;
		}
		Vector<BookRecord> searchResults = new Vector<BookRecord>();
		
		int count=0;
		for(int i=0;i<this.books.size();++i){
			if(this.books.get(i).getGenre()==genre){
				searchResults.add(this.books.get(i));
			}
		}
		//sort the results according to the page lenght
		this.sortPages(searchResults);
		//print out the results
		for(int i=0;i<searchResults.size();++i){
			System.out.println(searchResults.get(i).toString());
		}
	}
	public void searchTag(String tag){
		
		//implement the binary search
		if(this.books.size()==0){
			System.out.println("The library database is empty");
			return;
		}
		
		int first=0;
		int end=this.books.size()-1;
		int mid=(first+end)/2;
		while(first <= end){
			if(this.books.get(mid).getTag().compareTo(tag)==0){
				System.out.println("Found a match");
				System.out.println(this.books.get(mid).toString());
				return;
			}else if(this.books.get(mid).getTag().compareTo(tag)<0){//look at the right half
				first=mid+1;
				mid=(first+end)/2;
			}else if(this.books.get(mid).getTag().compareTo(tag)>0){//look at the left half
				end=mid-1;
				mid=(first+end)/2;
			}			
		}
		System.out.println("No match found");
	}
	public boolean searchForDuplicate(BookRecord aRecord){
		//loop through the library and find duplicates
		//return true if duplicate found 
		//else return false
		if(this.books.size()==0) return false;
		for(int i=0;i<this.books.size();++i){
			if(this.books.get(i).equals(aRecord))
				return true;
		}
		return false;
	}
	public void print(){//list the library
		for(int i=0;i<this.books.size();++i){
			System.out.println(this.books.get(i).toString());
		}	
	}
	
	library(){
		this.books=new Vector<BookRecord>();
	}
	public static void main(String []args)throws IOException{//instantiate the library
	//arg[0]: text file 
		library myLib = new library();
		//read the the files from text files
		String []authors;
		BookRecord aRecord;
		Scanner scan;
		String str;
		try {
			FileOutputStream fileOut = new FileOutputStream("output.ser");
		    ObjectOutputStream output = new ObjectOutputStream(fileOut);//out.writeObject(xxx);then out.close();fileOut.close();
		    PrintWriter outputfile = new PrintWriter("output.txt");
			File myFile=new File(args[0]);
            scan=new Scanner(myFile);//each line has the format title:genre:author-name-1,author-name-2..authorname-m
			while(scan.hasNextLine()){
				str=scan.nextLine();			
				String []tok=str.split(":");
				authors=tok[2].split(",");
				aRecord = new BookRecord(tok[0],tok[1],authors,tok[3],Integer.parseInt(tok[4]));
				//check for duplicate records
				if (!myLib.searchForDuplicate(aRecord)){
					//create a BookRecord object and load it on the array
					myLib.books.add(aRecord);
                    output.writeObject(aRecord.toString());
                    outputfile.println(aRecord.toString());					
				}
				else{
					System.out.println("Found a duplicate");
					String out="";
					out = out + "===================================\n";
					out = out + "Tag:" + aRecord.getTag() + "\n";
					out = out + "Title:" + aRecord.getTitle() + "\n";
					out = out + "Genre: " + aRecord.getGenre() + "\n";
					out = out + "Authors: " + aRecord.getAuthorList() + "\n";
					out = out + "No. of Pages: " + aRecord.getPages() + "\n";
					out = out + "===================================\n";
					System.out.println(out);
				}			
			}
			scan.close();
			output.close();
			fileOut.close();
			outputfile.close();
        }catch(IOException ioe){ 
			System.out.println("The file can not be read");
		}
		//sort the array
		myLib.sortString(myLib.books);
		
		//User interactive part
		String option1, option2;
		int option3;
		scan = new Scanner(System.in);
		while(true){
			System.out.println("Select an option:");
			System.out.println("Type \"S\" to list books of a genre");
			System.out.println("Type \"A\" to add books from a text file");
			System.out.println("Type \"B\" to add serialized book record objects from a file");
			System.out.println("Type \"P\" to print out all the book records");		
			System.out.println("Type \"T\" to search for a record with a specific tag");
			System.out.println("Type \"Q\" to Quit");
			option1=scan.nextLine();
			
			switch (option1) {
				case "S":	System.out.println("Type a genre. The genres are:");
							for (BookGenre d : BookGenre.values()) {
									System.out.println(d);
							}
							option2=scan.nextLine(); //assume the use will type in a valid genre
							myLib.searchByGenre(BookGenre.valueOf(option2));
							break;
				case "A":   System.out.println("Please type the name of text file you want to add: ");
				            System.out.println("Or type the int 1 for txt file and 2 for ser file");
							System.out.println("first line for name and second line for type");
				            option2=scan.nextLine();
							option3=scan.nextInt();
							if (option3==1||option3==2)
							{
								if(option3==1)
								{
									option2 = option2 +".txt";
								}
								if(option3==2)
								{
									option2 = option2 +".ser";
								}
							}
							File inputFile = new File(option2);
				            Scanner file = new Scanner(inputFile);
							while(file.hasNextLine())
							{
								str=file.nextLine();			
				                String []tok=str.split(":");
				                authors=tok[2].split(",");
				                aRecord = new BookRecord(tok[0],tok[1],authors,tok[3],Integer.parseInt(tok[4]));
				                if (!myLib.searchForDuplicate(aRecord)){
					                myLib.books.add(aRecord);			
				                }
				                else{
					                System.out.println("Found a duplicate");
					                String out="";
					                out = out + "===================================\n";
					                out = out + "Tag:" + aRecord.getTag() + "\n";
					                out = out + "Title:" + aRecord.getTitle() + "\n";
					                out = out + "Genre: " + aRecord.getGenre() + "\n";
					                out = out + "Authors: " + aRecord.getAuthorList() + "\n";
					                out = out + "No. of Pages: " + aRecord.getPages() + "\n";
					                out = out + "===================================\n";
					                System.out.println(out);
				                }			
							}
							option2=scan.nextLine();
							System.out.println("File has now add to the library");
							break;
				case "B":   System.out.println("Please type the name of text file you want to add: ");
				            System.out.println("Or type the int 1 for txt file and 2 for ser file");
							System.out.println("first line for name and second line for type");
				            option2=scan.nextLine();
							option3=scan.nextInt();
							if (option3==1||option3==2)
							{
								if(option3==1)
								{
									option2 = option2 +".txt";
								}
								if(option3==2)
								{
									option2 = option2 +".ser";
								}
							}
							File inputFileser = new File(option2);
				            Scanner fileser = new Scanner(inputFileser);
							while(fileser.hasNextLine())
							{
								str=fileser.nextLine();			
				                String []tok=str.split(":");
				                authors=tok[2].split(",");
				                aRecord = new BookRecord(tok[0],tok[1],authors,tok[3],Integer.parseInt(tok[4]));
				                if (!myLib.searchForDuplicate(aRecord)){
					                myLib.books.add(aRecord);			
				                }
				                else{
					                System.out.println("Found a duplicate");
					                String out="";
					                out = out + "===================================\n";
					                out = out + "Tag:" + aRecord.getTag() + "\n";
					                out = out + "Title:" + aRecord.getTitle() + "\n";
					                out = out + "Genre: " + aRecord.getGenre() + "\n";
					                out = out + "Authors: " + aRecord.getAuthorList() + "\n";
					                out = out + "No. of Pages: " + aRecord.getPages() + "\n";
					                out = out + "===================================\n";
					                System.out.println(out);
				                }			
							}
							option2=scan.nextLine();
							System.out.println("File has now add to the library");
							break;
							 
				case "P":   myLib.print();	 
							break;
				
				case "Q":   System.out.println("Quitting program");
							System.exit(0);
							
				case "T":	System.out.println("Input the tag of the book you want to search for:");
							option2=scan.nextLine(); //assume the use will type in a valid tag
							myLib.searchTag(option2);
							break;
							
				default:	System.out.println("Wrong option! Try again");
							break;
			
			}
			
		}
			 
	}
	
}
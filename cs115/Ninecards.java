package carddeck.client.classes;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

import carddeck.service.classes.CardSign;
import carddeck.service.classes.CardValue;
import carddeck.service.classes.Card;

/*Task 2: import neccessary user defined classes if needed*/

class Ninecards{
	Card [] yourHand = new Card[9]; //player's hand, provided in the text file hand.txt
	Card [] houseHand = new Card[9]; //house's hand, randomly generated

    private void generateHouseHand()//method to randomly generate the cards for the house
	{
		String [] suittype = new String[4];
		String [] numtype = new String[13];
		suittype[0] = "SPADE";
		suittype[1] = "CLUB";
		suittype[2] = "DIAMOND";
		suittype[3] = "HEART";
		
		numtype[0] = "ACE";
		numtype[1] = "TWO";
		numtype[2] = "Three";
		numtype[3] = "FOUR";
		numtype[4] = "FIVE";
		numtype[5] = "SIX";
  		numtype[6] = "SEVEN";
		numtype[7] = "EIGHT";
		numtype[8] = "NINE";
		numtype[9] = "TEN";
		numtype[10] = "JACK";
		numtype[11] = "QUEEN";
		numtype[12] = "KING";
		int max1 = 3;
		int max2 = 12;
		int min = 0;
		int rd1,rd2;
		int range1 = max1-min+1;
		int range2 = max2-min+1;
		for (int i = 0;i<9;i++)
		{
			rd1 = (int)(Math.random()*(range1)+min);
			rd2 = (int)(Math.random()*(range2)+min);
            houseHand[i] = new Card(CardSign.valueOf(suittype[rd1]),CardValue.valueOf(numtype[rd2]));
		}
		
		
		/*Task 5: Add code to generate the cards for the house*/
	}
	private int getScore()
	{
		int finalscore = 0;
		for (int p = 0;p<9;p++)
		{
			finalscore += yourHand[p].compareCards(houseHand[p]);
		}
		return finalscore;
		/*Task 6: compare the user's hand with the randomly genereted hand of the house*/
	}	
	public static void main(String []args){
	//arg[0]: file containing your hand
		Ninecards game=new Ninecards();
		//read the the files from text files
		int counter=0;
		Card aCard;
		Scanner scan;
		String str;
		try {
			File myFile=new File(args[0]);
            scan=new Scanner(myFile);//each line has the format title:genre:author-name-1,author-name-2..authorname-m
			while(scan.hasNextLine()){
				str=scan.nextLine();				
				String []tok=str.split(":");
				game.yourHand[counter] = new Card(CardSign.valueOf(tok[0]),CardValue.valueOf(tok[1]));
				counter++;
				/*Task 4: insert the information about the user's cards read from the text file, into the class array */
			}
		//lets play Nine Cards!!
		//User interactive part
		String option1;
		scan = new Scanner(System.in);
		int score;
		while(true){
			System.out.println("Select an option:");
			System.out.println("Type \"P\" to play a round of Nine Cards");			
			System.out.println("Type \"Q\" to Quit");
			option1=scan.nextLine();
			
			switch (option1) {								 
				case "P":   /*generate the cards for the house*/
							game.generateHouseHand();
							/*Compare the house cards with the cards of the user*/
				            score=game.getScore();				            
							if(score < 0)
								System.out.println("House Wins :-(");
							else if (score == 0)
								System.out.println("Its a draw");
							else if (score > 0)
								System.out.println("Congrats You win !!");
							else
								System.out.println("Somethings wrong!");
							break;
				
				case "Q":   System.out.println("Quitting program");
							System.exit(0);
							
				default:	System.out.println("Wrong option! Try again");
							break;
			
			}
			
		}					
		}catch(IOException ioe){ 
			System.out.println("The file can not be read");
		}catch(IllegalArgumentException ia){ 
            System.out.println(ia.getMessage());
		} catch(NullPointerException np){
			System.out.println(np.getMessage());
		}
	}	

}
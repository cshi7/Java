import java.io.*;
import java.util.*;

public class PlayCardGame
{
	public static void main(String[]args)throws IOException
	{
		Scanner scan = new Scanner(System.in);
		
		Card deck[] = new Card[52];
		
		Poker p1 = new Poker();
		Bridge b1 = new Bridge();
		p1.filldeck(deck);
		p1.shuffle(deck);
		
		
		String garbage;
		int cardnum;
		
		//switch the game you want
		System.out.println("'p' for poker, 'b' for bridge, Switch the game you want:   ");
		garbage = scan.nextLine();
		char switchchar = garbage.charAt(0);
		switch(switchchar)
		{
			case'p':case'P': p1.displayDescription();
                    	     Poker p2 = new Poker(deck);
			                 System.out.println("Type the card you want to choose");
							 cardnum = scan.nextInt();
							 p2.deal(cardnum);
							 break;
			case'b':case'B': b1.displayDescription();
			                 Bridge b2 = new Bridge(deck);
							 while(true)
							 {
								 System.out.println("Type the card you want to choose");
							     cardnum = scan.nextInt();
								 b2.deal(cardnum);
							 }
			default:break;
		}
	}
}

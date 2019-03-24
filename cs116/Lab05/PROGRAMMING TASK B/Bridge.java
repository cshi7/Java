import java.util.*;
public class Bridge extends CardGame
{
	private Card player1[] = new Card[13];
	private Card player2[] = new Card[13];
	private String suit;
	private String cardvalue;
	private int counter = 0;
	private Card deck[] = new Card[52];
	private int com = 0;
	private int justify = 0;
	private boolean key = true;

	
	public Bridge()
	{
		
	}
	public Bridge(Card passeddeck[])
	{
		System.out.println("Bridge Game now Ready!");
		for(int i=0;i<13;i++)
		{
			player1[i] = passeddeck[i];
			System.out.println(player1[i].toString() + "  " + "num:" + i);
		}
		System.out.println("================================================================");
		for (int p = 51;p>38;p--)
		{
			player2[counter] = passeddeck[p];
			System.out.println(player2[counter].toString() + "  " + "num:" + counter);
			counter++;
		}
	}
	public void deal(int j)
	{
		String tempvalue = player1[j].getValue();
		if (justify!=0)
		{
			if(!(tempvalue.equals(Valueofcard.values()[com+1])))
			{
				System.out.println("You lose!");
				System.exit(0);
			}
				
		}
		Valueofcard voc[] = Valueofcard.values();
		for (Valueofcard cop1 : voc)
		{
			if (tempvalue.equals(cop1))
			{
				com = cop1.ordinal()+1;
				break;
			}
		}
        for(int a = 0;a<13;a++)
		{
			if((player2[a].getValue()).equals(Valueofcard.values()[com]))
			{
				justify++;
				key = false;
				break;
			}
		}
		if(key)
		{
			System.out.println("You win!");
			System.exit(0);
		}
	}
	public void displayDescription()
	{
		System.out.println("=====================================");
		System.out.println("Here is the brief introduction for Bridge game!");
		System.out.println("You will choose a card, and the card will be the beginning.");
		System.out.println("Computer will try to follow your card.");
		System.out.println("Here is the sequence: ace, two, three, ... ten, jack, queen, king!");
		System.out.println("For example, if you choose card with value ace, the computer will try to choose two.");
		System.out.println("If computer have no two, you win.");
		System.out.println("On the other hand, if computer have two and you don't have three, you lose!");
		System.out.println("That's all of the rule, have fun!");
		System.out.println("=====================================");
	}
	enum Valueofcard
	{
		Ace,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Jack,Queen,King;
	}
	enum Suitofcard
	{
		Diamonds,Clubs,Hearts,Spades;
	}
}
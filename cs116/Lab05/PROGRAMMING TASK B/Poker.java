import java.util.*;
public class Poker extends CardGame
{
	private Card player1[] = new Card[5];
	private Card player2[] = new Card[5];
	private String suit;
	private String cardvalue;
	private int counter;
	private Card deck[] = new Card[52];
	
	public Poker()
	{
		
	}
	public Poker(Card passeddeck[])
	{
		System.out.println("Poker Game now Ready!");
		for(int i=0;i<5;i++)
		{
			player1[i] = passeddeck[i];
			System.out.println(player1[i].toString() + "  " + "num:" + i);
		}
		for (int p = 0;p<5;p++)
		{
			counter = p+5;
			player2[p] = passeddeck[counter];
		}
		
	}
	public void deal(int j)
	{
		Random ran = new Random();
		int garbage1 = ran.nextInt(5);
		int garbage2=0;
		int garbage3=0;
		int garbage4=0;
		int garbage5=0;
		
		Card dealcard1 = new Card();
		Card dealcard2 = new Card();
		dealcard1 = player1[j];
		dealcard2 = player2[garbage1];
		System.out.println("Deal the card now!");
		
		Valueofcard voc[] = Valueofcard.values();
		for(Valueofcard cop : voc)
		{
			if ((dealcard1.getValue()).equals(cop))
			{
				garbage2 = cop.ordinal();
			}
			if ((dealcard2.getValue()).equals(cop))
			{
				garbage3 = cop.ordinal();
			}
		}
		Suitofcard soc[] = Suitofcard.values();
		for(Suitofcard cop1 : soc)
		{
			if ((dealcard1.getSuit()).equals(cop1))
			{
				garbage4 = cop1.ordinal();
			}
			if ((dealcard2.getSuit()).equals(cop1))
			{
				garbage5 = cop1.ordinal();
			}
		}
		garbage2 = garbage2*garbage4;
		garbage3 = garbage3*garbage5;
		if (garbage2>=garbage3)
		{
			System.out.println("You win!");
		}
		else
		{
			System.out.println("Computer win!");
		}
	}
	
	public void displayDescription()
	{
		System.out.println("=====================================");
		System.out.println("Here is the brief introduction for poker game!");
		System.out.println("You will receive 5 five cards, each card has a suit,value and a num");
		System.out.println("You will choose a card to compare with the computer, computer's card is randomly");
		System.out.println("You will choose a biggest card, it will be the product of suit and value");
		System.out.println("For suit, diamonds is 1, clubs is 2, hearts is 3 and spades is 4");
		System.out.println("For value, ace is 1, two is 2, etc... for jack is 11, queen is 12, and king is 13");
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
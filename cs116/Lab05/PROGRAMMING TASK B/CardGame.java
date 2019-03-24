import java.util.*;
public abstract class CardGame
{
	private String suit;
	private String cardvalue;
	private int counter;
	private Card deck[] = new Card[52];
	
	public void filldeck(Card passdeck[])
	{
		counter = 0;
		String suitname[] ={"Diamonds","Clubs","Hearts","Spades"};
		String cardvaluename[] ={"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
	    for (int i = 0;i<4;i++)
		{
			for (int j = 0;j<13;j++)
			{
				passdeck[counter] = new Card(suitname[i],cardvaluename[j]);
				counter++;
			}
		}			
	}
	public void shuffle(Card passdeck[])
	{
		Random ran = new Random();
		int garbage1,garbage2;
		Card garbage3 = new Card();
		for (int p = 0; p < 52; p++)
		{
		    garbage1 = ran.nextInt(51);
			garbage2 = ran.nextInt(51);
			garbage3 = passdeck[garbage1];
			passdeck[garbage1] = passdeck[garbage2];
			passdeck[garbage2] = garbage3;
		}
	}
	
    abstract void displayDescription();
	abstract void deal(int j);

	/*
	public String toString()
	{
		String temp = "";
		temp = temp + this.getSuit() +" of " + this.getValue();
		return temp;
	}
	public String Card()
	{
		suit = "";
		cardvalue = "";
	}
	public String Card(String passedsuit, String passedcardvalue)
	{
		suit = passedsuit;
		cardvalue = passedcardvalue;
	}*/
}
public class Card
{
	private String suit;
	private String cardvalue;
	
	public Card()
	{
		suit = "";
		cardvalue = "";
	}
	public Card(String passedsuit, String passedcardvalue)
	{
		suit = passedsuit;
		cardvalue = passedcardvalue;
	}
	public String getSuit()
	{
		return suit;
	}
	public String getValue()
	{
		return cardvalue;
	}
	public String toString()
	{
		String temp = "";
		temp = temp + this.getValue() + " of " + this.getSuit();
		return temp;	
	}
}
package carddeck.service.classes;
import carddeck.service.classes.CardSign;
import carddeck.service.classes.CardValue;
/*Task 2 import neccessary user defined classes if needed*/
public class Card {
   private CardSign sign;
   private CardValue value;
   
public Card(CardSign sign, CardValue value) {   // constructor
      this.sign = sign;
      this.value = value;
   }
   
   public CardSign getSign() { return this.sign; }
   
   public CardValue getValue() { return this.value; }
   
   public String toString() { return "This card is " + this.sign + " of " + this.value; }
   
   public int compareCards(Card aCard)
   {
	   if(this.sign.compareTo(aCard.getSign()) < 0)
	    {
		   return -1;
	    }
	   else if(this.sign.compareTo(aCard.getSign()) >0)
	    {
			return 1;
		}
		else if(this.value.compareTo(aCard.getValue()) >0)
		{
		   return 1;
	    }
		else if(this.value.compareTo(aCard.getValue()) <0)
		{
			return -1;
		}
		else 
			return 0;
	   
	   //return -1 if this card object is less than the parameter aCard's, 0 if they are equal and 1 if this card object is greater than aCard's 
	  /*Task 3 Code to compare two cards*/  
   }
}
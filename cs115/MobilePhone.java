public class MobilePhone
{
	private String brand;
	private double price;
	private final double MAXPRICE = 20000;
	private final double MINPRICE = 500;
	
	public MobilePhone()
	{
       brand = "None";
       price = 0.0;
	}
	
	public String GetBrand()
	{
		return brand;
	}
	
	public double GetPrice()
	{
		return price;
	}
	
	public void SetBrand(String b)
	{
		brand = b;
		return;
	}
	
	public boolean SetPrice(double passedprice)
	{
		if (passedprice >= MINPRICE&&passedprice <= MAXPRICE)
		{
			price = passedprice;
			return true;
		}
		else
			return false;
		
	}
	
}
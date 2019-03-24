public class Television
{
	private String brand;
	private double price;
	private final double MAXPRICE = 100000;
	public Television()
	{
		String brand = "  ";
		double price = 0.0;
	}
	public String GetBrand()
	{
		return brand;
	}
	public double GetPrice()
	{
		return price;
	}
	public boolean SetPrice(double passedPrice)
	{
		if (passedPrice <= MAXPRICE&&passedPrice >= 0)
		{
			price = passedPrice;
			return true;
		}
		else
		{
			return false;
		}
	}
	public String SetBrand(String passedBrand)
	{
		brand = passedBrand.toString();
		return brand;
	}
}
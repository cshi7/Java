public class IceCreamCone
{
	private int scoops;
	private String flavor;
	
	public IceCreamCone(int passedscoops,String passedflavor)throws IceCreamConeException
	{
		System.out.println("IceCreamConeException thrown");
		this.setScoops(passedscoops);
		this.setFlavor(passedflavor);
	}
	public void setScoops(int n)throws IceCreamConeException
	{
		if (n>3)
		{
			System.out.println("The number of scoops: " + n + " exceeds the max.");
			throw new IceCreamConeException("The number of scoops: " + n + " exceeds the max.");
		}
		else 
		    scoops = n;
	}
	public void setFlavor(String passedflavor)throws IceCreamConeException
	{
		if ((!passedflavor.equals("vanilla"))&&(!passedflavor.equals("chocolate")))
		{
			System.out.println("The flavor of icecream: " + passedflavor + " is not chocolate or vanilla.");
			throw new IceCreamConeException("The flavor of icecream: " + passedflavor + " is not chocolate or vanilla.");
		}
		else 
		    flavor = passedflavor;
	}
}
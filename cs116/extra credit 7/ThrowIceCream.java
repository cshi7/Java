public class ThrowIceCream
{
	public static void main(String[]args)
	{
	    try
	    {
		    IceCreamCone icc = new IceCreamCone(4,"chocova");
	    }
	    catch(IceCreamConeException icex)
	    {
		    System.out.println(icex.getMessage());
	    }
	}
}
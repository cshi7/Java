public class normalbook extends record
{
	private String Enumb = "";
	
	public normalbook()
	{
		super();
		Enumb = "None";
	}
	public normalbook(String passedtitle,String passeddatapub, String passedEnumb)
	{
		super(passedtitle,passeddatapub);
		Enumb = passedEnumb;
	}
	public void setEnumb(String a)
	{
		Enumb = a;
	}
	public String getEnumb()
	{
		return Enumb;
	}
	public String toString()
	{
		String ret = "";
		ret = ret + super.toString();
		ret = ret + "Enumb is :" + this.getEnumb() + "\n";
		return ret;
	}
}
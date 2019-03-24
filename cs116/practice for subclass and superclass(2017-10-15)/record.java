public class record
{
	private int id;
	public static int cnt = 1000;
	private String Title = "";
	private String datapub = "";
	
	public record()
	{
		this.setId();
		Title = "No Title";
		datapub = "99-99-9999";
	}
	public record(String passedtitle, String passeddata)
	{
		this.setId();
		Title = passedtitle;
		datapub = passeddata;
	}
	public void setId()
	{
		id = cnt++;
	}
	public void setTitle(String a)
	{
		Title = a;
	}
	public void setDatapub(String b)
	{
		datapub = b;
	}
	public int getId()
	{
		return id;
	}
	public String getTitle()
	{
		return Title;
	}
	public String getDatapub()
	{
		return datapub;
	}
	public String toString()
	{
		String ret = "";
		ret= ret + "ID: " + this.getId() + "\n";
		ret= ret + "Title: " + this.getTitle() + "\n";
		ret= ret + "Date of Publishing: " + this.getDatapub() + "\n";
		return ret;
	}
}
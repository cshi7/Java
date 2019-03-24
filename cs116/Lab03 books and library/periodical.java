public class periodical extends record
{
	private String editor = "";
	
	public periodical()
	{
		super();
		editor = "None";
	}
	public periodical(String passedtitle,String passeddata, String passededitor)
	{
		super(passedtitle,passeddata);
		editor = passededitor;
	}
	public void setEditor(String a)
	{
		editor = a;
	}
	public String getEditor()
	{
		return editor;
	}
	public String toString()
	{
		String ret = "";
		ret = ret + super.toString();
		ret = ret + "Editor: " + this.getEditor() + "\n";
		return ret;
	}
}













/*class Periodical extends Record{
	private String editor="";
	
	Periodical(){
		super();
		this.setEditor("NoEditor");		
	}
	Periodical(String newTitle, String newDatePub, String newEditor){
		super(newTitle, newDatePub);
		this.setEditor(newEditor);		
	}
	public String getEditor(){
		return this.editor;
	}
	public void setEditor(String newEditor){
		this.editor = newEditor;
	}
	public String toString(){
		String ret = "";
		ret =ret + super.toString();
		ret= ret + "Editor: " + this.getEditor() + "\n";
		return ret;
	}
}*/
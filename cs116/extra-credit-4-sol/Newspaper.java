class Newspaper extends Periodical{
	private String edition="";
	
	Newspaper(){
		super();
		this.setEdition("NoEdition");		
	}
	Newspaper(String newTitle, String newDatePub, String newEditor, String newEdition){
		super(newTitle, newDatePub, newEditor);
		this.setEdition(newEdition);		
	}
	public String getEdition(){
		return this.edition;
	}
	public void setEdition(String newEdition){
		this.edition = newEdition;
	}
	public String toString(){
		String ret = "";
		ret =ret + super.toString();
		ret = ret + "Edition: " + this.getEdition() + "\n";		
		return ret;
	}	
}
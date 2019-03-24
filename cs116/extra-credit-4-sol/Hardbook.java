class Hardbook extends Book{
	private String edition="";
	
	Hardbook(){
		super();
		this.setEdition("NoEdition");		
	}
	Hardbook(String newTitle, String newDatePub,String newAuthor, String newEdition){
		super(newTitle,newDatePub, newAuthor);
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
		ret= ret + "Edition: " + this.getEdition() + "\n";
		return ret;
	}	
}
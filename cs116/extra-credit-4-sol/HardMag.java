class HardMag extends Magazine{
	private String edition;
		
	HardMag(){
		super();
		this.setEdition("NoEdition");		
	}
	HardMag(String newTitle, String newDatePub, String newEditor, int newIssueNo, int newVolNo, String newEdition){
		super(newTitle, newDatePub,newEditor,newIssueNo,newVolNo);
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
		ret = ret + super.toString();
		ret = ret + "Edition: " + this.getEdition() + "\n";		
		return ret;
	}
}
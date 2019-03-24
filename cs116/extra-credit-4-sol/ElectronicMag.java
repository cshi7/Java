class ElectronicMag extends Magazine{
	private String url;	
	
	ElectronicMag(){
		super();
		this.setUrl("NoUrl");		
	}
	ElectronicMag(String newTitle, String newDatePub, String newEditor, int newIssueNo, int newVolNo, String newUrl){
		super(newTitle, newDatePub,newEditor,newIssueNo,newVolNo);
		this.setUrl(newUrl);		
	}
	public String getUrl(){
		return this.url;
	}	
	public void setUrl(String newUrl){
		this.url = newUrl;
	}	
	public String toString(){
		String ret = "";
		ret = ret + super.toString();
		ret = ret + "URL: " + this.getUrl() + "\n";		
		return ret;
	}
}
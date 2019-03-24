class Ebook extends Book{
	private String url="";
	
	Ebook(){
		super();
		this.setUrl("NoUrl");		
	}
	Ebook(String newTitle, String newDatePub,String newAuthor, String newUrl){
		super(newTitle,newDatePub,newAuthor);
		this.setUrl(newUrl);		
	}
	public String getUrl(){
		return this.url;
	}
	public void setUrl(String newUrl){
		this.url = newUrl;
	}
	public String toString(){
		String ret= super.toString();
		ret= ret + "URL: " + this.getUrl() + "\n";
		return ret;
	}	
}
class Book extends Record{
	private String author;
	
	Book(){
		super();
		this.setAuthor("NoAuthor");		
	}
	Book(String newTitle, String newDatePub,String newAuthor){
		super(newTitle,newDatePub);
		this.setAuthor(newAuthor);		
	}
	public String getAuthor(){
		return this.author;
	}
	public void setAuthor(String newAuthor){
		this.author = newAuthor;
	}
	public String toString(){
		String ret= super.toString();
		ret= ret + "Author(s): " + this.getAuthor() + "\n";
		return ret;
	}
}
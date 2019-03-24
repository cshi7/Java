class Record{
	private int id;
	public static int cnt=1000;
	private String title="";
	private String datePub="";
	
	Record(){
		this.setId();
		this.setTitle("NoTitle");
		this.setDatePub("99-99-9999");
	}
	Record(String newTitle, String newDatePub){
		this.setId();
		this.setTitle(newTitle);
		this.setDatePub(newDatePub);
	}
	public int getId(){
		return this.id;
	}
	public String getTitle(){
		return this.title;
	}
	public String getDatePub(){
		return this.datePub;
	}
	public void setId(){
		this.id = Record.cnt++;
	}
	public void setTitle(String newTitle){
		this.title = newTitle;
	}
	public void setDatePub(String newDate){
		this.datePub = newDate;
	}
	public String toString(){
		String ret = "";
		ret= ret + "ID: " + this.getId() + "\n";
		ret= ret + "Title: " + this.getTitle() + "\n";
		ret= ret + "Date of Publishing: " + this.getDatePub() + "\n";
		return ret;
	}
}
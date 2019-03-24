class Magazine extends Periodical{
	private int issueNo;
	private int volNo;
	
	Magazine(){
		super();
		this.setIssueNo(-1);		
	}
	Magazine(String newTitle, String newDatePub, String newEditor, int newIssueNo, int newVolNo){
		super(newTitle, newDatePub,newEditor);
		this.setIssueNo(newIssueNo);
		this.setVolNo(newVolNo);
	}
	public int getIssueNo(){
		return this.issueNo;
	}
	public int getVolNo(){
		return this.volNo;
	}
	public void setIssueNo(int newIssueNo){
		this.issueNo = newIssueNo;
	}
	public void setVolNo(int newVolNo){
		this.volNo = newVolNo;
	}
	public String toString(){
		String ret = "";
		ret = ret + super.toString();
		ret = ret + "Issue No.: " + this.getIssueNo() + "\n";
		ret = ret + "Volume No.: " + this.getVolNo() + "\n";
		return ret;
	}
}
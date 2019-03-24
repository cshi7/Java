package library.service.classes;

public class BookRecord
{
	private String BooksName;
	private String BooksAuthor;
	private String BooksGenre;
	private String Tag;
	private int Pages;
	private static int BookID;
	private int id;
	
	public BookRecord(String a,String b,String c,String d,String e)
	{
		BooksName = a;
		BooksGenre = b;
	    BooksAuthor = c;
		Tag = d;
		Pages = Integer.parseInt(e);
		BookID++;
		id = 10000 + BookID;
	}
	public boolean equalsornot(BookRecord a1, BookRecord b1)
	{
		if ((a1.getBooksName()).equals(b1.getBooksName())&&(a1.getBooksGenre()).equals(b1.getBooksGenre())&&(a1.getBooksAuthor()).equals(b1.getBooksAuthor())
			&&(a1.getBooksTag()).equals(b1.getBooksTag())&&(a1.getBooksPages())==(b1.getBooksPages()))
			return true;
		else 
			return false;
	}
	
	public String getBooksName()
	{
		return BooksName;
	}
	public String getBooksGenre()
	{
		return BooksGenre;
	}
	public String getBooksAuthor()
	{
		return BooksAuthor;
	}
	public String getBooksTag()
	{
		return Tag;
	}
	public int getBooksPages()
	{
		return Pages;
	}
	public void setBooksName(String pbn)
	{
		BooksName = pbn;
		return;
	}
	public void setBooksGenre(String pbg)
	{
		BooksGenre = pbg;
		return;
	}
	public void setBooksAuthor(String pba)
	{
		BooksAuthor = pba;
		return;
	}
	public void setBooksTag(String pbt)
	{
		Tag = pbt;
		return;
	}
	public void setBooksPages(String pbp)
	{
		Pages = Integer.parseInt(pbp);
		return;
	}
	public String toString()
	{
		return "===================" + "\n" 
		       + "Record No:" + id + "\n"
			   + "Title:" + BooksName + "\n"
			   + "Genre:" + BooksGenre + "\n"
			   + "Authors:" + BooksAuthor + "\n"
			   + "Tag:" + Tag + "\n"
			   + "Pages:" + Pages + "\n"
			   +"===================" + "\n"
			   +"\n";
	}
	
}
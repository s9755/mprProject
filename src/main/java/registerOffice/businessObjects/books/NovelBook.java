package registerOffice.businessObjects.books;

import javax.persistence.Entity;

@Entity
public class NovelBook extends Book{


	//konstruktory
	public NovelBook(String title, long isbn)
	{
		this.title=title;
		this.isbn=isbn;
	}
	
	public NovelBook(long isbn)
	{
		this("",isbn);
	}

	@Override
	public String getBookDetails() {
		
		return "\""+title+"\" " + author +" "+isbn;
	}

}

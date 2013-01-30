package registerOffice.businessObjects.books;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ComicBook extends Book{

	@Column(name="Ilustracje")
	private String drawings;
	
	public ComicBook(String title, long isbn,  String drawings)
	{
		this.title=title;
		this.isbn=isbn;
		this.drawings=drawings;
	}
	
	public ComicBook(long isbn)
	{
		this("",isbn,"");
	}
	
	public String getDrawings() {
		return drawings;
	}

	public void setDrawings(String drawings) {
		this.drawings = drawings;
	}

	@Override
	public String getBookDetails() {
		return title +" "+ author + " " + isbn + " " + drawings;
	}

}


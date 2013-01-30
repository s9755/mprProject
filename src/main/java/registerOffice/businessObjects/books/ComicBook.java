package registerOffice.businessObjects.books;

import javax.persistence.Column;
import javax.persistence.Entity;

import registerOffice.businessObjects.persons.Person;

@Entity
public class ComicBook extends Book{

	@Column(name="Ilustracje")
	private String drawings;
	
	public ComicBook(String title, /*Person author,*/ String isbn,  String drawings)
	{
		this.title=title;
		/*this.author=author;*/
		this.isbn=isbn;
		this.drawings=drawings;
	}
	
	public ComicBook()
	{
		this("","","");
	}
	
	public String getDrawings() {
		return drawings;
	}

	public void setDrawings(String drawings) {
		this.drawings = drawings;
	}

	@Override
	public String getBookDetails() {
		// TODO Auto-generated method stub
		return "This is a comicbook.";
	}

	@Override
	public Book Clone() {
		// TODO Auto-generated method stub
		return null;
	}
}


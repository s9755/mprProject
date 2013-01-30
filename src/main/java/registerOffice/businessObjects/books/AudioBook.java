package registerOffice.businessObjects.books;

import javax.persistence.Column;
import javax.persistence.Entity;

import registerOffice.businessObjects.persons.Person;

@Entity
public class AudioBook extends Book{

	@Column(name="Długość_nagrania")
	private double length;
	
	public AudioBook(String title, /*Person author,*/ String isbn,  double length)
	{
		this.title=title;
		/*this.author=author;*/
		this.isbn=isbn;
		this.length=length;
	}
	

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String getBookDetails() {
		// TODO Auto-generated method stub
		return title +" "+ author + " " + isbn + " " + length;
	}

	@Override
	public Book Clone() {
		// TODO Auto-generated method stub
		return null;
	}
}


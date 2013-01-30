package registerOffice.businessObjects.books;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AudioBook extends Book{

	@Column(name="Długość_nagrania")
	private double length;
	
	public AudioBook(String title, long isbn,  double length)
	{
		this.title=title;
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
		
		return title +" "+ author + " " + isbn + " " + length;
	}

}


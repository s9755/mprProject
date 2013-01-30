package registerOffice.businessObjects.books;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import registerOffice.businessObjects.persons.Person;

@Entity
public abstract class Book implements BookInterface{

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="Tytuł")
	protected String title;

	@Column(name="Numer_ISBN")
	protected long isbn;
	
	@ManyToOne
	protected Person author;
	
	public void printData()
	{
		System.out.println("Author: "+author.getName());
		System.out.println(getBookDetails());
	}
	
	public abstract String getBookDetails();
	
	
	public void setAuthor(Person author)
	{
		this.author=author;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Person getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

}

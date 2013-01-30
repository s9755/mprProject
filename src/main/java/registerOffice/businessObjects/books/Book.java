package registerOffice.businessObjects.books;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import registerOffice.businessObjects.persons.Person;

@Entity
public abstract class Book implements BookInterface{

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="Tytuł")
	protected String title;

	@Column(name="Numer_ISBN")
	protected String isbn;
	
	@ManyToOne
	protected Person author;
	
	
//	@Transient
//	Context context;
//	public Book(){
//		context =Context.getInstance();
//		context.raiseNumberOfBooks();
//	}
	
	public void printData()
	{
		System.out.println("Author: "+author.getName());
		System.out.println(getBookDetails());
	}
	
	public abstract String getBookDetails();
	
	public abstract Book Clone();
	
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	

//	@Override
//	protected void finalize() throws Throwable {
//		context.reduceBooks();
//		super.finalize();
//	}
	
}

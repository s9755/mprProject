package registerOffice.businessObjects.books;

import javax.persistence.Entity;

import registerOffice.businessObjects.persons.Person;


@Entity
public class NovelBook extends Book{

	//pole statyczne
	
	//pola prywatne
	
	//pola publiczne
	
	//konstruktory
	public NovelBook(String title, Person author, String isbn)
	{
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	
//	public NovelBook()
//	{
//		this("","","");
//	}
	
	//wlasciwosci
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}


	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	//metody
	

	@Override
	public String getBookDetails() {
		// TODO Auto-generated method stub
		return title+" " + author +" "+isbn;
	}

	@Override
	public Book Clone() {
		
//		NovelBook returnValue =new NovelBook();
//		returnValue.setIsbn(this.isbn);
		
		//return returnValue;
		return null;
	}
}

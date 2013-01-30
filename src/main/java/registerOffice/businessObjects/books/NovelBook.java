package registerOffice.businessObjects.books;

import javax.persistence.Entity;

import registerOffice.businessObjects.persons.Person;


@Entity
public class NovelBook extends Book{

	//pole statyczne
	
	//pola prywatne
	
	//pola publiczne
	
	//konstruktory
	public NovelBook(String title,/* Person author,*/ String isbn)
	{
		this.title=title;
		/*this.author=author;*/
		this.isbn=isbn;
	}
	
//	public NovelBook()
//	{
//		this("","","");
//	}
	
	//wlasciwosci

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

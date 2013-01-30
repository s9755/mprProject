package registerOffice.management;

import java.util.ArrayList;
import java.util.List;

import registerOffice.businessObjects.books.Book;
import registerOffice.businessObjects.persons.Person;

public class DatabaseContext {

	private static List<Person> persons=new ArrayList<Person>();
	private static List<Book> books=new ArrayList<Book>();
	
	public static List<Person> getPersons() {
		return persons;
	}
	public static List<Book> getBooks() {
		return books;
	}
	
	
}

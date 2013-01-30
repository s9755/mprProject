package registerOffice;

import java.sql.SQLPermission;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import registerOffice.businessObjects.books.AudioBook;
import registerOffice.businessObjects.books.Book;
import registerOffice.businessObjects.books.ComicBook;
import registerOffice.businessObjects.books.NovelBook;
import registerOffice.businessObjects.persons.*;
import registerOffice.management.*;
import registerOffice.management.conditions.Condition;
import registerOffice.management.conditions.GetByAddressCondition;
import registerOffice.management.conditions.GetByNameCondition;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		ManagerInterface<Person> hib= 
				new HibernatePersonManager(session);
				
		
		Person adam = new Person("Adam", "1234", "Brzegi 55");
		Person jurek = new Person("Jurek", "1234", "Brzegi 55");
		Person maciek = new Person("Maciek", "1234", "Brzegi 55");
		Book zly = new NovelBook("Zły", "123456789");
		ComicBook nowyWspanialySwiat = new ComicBook("Nowy Wspaniały Świat", "443451189", "Matt Groening");
		AudioBook mamama = new AudioBook("Nowy Wspaniały Świat","443451189", 4.22);
		zly.setAuthor(adam);
		nowyWspanialySwiat.setAuthor(jurek);
		mamama.setAuthor(maciek);
		nowyWspanialySwiat.setAuthor(adam);
		adam.getBook().add(zly);
		jurek.getBook().add(nowyWspanialySwiat);
		maciek.getBook().add(mamama);
		
		
		hib.save(adam);
		hib.save(jurek);
		hib.save(maciek);
		
		List<Person>results = hib.getAll();
		
		for(Person p :results)
		{
			System.out.println(p.getName());
		}
		
	}

}

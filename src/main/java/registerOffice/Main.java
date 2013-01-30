package registerOffice;

import java.sql.SQLPermission;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
		Book zly = new NovelBook("Zły", adam,"123456789");
		Book nowyWspanialySwiat = new NovelBook("Nowy Wspaniały Świat", adam,"443451189");
		zly.setAuthor(adam);
		nowyWspanialySwiat.setAuthor(adam);
		adam.getBook().add(zly);
		adam.getBook().add(nowyWspanialySwiat);
		
		hib.save(adam);
		
		List<Person>results = hib.getAll();
		
		for(Person p :results)
		{
			System.out.println(p.getName());
		}
		
	}

}

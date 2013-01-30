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
				
		// dodajemy autorów
		Person aldHux = new Person("Aldonus", "Huxley", "Anglik");
		Person johWol = new Person("Johann Wolfgang", "Goethe", "Niemiec");
		Person chaBuk = new Person("Charles", "Bukowski", "Amerykanin");
		Person aleKam = new Person("Aleksander", "Kamiński", "Polak");
		
		// dodajemy powieści
		Book nowWsp = new NovelBook("Nowy Wspaniały Świat", 978837758);
		Book wyspa = new NovelBook("Wyspa", 978837414);
		Book malDuc = new NovelBook("Małpa i Duch", 978837514);
		
		Book cieMlo = new NovelBook("Cierpienia młodego Wertera", 670044123);
		Book latNau = new NovelBook("Lata nauki Wilhelma Meistra", 670044323);
		Book powZwy = new NovelBook("Powinowactwo z wyboru", 670044351);
		
		Book liston = new NovelBook("Listonosz", 170244331);
		Book faktot = new NovelBook("Faktotum", 170244459);
		Book kobiet = new NovelBook("Kobiety", 170244937);
		
		Book kamNas = new NovelBook("Kamienie na szaniec", 543789122);
		Book zosPar = new NovelBook("Zośka i Parasol", 543789155);
		Book jacwie = new NovelBook("Jaćwież", 543789751);
		
		// dodajemy audiobooki
		Book aNowWsp = new AudioBook("Nowy Wspaniały Świat", 978837759, 274.22);
		Book aCieMlo = new AudioBook("Cierpienia młodego Wertera", 670044124, 170.90);
		Book aKobiet = new AudioBook("Kobiety", 170244937, 189);
		Book aKamNas = new AudioBook("Kamienie na szaniec", 543789122, 150.5);
				
		// łączymy książki z autorami
		nowWsp.setAuthor(aldHux);
		wyspa.setAuthor(aldHux);
		malDuc.setAuthor(aldHux);
		aNowWsp.setAuthor(aldHux);
		
		cieMlo.setAuthor(johWol);
		latNau.setAuthor(johWol);
		malDuc.setAuthor(johWol);
		aCieMlo.setAuthor(johWol);
		
		liston.setAuthor(chaBuk);
		faktot.setAuthor(chaBuk);
		kobiet.setAuthor(chaBuk);
		aKobiet.setAuthor(chaBuk);
	
		kamNas.setAuthor(aleKam);
		zosPar.setAuthor(aleKam);
		jacwie.setAuthor(aleKam);
		aKamNas.setAuthor(aleKam);
		
		aldHux.getBook().add(nowWsp);
		aldHux.getBook().add(wyspa);
		aldHux.getBook().add(malDuc);
		aldHux.getBook().add(aNowWsp);
		
		
//		nowyWspanialySwiat.setAuthor(jurek);
//		mamama.setAuthor(maciek);
//		nowyWspanialySwiat.setAuthor(adam);
//		adam.getBook().add(zly);
//		jurek.getBook().add(nowyWspanialySwiat);
//		maciek.getBook().add(mamama);
//		
//		
		hib.save(aldHux);
		hib.save(chaBuk);
		hib.save(johWol);
		hib.save(aleKam);
		
		List<Person>results = hib.getAll();
		
		for(Person p :results)
		{
			System.out.println(p.getName());
		}
		
	}

}

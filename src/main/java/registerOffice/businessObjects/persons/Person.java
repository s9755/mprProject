package registerOffice.businessObjects.persons;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;


import registerOffice.businessObjects.books.*;


@Entity
@Table(name = "Osoby")
@NamedQueries({
	@NamedQuery(
			name="Person.all",
			query="from Person p"
			),
	@NamedQuery(
			name="Person.id",
			query="from Person p where id= :id"
			),
	@NamedQuery(
			name="Person.delete",
			query="Delete from Person p where id=:id"
			)
})
public class Person {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="Imie")
	private String name;
	
	@OneToMany(mappedBy="author", cascade = CascadeType.PERSIST)
	private List<Book> books;
	
	@Column(name="Nazwisko")
	private String surname;
	
	@Column(name="Narodowość")
	private String nationality;

	public Person(String name, String pesel, String nationality)
	{
		this(name,pesel);
		this.nationality=nationality;
	}
	public Person(String name, String surname)
	{
		this.surname=surname;
		this.name=name;
		this.books=new ArrayList<Book>();
	}
	
	public Person(String name) {
		
		this(name,"");
	}
	
	public Person()
	{
		
		this("","");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBook() {
		return books;
	}
	public void setCars(List<Book> books) {
		this.books = books;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	
}

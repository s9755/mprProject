package registerOffice.management.conditions;

import registerOffice.businessObjects.persons.Person;

public class GetBySurnameCondition extends Condition<Person>{

	private String surname;
	
	public GetBySurnameCondition(String surname)
	{
		this.surname=surname;
	}
	
	@Override
	protected boolean check(Person obj) {
		
		return obj.getSurname().equalsIgnoreCase(surname);
	}

}

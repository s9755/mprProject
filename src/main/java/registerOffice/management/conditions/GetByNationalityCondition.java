package registerOffice.management.conditions;

import registerOffice.businessObjects.persons.Person;

public class GetByNationalityCondition extends Condition<Person>{

	private String nationality;
	
	public GetByNationalityCondition(String nationality)
	{
		this.nationality=nationality;
	}
	
	@Override
	protected boolean check(Person obj) {
		// TODO Auto-generated method stub
		return obj.getNationality().equalsIgnoreCase(nationality);
	}

}

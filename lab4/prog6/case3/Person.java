package lab4.prog6.case3;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(this.getClass() != ob.getClass()) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
    PersonWithJob pj1 = new PersonWithJob("Quy", new GregorianCalendar(2017,12,15), 200000);
    PersonWithJob pj2 = new PersonWithJob("Bi", new GregorianCalendar(2018,01,15), 200000);
    PersonWithJob pj3 = new PersonWithJob("Quy", new GregorianCalendar(2017,12,15), 200000);
    Person pj4 = new Person("Quy", new GregorianCalendar(2017,12,15));
    
    System.out.println(pj1.equals(pj2));
    System.out.println(pj1.equals(pj3));
    System.out.println(pj1.equals(pj4));
  }

}

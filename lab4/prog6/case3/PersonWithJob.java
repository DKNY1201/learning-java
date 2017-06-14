package lab4.prog6.case3;

import java.util.GregorianCalendar;

public class PersonWithJob{
	private double salary;
	Person person;
	
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
	  person = new Person(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public boolean equals(Object ob) {
	  if (ob == null) {
	    return false;
	  }
	  
	  if (this.getClass() != ob.getClass()) {
	    return false;
	  }
	  
	  PersonWithJob personWithJob = (PersonWithJob) ob; 
	  return this.person.equals(personWithJob.person) && this.getSalary() == personWithJob.getSalary();
	}
}

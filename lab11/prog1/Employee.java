package lab11.prog1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord;
	
	Employee() {
	  salaryRecord = new HashMap<String, Double>();
	}
	
	public void addEntry(String date, double salary) {
	  salaryRecord.put(date, salary);
	}
	
	public void printPaymentAmount(String date) {
	  if (salaryRecord.containsKey(date)) {
	    System.out.println(this.getFirstName() + " " + this.getLastName() + " was paid " + salaryRecord.get(date) + " on " + date);
	  } else {
	    System.out.println(this.getFirstName() + " " + this.getLastName() + " did not receive a paycheck on " + date);
	  }
	}
	
	public void printAveragePaycheck() {
		Set<String> keyArr = this.salaryRecord.keySet();
		
		double totalPaycheck = 0;
		for (String key: keyArr) {
		  totalPaycheck += (double) this.salaryRecord.get(key);
		}
		
		System.out.println("Average paycheck for " + this.getFirstName() + " " + this.getLastName()  + " was " + totalPaycheck / this.salaryRecord.size());
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

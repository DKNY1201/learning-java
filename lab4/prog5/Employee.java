package lab4.prog5;

import java.util.Date;
import java.util.GregorianCalendar;


public class Employee implements Comparable<Employee>{
	private String name;
	private int salary;
	private Date hireDate;

	public Employee(String name, int salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
		hireDate = cal.getTime();
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public Date getHireDate() {
		Date returnVal = (Date) hireDate.clone();
		return returnVal;
	}

  @Override
  public int compareTo(Employee employee) {
    // TODO Auto-generated method stub
    if (employee == null || this.getClass() != employee.getClass()) { return -1;}
//    Employee employee = (Employee) o;
        
    if (this.getName().equals(employee.getName())) {
      if (this.getSalary() == employee.getSalary()) {
        if (this.getHireDate().equals(employee.getHireDate())) {
          return 0;
        }
        return this.getHireDate().compareTo(employee.getHireDate());
      }
      return this.getSalary() - employee.getSalary();
    }
    return this.getName().compareTo(employee.getName());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("<");
    sb.append("name: " + this.getName());
    sb.append(" salary: " + this.getSalary());
    sb.append(" hire date: " + String.format("%tD", this.getHireDate()));
    sb.append(">");
    return sb.toString();
  }
}

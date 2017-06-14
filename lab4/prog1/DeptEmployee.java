package lab4.prog1;

import java.time.LocalDate;

public class DeptEmployee {
  private String name;
  protected final double salary;
  private LocalDate hireDate;
  
  DeptEmployee(String name, double salary, int year, int month, int day) {
    this.name = name;
    this.salary = salary;
    this.hireDate = LocalDate.of(year, month, day);
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setHireDate(int year, int month, int day) {
    this.hireDate = LocalDate.of(year, month, day);
  }
  
  public LocalDate getHireDate() {
    return this.hireDate;
  }
  
  public double computeSalary() {
    return this.salary;
  }
  
}

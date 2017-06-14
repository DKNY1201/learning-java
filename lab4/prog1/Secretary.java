package lab4.prog1;

public final class Secretary extends DeptEmployee {
  
  private double overtimeHours;
  
  Secretary(String name, double salary, int year, int month, int day) {
    super(name, salary, year, month, day);
    // TODO Auto-generated constructor stub
  }

  public void setOvertimeHours(double overtimeHours) {
    this.overtimeHours = overtimeHours;
  }
  
  public double getOvertimeHours() {
    return this.overtimeHours;
  }
  
  public double computeSalary() {
    return this.salary + overtimeHours * 12;
  }
}

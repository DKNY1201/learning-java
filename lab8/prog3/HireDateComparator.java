package lab8.prog3;

import java.util.Comparator;
import java.util.Date;

public class HireDateComparator implements Comparator<Employee> {

  @Override
  public int compare(Employee o1, Employee o2) {
    String name1 = o1.getName();
    String name2 = o2.getName();
    Date hireDate1 = o1.getHireDate();
    Date hireDate2 = o2.getHireDate();
    double salary1 = o1.getSalary();
    double salary2 = o2.getSalary();
    
    if (hireDate1.compareTo(hireDate2) != 0) {
      return hireDate1.compareTo(hireDate2);
    }
    
    if (name1.compareTo(name2) != 0) {
      return name1.compareTo(name2);
    }
    
    if (salary1 > salary2) {
      return 1;
    } else if (salary1 < salary2) {
      return -1;
    } else {
      return 0;
    }
  }

}

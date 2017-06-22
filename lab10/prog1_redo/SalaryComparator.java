package lab10.prog1_redo;

import java.util.Comparator;
import java.util.Date;

public class SalaryComparator implements Comparator<Employee>{

  @Override
  public int compare(Employee o1, Employee o2) {
    String name1 = o1.getName();
    String name2 = o2.getName();
    Date date1 = o1.getHireDate();
    Date date2 = o2.getHireDate();
    double salary1 = o1.getSalary();
    double salary2 = o2.getSalary();
    
    if (salary1 != salary2) {
      if (salary1 > salary2) {
        return 1;
      } else if (salary1 < salary2) {
        return -1;
      }
    }
    
    if (!name1.equals(name2)) {
      return name1.compareTo(name2);
    }
    
    return date1.compareTo(date2);
  }

}

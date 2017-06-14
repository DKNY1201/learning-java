package lab8.prog3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		Employee[] empArray =
			{new Employee("George", 40000, 1996,11,5),
			 new Employee("Dave", 50000, 2000, 1, 3),
			 new Employee("Richard", 45000, 2001, 2, 7)
			 };
		List<Employee> empList = Arrays.asList(empArray);

		NameComparator nameComp = 
			new NameComparator();
		Collections.sort(empList, nameComp);
		System.out.println(empList);
		
		SalaryComparator salaryComp = new SalaryComparator();
		Collections.sort(empList, salaryComp);
		System.out.println(empList);
		
		HireDateComparator hireDateComp = new HireDateComparator();
    Collections.sort(empList, hireDateComp);
    System.out.println(empList);
		
		Employee e1 = new Employee("Quy", 145000, 2001, 2, 7);
		Employee e2 = new Employee("Quy", 145000, 2001, 2, 7);
		
		System.out.println(e1.equals(e2));
		System.out.println(nameComp.compare(e1, e2));
		System.out.println(salaryComp.compare(e1, e2));
		System.out.println(hireDateComp.compare(e1, e2));
		
	}
	

}

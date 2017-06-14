package lab4.prog1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    DeptEmployee[] department = new DeptEmployee[5];
    
    Professor professor1 = new Professor("Professor 1", 100000, 2000, 1, 1);
    Professor professor2 = new Professor("Professor 2", 110000, 2001, 1, 1);
    Professor professor3 = new Professor("Professor 3", 120000, 2002, 1, 1);
    
    professor1.setNumberOfPublications(10);
    professor2.setNumberOfPublications(10);
    professor3.setNumberOfPublications(10);
    
    Secretary secretary1 = new Secretary("Secretary 1", 80000, 2000, 1, 1);
    Secretary secretary2 = new Secretary("Secretary 2", 81000, 2001, 1, 1);
    secretary1.setOvertimeHours(200);
    secretary2.setOvertimeHours(200);
    
 
    department[0] = professor1;
    department[1] = professor2;
    department[2] = professor3;
    department[3] = secretary1;
    department[4] = secretary2;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Do you want to see the total salary of all staffes?");
    if (in.nextLine().equals("Y"))  {
      double total = 0;
      for(DeptEmployee staff: department) {
        total += staff.computeSalary();
      }
      System.out.println("Total salary is " + total);
    }
    in.close();
  }
}

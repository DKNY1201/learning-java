package lab3;

import java.time.LocalDate;
import java.util.Date;

public class Prog31Main {
	public static void main(String[] args) {
		Employee e1 = new Employee("Quy", "Bi", 125000, 2018, 3, 1);
		Account checkingAccount = new Account(e1, AccountType.CHECKING, 300);
		Account savingAccount = new Account(e1, AccountType.SAVINGS, 300);
		Account retirementAccount = new Account(e1, AccountType.RETIREMENT, 300);
		System.out.println(checkingAccount);
		System.out.println(savingAccount);
		System.out.println(retirementAccount);
		
		LocalDate d = e1.getHireDay();
		System.out.println(d);
		
		System.out.println(e1);
	}
}

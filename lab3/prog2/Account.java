package lab3.prog2;

class Account {
//	public final static String CHECKING = "checking";
//	public final static String SAVINGS = "savings";
//	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type: " + acctType.toString().toLowerCase() + "\nCurrent bal: " + balance;
	}

	//updates the balance field
	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	
	//updates the balance field and returns true, unless 
	//withdrawal amount is too large(larger than balance); 
	//in that case,
	//it does not modify the balance field, and returns false
	public boolean makeWithdrawal(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
	
	public AccountType getAccountType() {
		return acctType;
	}
	
	public double getBalance() {
		return balance;
	}
	
}

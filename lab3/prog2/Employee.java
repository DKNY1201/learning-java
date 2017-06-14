package lab3.prog2;

import java.time.LocalDate;

public class Employee {
  private Account savingsAcct;
  private Account checkingAcct;
  private Account retirementAcct;
  private String name;
  private LocalDate hireDate;

  public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
    this.name = name;
    this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
  }

  public void createNewChecking(double startAmount) {
    this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
  }

  public void createNewSavings(double startAmount) {
    this.savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
  }

  public void createNewRetirement(double startAmount) {
    this.retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
  }

  public void deposit(AccountType acctType, double amt) {
    switch (acctType) {
    case CHECKING:
      this.checkingAcct.makeDeposit(amt);
      break;
    case SAVINGS:
      this.savingsAcct.makeDeposit(amt);
      break;
    case RETIREMENT:
      this.retirementAcct.makeDeposit(amt);
      break;
    }
  }

  public boolean withdraw(AccountType acctType, double amt) {
    switch (acctType) {
    case CHECKING:
      this.checkingAcct.makeWithdrawal(amt);
      break;
    case SAVINGS:
      this.savingsAcct.makeWithdrawal(amt);
      break;
    case RETIREMENT:
      this.retirementAcct.makeWithdrawal(amt);
      break;
    }
    return false;
  }

  public String getFormattedAcctInfo() {
    StringBuilder sb = new StringBuilder();

    sb.append("\nACCOUNT INFO FOR " + this.name + "\n");
    sb.append(this.checkingAcct != null ? this.checkingAcct.toString() + "\n" : "");
    sb.append(this.savingsAcct != null ? this.savingsAcct.toString() + "\n" : "");
    sb.append(this.retirementAcct != null ? this.retirementAcct.toString() + "\n" : "");

    return sb.toString();
  }

  public String getName() {
    return this.name;
  }

  public String getHireDay() {
    return Util.localDateAsString(hireDate);
  }
}

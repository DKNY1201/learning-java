package lab4.prog1;

public final class Professor extends DeptEmployee {
  
  private int numberOfPublications;
  
  Professor(String name, double salary, int year, int month, int day) {
    super(name, salary, year, month, day);
    // TODO Auto-generated constructor stub
  }

  public void setNumberOfPublications(int numberOfPublications) {
    this.numberOfPublications = numberOfPublications;
  }
  public int getNumberOfPublications() {
    return this.numberOfPublications;
  }
  
  

  
}

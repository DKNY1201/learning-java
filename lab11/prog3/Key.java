package lab11.prog3;

public class Key {
  private String firstName;
  private String lastName;

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Key(String f, String l) {
    this.firstName = f;
    this.lastName = l;
  }

  public boolean equals(Object o) {
    if (o == null) {
      return false;
    }

    if (o.getClass() != this.getClass()) {
      return false;
    }

    Key k = (Key) o;

    if (k.getFirstName().equals(this.getFirstName())) {
      return k.getLastName().equals(this.getLastName());
    }

    return false;
  }

  @Override
  public int hashCode() {
    int result = 17;
    result += 31 * result + this.firstName.hashCode();
    result += 31 * result + this.lastName.hashCode();
    return result;
  }
}

package lab10.prog2;

public class Rational {
  private int p;
  private int q;
  Rational() {
    this(0,1);
  }
  Rational(int p, int q) {
    if (q <= 0) {
      System.out.println("Denominator can not be zero or less than zero");
      return;
    }
    this.p = p;
    this.q = q;
  }

  void setNumerator(int p) {
    this.p = p;
  }

  int getNumerator() {
    return this.p;
  }

  void setDenominator(int q) {
    this.q = q;
  }

  int getDenominator() {
    return this.q;
  }

  // adds the rational rat to this Rational
  public Rational add(Rational rat) {
    Rational result = new Rational();

    result.setNumerator((this.getNumerator() * rat.getDenominator()) + (rat.getNumerator() * this.getDenominator()));
    result.setDenominator(this.getDenominator() * rat.getDenominator());

    return result;
  }

  // multiplies rat by this Rational
  public Rational multiply(Rational rat) {
    Rational result = new Rational();
    result.setNumerator(this.getNumerator() * rat.getNumerator());
    result.setDenominator(this.getDenominator() * rat.getDenominator());
    return result;
  }

  // returns –1 if this rational is less than rat
  // returns 0 if this rational equals (see equals
  // method discussion below) rat
  // returns 1 if this rational is greater than rat
  public int compareTo(Rational rat) {
    if ((this.p / this.q) > (rat.p / rat.q)) {
      return 1;
    } else if ((this.p / this.q) < (rat.p / rat.q)) {
      return -1;
    }
    return 0;
  }
  
  public boolean equals(Object o) {
    if (o == null) {
      return false;
    }
    
    if (this.getClass() != o.getClass()) {
      return false;
    }
    
    Rational r = (Rational) o;
    
    return this.compareTo(r) == 0;
  }
  
  public String toString() {
    return String.format("%d/%d", this.p, this.q);
  }
}

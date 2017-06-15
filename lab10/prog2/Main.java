package lab10.prog2;

public class Main {
  public static void main(String[] args) {
    Rational rat1 = new Rational(2,3);
    Rational rat2 = new Rational(-17,5);
    Rational rat3 = new Rational(1,3);
    
    Rational result1 = rat1.multiply(rat2).add(rat3);
    Rational result2 = rat1.multiply(rat2.add(rat3));
    
    System.out.println(result1);
    System.out.println(result2);
    
    String s = "(" + rat1 + " * " + rat2 + ")" + " + " + rat3 + " is greater than " + rat1 + " * (" + rat2 + " + " + rat3 + ")";
    
    System.out.println(s);
    
  }
}

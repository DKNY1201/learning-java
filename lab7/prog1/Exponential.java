package lab7.prog1;

public class Exponential {

  double power(double x, int n) {
    if (n < 0) {
      return 1 / power(x, n - 1);
    }
    if (n == 0) {
      return 1;
    }
    if (n == 1) {
      return x;
    }
    return x * power(x, n - 1);
  }

  public static void main(String[] args) {
    Exponential ex = new Exponential();
    
    System.out.println(ex.power(2, 10));
    System.out.println(ex.power(2, -2));
  }
}

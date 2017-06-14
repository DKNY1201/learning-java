package lab4.prog2;

public final class Rectangle extends ClosedCurve {
  private double width;
  private double length;
  
  Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }
  
  @Override
  double computeArea() {
    return this.width * this.length;
  }
}

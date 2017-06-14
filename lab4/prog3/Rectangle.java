package lab4.prog3;

public final class Rectangle extends ClosedCurve implements Polygon{
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

  @Override
  public int getNumberOfSides() {
    // TODO Auto-generated method stub
    return 4;
  }

  @Override
  public double computePerimeter() {
    // TODO Auto-generated method stub
    return (this.width + this.length) * 2;
  }
  
  public String toString() {
    String lineSeparate = System.lineSeparator();
    StringBuilder sb = new StringBuilder();
    sb.append("For this Rectangle" + lineSeparate);
    sb.append("Number of sides = " + this.getNumberOfSides() + lineSeparate);
    sb.append("Perimeter = " + this.computePerimeter() + lineSeparate);
    return sb.toString();
  }
}

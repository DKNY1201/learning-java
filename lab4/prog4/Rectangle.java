package lab4.prog4;

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

  
  public String toString() {
    String lineSeparate = System.lineSeparator();
    StringBuilder sb = new StringBuilder();
    sb.append("For this Rectangle" + lineSeparate);
    sb.append("Perimeter = " + this.computePerimeter() + lineSeparate);
    return sb.toString();
  }

  @Override
  public double[] getArrayOfSides() {
    // TODO Auto-generated method stub
    return new double[] {this.width, this.width, this.length, this.length};
  }
  
}

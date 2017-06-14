package lab4.prog3;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
  @Override
  public int getNumberOfSides() {
    // TODO Auto-generated method stub
    return 4;
  }
  @Override
  public double computePerimeter() {
    // TODO Auto-generated method stub
    return this.side * this.side;
  }

  public String toString() {
    String lineSeparate = System.lineSeparator();
    StringBuilder sb = new StringBuilder();
    sb.append("For this Square" + lineSeparate);
    sb.append("Number of sides = " + this.getNumberOfSides() + lineSeparate);
    sb.append("Perimeter = " + this.computePerimeter() + lineSeparate);
    return sb.toString();
  }
}

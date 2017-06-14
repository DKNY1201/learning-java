package lab4.prog4;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}

  public String toString() {
    String lineSeparate = System.lineSeparator();
    StringBuilder sb = new StringBuilder();
    sb.append("For this Square" + lineSeparate);
    sb.append("Perimeter = " + this.computePerimeter() + lineSeparate);
    return sb.toString();
  }
  @Override
  public double[] getArrayOfSides() {
    // TODO Auto-generated method stub
    return new double[] {this.side, this.side, this.side, this.side};
  }
}

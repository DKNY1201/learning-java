package lab12.prog1;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length) throws IllegalClosedCurveException{
	  if (width < 0 || length < 0) {
	    throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a Rectangle instance. Width or length of Rectangle can't be negative number. Width: " + width + ". Length: " + length);
	  }
		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width*length;
	}
	


}

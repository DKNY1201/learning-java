package lab12.prog1;

public class Circle extends ClosedCurve {
	double radius;
	public Circle(Double radius) throws IllegalClosedCurveException{
		this(radius.doubleValue());
	}
	public Circle(double radius) throws IllegalClosedCurveException{
	  if (radius <= 0) {
	    throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a Rectangle instance. Radius of Circle can't be negative number. Radius: " + radius);
	  }
		this.radius = radius;
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
}

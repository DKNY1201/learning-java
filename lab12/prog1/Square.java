package lab12.prog1;

public class Square extends ClosedCurve {
	double side;
	public Square(Double side) throws IllegalClosedCurveException{
	  this(side.doubleValue());
	}
	public Square(double side) throws IllegalClosedCurveException{
	  if (side <= 0) {
      throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a Rectangle instance. Side of Square can't be negative number. Side: " + side);
    }
		this.side = side;
	}
	double computeArea() {
		return(side*side);
	}

}

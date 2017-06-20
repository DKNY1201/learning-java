package lab12.prog1;

public class IllegalTriangleException extends IllegalClosedCurveException {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  IllegalTriangleException() {
    super();
  }
  
  IllegalTriangleException(String msg) {
    super(msg);
  }
  
}

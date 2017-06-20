package lab12.prog1;

public class Test {

  public static void main(String[] args) {

    try {
      ClosedCurve[] objects = { new Triangle(4, 5, 6), new Square(-3), new Rectangle(3, -7), new Circle(-3) };

      for (ClosedCurve cc : objects) {
        String nameOfCurve = cc.getClass().getSimpleName();

        System.out.println("The area of this " + nameOfCurve + " is " + cc.computeArea());

      }
    } catch (IllegalTriangleException e) {
      System.out.println(e.getMessage());
//      e.printStackTrace();
    } catch (IllegalClosedCurveException e) {
      System.out.println(e.getMessage());
//      e.printStackTrace();
    }
  }

}

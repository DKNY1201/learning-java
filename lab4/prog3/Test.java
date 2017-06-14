package lab4.prog3;

public class Test {
	
	public static void main(String[] args) {

	  Polygon[] objects = {new Triangle(4,5,6),
								 new Square(4),
								 new Rectangle(3, 4)};
		//compute areas
	  String lineSeparate = System.lineSeparator();
		for(Polygon cc : objects) {
	    StringBuilder sb = new StringBuilder();
	    sb.append("For this " + cc.getClass().getSimpleName() + lineSeparate);
	    sb.append("Number of sides = " + cc.getNumberOfSides() + lineSeparate);
	    sb.append("Perimeter = " + cc.computePerimeter() + lineSeparate);
			System.out.println(sb.toString());
		}
	}
}
package lab4.prog4;

public class Test {
	
	public static void main(String[] args) {

	  Polygon[] objects = {new Triangle(4,5,6),
								 new Square(4),
								 new Rectangle(3, 4)};
		//compute areas
		for(Polygon cc : objects) {
			System.out.println(cc);
		}
	}
}
package lab3.prog4;

public class Main {
	public static void main(String[] args) {
		Circle cir = new Circle(10);
		Rectangle rec = new Rectangle(10, 20);
		Triangle tri = new Triangle(5, 10);
		
		System.out.println("Area of Triangle is " + cir.computeArea());
		System.out.println("Area of Triangle is " + rec.computeArea());
		System.out.println("Area of Triangle is " + tri.computeArea());
	}
}

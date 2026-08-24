package I1;

public class Shapetest {
	public static void main(String[] args) {
		Shape rect = new Rectangle(5,6);
		Shape cir = new Circle(3);
		Shape tri = new Triangle(6, 7);
		System.out.printf("Rectangle area:%.2f",rect.getArea());
		System.out.printf("Circle area:%.2f",cir.getArea());
		System.out.printf("Triangle area:%.2f",tri.getArea());
	
	}
}

package p1;

public class BoxingUnboxingDemo {
	public static void main(String[] args) {
		int num=10; //Primitive data
		Integer obj = num; //boxing
		System.out.println("boxing value:" + obj);
		int value = obj; //unboxing
		System.out.println("unboxing value :" + value);
	}
	
}

package Oops;

public class EncapsulationStdnt {
	 //Private members
	private String name;
	 private int age;
	private double marks;
	
	//Setter method
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getMarks() {
		return marks;
	}
	public static void main(String[] args) {
		EncapsulationStdnt e = new EncapsulationStdnt();
		e.setName("Mani");
		e.setAge(15);
		e.setMarks(55.6);
		System.out.println("Name:"+ e.getName());
		System.out.println("Age:"+ e.getAge());
		System.out.println("Marks:"+ e.getMarks());
		
		
	}
}

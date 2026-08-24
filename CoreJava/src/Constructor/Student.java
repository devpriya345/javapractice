package Constructor;

public class Student {
	String name;
	int age;
	//zero param constructor
	Student(){
		name = "Riya";
		age = 15;
	}
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
	}
	
}

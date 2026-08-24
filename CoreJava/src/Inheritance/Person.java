package Inheritance;

public class Person {
	String name="Anuj";
	void displayname() {
		System.out.println("Name::"+ name);
	}
}
class Student extends Person{
	void displayrole() {
		System.out.println("Role:: Student");
	}
}

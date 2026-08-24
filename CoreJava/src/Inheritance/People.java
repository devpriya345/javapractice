package Inheritance;

public class People {
	String name = "Raju";
	void displayname() {
		System.out.println("Name::"+ name);
	}
}
class Boy extends People{
	int marks = 80;
	void displaymarks() {
		System.out.println("Marks::"+ marks);
	}
}
class GraduateStudent extends Boy{
	void displayresult() {
		if(marks >=40) {
			System.out.println("Result pass");
		}else {
			System.out.println("Result fail");
		}
	}
}


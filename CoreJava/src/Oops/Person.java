package Oops;

public class Person {
	 //Static variable
	static String city = "mumbai";
	static String profession = "Engineer";
	//Instance variable
	double salary;
	String name;
	public static void main(String[] args) {
		Person p = new Person();
		p.salary = 45000.00;
		p.name = "Meenu";
		//static variable 
		System.out.println(Person.city);
		System.out.println(Person.profession);
		//instance variable
		System.out.println(p.name );
		System.out.println(p.salary);
	}

}

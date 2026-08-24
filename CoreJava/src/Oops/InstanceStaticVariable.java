package Oops;

public class InstanceStaticVariable {
	//Static variable
	static String schoolname ="ABC School";
	static String city ="Delhi";
	//Instance variable
	String name;
	int marks;

 
	 public static void main(String[] args) {
		InstanceStaticVariable s1 = new InstanceStaticVariable ();
		s1.name = "Riya";
		s1.marks = 80;
		//Static variable
		System.out.println(InstanceStaticVariable .schoolname);
		System.out.println(InstanceStaticVariable.city);
		//Instance variable
		System.out.println(s1.name);
		System.out.println(s1.marks);
	}
 
}
package in.streams;


import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Person> list =  new ArrayList<>();
		list.add(new Person("Jay","India"));
		list.add(new Person("Naman","Japan"));
		list.add(new Person("Junu","Korea"));
		list.add(new Person("Anu","USA"));
		list.add(new Person("Bannu","USA"));
		list.add(new Person("Chirag","India"));
		
//	boolean status1  = list.stream().anyMatch(p->  p.country.equals("USA"));
	//System.out.println("is americans available ::"+status1);
	
	//	boolean status2  = list.stream().allMatch(p->  p.country.equals("India"));
	//	System.out.println("is indians available ::"+status2);
		
		boolean status3 = list.stream().noneMatch(p->  p.country.equals("Germany"));
		System.out.println("is german available ::"+ status3);
		
		
	}
}
class Person1{
	String name;
	String country;
	
	 Person1(String name, String country) {
		this.name = name;
		this.country= country;
	}
	
}
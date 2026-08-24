package in.streams;

import java.util.Arrays;
import java.util.List;

public class MatchingOperation {  //anyMatch(),allMatch(),noneMatch(){terminal opertaions}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Ramesh","INDIA");
		Person p2 = new Person("Steve", "Mexico");
		Person p3 = new Person("Jinu", "Japan");
		Person p4 = new Person("Ching", "China");
		
	List<Person> person =	Arrays.asList(p1,p2,p3,p4);
	
	boolean status1 =person.stream().anyMatch(p-> p.country.equals("Japan"));
	System.out.println("Any japanese available? ::"+ status1);
		
	boolean status2 =person.stream().anyMatch(p-> p.country.equals("INDIA"));
	System.out.println("Any indian available? ::"+ status2);
	
	
	boolean status3 =person.stream().allMatch(p-> p.country.equals("USA"));
	System.out.println("All presons from america ? ::"+ status3);
	
	
	boolean status4 =person.stream().noneMatch(p-> p.country.equals("Mexico"));
	System.out.println("NO person from argentina? ::"+ status4);
	
		
	}
}

class Person{
	String name;
	String country;
	
	 Person(String name, String country) {
		this.name = name;
		this.country= country;
	}
	
}
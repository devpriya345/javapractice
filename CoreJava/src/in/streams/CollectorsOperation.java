package in.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsOperation { //  used to collect data form stream

	public static void main(String[] args) {
		

		Persons p1 = new Persons("Ramesh","India");
		Persons p2 = new Persons("Steve", "Mexico");
		Persons p3 = new Persons("Jinu", "Japan");
		Persons p4 = new Persons("Ching", "China");
		Persons p5 = new Persons("Rajiv", "India");
		
	List<Persons> persons =	Arrays.asList(p1,p2,p3,p4,p5);
	
	List<Persons> indians = persons.stream()
			.filter(p-> p.country.equals("India"))
			.collect(Collectors.toList());
	
	indians.forEach(i-> System.out.println(i));
	}
}

class Persons{
	@Override
	public String toString() {
		return "Persons [name=" + name + ", country=" + country + "]";
	}

	String name;
	String country;
	
	 public Persons(String name, String country) {
		this.name = name;
		this.country= country;
	}
	
}
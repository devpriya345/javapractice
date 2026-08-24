package java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	String name;
	String location;
	String dept;
	
	Employee(String name, String location , String dept ){
		this.name= name;
		this.location = location;
		this.dept = dept;
	}
}

public class PredicateJoinDemo {
	public static void main(String[] args) {

		Employee e1 = new Employee("Rani","Chennai","Devops");
		Employee e2 = new Employee("Raman","Pune","Networking");
		Employee e3 = new Employee("Chirag","Mumbai","Testing");
		Employee e4 = new Employee("Gnaesh","Hyderabad","DB");
		
		List<Employee>emps = Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Employee>p1 = (e) -> e.location.equals("Hyderabad");
		Predicate<Employee>p2 = (e) -> e.dept.equals("DB");
		
		//Predicate joiniig
		
		Predicate<Employee> p = p1.and(p2);
		
		for(Employee e: emps){
			if(p.test(e)) {
				System.out.println(e.name);
			}
		}
	 
	}
}




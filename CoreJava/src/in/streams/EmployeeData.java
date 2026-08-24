package in.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeData {
	
	public static void main(String[] args) { //calculate max,min,avg salary??
		
		Employeee e1 = new Employeee(1,"Siya",35000.0);
		Employeee e2 = new Employeee(2,"Ana",45000.0);
		Employeee e3 = new Employeee(3,"Bablu",32000.0);
		Employeee e4 = new Employeee(4,"Chalu",23000.0);
		Employeee e5 = new Employeee(5,"David",21000.0);
		
List<Employeee>list =	Arrays .asList(e1,e2,e3,e4,e5);
	
	Optional<Employeee> max=	list.stream()
			.collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
	System.out.println("Max Salary::"+ max.get().salary);  //maxSalary
	
	Optional<Employeee>min = list. stream()
			.collect(Collectors.minBy(Comparator.comparing(e-> e.salary)));
	System.out.println("Min Salary::"+ min.get().salary); //minSalary
	
	Double avgSalary = list. stream()
	.collect(Collectors.averagingDouble(e-> e.salary));
	System.out.println(avgSalary); //avgsalary
	
	/*Optional<Employeee> findFirst = list.stream()
			.sorted(Comparator.comparing(e-> e.salary).reversed())
			.skip(1)
			.findFirst();*/
	}
}


	class Employeee{
		int id;
		String name;
		double salary;
	
	Employeee(int id ,String name,double salary){
		this.id = id;
		this.name= name;
		this.salary = salary;
	}
	}
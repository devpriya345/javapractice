package in.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingOpeartion {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1(11, "Jay",12000.0,"India");
		Employee1 e2 = new Employee1(12,"Jatin",15000.0,"India");
		Employee1 e3 = new Employee1(13,"Celvin",25000.0,"China");
		Employee1 e4 = new Employee1(14,"Urav",35000.0,"Japan");
		
	List<Employee1>list=	Arrays.asList(e1,e2,e3,e4);
	
	Map<String,List<Employee1>>data=list.stream()
			.collect(Collectors.groupingBy(e->e.country));
	System.out.println(data);
	}
}


class Employee1{
	int id;
	String name;
	double salary;
	String country;
Employee1(int id ,String name,double salary,String country){
	this.id = id;
	this.name= name;
	this.salary = salary;
	this.country = country;
}
}
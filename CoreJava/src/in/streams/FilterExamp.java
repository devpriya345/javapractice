package in.streams;

import java.util.stream.Stream;

public class FilterExamp {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Ram",23,25000.00);
		Employee e2 = new Employee("Shyam",32,50000.00);
		Employee e3 = new Employee("Jhamun", 43,55000.00);
		Employee e4 = new Employee("Nana",32, 45000.00);
		
		Stream<Employee>stream = Stream.of(e1,e2,e3,e4);
		
		stream.filter(e ->e.salary>=40000)
		.forEach(e->System.out.println("Name:"+ e.name+"Age:" +e.age ));
	}	
}
	class Employee{
		String name;
		int age;
		double salary;
		
		 Employee(String name,int age,double salary) {
			
			this.name = name;
			this.age = age;
			this.salary = salary;
		}

		    @Override
		    public String toString() {
		        return "Employee{" +
		               "name='" + name + '\'' +
		               ", age=" + age +
		               ", salary=" + salary +
		               '}';
		    }
	}

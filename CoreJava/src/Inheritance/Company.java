package Inheritance;

public class Company {
	void companyName() {
		System.out.println("Tech comp");
	}
}
class Department extends Company{
	void deptName() {
		System.out.println(" Department :: Manager");
	}
}
class Employee extends Department{
	void emlpoyeeDetails() {
		System.out.println(" Emlpoyee :Ishan ,Role: Developer");
	}

}

	


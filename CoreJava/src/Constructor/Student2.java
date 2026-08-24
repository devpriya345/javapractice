package Constructor;

public class Student2 {
	String name;
	int rollNo;
	double marks;

	Student2(String n,int r,double m){
		name = n;
		rollNo=r;
		marks = m;
	}
	void display() {
		System.out.println("name:"+name);
		System.out.println("rollNo:"+ rollNo);
		System.out.println("marks:"+marks);
	
	}
	public static void main(String[] args) {
		Student2 s2 = new Student2("shamu",10,86);
		s2.display();
	}
	}

	


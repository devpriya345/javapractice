package in.streams;

import java.util.stream.Stream;

public class PrintAgeName {
	
	public static void main(String[] args) {
		User u1 = new User("John",12);
		User u2 = new User("Ankit",35);
		User u3 = new User("Diya",23);
		User u4 = new User("Anam",22);
		User u5 = new User("Uma",15);
		User u6 = new User("Amina",17);
		
		Stream<User>stream = Stream.of(u1,u2,u3,u4,u5,u6);
		//stream.filter(u ->u.age >=18).forEach(u->System.out.println(u));
		
		stream.filter(u ->u.age>=18 && u.name.startsWith("A")).forEach(u->System.out.println(u));
		
	}
}
class User{
	 
	String name;
	int age;
	
	User(String name,int age) {
		this.name = name;
		this.age  = age;
		
	}

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}

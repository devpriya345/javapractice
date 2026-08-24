package java8Feature;

import java.util.function.Supplier;

public class Test {
	public static void main(String[] args) {
		
		// Doctor d = new Doctor();
		
		Supplier<Doctor> s = Doctor::new;
		
		System.out.println(s.get().hashCode());
	}
}
	class Doctor{        //constructor reference
		
		public Doctor(){
			System.out.println("Doctor contructor....");
		}
	}
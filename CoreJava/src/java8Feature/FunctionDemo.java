package java8Feature;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		
	Function<String,Integer > f =(name) -> name.length();
	
	System.out.println(f.apply("seema"));
	System.out.println(f.apply("riya"));
	}
	
	
}

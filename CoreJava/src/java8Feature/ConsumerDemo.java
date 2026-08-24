package java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> c =(name) -> System.out.println(name + "good mrng");
		
		c.accept("Anil");
		c.accept("Sunil");
		
		List<Integer> numbers = Arrays .asList(10,20,20); 
				
		numbers.forEach(i->System.out.println(i));	
	}
}

package in.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FirstDemo {
	
	public static void main(String[] args) {
		
		//Approach 1 using Stream.of()
		Stream<Integer>stream1 = Stream.of(1,2,3,4,5);
		
		ArrayList<String>names = new ArrayList<>();
		names.add("Seema");
		names.add("Jaya");
		names.add("Riya");
		
		//Approach2 using Stream()method
		Stream<String> stream2 = names.stream();
	}
}

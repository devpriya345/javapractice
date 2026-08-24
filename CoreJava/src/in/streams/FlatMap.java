package in.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {  //used to flaten list of string into single string

	public static void main(String[] args) {
		
	List<String> javacourses =	Arrays.asList("core java","adv java","springboot");
	
	List<String> uicourses =Arrays .asList("html","css","js");
	
	List<List<String> >courses = Arrays.asList(javacourses,uicourses);
	
	Stream<String> flatMap = courses.stream().flatMap(list-> list.stream());
	
	flatMap.forEach(c-> System.out.println(c));
	
	}
	
	
}

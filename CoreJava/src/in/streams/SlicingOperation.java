package in.streams;

import java.util.Arrays;
import java.util.List;

public class SlicingOperation {  //distinct(),skip(),limit() {intermediate operation part}
	
	public static void main(String[] args) {
		
	List<String> javacourses =	Arrays.asList("core java","html","js","css");
	
	javacourses.stream().limit(3).forEach(c->System.out.println(c));
	
	javacourses.stream().skip(2).forEach(c-> System.out.println(c));
	
	List<String> names =	Arrays.asList("ram","shyam","gita","sita","sita","ram","shyam");
	
	names.stream().distinct().forEach(name->System.out.println(name));
	}
}

package in.streams;

import java.util.Arrays;
import java.util.List;

public class PrintName {
	
	public static void main(String[] args) {
		List<String> names= Arrays .asList("John","Anushka","Ankit","Arya","Suman","Diya");
		
		names.stream().filter(i-> i.startsWith("A")).forEach(i-> System.out.println(i));
	}
}

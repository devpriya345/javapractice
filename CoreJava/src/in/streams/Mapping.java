package in.streams;

import java.util.Arrays;
import java.util.List;

public class Mapping {
	
	public static void main(String[] args) {
		
	List<String> names=	Arrays.asList("Bina","Chintu","Bela","Jiya","Babita");
	
	
	//using mapping operation (intermediate)
	
	//names.stream().map(name->name.toUpperCase()).forEach(n->System.out.println(n));
	
	names.stream()
	.filter(name-> name.startsWith("B"))
	.map(name ->name +"-"+name.length())
	.forEach(name-> System.out.println(name));
	}
}

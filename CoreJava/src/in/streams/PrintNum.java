package in.streams;

import java.util.Arrays;
import java.util.List;

public class PrintNum {
	
	public static void main(String[] args) {
	List<Integer> list	= Arrays.asList(34,45,66,78,54);
	
	/*// old approach
	 * for(Integer i :list) { if(i>40) { System.out.println(i); } }
	 */
	
	
	/*// Approach 1
	 * Stream <Integer> stream = list .stream(); Stream<Integer> filter =
	 * stream.filter(i -> i>40); filter.forEach(i-> System.out.println(i));
	 */
	
	// Approach 2
	list.stream().filter(i -> i>40 ).forEach(i->System.out.println(i));
	}
}

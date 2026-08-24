package java8Feature;

import java.util.function.Predicate;

public class PredicateDemo {
	
	/*
	 * public boolean test(int i) { // method without lambda
	 *  if(i>10) { return true;
	 * }else { return false; } }
	 */
	public static void main(String[] args) {
		Predicate<Integer> p = i-> i > 10; // method with lambda
		System.out.println(p.test(5));
		System.out.println(p.test(15));
	}
}

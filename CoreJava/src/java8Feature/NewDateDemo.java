package java8Feature;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class NewDateDemo {
	
	public static void main(String[] args) {
		LocalDate date =  LocalDate.now();
		System.out.println(date);
		
		date = date.plusDays(3);
		System.out.println(date);
		
		date = date.plusMonths(2);
		System.out.println(date);
		
		date = date.plusYears(5);
		System.out.println(date);
		
	boolean leapYear	= LocalDate.parse("2021-05-23").isLeapYear();
		System.out.println("Leap year ::"+ leapYear);
		
		Period between = Period.between(LocalDate.parse("1992-04-21"),LocalDate.now());
		System.out.println(between);
		
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		time = time.plusHours(2);
		System.out.println(time);
		
		LocalDateTime datetime =  LocalDateTime.now();
		System.out.println(datetime);
	}
}

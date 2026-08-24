package java8Feature;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args)throws Exception {
		
		Date d = new Date();
		System.out.println(d);
		
		//converting date to string
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format(d);
		System.out.println(format);
		
		//converting String to date
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = sdf2.parse("2023-11-12");
		System.out.println(parsedDate);
	}
}

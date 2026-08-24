package java8Feature;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter user id");
		int userid = s.nextInt();
		
		User u = new User();
		/*String username = u.getUsernameById(userid);
		
	
	if(username != null) {
		String msg = username.toUpperCase()+",Hello";
		System.out.println(msg);
	}else {
		System.out.println("invalid Id");
	}	
	} */
		
		Optional<String>username = u.getUsername(userid);
		
		if(username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase()+",Hello");
		}else {
			System.out.println("No data found");
		}
		}
}
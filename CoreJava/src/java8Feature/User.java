package java8Feature;

import java.util.Optional;

public class User {
	
	public String getUsernameById(Integer id) {
		if(id == 100) {
			return "Raju";
		}else if (id == 101) {
			return "Rani";
		}else if (id == 102) {
			return "John";
		}else {
			return null;
		}
	}
	
	public Optional<String>getUsername(Integer id){    //with optional class
		String name = null;
		if(id ==100) {
			name = "raju";
		}else if(id == 101) {
			name = "Rani";
		}else if (id == 102) {
			name = "John";
		}
		return Optional.ofNullable(name);
		
	}
}

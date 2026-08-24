package in.json.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;


public class JavaToJsonConvert {
	public static void main(String[] args) throws Exception {
		
		Student s = new Student(); 
		s.setAge(22);
		s.setMarks(78);
		s.setName("Shyam");
		s.setRollNo(12);
	
	
	ObjectMapper mapper = new ObjectMapper();
	mapper.writeValue(new File("student.json"),s);
	System.out.println("Json file created");
}
}
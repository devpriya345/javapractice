package in.priya.binding;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MarshallDemo {
	
	public static void main(String[] args)throws Exception {
		
		Employee e = new Employee();
		e.setId(102);
		e.setName("Jia");
		e.setEmail("jia@143");
		e.setPhno(3457543L);
		
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		
		Marshaller marshaller = context.createMarshaller();
		
		marshaller.marshal(e, new File("employee.xml"));
		
		System.out.println("xml created....");
		
	}
}

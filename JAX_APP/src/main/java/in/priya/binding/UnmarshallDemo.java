package in.priya.binding;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class UnmarshallDemo {
	public static void main(String[] args) throws Exception{
		File f = new File("employee.xml");
		
		JAXBContext context =JAXBContext .newInstance(Employee.class);
	
		Unmarshaller unmarshaller =context.createUnmarshaller();
		
		Object object = unmarshaller .unmarshal(f);
		
		Employee e = (Employee) object;
		
		System.out.println(e);
		
	}
}

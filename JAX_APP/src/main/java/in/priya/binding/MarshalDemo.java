package in.priya.binding;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MarshalDemo {
	public static void main(String[] args)throws Exception {
		Person p = new Person();
		p.setId(103);
		p.setName("neha");
		p.setAddress("greater noida");
		
		
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(p,new File("person.xml"));
		System.out.println("xml created");
		
	}
}
